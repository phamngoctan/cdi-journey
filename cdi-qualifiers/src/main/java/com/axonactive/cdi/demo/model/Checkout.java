package com.axonactive.cdi.demo.model;

import com.axonactive.cdi.demo.service.SpecialLogger;

public class Checkout {
	private SpecialLogger logger;
	 
    public void finishCheckout() {
        logger.log("Finishing Checkout");
    }
}
