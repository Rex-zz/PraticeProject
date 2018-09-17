package com.pratice.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pratice.entity.Student;
import com.pratice.entity.Teacher;
import com.pratice.service.StudentService;
import com.pratice.service.TeacherService;
import com.pratice.tools.ExcelTool;

import jxl.read.biff.BiffException;
@Controller
@Scope("prototype")
public class InsertInfoAction extends ActionSupport {
	private String type;
	private File upload;
	private String uploadFileName;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private StudentService studentService;
	public String insertInfo() throws BiffException, IOException{
		FileInputStream is = new FileInputStream(upload);
		switch (type) {
		case "0":
			List<Student> readStudent = ExcelTool.readStudent(is);
			studentService.saveStudentList(readStudent);
			break;
		case "1":
			List<Teacher> readTeacher = ExcelTool.readTeacher(is);
			teacherService.saveTeacherList(readTeacher);
			break;
		default:
			return ERROR;
		}
		
		return SUCCESS;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
}
