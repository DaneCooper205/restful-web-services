package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import jakarta.validation.constraints.Size;

public class Name {
	@Size(min=1, message="first name should have at least 1 character.")
	private String firstName;
	@Size(min=1, message="last name should have at least 1 character.")
	private String lastName;

	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
