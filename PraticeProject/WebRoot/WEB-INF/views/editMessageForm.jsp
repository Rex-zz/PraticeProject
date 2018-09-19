<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
   
	<script type="text/javascript" src="Jquery/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
	<script type="text/javascript">
		$(function(){
			var type="${requestScope.message.type}"
			if(type==0){
				$("input#all").attr("checked","checked");
			}else if(type==1){
			$("input#pratice").attr("checked","checked");
			}else if(type==2){
				$("input#job").attr("checked","checked");
			}
			
			$("#msgform").submit(function(){
			debugger
				var formdata = new FormData($("#msgform")[0]);
				$.ajax({
					processData: false,
                	contentType: false,
					type:'POST',
					data:formdata,
					url:'updateMessage.action',
					success:function(data){
						$("div.sbmaincontent").empty();
						$("div.sbmaincontent").html(data);
					}
				})
				return false;
			})
			
		})
	</script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div class="sbmaincontent">
    	<script language="javascript" src="_dwr/engine.js"></script>
		<script language="javascript" src="system/resource/js/news/newscontent.js"></script>
		<script language="javascript" src="system/resource/js/ajax.js"></script>
		<form id="msgform" enctype="multipart/form-data">
			<input type="hidden" name="id" value="${requestScope.message.id }">
			标题:<input type="text" id="title" name="message.title" value="${requestScope.message.title }"/><br>
			内容:<br><textarea class="ckeditor" name="message.content" id="ckeditor" cols="58" 
			rows="10">${requestScope.message.content }</textarea>
				<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
				<script type="text/javascript">
					var instance = CKEDITOR.instances['ckeditor'];
					if(instance){
						CKEDITOR.remove(instance);
					}CKEDITOR.replace('ckeditor');
				</script><br>
   			通知类型<br>
   			<input type="radio" id="all" class="msgType" name="message.type" value="0"/> 全体通知
   			<input type="radio" id="pratice" class="msgType" name="message.type" value="1"/> 实习期通知
   			<input type="radio" id="job" class="msgType" name="message.type" value="2"/>岗位信息 <br><br>
   			重新选择文件:<input type="file" name="upload" /><br><br>
   			<input type="submit" value="提交"/>
		</form>
    </div>
  </body>
</html>
