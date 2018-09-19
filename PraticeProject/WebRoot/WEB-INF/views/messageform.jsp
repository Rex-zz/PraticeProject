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
		<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
		<script type="text/javascript">
			$(function(){
				$("#msgform").submit(function(){
					var title=document.getElementById("title").value;
					if(title==""||title==null){
						$("#error").html("标题不能为空")
					return false
					}
					$("#ckeditor").val(CKEDITOR.instances.ckeditor.getData());
					var msgform = new FormData($("#msgform")[0]);
					$.ajax({
						type:'POST',
						url:'msgCommit.action',
						processData: false,
                		contentType: false,
						data:msgform,
						success:function(data){
							$("div.sbmaincontent").empty();
							$("div.sbmaincontent").html(data);
						}
						
					});
					return false;
				})
				
			})
		</script>
  </head>
  
  <body>
    	<div class="sbmaincontent">
						<!--#begineditable name="文章内容" action="webber.wbst.com.news.DetailNews" layout="/system/_component/news/content/tpltitle.jsp" tpltype="1" contype="" clone="" viewid="136235" contentviewid="" tagname="文章内容"-->
						
						<script language="javascript" src="_dwr/engine.js"></script>
						<script language="javascript" src="system/resource/js/news/newscontent.js"></script>
						<script language="javascript" src="system/resource/js/ajax.js"></script>
						<form id="msgform" enctype="multipart/form-data">
							<p id="error" style="color: red;"></p>
							标题:<input type="text" id="title" name="message.title"/><br>
							内容:<br>
        					<textarea class="ckeditor" name="message.content" id="ckeditor" cols="58"
									rows="10"></textarea>
									<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
									<script type="text/javascript">
									var instance = CKEDITOR.instances['ckeditor'];
									if(instance){
									CKEDITOR.remove(instance);
									}CKEDITOR.replace('ckeditor');
									</script>
    						<br>
   							通知类型<br>
   							<input type="radio" class="msgType" name="message.type" value="0" checked="true"/> 全体通知
   							<input type="radio" class="msgType" name="message.type" value="1"/> 实习期通知
   							<input type="radio" class="msgType" name="message.type" value="2"/>岗位信息 
   							<br><br>
   							文件:<input type="file" name="upload" /><br><br>
   							<input type="submit" value="提交"/>
   							
						</form>
						
						<!--#endeditable-->
					</div>
  </body>
</html>
