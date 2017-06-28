package com.mts.spring;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class InfraConfig {

	@Bean
	@Scope("singleton")
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		return dataSource;
	}

}
