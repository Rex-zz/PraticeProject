package com.pratice.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.StrutsStatics;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pratice.entity.Student;
@Controller
public class Hello extends ActionSupport {
	@Autowired
	private SessionFactory sessionFactory;
	private int level;
	
	public Session GetSession() throws Exception{
		Configuration cfg=new Configuration().configure();
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sessionFactory=cfg.buildSessionFactory(registry);
		return sessionFactory.getCurrentSession();
	}
	public void ClearSession() throws Exception{
		sessionFactory.close();
	}
	
	public String hello() throws Exception{
		HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
		HttpSession session=request.getSession();
		if(session.getAttribute("user")==null) {
			System.out.println("null");
		}else{
			System.out.println("full");
			System.out.println(session.getAttribute("identity"));
		}
		return SUCCESS;
	}
}
