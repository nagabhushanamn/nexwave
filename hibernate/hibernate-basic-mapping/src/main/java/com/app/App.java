package com.app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;
import com.app.model.Gender;

public class App {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Employee employee = new Employee(1, "A", 0.0, Gender.FEMALE, new Date(), "he is good employee");
		session.save(employee);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
