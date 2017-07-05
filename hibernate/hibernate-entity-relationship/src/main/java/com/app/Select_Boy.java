package com.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Boy;

public class Select_Boy {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Boy boy = (Boy) session.get(Boy.class, 53453);
		System.out.println(boy);
		System.out.println("----------------------------------------");
		// System.out.println(boy.getGirl());
		//Hibernate.initialize(boy.getGirl());

		session.getTransaction().commit();
		session.close();

		sessionFactory.close();

	}

}
