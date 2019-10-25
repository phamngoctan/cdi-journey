package com.axonactive.cdi.demo.generictypes.model;

public class FreelancerContractEmployee extends ContractEmployee {
	private static final long serialVersionUID = 1L;
	private String freelancerSpecialTreatment;

	public String getFreelancerSpecialTreatment() {
		return freelancerSpecialTreatment;
	}

	public void setFreelancerSpecialTreatment(String freelancerSpecialTreatment) {
		this.freelancerSpecialTreatment = freelancerSpecialTreatment;
	}

//	@Override
	public String getSpecialTreatment() {
		return freelancerSpecialTreatment;
	}
	
}
