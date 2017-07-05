package com.mts.spring;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BFPP implements BeanFactoryPostProcessor {

	private static Logger logger = Logger.getLogger("mts");

	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		logger.info("count " + arg0.getBeanDefinitionCount());
	}

}
