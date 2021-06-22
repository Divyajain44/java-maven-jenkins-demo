package com.PS.product1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
	public static void main(String[] args)
	{
		final Logger logger = LoggerFactory.getLogger(Application.class);
		System.out.println("Hello Maven");
		logger.trace("teace messgae");
		logger.debug("this is debug message");
		logger.info("this is a info message");
		logger.error("this is error message");
		logger.warn("this is warning");
	}

}
