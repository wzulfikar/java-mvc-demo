package mvc_demo.helpers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class ViewHelper{
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private ServletContext servletContext;
	
	public ViewHelper(){
		
	}
	
	public void compose(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response){
		this.request = request;
		this.response = response;
		this.servletContext = servletContext;
	}
	
	public void set(String name, Object o){
		request.setAttribute(name, o);
	}
	
	/**
     * dispatch request to given view
     * 
     * @param  view
     * @throws ServletException
     * @throws IOException
     */
	public void render(String viewName) throws ServletException, IOException{
    	servletContext.getRequestDispatcher(viewName).forward(request, response);
    }
	
	public void println(String msg) throws IOException{
		PrintWriter out = this.response.getWriter();
		out.println(msg);
		out.flush();
	}
	
	public void print(String msg) throws IOException{
		PrintWriter out = this.response.getWriter();
		out.print(msg);
		out.flush();
	}
	
	public void json(List<HashMap<String, String>> list) throws IOException{
		this.response.setContentType("application/json");
		
		Gson gson = new Gson();
		print(gson.toJson(list));
	}
}