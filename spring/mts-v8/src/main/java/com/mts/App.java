package com.mts;

import java.util.HashSet;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mts.service.TxrService;
import com.mts.spring.AppConfig;

public class App {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("-------------------------------------");

		TxrService txrService = context.getBean("txrService", TxrService.class);
		// Use
		txrService.txr(100.00, "1", "2");

		System.out.println("-------------------------------------");

		// Destroy
		context.close();
		

	}

}
