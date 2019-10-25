package com.axonactive.cdi.demo.generictypes.model;

import java.io.Serializable;
import java.time.LocalDate;

public class ContractEmployee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String type;
	private LocalDate createdDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	
//	public abstract String getSpecialTreatment();
	
}
