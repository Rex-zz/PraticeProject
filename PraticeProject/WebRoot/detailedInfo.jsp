<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib	prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'detailedInfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="Jquery/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="datatables/js/jquery.js"></script>
	<script type="text/javascript" charset="utf8" src="datatables/js/jquery.dataTables.js"></script>
	<link rel="stylesheet" type="text/css" href="datatables/css/jquery.dataTables.css">
	<script type="text/javascript">
		$(function(){
		
			$("#changedForm").submit(function(){
			var formdata=new FormData($("#changedForm")[0]);
			$.ajax({
				type:"POST",
				processData: false,
                contentType: false,
				data:formdata,
				url:"updateStudentTutor.action",
				success:function(data){
					
					window.opener.reloadTable(data);
					window.close();
				}
			})
			return false;
			
		})
		})
	</script>
	<script type="text/javascript">
	$(function(){
		var type=${param.type}+"";
		if(type=="")
		return;
		type=${param.type};
		$.ajax({
			type:"GET",
			url:"notNullTeacher.action",
			success:function(data){
				var selectTeachers = document.getElementById("teachers");
				selectTeachers.options.length = 0;
				$("#teachers").append("<option value=''>-- 请选择 --</option>");
				for(var i=0;i<data.length;i++){
					$("#teachers").append("<option value='"+data[i].TId+"'>"+data[i].TName+"</option>");
				}
				if(type==0){
				var user=window.opener.stu;
				$("#id").append(user.SId);
				$("#name").append(user.name);
				$("#sex").append(user.sex);
				$("#tel").append(user.tel);
				$("#institute").append(user.major);
				$("#clas").append(user.class_);
				$("#sId").attr("value",user.SId); 
		}else if(type==1){
			
		}
			}
		})
		
		
		
	})
		
	</script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<div id="userTable">
  	<form id="changedForm">
  		<input type="hidden" id="sId" name="sId"/>
  		<p id="id">学号: </p>
  		<p id="name">姓名: </p>
  		<p id="sex">性别: </p>
  		<p id="tel">电话: </p>
  		<p id="institute">学院: </p>
  		<p id="clas">班级: </p>
  		导师:<select id="teachers" name="tutor" style="overflow:auto">
  		</select><br>
  		<input type="submit" value="提交">
  	</form>
  	</div>
  </body>
</html>
