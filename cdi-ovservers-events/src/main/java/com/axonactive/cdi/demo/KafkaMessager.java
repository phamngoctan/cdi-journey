package com.axonactive.cdi.demo;

public interface KafkaMessager {

	void send(Long id, Buyer buyer);

}
