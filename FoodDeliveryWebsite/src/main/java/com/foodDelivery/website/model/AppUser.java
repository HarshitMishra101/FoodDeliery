package com.foodDelivery.website.model;

import jakarta.persistence.*;

@MappedSuperclass
public class AppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String username;
	private String password;
	public int getUserId() {
		return userId;
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
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}
