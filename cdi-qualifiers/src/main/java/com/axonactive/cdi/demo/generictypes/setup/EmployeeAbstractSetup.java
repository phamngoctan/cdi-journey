package com.axonactive.cdi.demo.generictypes.setup;

import java.util.List;
import java.util.function.Supplier;

import javax.inject.Inject;

import com.axonactive.cdi.demo.generictypes.builder.GenericBuilder;
import com.axonactive.cdi.demo.generictypes.entity.ContractEmployeeEntity;
import com.axonactive.cdi.demo.generictypes.model.Employee;
import com.axonactive.cdi.demo.generictypes.model.ContractEmployee;
import com.axonactive.cdi.demo.generictypes.service.dao.AbstractEmployeeContractDatabaseCommunicationService;
import com.axonactive.cdi.demo.generictypes.service.tomodel.EmployeeContractToModelService;

public abstract class EmployeeAbstractSetup<E extends ContractEmployeeEntity, M extends ContractEmployee, S extends Employee> implements EmployeeSetup<S> {
	
	protected abstract Supplier<S> getEmployeeInstantiator();
	
	@Inject
	protected AbstractEmployeeContractDatabaseCommunicationService<E, M> databaseCommunicationService;

	@Inject
	private EmployeeContractToModelService<E, M> toModelService;
	
	public S getEmployee() {
		List<E> employeeContracts = databaseCommunicationService.getEmployeeContractEntities();
		List<M> employeeContractModels = toModelService.toEmployeeContractModel(employeeContracts);
		return GenericBuilder.of(getEmployeeInstantiator()).with(Employee::setType, getType()).with(S::setContracts, employeeContractModels).build();
	}
	
}
