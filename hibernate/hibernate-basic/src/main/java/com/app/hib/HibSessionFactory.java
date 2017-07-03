package com.app.hib;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibSessionFactory {

	private static SessionFactory sessionFactory;

	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		sessionFactory = cfg.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
