<<<<<<< HEAD:PraticeProject/WebRoot/index.jsp
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
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
		<!--IE6透明判断-->
		<!--[if IE 6]>
<script src="dfiles/9914/template/default/js/bdtxk1.js"></script>
<script>
DD_belatedPNG.fix('.flash_bar,#tit_fc1,#tit_fc2,#tit_fc3,#tit_fc4,#flashLine,.png');
</script>
<![endif]-->

		<!--Announced by Visual SiteBuilder 9-->
		<!-- CustomerNO:77656262657232307b7647545251574103070000 -->
		<script type="text/javascript" src="system/resource/js/counter.js"></script>
		<script type="text/javascript">
			_jsq_(1021, '/list.jsp', -1, 1358721784)
		</script>

  </head>
  
  <body>
    
		<!--头部-->

		<div class="Headout">
			<div class="Header">
				<div class="logo">
					<!--#begineditable name="LOGO" action="" layout="" tpltype="" contype="" clone="" viewid="136192" contentviewid="" tagname="LOGO"-->
					<!-- 网站logo图片地址请在本组件"内容配置-网站logo"处填写 -->
					<a href="../" title="温州大学教务处"><img src="dfiles/9914/template/default/images/logo.png" width="415" height="109" border="0" alt="温州大学教务处" title="温州大学教务处"></a>
					<!--#endeditable-->
				</div>
				
			</div>

			<div class="navdivout"></div>

		</div>

		</div>
		<!--头部结束-->
		
		<div class="submain" align="center">
			<form action="hello.action" method="post">
				<table>
					<tr>
						<td>用户名</td><td><input type="text" name="name"/></td>
					</tr>
					<tr>
						<td>密码</td><td><input type="password" name="password"/></td>
					</tr>
					<tr>
						<td colspan="3" align="center">
							<label><input type="radio" value="0" name="level"/>管理员</label>
							<label><input type="radio" value="1" name="level"/>教师</label>
							<label><input type="radio" value="2" name="level" checked="checked"/>学生</label>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="right">
							<input type="submit" value="登入" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="reset" value="重置"  />
						</td>
					</tr>
				</table>
			</form>
		</div>
		
		
		<script>
			$(function() {
				$("#m72").css("visibility", "hidden");
			})
		</script>
	</body>

  </body>
</html>
=======
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
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
   	当前用户:${sessionScope.user.name }
  </body>
</html>
>>>>>>> master:PraticeProject/src/com/pratice/service/success.jsp
