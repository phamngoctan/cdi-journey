package com.axonactive.cdi.demo.generictypes.service.tomodel;

import java.util.List;

import com.axonactive.cdi.demo.generictypes.entity.ContractEmployeeEntity;
import com.axonactive.cdi.demo.generictypes.model.ContractEmployee;

public interface EmployeeContractToModelService<E extends ContractEmployeeEntity, M extends ContractEmployee> {

	List<M> toEmployeeContractModel(List<E> employeeContracts);

}
