package com.axonactive.cdi.demo.generictypes.setup;

import com.axonactive.cdi.demo.generictypes.model.Employee;
import com.axonactive.cdi.demo.generictypes.model.EmployeeType;

public interface EmployeeSetup<S extends Employee> {
	EmployeeType getType();
	S getEmployee();
}
