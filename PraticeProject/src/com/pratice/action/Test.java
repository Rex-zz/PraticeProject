package com.pratice.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pratice.entity.Institute;
@Controller
@Scope(value="prototype")
public class Test extends ActionSupport {

	
	@Autowired
	private SessionFactory sessionFactory;
	private String institute;
	
	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String test(){
		System.out.println("helloword");
//		Session session = sessionFactory.openSession();
//		session.save(new Institute(institute));
//		session.close();
		return SUCCESS;
	}
}
