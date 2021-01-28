package com.axonactive.cdi.demo.main;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.axonactive.cdi.demo.bean.Checkout;

public class MainApplication {

	public static void main(String[] args) {
		try (WeldContainer container = new Weld().initialize()) {
			Checkout checkout = container.select(Checkout.class).get();
			// This line equals 
			/*
			 * @Inject
				private Checkout checkout;
			 */

			checkout.finishCheckout();
			checkout.startPlayground();
		}
	}

}
