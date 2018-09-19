<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <title>实习见习-温州大学教务处</title>
		<META Name="keywords" Content="温州大学教务处,实习见习" />

		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

		<meta name="Copyright" content="温州大学教务处版权所有" />

		<meta content="温州大学教务处" name="Description" />

		<link href="dfiles/9914/template/default/css/global.css" rel="stylesheet" type="text/css" />
		<link href="dfiles/9914/template/default/css/layout.css" rel="stylesheet" type="text/css" />
		<script src="dfiles/9914/template/default/js/bdtxk.js"></script>
		<script src="dfiles/9914/template/default/js/msclass.js" type="text/javascript"></script>
		<script type="text/javascript" src="dfiles/9914/template/default/js/car.js"></script>
		<script type="text/javascript" src="dfiles/9914/template/default/js/bdtxk2.js"></script>
		<script type="text/javascript" src="datatables/js/jquery.js"></script>
		<script type="text/javascript" charset="utf8" src="datatables/js/jquery.dataTables.js"></script>
		<link rel="stylesheet" type="text/css" href="datatables/css/jquery.dataTables.css">
		<script type="text/javascript" src="system/resource/js/counter.js"></script>
		<script type="text/javascript">
			$(function(){
				
				var type="${requestScope.type}";
				var url=null;
				var userColumns=null;
				if(type==0){
					url="studentsInfo.action";
					userColumns=[{data:"SId"},{data:"name"},{data:"sex"},{data:"tel"},{data:"major"},{data:"class_"},{data:"tutor"}];
					aoColumnDefs=[
                		{"aTargets":[6],"mRender":function(data,type,row,meta){
                		if(data=="未指定")
                			return "<a class='uid' row='"+meta.row+"><p style='color:red'>"+data+"</p></a>";
                		return data;
                		}}];
				}else if(type==1){
					url="teachersInfo.action";
					userColumns=[{data:"TId"},{data:"TName"},{data:"TTel"},{data:"TMajor"},{data:"TStunum"}];
					aoColumnDefs=[{"aTargets":[4],"mRender":function(data,type,row,meta){
						if(data<10){
							return "<a row='"+meta.row+"' onclick='stusOfTea(this)'><p style='color:green'>"+data+"</p></a>";
						}else{
							return "<a row='"+meta.row+"' onclick='stusOfTea(this)'><p style='color:red'>"+data+"</p></a>";
						}
					}}];
				}
				
				 $("#usertable").DataTable({
					language: {url:"datatables/zh_CN.txt"},
					"info":true,
					"paging":true,
					"processing":false,
                	"searching": true,
                	"lengthChange":false,
                	columns:userColumns,
                	"aoColumnDefs":aoColumnDefs,
                	serverSide: false,
                	ajax:{
                		type:"GET",
                		url:url
                	}
				})
			})
		</script>
		<script type="text/javascript">
			var stu=null;
			var rowIndex=null;
			var table=null;
			var tea=null;
			function appointTea(a){
				this.rowIndex=$(a).attr("row");
				this.table=$("#usertable").DataTable();
				this.stu=this.table.rows(rowIndex).data()[0];
				
					/* alert(rowIndex+"  "+jsonRow.SId); */
				window.open("detailedInfo.jsp?type=0","table","height=300,width=400,top="+
				(window.screen.height-30-600)/2+",left="+(window.screen.width-10-400)/2);
			}
			
		</script>
		<script type="text/javascript">
			function reloadTable(data){
				$("#usertable").DataTable().cell(rowIndex,6).data(data[0].tutor);
				$("#usertable").DataTable().draw(false);
			}
		</script>
  </head>
  
  <body>
  
  	<div class="divtable">
   	<table id="usertable" border="1" width="650px">
   		<s:if test="type==0">
   		<thead>
   			<tr>
   				<td>学号</td>
   				<td>姓名</td>
   				<td>性别</td>
   				<td>电话</td>
   				<td>专业</td>
   				<td>班级</td>
   				<td>导师</td>
   			</tr>
   		</thead>
   		</s:if>
   		<s:elseif test="type==1">
   		<thead>
   			<tr>
   				<td>教工号</td>
   				<td>姓名</td>
   				<td>电话</td>
   				<td>专业</td>
   				<td>指导学生数</td>
   			</tr>
   			</thead>
   			
   		</s:elseif>
   		
   	</table>
			</div>
			
  </body>
</html>
