package com.axonactive.cdi.demo.generictypes.setup;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import com.axonactive.cdi.demo.generictypes.model.Employee;
import com.axonactive.cdi.demo.generictypes.model.EmployeeType;

public class SetupFactory {
	
	@Inject
	private Instance<EmployeeSetup<Employee>> employeeSetups;
	
	public EmployeeSetup<Employee> createSetup(EmployeeType type) {
		for (EmployeeSetup<Employee> accountSetup : employeeSetups) {
			if (accountSetup.getType() == type) {
				return accountSetup;
			}
		}
		return null;
	}

}
