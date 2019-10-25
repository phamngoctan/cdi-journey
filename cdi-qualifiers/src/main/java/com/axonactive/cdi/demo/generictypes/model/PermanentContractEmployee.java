package com.axonactive.cdi.demo.generictypes.model;

public class PermanentContractEmployee extends ContractEmployee {
	private static final long serialVersionUID = 1L;
	private String permanentSpecialTreatment;

	public String getPermanentSpecialTreatment() {
		return permanentSpecialTreatment;
	}

	public void setPermanentSpecialTreatment(String permanentSpecialTreatment) {
		this.permanentSpecialTreatment = permanentSpecialTreatment;
	}

//	@Override
	public String getSpecialTreatment() {
		return permanentSpecialTreatment;
	}
	
}
