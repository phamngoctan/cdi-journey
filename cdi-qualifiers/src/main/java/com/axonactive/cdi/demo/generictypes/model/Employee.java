package com.axonactive.cdi.demo.generictypes.model;

import java.time.LocalDate;
import java.util.List;

public class Employee {
	private Long id;
	private String name;
	private EmployeeType type;
	private List<? extends ContractEmployee> contracts;
	private LocalDate createdDate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
	
	public List<? extends ContractEmployee> getContracts() {
		return contracts;
	}

	public void setContracts(List<? extends ContractEmployee> contracts) {
		this.contracts = contracts;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

}
