package com.email.dto;

public class EmailResponse {

	String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public EmailResponse(String token) {
		super();
		this.token = token;
	}

	public EmailResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
