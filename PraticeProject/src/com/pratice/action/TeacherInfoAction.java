package com.pratice.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pratice.entity.Teacher;
import com.pratice.service.TeacherService;
import com.pratice.tools.JsonBean;
@Controller
@Scope("prototype")
public class TeacherInfoAction extends ActionSupport {
	private Integer type;
	private JsonBean jsonBean;
	private List<Teacher> jsonTecher;
	@Autowired
	private TeacherService teacherService;
	public String teachersInfo() {
		List<Teacher> teacherList = teacherService.getEntityList(null);
		jsonBean = new JsonBean(1, (long)teacherList.size(), (long)teacherList.size(), teacherList);
		return SUCCESS;
	}
	public String getNotFullTeacher() {
		jsonTecher = teacherService.getNotFullTeacher();
		return SUCCESS;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public JsonBean getJsonBean() {
		return jsonBean;
	}
	public void setJsonBean(JsonBean jsonBean) {
		this.jsonBean = jsonBean;
	}
	public List<Teacher> getJsonTecher() {
		return jsonTecher;
	}
	public void setJsonTecher(List<Teacher> jsonTecher) {
		this.jsonTecher = jsonTecher;
	}
	
}
