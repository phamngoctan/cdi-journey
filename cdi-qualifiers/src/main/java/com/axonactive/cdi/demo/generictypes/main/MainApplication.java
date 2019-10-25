package com.axonactive.cdi.demo.generictypes.main;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.axonactive.cdi.demo.generictypes.EmployeeService;
import com.axonactive.cdi.demo.generictypes.model.Employee;
import com.axonactive.cdi.demo.generictypes.model.EmployeeType;

public class MainApplication {
	public static void main(String[] args) {
		try (WeldContainer container = new Weld().initialize()) {
			EmployeeService employee = container.select(EmployeeService.class).get();
			// This line equals 
			/*
			 * @Inject
				private Checkout checkout;
			 */

			Employee longtermEmployee = employee.maintainEmployee(EmployeeType.LONGTERM);
			System.out.println(longtermEmployee.getType());
			
			Employee freelancerEmployee = employee.maintainEmployee(EmployeeType.FREELANCER);
			System.out.println(freelancerEmployee.getType());
		}
	}
}
