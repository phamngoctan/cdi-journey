package com.axonactive.cdi.demo;

import javax.inject.Inject;

public class Checkout {

	@Inject
    private EmailSender emailSender;
 
    @Inject
    private MetricCreator metrics;
 
//    @Inject
//    private PushNotification pushNotification;
// 
//    @Inject
//    private KafkaMessager kafka;
// 
//    @Inject
//    private AmazonSqs amazonSqs;
 
    public void finishCheckout(Order order) {
        System.out.println("Finishing Checkout with Id: " + order.getId());
 
        emailSender.sendEmailFor(order.getBuyer());
 
        metrics.createMetricFor(order);
 
//        pushNotification.send(order);
// 
//        kafka.send(order.getId(), order.getBuyer());
// 
//        amazonSqs.send(order);
    }

}
