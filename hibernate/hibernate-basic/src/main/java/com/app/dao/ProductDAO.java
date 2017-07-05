package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.hib.HibSessionFactory;
import com.app.model.Product;

public class ProductDAO {

	public void save(Product product) {
		SessionFactory factory = HibSessionFactory.getSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();

		session.save(product);

		session.getTransaction().commit();
		session.close();

	}

	public void update(int id, double price) {

		SessionFactory factory = HibSessionFactory.getSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();

		Product product = (Product) session.get(Product.class, id);
		product.setPrice(price);

		session.getTransaction().commit();
		session.close();

	}

	public Product find(int id) {

		SessionFactory factory = HibSessionFactory.getSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();

		Product product = (Product) session.get(Product.class, id);

		session.getTransaction().commit();
		session.close();

		return product;

	}

	public List<Product> findAll() {

		SessionFactory factory = HibSessionFactory.getSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();

		String hql = "from Product";
		List<Product> list = session.createQuery(hql).list();

		session.getTransaction().commit();
		session.close();

		return list;

	}

	public void delete(int id) {

		SessionFactory factory = HibSessionFactory.getSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();

		Product product = (Product) session.get(Product.class, id);
		session.delete(product);

		session.getTransaction().commit();
		session.close();

	}

}
