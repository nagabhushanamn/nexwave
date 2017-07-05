package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;
import com.app.model.NonTechEmployee;
import com.app.model.TechEmployee;

public class App {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("A");

		TechEmployee techEmployee = new TechEmployee();
		techEmployee.setId(11);
		techEmployee.setName("B");
		techEmployee.setTechSkill("Java");

		NonTechEmployee nonTechEmployee = new NonTechEmployee();
		nonTechEmployee.setId(111);
		nonTechEmployee.setName("C");
		nonTechEmployee.setDivision("HR");

		session.save(employee);
		session.save(techEmployee);
		session.save(nonTechEmployee);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
