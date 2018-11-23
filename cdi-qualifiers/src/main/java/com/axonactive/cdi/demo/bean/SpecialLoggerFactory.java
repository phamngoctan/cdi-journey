package com.axonactive.cdi.demo.bean;

import com.axonactive.cdi.demo.service.SpecialLogger;

public class SpecialLoggerFactory {
	
	public SpecialLogger createLogger() {
        LogConfiguration logInDebugMode = new LogConfiguration(true, false);
 
        return new SpecialLogger(logInDebugMode);
    }
	
}
