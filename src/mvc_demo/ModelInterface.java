package mvc_demo;

import java.util.HashMap;
import java.util.List;

public interface ModelInterface {
	public String getTblName();
	public String getTblName(String className);
	public void set(String name, String val);
	public String get(String name);
	public HashMap<String, String> get();
	public void save();
	public void delete();
	public boolean fetch(int id);
	public List<HashMap<String, String>> select(String columns);
}
