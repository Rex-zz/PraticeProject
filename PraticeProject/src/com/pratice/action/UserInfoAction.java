package com.pratice.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.pratice.entity.Student;
import com.pratice.entity.Teacher;
import com.pratice.service.StudentService;
import com.pratice.service.TeacherService;
import com.pratice.tools.JsonBean;
@Controller
@Scope("prototype")
public class UserInfoAction extends ActionSupport{
}
