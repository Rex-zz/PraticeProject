package com.pratice.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;

import com.pratice.entity.Student;

public class MyFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
			HttpServletRequest req=(HttpServletRequest) arg0;
			HttpSession session = req.getSession();
			if(session.getAttribute("user")==null) {
				session.setAttribute("user", new Student("王梦龙", "男", "123", "716203", "计算机科学与技术", "15计本2", "李俊"));
				session.setAttribute("identity", new Integer(2));//0管理员1老师2学生
			}
			arg2.doFilter(arg0, arg1);
		// TODO Auto-generated method stub

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
