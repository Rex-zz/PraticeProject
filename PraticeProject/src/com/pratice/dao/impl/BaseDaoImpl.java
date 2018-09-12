package com.pratice.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class BaseDaoImpl {
	@Autowired
	protected SessionFactory sessionFactory;
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
