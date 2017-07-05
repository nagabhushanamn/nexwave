package com.app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Product;
import com.app.model.ProductType;

/*
 * 
 * in hibernate, we can select product in 4 ways
 * 
 * -> by Id
 * -> by HQL
 * -> by Criteria API
 * -> by Native SQL
 * 
 */

public class Update_Product {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = null;
		Product product = null;

		// -----------------------------------------------------------
		// Req-1
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		product = (Product) session.get(Product.class, 1);
		// session.evict(product);
		// session.clear();
		session.getTransaction().commit();
		session.close();
		// -----------------------------------------------------------

		System.out.println("------------------------------------------");
		product.setPrice(10.00); // Detached state

		// -----------------------------------------------------------
		// Req-2
		session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.merge(product);

		session.getTransaction().commit();
		session.close(); // Detached state
		// -----------------------------------------------------------

		sessionFactory.close();

	}

}
