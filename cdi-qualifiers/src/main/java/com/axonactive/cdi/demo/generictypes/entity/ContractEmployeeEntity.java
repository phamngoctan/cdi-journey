package com.axonactive.cdi.demo.generictypes.entity;

public class ContractEmployeeEntity extends BaseEntity {
	private String type;
	private String specialTreatment;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpecialTreatment() {
		return specialTreatment;
	}

	public void setSpecialTreatment(String specialTreatment) {
		this.specialTreatment = specialTreatment;
	}
}
