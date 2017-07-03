package com.app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Book;
import com.app.model.Chapter;
import com.app.model.Product;
import com.app.model.ProductType;
import com.app.model.Publisher;

public class Save_Books {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Chapter chapter1 = new Chapter();
		chapter1.setIdx(5);
		chapter1.setTitle("title-1");

		Chapter chapter2 = new Chapter();
		chapter2.setIdx(6);
		chapter2.setTitle("title-2");

		Book book = new Book();
		book.setId(12347);
		book.setName("Book-3");
		book.setPublisher((Publisher) session.load(Publisher.class, 111));

		book.getChapters().add(chapter1);
		book.getChapters().add(chapter2);

		session.save(book);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
