package com.axonactive.cdi.demo.injectionpoint;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.axonactive.cdi.demo.injectionpoint.main.EmployeeService;

public class InjectionPointTest {
	
	private static WeldContainer container;
	private EmployeeService employeeService;
	
	@BeforeClass
	public static void initBeforeClass() {
		container = new Weld().initialize();
	}
	
	@AfterClass
	public static void close() {
		container.shutdown();
	}
	
	@Before
	public void init() {
		employeeService = container.select(EmployeeService.class).get();
		
		container.select(EmployeeService.class).get();
	}
	
	@Test
	public void test_injectionPoint() {
		Employee employee = employeeService.getEmployeeFromDefaultOne();
		assertThat(employee, notNullValue());
		assertThat(employee.getId(), equalTo(null));
		assertThat(employee.getName(), equalTo(null));
		
		Employee employeeInCurrentSession = employeeService.getEmployeeFromCurrentSession();
		assertThat(employeeInCurrentSession, notNullValue());
		assertThat(employeeInCurrentSession.getId(), equalTo(1L));
		assertThat(employeeInCurrentSession.getName(), equalTo("Tan Pham"));
	}
	
}
