package com.HMHDP.model;

public class ErrorResonse {

	private String message;
	private String description;
		
	public ErrorResonse(String message, String description) {
		super();
		this.message = message;
		this.description = description;
	}
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
