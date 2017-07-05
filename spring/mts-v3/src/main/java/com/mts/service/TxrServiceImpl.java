
package com.mts.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mts.annotation.RepoQualifier;
import com.mts.model.Account;
import com.mts.repository.AccountRepository;

//@Component("txrService")
@Service("txrService")
public class TxrServiceImpl implements TxrService {

	private static Logger logger = Logger.getLogger("mts");

	private AccountRepository accountRepository;

	private String txrType = "NEFT";

	public TxrServiceImpl() {
		logger.info("TxrService instantiated");
	}

	@Autowired(required = true)
	// @Qualifier(value = "jdbc")
	@RepoQualifier(dbms = "mysql", tech = "jdbc")
	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("accountRepository injected to txrService");
	}

//	@Required
	public void setTxrType(String txrType) {
		this.txrType = txrType;
		logger.info("new txrType injected");
	}

	public void init() {
		logger.info("init()");
	}

	public void destroy() {
		logger.info("destroy()");
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
