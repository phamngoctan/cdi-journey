package com.axonactive.cdi.demo;

public interface AmazonSqs {

	void send(Order order);

}
