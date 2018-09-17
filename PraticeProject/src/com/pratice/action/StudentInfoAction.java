package com.pratice.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.pratice.entity.Student;
import com.pratice.service.StudentService;
import com.pratice.tools.JsonBean;

import net.sf.json.JSONObject;
@Controller
@Scope("prototype")
public class StudentInfoAction extends ActionSupport implements ModelDriven<Student>{
	private String sId;
	private Integer type;
	private JsonBean jsonBean;
	private Student student;
	private List<Student> list;
	@Autowired
	private StudentService studentService;
	public String sudentsInfo() {
		List<Student> studentList = studentService.getEntityList(null);
		jsonBean = new JsonBean(1, (long)studentList.size(), (long)studentList.size(), studentList);
		return SUCCESS;
	}
	public String test() {
		System.out.println("test");
		return SUCCESS;
	}
	public String updateStudentTutor() throws IOException {
		studentService.updateStudentTutor(student);
		student = studentService.getEntityById(student.getSId());
		list=new ArrayList<Student>();
		list.add(student);
		return SUCCESS;
	}
	public String detailedStuInfo() {
		Map<String,Object> req = (Map<String, Object>) ActionContext.getContext().get("request");
		req.put("stu", student);
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
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		if(sId==null) {
			student=new Student();
		}else {
			student=studentService.getEntityById(sId);
		}
		return student;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	
}
