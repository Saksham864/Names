package com.SchoolPractice.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.SchoolPractice.DB.DBConnection;
import com.SchoolPractice.TO.ResultTO;
import com.SchoolPractice.TO.StudentTO;
import com.SchoolPractice.TO.TeacherTO;
import com.SchoolPractice.TO.UserTO;



public class TeacherRepository {
	Connection conn = DBConnection.getConnection();
	
	public List<TeacherTO> findStudent(String username) {

		List<TeacherTO> teachers = new ArrayList<>();

		try {

			PreparedStatement statement = conn.prepareStatement("select * from teacher where user_name=?");
			statement.setString(1, username);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				String password = resultSet.getString(2);
				int teacherId= resultSet.getInt(3);
				int role = resultSet.getInt(4);

			 TeacherTO teacher = new TeacherTO(username, password, teacherId,role);
				teachers.add(teacher);
			}

		} catch (Exception e) {
			System.out.println("inside catch of findAll of StudentRepository");
		}

		return teachers;
	}
	public void updateTeacher(String oldname, String username, int id) {

		try {
			PreparedStatement statement = conn.prepareStatement("update teacher set user_name= ? , teacher_id= ? where user_name=?");

			statement.setString(1, username);
			statement.setInt(2, id);
			statement.setString(3, oldname);
			

			statement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Inside catch of updateUser");
			e.printStackTrace();
		}
	
	}

//	public void addTeacher(TeacherTO teacher) {
//
//		try {
//			PreparedStatement statement = conn.prepareStatement("insert into teacher values(?, ?, ?, ?)");
//
//			statement.setString(1, teacher.getUsername());
//			statement.setString(2, teacher.getPassword());			
//			statement.setInt(3, teacher.getTeacherId());
//			statement.setInt(4, teacher.getRole());
//
//			statement.executeUpdate();
//
//		} catch (Exception e) {
//			System.out.println("inside catch of addTeacher() of TeacherRepository");
//			e.printStackTrace();
//		}
//	}

//	public UserTO findUser(String username, String password) {
//		UserTO user = null;
//
//		try {
//			PreparedStatement statement = conn
//					.prepareStatement("select * from user where user_name = ? and password = ?");
//
//			statement.setString(1, username);
//			statement.setString(2, password);
//
//			ResultSet resultSet = statement.executeQuery();
//
//			while(resultSet.next()) {
//
//				int userId=resultSet.getInt(3);
//				int role = resultSet.getInt(4);
//
//				user = new UserTO(username, password, userId,role);
//				System.out.println(user);
//			}
//		} catch (Exception e) {
//			System.out.println("inside catch of addUser() of UserRepository");
//			e.printStackTrace();
//		}
//
//		return user;
//	}
//
//	public List<UserTO> findAll() {
//
//		List<UserTO> users = new ArrayList<UserTO>();
//
//		try {
//
//			PreparedStatement statement = conn.prepareStatement("select * from user");
//			ResultSet resultSet = statement.executeQuery();
//
//			while (resultSet.next()) {
//
//				String username = resultSet.getString(1);
//				String password = resultSet.getString(2);
//				int userId= resultSet.getInt(3);
//				int role = resultSet.getInt(4);
//
//				UserTO user = new UserTO(username, password, userId,role);
//				users.add(user);
//			}
//
//		} catch (Exception e) {
//			System.out.println("inside catch of findAll of UserRepository");
//			e.printStackTrace();
//		}
//
//		return users;
//	}
//	public void deleteUser(String username) {
//
//		try {
//			PreparedStatement statement = conn.prepareStatement("delete from user where user_name=?");
//
//			statement.setString(1, username);
//
//			statement.executeUpdate();
//
//		} catch (SQLException e) {
//			System.out.println("Inside catch of deleteUser");
//			e.printStackTrace();
//		}
//		
//
//	}
//	public void updateUser(String oldname, String username, int id) {
//
//		try {
//			PreparedStatement statement = conn.prepareStatement("update user set user_name= ? , user_id= ? where user_name=?");
//
//			statement.setString(1, username);
//			statement.setInt(2, id);
//			statement.setString(3, oldname);
//			
//
//			statement.executeUpdate();
//
//		} catch (SQLException e) {
//			System.out.println("Inside catch of deleteUser");
//			e.printStackTrace();
//		}
//	
//	}
//	public List<ResultTO> fetchResult(String username)
//	{
//		List<ResultTO> results = new ArrayList<>();
//System.out.println(username);
//		try {
//
//			PreparedStatement statement = conn.prepareStatement("select * from result where student_name = ?");
//			statement.setString(1, username);
//			ResultSet resultSet = statement.executeQuery();
//
//			while (resultSet.next()) {
//               
//				String percentage=resultSet.getString(2);
//				String status=resultSet.getString(3);
//				
//				ResultTO result= new ResultTO(username, percentage, status);
//				results.add(result);
//			}
//
//		} catch (SQLException e) {
//			System.out.println("Inside catch of fetchResult");
//			e.printStackTrace();
//		}
//		return results;
//	}
}
