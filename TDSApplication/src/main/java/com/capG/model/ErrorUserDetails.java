package com.capG.model;

import java.util.Date;

public class ErrorUserDetails {
	//pojo class to print the details when ever there is an exception
	//which contains date , message and details of that exception
	private Date timestamp;
	private String message;
	private String details;
	
	
	public ErrorUserDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	
	
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
