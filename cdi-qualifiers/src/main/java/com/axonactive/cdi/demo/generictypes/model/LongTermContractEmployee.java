package com.axonactive.cdi.demo.generictypes.model;

public class LongTermContractEmployee extends ContractEmployee {
	private static final long serialVersionUID = 1L;

	private String longtermSpecialTreatment;

	public String getLongtermSpecialTreatment() {
		return longtermSpecialTreatment;
	}

	public void setLongtermSpecialTreatment(String longtermSpecialTreatment) {
		this.longtermSpecialTreatment = longtermSpecialTreatment;
	}

	@Override
	public String getSpecialTreatment() {
		return longtermSpecialTreatment;
	}
	
}
