package com.mts.repository;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.mts.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("mts");

	private DataSource dataSource;

	public JdbcAccountRepository(DataSource dataSource) {
		logger.info("JdbcAccountRepository instantiated..");
		this.dataSource = dataSource;
	}

	public Account load(String num) {
		logger.info("loading account");
		return null;
	}

	public void update(Account account) {
		logger.info("updating account");
	}

}
