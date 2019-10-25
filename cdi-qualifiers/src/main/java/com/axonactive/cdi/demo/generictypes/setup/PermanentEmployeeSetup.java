package com.axonactive.cdi.demo.generictypes.setup;

import java.util.function.Supplier;

import com.axonactive.cdi.demo.generictypes.entity.ContractEmployeeEntity;
import com.axonactive.cdi.demo.generictypes.model.ContractEmployee;
import com.axonactive.cdi.demo.generictypes.model.Employee;
import com.axonactive.cdi.demo.generictypes.model.EmployeeType;
import com.axonactive.cdi.demo.generictypes.model.PermanentContractEmployee;

//public class PermanentEmployeeSetup extends EmployeeAbstractSetup<ContractEmployeeEntity, PermanentContractEmployee, Employee> {
public class PermanentEmployeeSetup extends EmployeeAbstractSetup<ContractEmployeeEntity, ContractEmployee, Employee> {
	// At some point of time, if we declare this line, there will be an exception
	// org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type EmployeeContractToModelService<ContractEmployeeEntity, ContractEmployee> with qualifiers @Default
	// The point is that the message is so general, after sometimes to play around. I figured out that the missing dependencies come from the missing of toModelService of this PermanentEmployeeSetup class
	// NOT the service of LongTermEmployeeContractToModelService. This takes time to recognize =))
	
	@Override
	public EmployeeType getType() {
		return EmployeeType.PERMANENT;
	}

	@Override
	protected Supplier<Employee> getEmployeeInstantiator() {
		return Employee::new;
	}

}
