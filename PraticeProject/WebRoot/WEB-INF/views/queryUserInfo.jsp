<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     <title>关于举办温州大学第十二届师范生教学技能竞赛的通知-温州大学教务处</title>
		<META Name="keywords" Content="温州大学教务处,教师技能" />

		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

		<meta name="Copyright" content="温州大学教务处版权所有" />

		<meta content="温州大学教务处" name="Description" />

		<link href="dfiles/9914/template/default/css/global.css" rel="stylesheet" type="text/css" />
		<link href="dfiles/9914/template/default/css/layout.css" rel="stylesheet" type="text/css" />
		<script src="dfiles/9914/template/default/js/bdtxk.js"></script>
		<script src="dfiles/9914/template/default/js/msclass.js" type="text/javascript"></script>
		<script type="text/javascript" src="dfiles/9914/template/default/js/car.js"></script>
		<script type="text/javascript" src="dfiles/9914/template/default/js/bdtxk2.js"></script>
		<script type="text/javascript" src="Jquery/jquery-1.10.2.js"></script>
		<script type="text/javascript">
			$(function(){
				$(".radio").change(function(){
					
					var data=$("input[name='type']:checked").val();
					var url=null;
					if(data==0){
						url="studentsInfoTable.action";
					}else if(data==1){
						url="teachersInfoTable.action"
					}
					$.ajax({
					type:"GET",
					data:{"type":data},
					url:url,
					success:function(data){
						$("#table").empty();
						$("#table").html(data);
					}
				}) 
				})
			})
		</script>

  </head>
  
  <body>
    
    <div id="userinfoPage">
    类型:<input type="radio" class="radio" name="type" value="0" />学生&nbsp;
    <input type="radio" class="radio" name="type" value="1" />教师
		</div>					
						
   
   	<div id="table">
   	
   	</div> 
  </body>
</html>
