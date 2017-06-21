package com.app.model;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIDGenerator implements IdentifierGenerator {

	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException {
		return "wissen-" + (int) (Math.random() * 1000);
	}

}
