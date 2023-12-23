package com.resume.bean;

public class Faculty {

	private String email;
	private String name;
	private String password;
	private String department;
	public Faculty() {
		// TODO Auto-generated constructor stub
	}
	public Faculty(String email, String name, String password, String department) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
