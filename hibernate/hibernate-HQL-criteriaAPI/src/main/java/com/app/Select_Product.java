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
 * 
 * ----------------------------------------------------------------
 * 
 * 
 * advantages of HQL
 * ---------------------
 * 
 * 
 * -> OO query lang
 * -> DBMS independent
 * 
 * 
 * 
 */

public class Select_Product {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Product product = (Product) session.get(Product.class, 1); // Persistent
		System.out.println(product);
		product.setPrice(100.00);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
