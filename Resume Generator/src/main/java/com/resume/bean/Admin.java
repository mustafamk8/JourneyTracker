package com.resume.bean;

public class Admin {

	private Integer id;
	private String name;
	private String username;
	private String password;
	
	
	
	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Admin(Integer id, String name, String username, String password) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	
	
}
