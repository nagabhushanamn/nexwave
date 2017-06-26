package com.mts.repository;

import org.apache.log4j.Logger;

import com.mts.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("mts");

	public Account load(String num) {
		logger.info("loading account");
		return null;
	}

	public void update(Account account) {
		logger.info("updating account");
	}

}
