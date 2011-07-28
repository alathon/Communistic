package com.cphse.dto;

public class EmailAddress {
	private String name;
	private String email;
	
	public EmailAddress(String email, String name) {
		this.name = name;
		this.email = email;
	}

	public EmailAddress() {
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
