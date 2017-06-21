package com.app;

import java.util.ArrayList;
import java.util.List;

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

		Address address1 = new Address();
		address1.setCity("BLR");
		address1.setState("KA");

		Address address2 = new Address();
		address2.setCity("CHN");
		address2.setState("TN");

		List<Address> list = new ArrayList<Address>();
		list.add(address1);
		list.add(address2);

		employee.setAddresses(list);

		session.save(employee);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
