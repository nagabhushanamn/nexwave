package com.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import com.app.model.Book;
import com.app.model.Product;

public class Criteria_API {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Criteria criteria = session.createCriteria(Product.class);
		//
		// criteria.add(Restrictions.gt("price", 100.00));
		// criteria.add(Restrictions.eq("name", "Laptop"));

		// criteria.add(Restrictions.or(Restrictions.gt("price", 100.00),
		// Restrictions.eq("name", "Laptop")));

		//
		Product productEx = new Product();
		productEx.setName("Laptop");
		productEx.setPrice(100.00);

		criteria.add(Example.create(productEx));

		List<Product> products = criteria.list();
		for (Product product : products) {
			System.out.println(product);
		}

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}
}
