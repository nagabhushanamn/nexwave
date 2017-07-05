package com.mts.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mts.model.Account;

@Repository
@Qualifier("hibernate")
public class HibAccountRepository implements AccountRepository {

	private SessionFactory sessionFactory;

	@Autowired
	public HibAccountRepository(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Account load(String num) {
		return sessionFactory.getCurrentSession().get(Account.class, num);
	}

	@Override
	public void update(Account account) {
		sessionFactory.getCurrentSession().merge(account);
	}

}
