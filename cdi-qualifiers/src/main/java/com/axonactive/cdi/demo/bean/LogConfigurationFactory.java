package com.axonactive.cdi.demo.bean;

import javax.enterprise.inject.Produces;

public class LogConfigurationFactory {

	@Produces
	@LoggerMode(desiredMode = Mode.DEBUG)
	public LogConfiguration createDebugLogger() {
 
        return new LogConfiguration(false, true, false);
    }
	
	@Produces
	@LoggerMode(desiredMode = Mode.INFO)
	public LogConfiguration createInfoLogger() {
 
        return new LogConfiguration(true, false, false);
    }
	
	@Produces
	@LoggerMode(desiredMode = Mode.WARN)
	public LogConfiguration createWarnLogger() {
 
        return new LogConfiguration(false, false, true);
    }

}
