package com.axonactive.cdi.demo.model;

import javax.inject.Inject;

import com.axonactive.cdi.demo.service.SpecialLogger;

public class Checkout {
	
	@Inject
	private SpecialLogger logger;
	 
    public void finishCheckout() {
        logger.log("Finishing Checkout");
    }
}
