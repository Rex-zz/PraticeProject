package com.pratice.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pratice.entity.Admin;
import com.pratice.entity.Student;
import com.pratice.entity.Teacher;
import com.pratice.service.AdminService;
import com.pratice.service.StudentService;
import com.pratice.service.TeacherService;
/**
 * Martrvy
 * @author 137418235
 *
 */
@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements RequestAware,SessionAware{
	public String id;
	public String password;
	public String type;
	private Map<String, Object> request,session;
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private AdminService adminService;
	public String login() {
		System.out.println("aaa");
		switch (type) {
		case "0":
			Student std = studentService.getEntityById(id);
			if(std!=null&&std.getPassword().equals(password)) {
				session.put("user", std);
				return SUCCESS;
			}
			break;
		case "1":
			Teacher thr = teacherService.getEntityById(id);
			if(thr!=null&&thr.getTPassword().equals(password)) {
				session.put("user", thr);
				return SUCCESS;
			}
			break;
		case "2":
			Admin admin = adminService.getEntityById(id);
			if(admin!=null&&admin.getPassword().equals(password)) {
				session.put("user",admin);
				return SUCCESS;
			}
			break;
		}
		request.put("error", "’Àªß√˚ªÚ√‹¬Î¥ÌŒÛ");
		
		return ERROR;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
