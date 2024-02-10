package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import jakarta.validation.constraints.Size;

public class PersonV1 {
	@Size(min=2, message="Name should have at least 2 characters.")
	private String name;

	public PersonV1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "PersonV1 [name=" + name + "]";
	}
	
}
