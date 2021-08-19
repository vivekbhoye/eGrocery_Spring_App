package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	
	@Id
	private String username;
	
	private String password;
	
	private String user_Type;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(String username, String password, String user_Type) {
		super();
		this.username = username;
		this.password = password;
		this.user_Type = user_Type;
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

	public String getUser_Type() {
		return user_Type;
	}

	public void setUser_Type(String user_Type) {
		this.user_Type = user_Type;
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", user_Type=" + user_Type + "]";
	}
	
	

}
