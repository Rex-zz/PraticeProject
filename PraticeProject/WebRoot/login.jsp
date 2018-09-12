<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <div align="center" style="padding-top: 200px;">
			<% if(request.getAttribute("error")!=null) %><%=request.getAttribute("error") %>
			<form action="login.action" method="post">
				账号:<input type="text" name="id" /><br>
				密码:<input type="text" name="password" /><br>
				类型:<label><input type="radio"	name="type" value="0" checked="checked"/>学生</label> 
				<label><input type="radio"	name="type" value="1" />教师 </label>
				<label><input type="radio"	name="type" value="2" />管理员</label><br>
				<input type="submit" value="提交"/>
			</form>
		</div>
  </body>
</html>
