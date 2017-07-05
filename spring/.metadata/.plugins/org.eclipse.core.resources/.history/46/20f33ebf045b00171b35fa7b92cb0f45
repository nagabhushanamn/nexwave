package com.mts.spring;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.mts.service.TxrService;
import com.mts.service.TxrServiceImpl;

public class BPP implements BeanPostProcessor {

	private static Logger logger = Logger.getLogger("mts");

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		logger.info("BPP : before init() " + arg1);

		if (arg1.equals("txrService")) {
			//throw new BeanInstantiationException(TxrService.class, "Invalid TxrType");
		}

		return arg0;
	}

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		logger.info("BPP : after init() " + arg1);
		return arg0;
	}
}
