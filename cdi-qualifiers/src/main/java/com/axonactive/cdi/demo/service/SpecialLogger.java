package com.axonactive.cdi.demo.service;

import javax.inject.Inject;

import com.axonactive.cdi.demo.bean.LogConfiguration;
import com.axonactive.cdi.demo.bean.LoggerMode;
import com.axonactive.cdi.demo.bean.Mode;

public class SpecialLogger {
	
	@Inject
//	@Default
//  @DebugMode
	@LoggerMode(desiredMode = Mode.WARN)
	private LogConfiguration configuration;

//	public SpecialLogger(LogConfiguration configuration) {
//		this.configuration = configuration;
//	}

	public void log(String message) {
		if (configuration.isInDebugMode()) {
			System.out.println("DEBUG LOG: " + message);
		} else if (configuration.isInInfoMode()) {
			System.out.println("INFO LOG: " + message);
		} else if (configuration.isInWarnMode()) {
			System.out.println("WARN LOG: " + message);
		} else {
			System.out.println("DEFAULT LOG: " + message);
		}
	}
	
}
