package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Book;
import com.app.model.Chapter;

public class Save_Book {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Book book = new Book();
		book.setIsbn("32456789");
		book.setName("Hibernate");

		Chapter chapter1 = new Chapter();
		chapter1.setTitle("Introduction");

		Chapter chapter2 = new Chapter();
		chapter2.setTitle("Advanced");

		chapter1.setBook(book);
		chapter2.setBook(book);

		book.getChapters().add(chapter1);
		book.getChapters().add(chapter2);

		session.save(book);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
