
package com.mts.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mts.model.Account;
import com.mts.model.Txn;
import com.mts.model.TxnType;
import com.mts.repository.AccountRepository;
import com.mts.repository.NewAccountRepository;

@Service("txrService")
public class TxrServiceImpl implements TxrService {

//	@Autowired
//	@Qualifier("hibernate")
//	private AccountRepository accountRepository;
	
	@Autowired
	private NewAccountRepository accountRepository;

	@Transactional(
			transactionManager = "jpaTransactionManager",
			isolation=Isolation.READ_COMMITTED,
			propagation=Propagation.REQUIRED)
	public void txr(double amount, String fromAccNum, String toAccNum) {

		// load from & to accounts
		
//		Account fromAccount = accountRepository.load(fromAccNum);
//		Account toAccount = accountRepository.load(toAccNum);
		
		Account fromAccount = accountRepository.findOne(fromAccNum);
		Account toAccount = accountRepository.findOne(toAccNum);

				
		// debit & credit
		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		Txn fromAccTxn = new Txn();
		fromAccTxn.setAccount(fromAccount);
		fromAccTxn.setAmount(amount);
		fromAccTxn.setDate(new Date());
		fromAccTxn.setType(TxnType.DEBIT);
		fromAccTxn.setRemark("Nil");

		fromAccount.getTxns().add(fromAccTxn);

		// update accounts
		//accountRepository.update(fromAccount);
		//accountRepository.update(fromAccount.getBalance(),fromAccount.getNum());

		// boolean status = false;
		// if (status)
		// throw new RuntimeException("oops");

		//accountRepository.update(toAccount);
		//accountRepository.update(toAccount.getBalance(), toAccount.getNum());
	}

}
