package com.app;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.Type;

import com.app.model.Book;
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

public class HQL {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		/*
		 * 
		 * select cloumn(s) from table(s) where condition(s)
		 * 
		 * 
		 */

		// String hql = "from Product";
		// String hql = "from Product p where p.price=100";

		// String price = "100.00 or 1=1";
		// String hql = "from Product p where p.price=" + price; // bad
		// String hql = "from Product p where p.price=?";
		// String hql = "from Product p where p.price=:pprice";
		// Query query = session.createQuery(hql);
		// // query.setParameter(0, 100.00);
		// query.setParameter("pprice", 100.00);
		//
		// // query.setFirstResult(0);
		// // query.setMaxResults(5);
		//
		// List<Product> entities = query.list();
		// for (Product product : entities) {
		// System.out.println(product);
		// }

		// ----------------------------------------------------------------

		// String hql = "select p.name,p.price from Product p";
		// Query query = session.createQuery(hql);
		//
		// List<Object[]> list = query.list();
		//
		// for (Object[] oa : list) {
		// System.out.println(oa[0] + "\t" + oa[1]);
		// }

		// -----------------------------------------------------------------

		// String hql = "select new com.app.ProductResult(p.name,p.price) from
		// Product p";
		//
		// List<ProductResult> list = session.createQuery(hql).list();
		//
		// for (ProductResult result : list) {
		// System.out.println(result);
		// }

		// -----------------------------------------------------------------
		//
		// String hql = "select new list(p.name,p.price) from Product p";
		// List<List> list = session.createQuery(hql).list();
		// System.out.println(list);

		// --------------------------------------------------------------------
		//
		// String hql = "select new map(p.name,p.price) from Product p";
		// List<List> list = session.createQuery(hql).list();
		// System.out.println(list);

		// ---------------------------------------------------------------------

		// HQL with joins

		// String hql = "from Book book where book.publisher.name='Abc'";
		// String hql = "from Book book where book.publisher is not null";
		// String hql = "from Book book where book.chapters.size=0";
		// List<Book> list = session.createQuery(hql).list();
		//
		// for (Book book : list) {
		// System.out.println(book);
		// }

		// -----------------------------------------------

		Query query = session.getNamedQuery("product.findAll");
		List<Product> entities = query.list();
		for (Product product : entities) {
			System.out.println(product);
		}

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}

class ProductResult {
	private String name;
	private double price;

	public ProductResult(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductResult [name=" + name + ", price=" + price + "]";
	}

}
