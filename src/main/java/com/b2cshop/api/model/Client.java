package com.b2cshop.api.model;

public class Client {

	private String firstName;
	private String lastName;
	private String email;
	
	//Get & Set
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Client [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
}
