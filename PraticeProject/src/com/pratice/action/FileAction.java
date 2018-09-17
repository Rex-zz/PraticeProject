package com.pratice.action;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pratice.entity.Student;
import com.pratice.entity.Teacher;
import com.pratice.service.StudentService;
import com.pratice.service.TeacherService;
import com.pratice.tools.ExcelTool;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
@Controller
@Scope("prototype")
public class FileAction extends ActionSupport {
	private InputStream inputStream;
	private String downloadFileName;
	private Integer usertype;
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	public String fileDown() throws FileNotFoundException {
		String root=ServletActionContext.getServletContext().getRealPath("/files");
		File file = new File(root,downloadFileName);
		inputStream = new FileInputStream(file);
		return SUCCESS;
	}
	public String excelExport() throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		switch (usertype) {
		case 0:
			List<Student> stuList = studentService.getEntityList(null);
			ExcelTool.exportStudent(baos, stuList);
			downloadFileName="学生信息文件.xls";
			break;
		case 1:
			List<Teacher> teaList = teacherService.getEntityList(null);
			ExcelTool.exportTeacher(baos, teaList);
			downloadFileName="教师信息文件.xls";
			break;
		default:
			break;
		}
		byte[] byteArray = baos.toByteArray();
		inputStream=new ByteArrayInputStream(byteArray);
		baos.flush();
		baos.close();
		return SUCCESS;
	}
	public String exportFilePage() {
		return SUCCESS;
	}
	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getDownloadFileName() throws UnsupportedEncodingException {
		return new String(downloadFileName.getBytes(),"ISO8859-1");
	}

	public void setDownloadFileName(String downloadFileName) {
		this.downloadFileName = downloadFileName;
	}
	public Integer getUsertype() {
		return usertype;
	}
	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}
	
	
}
