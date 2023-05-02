package com.SchoolPractice.TO;

public class TeacherTO {

	String username;
	String password;
	int teacherId;
	int role=1;
	
	
	
	public TeacherTO() {
		
	}
	public TeacherTO(String username, String password, int teacherId, int role) {
		super();
		this.username = username;
		this.password = password;
		this.teacherId = teacherId;
		this.role = role;
	}
	public TeacherTO(String username, String password, int teacherId) {
		super();
		this.username = username;
		this.password = password;
		this.teacherId = teacherId;
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
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
	
	
}
