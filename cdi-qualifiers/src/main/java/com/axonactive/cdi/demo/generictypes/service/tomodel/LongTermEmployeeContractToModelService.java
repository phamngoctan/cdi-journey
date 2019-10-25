package com.axonactive.cdi.demo.generictypes.service.tomodel;

import java.util.List;
import java.util.stream.Collectors;

import com.axonactive.cdi.demo.generictypes.entity.ContractEmployeeEntity;
import com.axonactive.cdi.demo.generictypes.model.LongTermContractEmployee;

public class LongTermEmployeeContractToModelService implements EmployeeContractToModelService<ContractEmployeeEntity, LongTermContractEmployee> {
//public class LongTermEmployeeContractToModelService implements EmployeeContractToModelService<ContractEmployeeEntity, ContractEmployee> {

	@Override
//	public List<ContractEmployee> toEmployeeContractModel(List<ContractEmployeeEntity> employeeContracts) {
	public List<LongTermContractEmployee> toEmployeeContractModel(List<ContractEmployeeEntity> employeeContracts) {
		return employeeContracts.stream()
				.map(entity -> {
						LongTermContractEmployee employeeContract = new LongTermContractEmployee();
						employeeContract.setId(entity.getId());
						employeeContract.setType(entity.getType());
						employeeContract.setCreatedDate(entity.getCreatedDate());
						employeeContract.setLongtermSpecialTreatment(entity.getSpecialTreatment());
						return employeeContract;
					})
				.collect(Collectors.toList());
	}

}
