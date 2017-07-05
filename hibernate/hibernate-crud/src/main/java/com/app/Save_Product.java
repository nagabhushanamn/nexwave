package com.app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Product;
import com.app.model.ProductType;

public class Save_Product {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Product product = new Product(); // Transient
		product.setName("Item3");
		product.setPrice(18000.00);
		product.setMakeDate(new Date());
		product.setType(ProductType.ELEC);
		product.setDescription("New Mac pro");

		session.save(product); // Persistent

		product.setPrice(18000.00);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
