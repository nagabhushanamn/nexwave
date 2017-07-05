
package com.mts.service;

import org.apache.log4j.Logger;

import com.mts.model.Account;
import com.mts.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	private static Logger logger = Logger.getLogger("mts");

	private AccountRepository accountRepository;

	public TxrServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	public void txr(double amount, String fromAccNum, String toAccNum) {
		logger.info("Txr-begin");

		// load from & to accounts
		Account fromAccount = accountRepository.load(fromAccNum);
		Account toAccount = accountRepository.load(toAccNum);

		// debit & credit

		// update accounts
		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);
		logger.info("Txr-complete");
	}

}
