package com.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Boy;
import com.app.model.Girl;

public class Save_Girl {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Girl girl = new Girl();
		girl.setId(22);
		girl.setName("Indu");
		session.save(girl);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
