package com.mts.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	private Logger logger = Logger.getLogger("mts");

	@Around("execution(* txr(..))")
	public void doLogAroundTxr(ProceedingJoinPoint joinPoint) {
		try {
			logger.info("before");
			joinPoint.proceed();
			logger.info("after-returning");
		} catch (Throwable e) {
			logger.info("after-throwing");
		} finally {
			logger.info("after");
		}
	}

}
