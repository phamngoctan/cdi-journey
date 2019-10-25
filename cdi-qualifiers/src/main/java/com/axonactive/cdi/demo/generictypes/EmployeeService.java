package com.axonactive.cdi.demo.generictypes;

import javax.inject.Inject;

import com.axonactive.cdi.demo.generictypes.model.Employee;
import com.axonactive.cdi.demo.generictypes.model.EmployeeType;
import com.axonactive.cdi.demo.generictypes.setup.SetupFactory;

public class EmployeeService {
	
	@Inject
	private SetupFactory setupFactory;
	
	public Employee maintainEmployee(EmployeeType employeeType) {
		return setupFactory.createSetup(employeeType).getEmployee();
	}

}
