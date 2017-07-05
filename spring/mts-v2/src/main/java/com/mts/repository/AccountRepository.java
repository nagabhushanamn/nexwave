package com.mts.repository;

import com.mts.model.Account;

public interface AccountRepository {

	Account load(String num);
	void update(Account account);

}
