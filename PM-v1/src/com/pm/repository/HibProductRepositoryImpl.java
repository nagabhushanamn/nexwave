package com.pm.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pm.model.Product;

public class HibProductRepositoryImpl implements ProductRepository {

	private SessionFactory sessionFactory;

	public HibProductRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Product product) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(product);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void update(Product product) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.merge(product);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Product find(int id) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		Product product = (Product) session.get(Product.class, id);
		session.getTransaction().commit();
		session.close();
		return product;
	}

	@Override
	public List<Product> findAll() {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		List<Product> products = session.createQuery("from Product").list();
		session.getTransaction().commit();
		session.close();
		return products;
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		Product product = (Product) session.get(Product.class, id);
		session.delete(product);
		session.getTransaction().commit();
		session.close();
	}

}
