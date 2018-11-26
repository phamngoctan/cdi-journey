package com.axonactive.cdi.demo;

public class EmailSender {

	public void sendEmailFor(Buyer buyer) {
        System.out.println("Sending email to: " + buyer.getEmail());
    }

}
