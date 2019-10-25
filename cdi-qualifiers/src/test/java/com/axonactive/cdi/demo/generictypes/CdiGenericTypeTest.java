package com.axonactive.cdi.demo.generictypes;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.axonactive.cdi.demo.generictypes.model.Employee;
import com.axonactive.cdi.demo.generictypes.model.EmployeeType;
import com.axonactive.cdi.demo.generictypes.model.LongTermContractEmployee;

public class CdiGenericTypeTest {
	
	private static WeldContainer container;
	@BeforeClass
	public static void init() {
		container = new Weld().initialize();
	}
	
	@AfterClass
	public static void close() {
		container.shutdown();
	}
	
	@Test
	public void autoPickInstanceOfGenericType() {
		// This line equals 
		/*
		 * @Inject
		   private EmployeeService employee;
		 */
//		WeldContainer container = new Weld().initialize();
		EmployeeService employee = container.select(EmployeeService.class).get();
		Employee longtermEmployee = employee.maintainEmployee(EmployeeType.LONGTERM);
		assertThat(longtermEmployee, notNullValue());
		assertThat(longtermEmployee.getType(), equalTo(EmployeeType.LONGTERM));
		assertThat(longtermEmployee.getContracts().size(), equalTo(1));
		assertThat(longtermEmployee.getContracts().get(0) instanceof LongTermContractEmployee, equalTo(true));
//		container.shutdown();
	}
	
	@Test(expected = NullPointerException.class)
	public void autoPickInstanceOfGenericType_errorCase() {
		EmployeeService employee = container.select(EmployeeService.class).get();
		employee.maintainEmployee(EmployeeType.FREELANCER);
	}
	
}
