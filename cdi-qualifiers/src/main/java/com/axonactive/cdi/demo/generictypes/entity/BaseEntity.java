package com.axonactive.cdi.demo.generictypes.entity;

import java.time.LocalDate;

public class BaseEntity {
	
	private Long id;
	private LocalDate createdDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	
}
