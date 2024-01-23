package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class LogTable {
	@Id
	private int logId;
	private int userId;
	
	//@JsonFormat(pattern =""dd-MM-yyyy")
	@Transient
	private String date;
	private String description;
	public int getLogId() {
		return logId;
	}
	public void setLogId(int logId) {
		this.logId = logId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LogTable(int logId, int userId, String date, String description) {
		super();
		this.logId = logId;
		this.userId = userId;
		this.date = date;
		this.description = description;
	}
	@Override
	public String toString() {
		return "LogTable [logId=" + logId + ", userId=" + userId + ", date=" + date + ", description=" + description
				+ "]";
	}
	
}
