package com.axonactive.cdi.demo;

public class CheckoutEvent {

	private Order order;

	public CheckoutEvent(Order order) {
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

}
