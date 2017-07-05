package com.mts.spring;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

import com.mts.repository.AccountRepository;
import com.mts.repository.JdbcAccountRepository;
import com.mts.service.TxrService;
import com.mts.service.TxrServiceImpl;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = { "com.mts.aspects" })
public class AppConfig {

	@Autowired
	private DataSource dataSource;

	@Bean(name = "jdbcAccoutnyRepository")
	public AccountRepository jdbcAccoutnyRepository() {
		return new JdbcAccountRepository(dataSource);
	}

	@Bean
	public TxrService txrService() {
		TxrServiceImpl txrService = new TxrServiceImpl();
		txrService.setAccountRepository(jdbcAccoutnyRepository());
		return txrService;
	}

}
