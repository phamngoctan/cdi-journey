package com.axonactive.cdi.demo.injectionpoint;

public class EmployeeIml implements Employee {
	private Long id;
	private String name;
	private ResponseType responseType;
	
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public ResponseType getResponseType() {
		// TODO Auto-generated method stub
		return responseType;
	}

	public void setResponseType(ResponseType responseType) {
		this.responseType = responseType;
	}
	
}
