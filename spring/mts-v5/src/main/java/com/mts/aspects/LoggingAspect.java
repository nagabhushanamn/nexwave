package com.mts.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	private Logger logger = Logger.getLogger("mts");

	@Before("execution(void txr(..))")
	public void doLogBeforeMethod() {
		logger.info("Txr begins");
	}

}
