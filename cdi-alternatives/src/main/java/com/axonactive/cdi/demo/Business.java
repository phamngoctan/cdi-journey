package com.axonactive.cdi.demo;

import javax.inject.Inject;

public class Business {

	@Inject
	private Coder coder;
	
	public void doSomething() {
		System.out.println(coder.codeString());
	}

}
