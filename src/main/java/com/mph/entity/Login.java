package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_Id;
	
	private String username;
	
	private String password;
	
	private String user_Type;

	public Login() {
		super();
	}

	public Login(int user_Id, String username, String password, String user_Type) {
		super();
		this.user_Id = user_Id;
		this.username = username;
		this.password = password;
		this.user_Type = user_Type;
	}

	public int getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
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
		return "Login [user_Id=" + user_Id + ", username=" + username + ", password=" + password + ", user_Type="
				+ user_Type + "]";
	}

}
