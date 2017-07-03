package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Address;
import com.app.model.Employee;

public class App {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Employee employee = new Employee(123, "A");

		Address address = new Address();
		address.setCity("BLR");
		address.setState("KA");

		employee.setAddress(address);

		session.save(employee);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
