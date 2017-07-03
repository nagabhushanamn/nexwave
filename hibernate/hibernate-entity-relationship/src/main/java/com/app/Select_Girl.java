package com.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Girl;

public class Select_Girl {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Girl girl = (Girl) session.get(Girl.class, 22);
		System.out.println(girl);
		System.out.println(girl.getBoy());

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
