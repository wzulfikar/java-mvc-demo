package mvc_demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaseController
 */
@WebServlet("/BaseController")
public class BaseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected ViewHelper view;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BaseController() {
        super();
        view = new ViewHelper();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// compose request & response for view
		view.compose(getServletContext(), request, response);
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// compose request & response for view
		view.compose(getServletContext(), request, response);
    }
}
