package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;
import com.app.model.EmployeeId;

public class App {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		EmployeeId employeeId = new EmployeeId();
		employeeId.setId(123);
		employeeId.setDep("IT");

		Employee employee = new Employee(employeeId, "A");

		session.save(employee);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
