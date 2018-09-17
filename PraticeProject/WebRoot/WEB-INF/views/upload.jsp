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
			$("#fileForm").submit(function(){
			var formData = new FormData($("#fileForm")[0]);
			$.ajax({
				type:'POST',
				processData: false,
                contentType: false,
				url:"insertInfo.action",
				data:formData,
				success:function(data){
					$("div.sbmaincontent").empty();
					$("div.sbmaincontent").html(data);
				}
			});
			return false;
			})
		</script>
		<style>
			td {
				border: solid #000;
				border-width: 0px 1px 1px 0px;
			}
		</style>
  </head>
  
  <body>
    <div class="sbmaincontent">
    
    	<form id="fileForm" enctype="multipart/form-data">
    		选择文件:<input type="file" name="upload" accept=".xls"><br><br>
    		类型:<input type="radio" name="type" value="0">学生 
    		<input type="radio" name="type" value="1">教师<br><br>
    		<input type="submit" value=" 提交 ">
    	</form>
    </div>
  </body>
</html>
