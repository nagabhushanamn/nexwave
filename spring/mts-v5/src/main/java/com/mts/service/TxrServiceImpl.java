
package com.mts.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mts.model.Account;
import com.mts.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	private AccountRepository accountRepository;

	private String txrType = "NEFT";

	public TxrServiceImpl() {
	}

	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public void setTxrType(String txrType) {
		this.txrType = txrType;
	}

	public void init() {
	}

	public void destroy() {
	}

	public void txr(double amount, String fromAccNum, String toAccNum) {

		// load from & to accounts
		Account fromAccount = accountRepository.load(fromAccNum);
		Account toAccount = accountRepository.load(toAccNum);

		// debit & credit

		// update accounts
		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);
	}

}
