package com.SchoolPractice.TO;

public class StudentTO {

	String username;
	String password;
	int userId;
	int role=0;
	
	
	
	public StudentTO() {
	
	}

	public StudentTO(String username, String password, int userId, int role) {
		super();
		this.username = username;
		this.password = password;
		this.userId = userId;
		this.role = role;
	}
	
	public StudentTO(String username, String password, int userId) {
		super();
		this.username = username;
		this.password = password;
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "StudentTO [username=" + username + ", password=" + password + ", userId=" + userId + ", role=" + role
				+ "]";
	}
	
	
	
	
}
