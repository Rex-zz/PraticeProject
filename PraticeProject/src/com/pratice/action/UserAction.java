package com.pratice.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pratice.entity.Admin;
import com.pratice.entity.StuIntention;
import com.pratice.entity.StuPractice;
import com.pratice.entity.StuReport;
import com.pratice.entity.StuSummary;
import com.pratice.entity.Student;
import com.pratice.entity.Teacher;
import com.pratice.service.AdminService;
import com.pratice.service.StuIntentionService;
import com.pratice.service.StuPracticeService;
import com.pratice.service.StuReportService;
import com.pratice.service.StuSummaryService;
import com.pratice.service.StudentService;
import com.pratice.service.TeacherService;

/**
 * Martrvy
 * 
 * @author 137418235
 *
 */
@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements RequestAware,
		SessionAware {
	public String id;
	public String password;
	public String type;
	private Map<String, Object> request, session;
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private AdminService adminService;
	@Autowired
	private StuPracticeService stuPracticeService;
	@Autowired
	private StuIntentionService stuIntentionService;
	@Autowired
	private StuReportService stuReportService;
	@Autowired
	private StuSummaryService stuSummaryService;

	public String login() {
		session.remove("start");
		session.remove("end");
		session.remove("intention");
		session.remove("practiced");
		session.remove("summary");
		session.remove("report");
		if (id == "" || password == "") {
			request.put("error", "账户名或密码为空");
			return ERROR;
		}
		switch (type) {
		case "0":
			Student std = studentService.getEntityById(id);
			if (std != null && std.getPassword().equals(password)) {
				StuPractice sp = stuPracticeService.getEntityById(id);
				StuIntention sit = stuIntentionService.getEntityBySid(std
						.getSId());
				StuReport sr = stuReportService.getEntityById(id);
				StuSummary ss = stuSummaryService.getEntityById(id);
				session.put("user", std);
				session.put("identity", type);
				if (sp != null) {
					session.put("practiced", 1);
				}
				if (sp != null && sp.getSStartdate() != null) {
					session.put("start", sp.getSStartdate().toString());
				}
				if (sp != null && sp.getSEnddate() != null) {
					session.put("end", sp.getSEnddate().toString());
				}
				if (sit != null) {
					session.put("intention", 1);
				}
				if (sr != null) {
					session.put("report", sr);
				}
				if (ss != null) {
					session.put("summary", ss);
				}
				return SUCCESS;
			}
			break;
		case "1":
			Teacher thr = teacherService.getEntityById(id);
			if (thr != null && thr.getPassword().equals(password)) {
				session.put("user", thr);
				session.put("identity", type);
				return SUCCESS;
			}
			break;
		case "2":
			Admin admin = adminService.getEntityById(id);
			if (admin != null && admin.getPassword().equals(password)) {
				session.put("user", admin);
				session.put("identity", type);
				return SUCCESS;
			}
			break;
		}
		request.put("error", "账户名或密码错误");
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
		session = arg0;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}

}
