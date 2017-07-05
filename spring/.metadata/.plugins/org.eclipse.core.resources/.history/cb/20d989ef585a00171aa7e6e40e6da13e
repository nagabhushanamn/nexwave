package com.mts;

import com.mts.repository.AccountRepository;
import com.mts.repository.JdbcAccountRepository;
import com.mts.service.TxrService;
import com.mts.service.TxrServiceImpl;

public class App {

	public static void main(String[] args) {

		// some-one
		
		// Init
		AccountRepository accountRepository=new JdbcAccountRepository();
		TxrService txrService = new TxrServiceImpl(accountRepository);

		// Use
		txrService.txr(100.00, "1", "2");

		// Destroy
		txrService = null;
	}

}
