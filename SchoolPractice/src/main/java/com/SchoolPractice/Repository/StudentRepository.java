package com.SchoolPractice.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.SchoolPractice.DB.DBConnection;
import com.SchoolPractice.TO.StudentTO;
import com.SchoolPractice.TO.UserTO;

public class StudentRepository {

	Connection conn = DBConnection.getConnection();
	
	public List<StudentTO> findAll() {

		List<StudentTO> students = new ArrayList<>();

		try {

			PreparedStatement statement = conn.prepareStatement("select * from student");
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {

				String username = resultSet.getString(1);
				String password = resultSet.getString(2);
				int userId= resultSet.getInt(3);
				int role = resultSet.getInt(4);

			 StudentTO student = new StudentTO(username, password, userId,role);
				students.add(student);
			}

		} catch (Exception e) {
			System.out.println("inside catch of findAll of StudentRepository");
		}

		return students;
	}
	
	public void deleteStudent(String username) {

		try {
			PreparedStatement statement = conn.prepareStatement("delete from student where user_name=?");

			statement.setString(1, username);

			statement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Inside catch of deleteStudent");
			e.printStackTrace();
		}
		

	}
	public void updateStudent(String oldname, String username, int id) {

		try {
			PreparedStatement statement = conn.prepareStatement("update student set user_name= ? , student_id= ? where user_name=?");

			statement.setString(1, username);
			statement.setInt(2, id);
			statement.setString(3, oldname);
			

			statement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Inside catch of updateUser");
			e.printStackTrace();
		}
	
	}
	public List<StudentTO> findStudent(String username) {

		List<StudentTO> students = new ArrayList<>();

		try {

			PreparedStatement statement = conn.prepareStatement("select * from student where user_name=?");
			statement.setString(1, username);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				String password = resultSet.getString(2);
				int userId= resultSet.getInt(3);
				int role = resultSet.getInt(4);

			 StudentTO student = new StudentTO(username, password, userId,role);
				students.add(student);
			}

		} catch (Exception e) {
			System.out.println("inside catch of findAll of StudentRepository");
		}

		return students;
	}
	
	
}
