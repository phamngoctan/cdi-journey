package com.axonactive.cdi.demo;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class MainApplication {

	public static void main(String[] args) {
		try (WeldContainer container = new Weld().initialize()) {
			Checkout checkout = container.select(Checkout.class).get();

			checkout.finishCheckout();
		}
	}

}
