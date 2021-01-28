package com.axonactive.cdi.demo.bean;

import javax.enterprise.inject.Instance;
import javax.enterprise.inject.spi.CDI;
import javax.inject.Inject;

import com.axonactive.cdi.demo.service.SpecialLogger;

public class Checkout {
	
	@Inject
	private SpecialLogger logger;
	 
    public void finishCheckout() {
        logger.log("Finishing Checkout");
//        System.out.println("Hello myI: " + myI.hashCode());
    }
    
//    @Inject
//    private MyInterface myI;
    
//    @Inject
//    private InterfaceWithoutImplementation inter;

    public void startPlayground() {
        Instance<InterfaceWithoutImplementation> select = CDI.current().select(InterfaceWithoutImplementation.class);
        boolean resolvable = select.isResolvable();
        InterfaceWithoutImplementation inter;
        if (resolvable) {
            inter = select.get();
            System.out.println(inter);
        } else {
            inter = null;
        }
        System.out.println("interface without implementation value: " + inter);
    }
    
}
