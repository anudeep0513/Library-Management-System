package com.project.library_management_system.dto;

import java.io.Serializable;

public class User implements Serializable{

	private int userId;
	private String userName;
	private String password;
	private String email;
	private int booksBorrowed;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBooksBorrowed() {
		// TODO Auto-generated method stub
		return booksBorrowed;
	}
	
	
}
