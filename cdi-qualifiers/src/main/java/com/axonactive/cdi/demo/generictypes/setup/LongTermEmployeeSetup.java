package com.axonactive.cdi.demo.generictypes.setup;

import java.util.function.Supplier;

import com.axonactive.cdi.demo.generictypes.entity.ContractEmployeeEntity;
import com.axonactive.cdi.demo.generictypes.model.Employee;
import com.axonactive.cdi.demo.generictypes.model.EmployeeType;
import com.axonactive.cdi.demo.generictypes.model.LongTermContractEmployee;

public class LongTermEmployeeSetup extends EmployeeAbstractSetup<ContractEmployeeEntity, LongTermContractEmployee, Employee> {

	@Override
	public EmployeeType getType() {
		return EmployeeType.LONGTERM;
	}

	@Override
	protected Supplier<Employee> getEmployeeInstantiator() {
		return Employee::new;
	}

}
