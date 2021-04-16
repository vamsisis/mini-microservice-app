package com.example.demo.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {
	
	@NotNull(message="First Name cannot be null")
	@Size(min=5, max=8 , message="firstname must be equal or greater than 5 char and less than 8 char")
	private String firstName;
	
	@NotNull(message="Last Name cannot be null")
	@Size(min=5, max=8 , message="lastname must be equal or greater than 5 char and less than 8 char")
	private String lastName;
	
	@NotNull(message="Email cannot be null")
	@Email
	private String email;
	
	@NotNull(message="password cannot be null")
	@Size(min=8,max=16, message = "Password must be equal or greater than 8 char and less than 16 characters")
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
