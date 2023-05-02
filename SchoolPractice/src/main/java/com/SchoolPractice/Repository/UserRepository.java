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




public class UserRepository {
	Connection conn = DBConnection.getConnection();
//To register Teacher
	public void RegisterTeacher(TeacherTO teacher, UserTO user) {

		try {
			PreparedStatement statement = conn.prepareStatement("insert into teacher values(?, ?, ?, ?)");

			statement.setString(1, teacher.getUsername());
			statement.setString(2, teacher.getPassword());			
			statement.setInt(3, teacher.getTeacherId());
			statement.setInt(4, teacher.getRole());

			statement.executeUpdate();
			
			statement = conn.prepareStatement("insert into user values(?, ?, ?, ?)");

			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());			
			statement.setString(3, user.getStatus());
			statement.setInt(4, user.getRole());

			statement.executeUpdate();

		} catch (Exception e) {
			System.out.println("inside catch of addUser() of UserRepository");
			e.printStackTrace();
		}
	}
	//To register Student
	public void RegisterStudent(StudentTO student, UserTO user) {

		try {
			PreparedStatement statement = conn.prepareStatement("insert into student values(?, ?, ?, ?)");

			statement.setString(1, student.getUsername());
			statement.setString(2, student.getPassword());			
			statement.setInt(3, student.getUserId());
			statement.setInt(4, student.getRole());

			statement.executeUpdate();
			
			statement = conn.prepareStatement("insert into user values(?, ?, ?, ?)");

			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());			
			statement.setString(3, user.getStatus());
			statement.setInt(4, user.getRole());

			statement.executeUpdate();

		} catch (Exception e) {
			System.out.println("inside catch of addUser() of UserRepository");
			e.printStackTrace();
		}
	}
//To find all users
	public UserTO findUser(String username, String password) {
		UserTO user = null;

		try {
			PreparedStatement statement = conn
					.prepareStatement("select * from user where user_name = ? and password = ? and status=?");

			statement.setString(1, username);
			statement.setString(2, password);
			statement.setString(3, "unblocked");

			ResultSet resultSet = statement.executeQuery();

			while(resultSet.next()) {

				String status=resultSet.getString(3);
				int role = resultSet.getInt(4);

				user = new UserTO(username, password, status,role);
				System.out.println(user);
			}
		} catch (Exception e) {
			System.out.println("inside catch of FinfUser() of UserRepository");
			e.printStackTrace();
		}

		return user;
	}
	
	
	public List<UserTO> findUser() {

		List<UserTO> users = new ArrayList<>();

		try {

			PreparedStatement statement = conn.prepareStatement("select * from user");
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {

				String username = resultSet.getString(1);
				String password = resultSet.getString(2);
				String status= resultSet.getString(3);
				int role = resultSet.getInt(4);

				UserTO user = new UserTO(username, password, status ,role);
				users.add(user);
			}

		} catch (Exception e) {
			System.out.println("inside catch of findStudent of UserRepository");
			e.printStackTrace();
		}

		return users;
	}
	//To delete user
	public void deleteUser(String username) {

		try {
			PreparedStatement statement = conn.prepareStatement("delete from user where user_name=?");

			statement.setString(1, username);

			statement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Inside catch of deleteUser");
			e.printStackTrace();
		}
		

	}
	//To update user
	public void updateUser(String oldname, String username, int id) {

		try {
			PreparedStatement statement = conn.prepareStatement("update user set user_name= ? , user_id= ? where user_name=?");

			statement.setString(1, username);
			statement.setInt(2, id);
			statement.setString(3, oldname);
			

			statement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Inside catch of deleteUser");
			e.printStackTrace();
		}
	
	}

}
