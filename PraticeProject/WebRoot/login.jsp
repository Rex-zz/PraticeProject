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
			<form action="login.action" method="post">
				学号:<input type="text" name="id" /><br>
				密码:<input type="text" name="password" /><br>
				类型:<input type="radio"	name="type" value="0" />学生 
				<input type="radio"	name="type" value="1" />教师 
				<input type="radio"	name="type" value="2" />管理员<br>
				<input type="submit" value="提交"/>
			</form>
		</div>
		<a href="helloword.action">hello</a>
  </body>
</html>
