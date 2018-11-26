package com.axonactive.cdi.demo.bean;

import javax.enterprise.inject.Produces;

public class LogConfigurationFactory {

	@Produces
	@DebugMode
	public LogConfiguration createDebugLogger() {
 
        return new LogConfiguration(false, true, false);
    }
	
	@Produces
	@InfoMode
	public LogConfiguration createInfoLogger() {
 
        return new LogConfiguration(true, false, false);
    }
	
	@Produces
	@WarnMode
	public LogConfiguration createWarnLogger() {
 
        return new LogConfiguration(false, false, true);
    }

}
