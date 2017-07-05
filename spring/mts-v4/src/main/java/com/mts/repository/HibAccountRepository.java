package com.mts.repository;

import org.apache.log4j.Logger;

import com.mts.model.Account;

public class HibAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("mts");

	public HibAccountRepository() {
		logger.info("HibAccountRepository instantiated...");
	}

	public Account load(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Account account) {
		// TODO Auto-generated method stub

	}

}
