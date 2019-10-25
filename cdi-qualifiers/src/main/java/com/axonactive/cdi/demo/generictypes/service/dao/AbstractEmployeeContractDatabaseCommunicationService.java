package com.axonactive.cdi.demo.generictypes.service.dao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.axonactive.cdi.demo.generictypes.builder.GenericBuilder;
import com.axonactive.cdi.demo.generictypes.entity.ContractEmployeeEntity;
import com.axonactive.cdi.demo.generictypes.model.ContractEmployee;
import com.axonactive.cdi.demo.generictypes.model.EmployeeType;

public class AbstractEmployeeContractDatabaseCommunicationService<E extends ContractEmployeeEntity, M extends ContractEmployee> {
	
	public List<E> getEmployeeContractEntities() {
//		ContractEmployeeEntity contract1 = GenericBuilder.of(ContractEmployeeEntity::new)
//				.with(ContractEmployeeEntity::setId, 1L)
//				.with(ContractEmployeeEntity::setType, EmployeeType.FREELANCER.name())
//				.with(ContractEmployeeEntity::setCreatedDate, LocalDate.now())
//				.with(ContractEmployeeEntity::setSpecialTreatment, "FREELANCER SpecialTreatment")
//				.build();
//		ContractEmployeeEntity contract2 = GenericBuilder.of(ContractEmployeeEntity::new)
//				.with(ContractEmployeeEntity::setId, 2L)
//				.with(ContractEmployeeEntity::setType, EmployeeType.LONGTERM.name())
//				.with(ContractEmployeeEntity::setCreatedDate, LocalDate.now())
//				.with(ContractEmployeeEntity::setSpecialTreatment, "LONGTERM SpecialTreatment")
//				.build();
//		ContractEmployeeEntity contract3 = GenericBuilder.of(ContractEmployeeEntity::new)
//				.with(ContractEmployeeEntity::setId, 3L)
//				.with(ContractEmployeeEntity::setType, EmployeeType.PERMANENT.name())
//				.with(ContractEmployeeEntity::setCreatedDate, LocalDate.now())
//				.with(ContractEmployeeEntity::setSpecialTreatment, "PERMANENT SpecialTreatment")
//				.build();
//		ContractEmployeeEntity contract4 = GenericBuilder.of(ContractEmployeeEntity::new)
//				.with(ContractEmployeeEntity::setId, 4L)
//				.with(ContractEmployeeEntity::setType, EmployeeType.TEMPORAL.name())
//				.with(ContractEmployeeEntity::setCreatedDate, LocalDate.now())
//				.with(ContractEmployeeEntity::setSpecialTreatment, "TEMPORAL SpecialTreatment")
//				.build();
		
//		return (List<E>) Arrays.asList(contract1, contract2, contract3, contract4);
		ContractEmployeeEntity contract1 = GenericBuilder.of(ContractEmployeeEntity::new)
				.with(ContractEmployeeEntity::setId, 1L)
				.with(ContractEmployeeEntity::setType, EmployeeType.LONGTERM.name())
				.with(ContractEmployeeEntity::setCreatedDate, LocalDate.now())
				.with(ContractEmployeeEntity::setSpecialTreatment, "SpecialTreatment")
				.build();
		return (List<E>) Arrays.asList(contract1);
	}
	
}
