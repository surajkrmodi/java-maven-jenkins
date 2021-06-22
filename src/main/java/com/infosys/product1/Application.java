package com.infosys.product1;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

public class Application {

	static final Logger logger = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		//System.out.println("Hello Maven ");
		logger.trace("trace message");
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warning message");
		logger.error("This is error message");
	}

}
