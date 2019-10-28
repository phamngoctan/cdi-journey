package com.axonactive.cdi.demo.injectionpoint;

import javax.enterprise.inject.Produces;

public class EmployeeProducer {

	@Produces
	@CurrentSession
	public Employee produceEmployee() {
		EmployeeIml employee = new EmployeeIml();
		employee.setId(1L);
		employee.setName("Tan Pham");
		
		return employee;
	}
	
}
