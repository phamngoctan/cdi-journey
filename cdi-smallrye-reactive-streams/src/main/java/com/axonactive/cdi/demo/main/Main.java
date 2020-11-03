package com.axonactive.cdi.demo.main;

import javax.enterprise.inject.se.SeContainerInitializer;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {
    public static void main(String[] args) {
//        SeContainerInitializer.newInstance().initialize();
        try (WeldContainer container = new Weld().initialize()) {
//            MyBean checkout = container.select(MyBean.class).get();
        }
    }
}
