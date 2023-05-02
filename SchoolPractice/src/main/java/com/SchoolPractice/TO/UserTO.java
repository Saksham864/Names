package com.SchoolPractice.TO;

public class UserTO {

	String username;
	String password;
	String status="unblocked";
	int role;
	
	
	
	public UserTO() {
		
	}

   public UserTO(String username, String password, String status, int role) {
		super();
		this.username = username;
		this.password = password;
		this.status = status;
		this.role = role;
	}
   
   public UserTO(String username, String password, int role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
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

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public int getRole() {
	return role;
}

public void setRole(int role) {
	this.role = role;
}
	
	
	
	
	
		
}
