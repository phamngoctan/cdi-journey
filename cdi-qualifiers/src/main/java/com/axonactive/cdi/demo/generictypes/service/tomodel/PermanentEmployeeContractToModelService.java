package com.axonactive.cdi.demo.generictypes.service.tomodel;

import java.util.List;
import java.util.stream.Collectors;

import com.axonactive.cdi.demo.generictypes.entity.ContractEmployeeEntity;
import com.axonactive.cdi.demo.generictypes.model.PermanentContractEmployee;

public class PermanentEmployeeContractToModelService implements EmployeeContractToModelService<ContractEmployeeEntity, PermanentContractEmployee> {
//public class LongTermEmployeeContractToModelService implements EmployeeContractToModelService<ContractEmployeeEntity, ContractEmployee> {

	@Override
//	public List<ContractEmployee> toEmployeeContractModel(List<ContractEmployeeEntity> employeeContracts) {
	public List<PermanentContractEmployee> toEmployeeContractModel(List<ContractEmployeeEntity> employeeContracts) {
		return employeeContracts.stream()
				.map(entity -> {
					PermanentContractEmployee employeeContract = new PermanentContractEmployee();
						employeeContract.setId(entity.getId());
						employeeContract.setType(entity.getType());
						employeeContract.setCreatedDate(entity.getCreatedDate());
						employeeContract.setPermanentSpecialTreatment(entity.getSpecialTreatment());
						return employeeContract;
					})
				.collect(Collectors.toList());
	}

}
