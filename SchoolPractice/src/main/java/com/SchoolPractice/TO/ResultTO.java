package com.SchoolPractice.TO;

public class ResultTO {

	String username;
	String percentage;
	String status;
	
	
	public ResultTO() {

	}
	public ResultTO(String username, String percentage, String status) {
		super();
		this.username = username;
		this.percentage = percentage;
		this.status = status;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
