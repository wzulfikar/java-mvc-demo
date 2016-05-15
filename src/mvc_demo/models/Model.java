package mvc_demo.models;

import java.util.HashMap;
import java.util.List;

import mvc_demo.DAO.DAO;
import mvc_demo.interfaces.ModelInterface;

public class Model implements ModelInterface{
	
	public HashMap<String, String> model;
	public DAO dao;
	
	public String tblName = null;
	
	public Model(){
		this.dao = new DAO();
		this.dao.setTblName(this.getTblName());
		
		this.model = new HashMap<String, String>();
	}
	
	/**
	 * override this method in child class 
	 * to provide custom table name
	 * 
	 * @return String
	 */
	public String getTblName(){
		return this.getClass().getSimpleName().toLowerCase() + "s";				
	}
	
	public String getTblName(String className){
		return className.toLowerCase() + "s";				
	}
		
	public void set(String name, String val){
		this.model.put(name, val);
	}
	
	public String get(String name){
		return this.model.get(name);
	}
		
	public HashMap<String, String> get(){
		return this.model;
	}
	
	public void save(){
		this.dao.save(this.model);
	}
	
	public void delete(){
		this.dao.delete(this.model);
	}
	
	public boolean fetch(int id){
		HashMap<String, String> found = this.dao.find(id);
		
		if(found.isEmpty()){
			return false;
		}
		
		this.model = this.dao.find(id);
		return true;
	}
	
	public List<HashMap<String, String>> select(String columns){
		return this.dao.select(columns);
	}
	
	public List<HashMap<String, String>> all(){
		return this.dao.all();
	}
}
