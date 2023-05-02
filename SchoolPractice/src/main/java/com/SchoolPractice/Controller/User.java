package com.SchoolPractice.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SchoolPractice.TO.StudentTO;
import com.SchoolPractice.TO.TeacherTO;
import com.SchoolPractice.TO.UserTO;
import com.SchoolPractice.Service.*;
@WebServlet("/user")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

      UserService service= new UserService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           
		UserTO user = null;
		TeacherTO teacher= null;
		StudentTO student= null;
		String action = request.getParameter("action");
		RequestDispatcher dispatcher = null;	String username=request.getParameter("username");
	    String password=request.getParameter("password");
           switch (action) {

		case "registerStudent":
			
			int userId=Integer.parseInt(request.getParameter("uId"));
			System.out.println(username+" "+password+" "+userId);
			
			student= new StudentTO(username, password, userId, 0);
			
			user= new UserTO(username, password, "unblocked", 0);
			
			service.registerStudent(student, user);

			request.setAttribute("errorMessage", "Your details have been taken successfully");
			dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
	
			
			break;
		case "registerTeacher":
			int teacherId=Integer.parseInt(request.getParameter("tId"));
			
			teacher= new TeacherTO(username, password, teacherId, 1);
			System.out.println(username+" "+password+" "+teacherId);
			user= new UserTO(username, password, "unblocked", 1);
			service.registerTeacher(teacher, user);

			request.setAttribute("errorMessage", "Your details have been taken successfully");
			dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
	
			
			break;
		 case "login":
			
			
				
			user = service.login(username, password);
		
			if (user != null) {
				if(user.getRole()==2)
				{
					request.setAttribute("username", username);
					request.setAttribute("userdetails", user);
					dispatcher = request.getRequestDispatcher("welcome.jsp");
					dispatcher.forward(request, response);
					dispatcher = request.getRequestDispatcher("master_page.jsp");
					dispatcher.forward(request, response);
				}
				else
				{
				request.setAttribute("username", username);
				request.setAttribute("userdetails", user);
				dispatcher = request.getRequestDispatcher("welcome.jsp");
				dispatcher.forward(request, response);
				dispatcher = request.getRequestDispatcher("master_page.jsp");
				dispatcher.forward(request, response);
				}	
			} else {
				request.setAttribute("errorMessage", "Wrong Credentials, please try again!!");
				dispatcher = request.getRequestDispatcher("index.jsp");
				dispatcher.forward(request, response);
			}
			break;

		default:
			break;
		}
		

		
		
	}

}
