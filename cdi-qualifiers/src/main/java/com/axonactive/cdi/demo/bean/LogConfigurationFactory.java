package com.axonactive.cdi.demo.bean;

import javax.enterprise.inject.Produces;

public class LogConfigurationFactory {

	@Produces
	@DebugMode
	public LogConfiguration createDebugLogger() {
 
        return new LogConfiguration(false, true);
    }
	
	@Produces
	public LogConfiguration createInfoLogger() {
 
        return new LogConfiguration(true, false);
    }

}
