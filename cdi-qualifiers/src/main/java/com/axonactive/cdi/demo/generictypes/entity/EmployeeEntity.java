package com.axonactive.cdi.demo.generictypes.entity;

import java.util.List;

import com.axonactive.cdi.demo.generictypes.model.EmployeeType;

public class EmployeeEntity extends BaseEntity {
	
	private String name;
	private EmployeeType type;
	private List<? extends ContractEmployeeEntity> contracts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeType getType() {
		return type;
	}

	public void setType(EmployeeType type) {
		this.type = type;
	}

	public List<? extends ContractEmployeeEntity> getContracts() {
		return contracts;
	}

	public void setContracts(List<? extends ContractEmployeeEntity> contracts) {
		this.contracts = contracts;
	}

}
