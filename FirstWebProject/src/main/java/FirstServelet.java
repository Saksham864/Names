

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServelet")
public class FirstServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public FirstServelet() {
       
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer= response.getWriter();
		writer.println("<html><body><h1>Inside Servlet</h1></body></html>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  System.out.println("Inside doPost of Servlet");
	  
	  String firstname=request.getParameter("fname");
	  String lastname=request.getParameter("lname");
	  String email=request.getParameter("em");
	  String password=request.getParameter("pass");
	  
	  System.out.println(firstname);
	  System.out.println(lastname);
	  System.out.println(email);
	  System.out.println(password);
		//doGet(request, response);
	}

}
