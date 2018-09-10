package com.pratice.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope(value="prototype")
public class Test extends ActionSupport {

	
	
	public String test(){
		System.out.println("helloword");
		return SUCCESS;
	}
}
