package mvc_demo;

import java.util.HashMap;
import java.sql.Connection;

public interface DAOInterface {
	public Connection getConnection();
	public void closeConnection();
	
	public void setTblName(String tblName);
	public HashMap<String, String> find(int id);
	public boolean save(HashMap<String, String> model);
	public boolean delete(HashMap<String, String> model);
}
