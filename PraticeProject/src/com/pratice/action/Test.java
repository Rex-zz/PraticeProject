package com.pratice.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pratice.entity.Institute;
import com.pratice.entity.Student;
import com.pratice.service.StudentService;
@Controller
@Scope(value="prototype")
public class Test extends ActionSupport {

	@Autowired
	private StudentService studentService;
	public String test(){
		studentService.saveEntity(new Student("15211160231","小王", "男", "123", "716203", "计算机", "2班", "王梦龙"));
		return SUCCESS;
	}
}
