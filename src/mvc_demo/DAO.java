package mvc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DAO implements DAOInterface{
	
	boolean enableLog = true;
	
	Connection connection = null;
	
	String dbName = "webprog2";
	String dbUser = "root";
	String dbPass = "";
	
	String tblName = "events";
	
	String connectionString = "jdbc:mysql://localhost/" 
							+ dbName 
							+ "?user="
							+ dbUser
							+ "&password="
							+ dbPass;
	
	String driver = "com.mysql.jdbc.Driver";
	
	public DAO() {
		log("initiating BaseDAO");
		openConnection();
	}
	
	public Connection getConnection(){
		try {
			Class.forName(this.driver);
			log(this.driver);
			if(connection == null){
				log("Creating connection..");
				connection = DriverManager.getConnection(this.connectionString);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void setTblName(String tblName){
		log("Table name set to \"" + tblName + "\"");
		this.tblName = tblName;
	}
	
	private boolean exec(String stmt) {
		
		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(stmt);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	private List<HashMap<String, String>> execQuery(String query) {
		
		List<HashMap<String, String>> models = new LinkedList<HashMap<String, String>>();
		
		try {
			Statement stmt = this.connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			ResultSetMetaData md = rs.getMetaData();
			int columns = md.getColumnCount();
			
			while (rs.next()){
				HashMap<String, String> row = new HashMap<String, String>(columns);
				for(int i=1; i<=columns; ++i){           
					row.put(md.getColumnName(i), rs.getString(i));
				}
				
				models.add(row);
			}
			
			log(models.size() + " row(s) found in table " + this.tblName);
			
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return models;
	}
	
	/**
	 * if given model has no id, create row.
	 * else, update the row.
	 */
	public boolean save(HashMap<String, String> model){
		log("Saving model: " + model.toString());
		
		String stmt = "";
		if(model.get("id") == null){
			stmt = this.prepareInsertStmt(model);
		}else{
			stmt = this.prepareUpdateStmt(model);
		}
		
	    return this.exec(stmt);
	}
	
	/**
	 * delete model. model must have id or deletion will fail.
	 * 
	 * @param model
	 * @return boolean
	 */
	public boolean delete(HashMap<String, String> model){
		log("Deleting model: " + model.toString());
		
		if(model.get("id") == null){
			log("Failed to delete model: undefined id");
			return false;
		}
		
		String stmt = "DELETE FROM " 
					+ this.tblName 
					+ " WHERE id = "
					+ model.get("id");
		
		return this.exec(stmt);
	}
	
	public void closeConnection(){
		try {
			if (connection != null) {
				connection.close();
				log("DB connection closed.");
			}
		} catch (Exception e) {
			//do nothing
		}
	}
	
	private void openConnection(){
		if(connection == null){
			connection = getConnection();
			log("Connected to db: " + connection);
		}
	}
	
	private String prepareInsertStmt(HashMap<String, String> model){

		ArrayList<String> columnsArray = new ArrayList<>();
		ArrayList<String> valuesArray  = new ArrayList<>();

		Iterator<?> it = model.entrySet().iterator();
		while (it.hasNext()) {
	      @SuppressWarnings("rawtypes")
				Map.Entry pair = (Map.Entry)it.next();
	      
	      columnsArray.add((String) pair.getKey());
	      valuesArray.add("\"" + pair.getValue() + "\"");
	      
	      // avoids a ConcurrentModificationException
	      it.remove();
		}
	  
		String stmt = "INSERT INTO " 
	  				+ this.tblName 
	  				+ " (" + String.join(", ", columnsArray) + ") "
	  				+ " VALUES "
					+ " (" + String.join(", ", valuesArray) + ");";
	  
		log("Prepared insert statement: " + stmt);
	  
		return stmt;
	}
	
	private String prepareUpdateStmt(HashMap<String, String> model){
		// Create new ArrayList.
		ArrayList<String> stmtArray = new ArrayList<>();

		Iterator<?> it = model.entrySet().iterator();
		  while (it.hasNext()) {
		    @SuppressWarnings("rawtypes")
			Map.Entry pair = (Map.Entry)it.next();
		      String stmt = pair.getKey() + " = \"" + pair.getValue() + "\"";
		      stmtArray.add(stmt);
		      
		      // avoids a ConcurrentModificationException
		      it.remove();
		  }
		  
		  String stmt = "UPDATE " 
		  			+ this.tblName 
		  			+ " set "
		  			+ String.join(", ", stmtArray)
		  			+ " WHERE id = "
		  			+ model.get("id")
		  			+ ";";
		  
		  log("Prepared update statement: " + stmt);
		  
		  return stmt;
	}
	
	private void log(String msg){
		if(this.enableLog){
			System.out.println(msg);
		}
	}

	@Override
	public HashMap<String, String> find(int id) {
		String query = "SELECT * from " 
					 + this.tblName
					 + " WHERE id = "
					 + id
					 + " LIMIT 1;";
		
		List<HashMap<String, String>> models = this.execQuery(query);
		
		if(models.size() > 0){
			return models.get(0);
		}
		
		return new HashMap<String, String>();
	}
	
	public List<HashMap<String, String>> select(String columns){
		String query = "SELECT " + columns + " from " + this.tblName;
		return this.execQuery(query);
	}
	
	protected void finalize() throws Throwable {
		// Invoke the finalizer of our superclass
		// We haven't discussed superclasses or this syntax yet
		super.finalize();
		
		log("destroying instance of DAO");
		closeConnection();
	}
}