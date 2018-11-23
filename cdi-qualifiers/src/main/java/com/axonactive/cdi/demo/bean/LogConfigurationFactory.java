package com.axonactive.cdi.demo.bean;

import javax.enterprise.inject.Produces;

public class LogConfigurationFactory {

	@Produces
	public LogConfiguration createLogger() {
 
        return new LogConfiguration(false, true);
    }

}
