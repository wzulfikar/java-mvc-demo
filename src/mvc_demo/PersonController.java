package mvc_demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonController
 */
@WebServlet("/Person")
public class PersonController extends BaseController {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PersonController() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.doGet(request, response);
		
		// create new person
		Person person  = new Person();
		person.setName(request.getParameter("name"));
		person.setEmail(request.getParameter("email"));
		
		// set data for the view
		viewHelper.set("person", person);
		
		// render the view
		viewHelper.render("/person.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
