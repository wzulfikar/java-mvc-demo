package mvc_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewHelper{
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private ServletContext servletContext;
	
	protected ViewHelper(){
		
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
	}
}