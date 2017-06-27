package com.mts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mts.repository.AccountRepository;
import com.mts.repository.JdbcAccountRepository;
import com.mts.service.TxrService;
import com.mts.service.TxrServiceImpl;
import com.mts.spring.AppConfig;

public class App {

	public static void main(String[] args) {

		// some-one

		// Init
		// AccountRepository accountRepository=new JdbcAccountRepository();
		// TxrService txrService = new TxrServiceImpl(accountRepository);

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
