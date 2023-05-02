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

public class AdminRepository {

	Connection conn = DBConnection.getConnection();
	
	public void blockUser(String name) {

		try {
			PreparedStatement statement = conn.prepareStatement("update user set status= 'blocked' where user_name=?");

			statement.setString(1, name);

			statement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Inside catch of blockStudent");
			e.printStackTrace();
		}
	}
	public void unblockUser(String name) {

		try {
			PreparedStatement statement = conn.prepareStatement("update user set status= 'unblocked' where user_name=?");

			statement.setString(1, name);

			statement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Inside catch of unblockStudent");
			e.printStackTrace();
		}
	}
	
	
}
