package com.axonactive.cdi.demo.service;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.axonactive.cdi.demo.bean.DebugMode;
import com.axonactive.cdi.demo.bean.LogConfiguration;

public class SpecialLogger {
	
	@Inject
//	@Default
	@DebugMode
	private LogConfiguration configuration;

//	public SpecialLogger(LogConfiguration configuration) {
//		this.configuration = configuration;
//	}

	public void log(String message) {
		if (configuration.isInDebugMode()) {
			System.out.println("DEBUG LOG: " + message);
		} else if (configuration.isInInfoMode()) {
			System.out.println("INFO LOG: " + message);
		} else {
			System.out.println("DEFAULT LOG: " + message);
		}
	}
	
}
