<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
				$("a#return,a#deleteMessage,a#enditMessage").click(function(){
					var url=this.href;
					
					$.get(url,null,function(data){
					$("div.sbmaincontent").empty();
					$("div.sbmaincontent").html(data)
					},"html")
				return false;
				})
				
			})
		</script>
		<style>
			td {
				border: solid #000;
				border-width: 0px 1px 1px 0px;
			}
		</style>

		<!--IE6透明判断-->
		<!--[if IE 6]>
<script src="../../dfiles/9914/template/default/js/bdtxk1.js"></script>
<script>
DD_belatedPNG.fix('.flash_bar,#tit_fc1,#tit_fc2,#tit_fc3,#tit_fc4,#flashLine,.png');
</script>
<![endif]-->
		<!--Announced by Visual SiteBuilder 9-->
		<!-- CustomerNO:77656262657232307b7647545251574103070000 -->
		
		
  </head>
  
  <body>
    <!--内页主模块-->
				
					<s:debug></s:debug>
					<div class="sbmaincontent">
						<!--#begineditable name="文章内容" action="webber.wbst.com.news.DetailNews" layout="/system/_component/news/content/tpltitle.jsp" tpltype="1" contype="" clone="" viewid="136235" contentviewid="" tagname="文章内容"-->
					
						<script language="javascript" src="_dwr/engine.js"></script>
						<script language="javascript" src="system/resource/js/news/newscontent.js"></script>
						<script language="javascript" src="system/resource/js/ajax.js"></script>
						<form name="_newscontent_fromname">

							<div class="newstitle">${requestScope.message.title }</div>
							<div class="newstime">编辑日期：${requestScope.message.date}&nbsp;&nbsp;&nbsp;&nbsp;
							通知类型:
							<c:if test="${requestScope.message.type==0 }">常规通知</c:if>
							<c:if test="${requestScope.message.type==1 }">重要通知</c:if>
							 &nbsp;&nbsp;&nbsp;&nbsp;作者：${requestScope.message.admin.name }&nbsp;&nbsp;&nbsp;&nbsp;
							 <a id="return" href="allMessages.action?page=${requestScope.page }&msgType=${requestScope.message.type}">返回</a>
							 <a id="enditMessage" href="getEditForm.action?id=${requestScope.message.id }">编辑</a>
							 <a id="deleteMessage" href="deleteMessage.action?id=${requestScope.message.id }">删除</a>
							 </div>
							<div class="newscontent">
								<div id="vsb_content">
									${requestScope.message.content }
								</div>
								<c:if test="${requestScope.message.file!=null }">
								<p>
									<UL style="list-style-type:none;">
										<li>
											<a href="fileDownFile.action?downloadFileName=${requestScope.message.file }" target="_blank">${requestScope.message.file }</a>
										</li>
									</UL>
								</p>
								</c:if>
							</div>
						</form>

						<!--#endeditable-->
					</div>
  </body>
</html>
