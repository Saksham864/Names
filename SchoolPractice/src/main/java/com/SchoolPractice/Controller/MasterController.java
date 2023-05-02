package com.SchoolPractice.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.SchoolPractice.Service.*;
import com.SchoolPractice.TO.*;

@WebServlet("/master")
public class MasterController extends HttpServlet {

	StudentService studentService = new StudentService();
	UserService userService = new UserService();
	TeacherService teacherService = new TeacherService();
	AdminService adminService = new AdminService();
	StudentTO studentt = new StudentTO();
	RequestDispatcher dispatcher = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("insdie Master Controller...");
		String action = request.getParameter("action");
		System.out.println(action);

		switch (action) {
		//This method is used to List of the Students
		case "list": {
			List<StudentTO> students = studentService.getAllStudents();
			// System.out.println(users.get(0));
			request.setAttribute("users", students);
			request.setAttribute("role", studentt.getRole());
			dispatcher = request.getRequestDispatcher("listAll.jsp");
			dispatcher.forward(request, response);
			break;
		}
		//This Method is used to delete Users i.e Teacher and Student
		case "delete": {
			System.out.println(action);
			String username = request.getParameter("username");
			System.out.println(username);

			userService.deleteUser(username);
			List<UserTO> student1 = userService.findUser();
			request.setAttribute("results", student1);
			dispatcher = request.getRequestDispatcher("list_user.jsp");
			dispatcher.forward(request, response);
			break;
		}
		//This method is used to block student and teachers
		case "block": {
			String username = request.getParameter("username");
			adminService.blockUser(username);
			List<StudentTO> student1 = studentService.getAllStudents();
			request.setAttribute("users", student1);
			request.setAttribute("message", "User Blocked Sucessfully");
			dispatcher = request.getRequestDispatcher("listAll.jsp");
			dispatcher.forward(request, response);
			break;

		}
		//To Unblock Student and Teachers
		case "unblock": {
			String username = request.getParameter("username");
			adminService.blockUser(username);
			List<StudentTO> student1 = studentService.getAllStudents();
			request.setAttribute("users", student1);
			request.setAttribute("message", "User unblocked Sucessfully");
			dispatcher = request.getRequestDispatcher("listAll.jsp");
			dispatcher.forward(request, response);
			break;

		}
		//To find All Students
		case "findStudent": {
			String username = request.getParameter("username");
			System.out.println(username);
			List<StudentTO> students = studentService.findStudent(username);
			request.setAttribute("results", students);
			// request.setAttribute("role", userr.getRole());
			dispatcher = request.getRequestDispatcher("list_students.jsp");
			dispatcher.forward(request, response);
			break;
		}
		//To find all teachers
		case "findTeacher": {
			String username = request.getParameter("username");
			System.out.println(username);
			List<TeacherTO> teachers = teacherService.findTeacher(username);
			request.setAttribute("results", teachers);
			// request.setAttribute("role", userr.getRole());
			dispatcher = request.getRequestDispatcher("List_teacher.jsp");
			dispatcher.forward(request, response);
			break;
		}
		//To find all users
		case "findUser": {
			List<UserTO> users = userService.findUser();
			request.setAttribute("results", users);
			// request.setAttribute("role", userr.getRole());
			dispatcher = request.getRequestDispatcher("list_user.jsp");
			dispatcher.forward(request, response);
			break;
		}

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		switch (action) {
		//To update Student
		case "update": {
			String oldname = request.getParameter("Oldname");
			String name = request.getParameter("Upname");
			int id = Integer.parseInt(request.getParameter("UpId"));

			studentService.updateUser(oldname, name, id);
			List<StudentTO> student1 = studentService.findStudent(name);
			request.setAttribute("users", student1);
			dispatcher = request.getRequestDispatcher("list_students.jsp");
			dispatcher.forward(request, response);
			break;

		}
		//To update Teacher
		case "updateTeacher": {
			String oldname = request.getParameter("Oldname");
			String name = request.getParameter("Tname");
			int id = Integer.parseInt(request.getParameter("tId"));

			teacherService.updateTeacher(oldname, name, id);
			List<StudentTO> teacher1 = studentService.findStudent(name);
			request.setAttribute("users", teacher1);
			dispatcher = request.getRequestDispatcher("List_teacher.jsp");
			dispatcher.forward(request, response);
			break;
		}
		//To update User
		case "updateUser": {
			String oldname = request.getParameter("Oldname");
			String name = request.getParameter("Upname");
			int id = Integer.parseInt(request.getParameter("UpId"));

			userService.updateUser(oldname, name, id);
			List<UserTO> teacher1 = userService.findUser();
			request.setAttribute("users", teacher1);
			dispatcher = request.getRequestDispatcher("list_user.jsp");
			dispatcher.forward(request, response);
			break;
		}
		}

	}

}
