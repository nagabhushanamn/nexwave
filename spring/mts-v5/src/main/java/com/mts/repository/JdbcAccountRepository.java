package com.mts.repository;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mts.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	private DataSource dataSource;

	public JdbcAccountRepository(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Account load(String num) {
		return null;
	}

	public void update(Account account) {
	}

}
