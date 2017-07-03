  package com.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import com.app.model.Book;
import com.app.model.Product;

public class Native_SQL {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		String sql = "select * from PRODUCTS";

		Query query = session.createSQLQuery(sql).addEntity(Product.class);
		List<Product> products = query.list();

		for (Product product : products) {
			System.out.println(product);
		}

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}
}
