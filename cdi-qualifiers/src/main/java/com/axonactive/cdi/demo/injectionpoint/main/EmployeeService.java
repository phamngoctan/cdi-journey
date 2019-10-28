package com.axonactive.cdi.demo.injectionpoint.main;

import javax.inject.Inject;

import com.axonactive.cdi.demo.injectionpoint.CurrentSession;
import com.axonactive.cdi.demo.injectionpoint.Employee;

public class EmployeeService {

	@Inject
	private Employee employee;
	
	@Inject
	@CurrentSession
	private Employee employeeInCurrentSession;
	
	public Employee getEmployeeFromDefaultOne() {
		return employee;
	}
	
	public Employee getEmployeeFromCurrentSession() {
		return employeeInCurrentSession;
	}
	
}
