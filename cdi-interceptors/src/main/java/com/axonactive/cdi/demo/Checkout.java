package com.axonactive.cdi.demo;

import javax.inject.Inject;

public class Checkout {

//	@Inject
//    private Auditor auditor;
 
    @Inject
    private MyLogger logger;
 
    @Auditable
    public void finishCheckout() {
        logger.log("Finishing Checkout");
 
//        auditor.audit();
    }

}
