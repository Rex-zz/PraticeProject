<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<script type="text/javascript" src="Jquery/jquery-1.10.2.js"></script>
		<script type="text/javascript">
			$(function(){
				$('a.Next,a.Prev').click(function(){
					var url=this.href;
					var args={"time":new Date()};
					$.get(url,args,function(data){
					$("div.sbmaincontent").empty();
					$("div.sbmaincontent").html(data)
					},"html")
					return false;
				})
				$('a.msgs').click(function(){
					var url=this.href;
					var args={"time":new Date()};
					$.get(url,args,function(data){
					$("div.sbmaincontent").empty();
					$("div.sbmaincontent").html(data)
					},"html")
					return false;
				})
			})
		</script>
		

		<!--Announced by Visual SiteBuilder 9-->
		<!-- CustomerNO:77656262657232307b7647545251574103070000 -->
		<script type="text/javascript" src="system/resource/js/counter.js"></script>
		<script type="text/javascript">
			_jsq_(1021, '/list.jsp', -1, 1358721784)
		</script>

  </head>
  
  <body>
    
					<div class="sbmaincontent">
						<div class="newslist">
							<!--#begineditable name="静态翻页列表" action="webber.wbst.com.news.ColumnNews" layout="/system/_component/news/list/stattplpagedownv2.jsp" tpltype="1" contype="news" clone="" viewid="136240" contentviewid="" tagname="静态翻页列表"-->

							<script language="javascript" src="system/resource/js/news/statpagedown.js"></script>
							<ul>
								<s:iterator value="#request.listmessages">
									
									
									<li id="line_u11_0">
										<a title='${title }' href="msgContent.action?id=${id }&page=${requestScope.page }" class="msgs"><span class="newslistatime">${date }</span><span style="float:left;">
										<s:if test="type==0">
										[全体通知]
										</s:if>
										<s:if test="type==1">
										[实习期通知]
										</s:if>
										${title }
										
										</span></a>
									</li>
								</s:iterator>
								
							</ul>
							<br />
							<div align="center">
								<INPUT TYPE="hidden" NAME="actiontype" VALUE=""><input type="hidden" name="_scode_" value="1528438023438"><input type="hidden" name="urltype" value="tree.TreeTempUrl"><input type="hidden" name="wbtreeid" value="1021"><input type="hidden" name="outFlag" value="false">
								<style type="text/css">
									.headStyle4cb83oav5v,
									.headStyle4cb83oav5v td,
									.headStyle4cb83oav5v div {
										font-size: 12px;
										font-family: 宋体;
										color: #000000;
										margin-left: auto;
										margin-right: auto;
										line-height: 14px;
									}
									
									.defaultButtonStyle {
										font-size: 12px;
										font-family: 宋体;
										height: 20px;
										color: #000000;
										BORDER: #AFD5F5 1px solid;
										margin: 0px;
										padding: 0px;
										FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#BDDBF7);
										CURSOR: pointer;
										line-height: 14px;
										background: -webkit-gradient(linear, 0 0, 0 100%, from(#ffffff), to(#BDDBF7));
										background: -moz-linear-gradient( top, #ffffff, #BDDBF7);
										background: -ms-linear-gradient(top, #ffffff 0%, #bddbf7 100%);
									}
									
									.defaultinputStyle {
										font-size: 12px;
										font-family: 宋体;
										height: 20px;
										border: 1px solid #AFD5F5;
										line-height: 14px;
									}
									
									.colHeader {
										font-size: 12px;
										font-family: 宋体;
										line-height: 14px;
									}
									
									.headStyle4cb83oav5v a,
									.pageList .this-page {
										font-size: 12px;
										font-family: 宋体;
										display: inline-block;
										height: 14px;
										padding: 2px 4px;
										border: solid 1px #AFD5F5;
										background: #fff;
										text-decoration: none;
										MARGIN-RIGHT: 1px;
										line-height: 14px;
									}
									
									.headStyle4cb83oav5v a:visited {
										font-size: 12px;
										font-family: 宋体;
										color: #000000;
										text-decoration: none;
										line-height: 14px;
									}
									
									.headStyle4cb83oav5v .PrevDisabled {
										font-size: 12px;
										font-family: 宋体;
										display: inline-block;
										height: 14px;
										margin-right: 3px;
										padding: 2px 4px;
										background: #fff;
										color: #ccc;
										border: solid 1px #AFD5F5;
										line-height: 14px;
									}
									
									.headStyle4cb83oav5v .SelectList {
										font-size: 12px;
										font-family: 宋体;
										line-height: 14px;
									}
									
									.headStyle4cb83oav5v .Prev {
										font-size: 12px;
										font-family: 宋体;
										margin-right: 3px;
										padding: 2px 4px;
										line-height: 14px;
									}
									
									.headStyle4cb83oav5v .break {
										font-size: 12px;
										font-family: 宋体;
										border: none;
										text-decoration: none;
										line-height: 14px;
									}
									
									.headStyle4cb83oav5v .NextDisabled {
										font-size: 12px;
										font-family: 宋体;
										display: inline-block;
										height: 14px;
										margin-left: 2px;
										padding: 2px 4px;
										background: #fff;
										color: #ccc;
										border: solid 1px #AFD5F5;
										line-height: 14px;
									}
									
									.headStyle4cb83oav5v .Next {
										font-size: 12px;
										font-family: 宋体;
										margin-left: 2px;
										padding: 2px 4px;
										line-height: 14px;
									}
									
									.headStyle4cb83oav5v .this-page {
										font-size: 12px;
										font-family: 宋体;
										display: inline-block;
										height: 14px;
										padding: 2px 4px;
										border: solid 1px #AFD5F5;
										background: #E1F0FD;
										font-weight: bold;
										color: black;
										MARGIN-RIGHT: 1px;
										line-height: 14px;
									}
									
									.headStyle4cb83oav5v a:hover {
										font-size: 12px;
										font-family: 宋体;
										color: black;
										background: #EFF7FE;
										border-color: #AFD5F5;
										text-decoration: none;
										line-height: 14px;
									}
									
									.headStyle4cb83oav5v a:link {
										font-size: 12px;
										font-family: 宋体;
										color: #000000;
										text-decoration: none;
										line-height: 14px;
									}
									
									.headStyle4cb83oav5v a:active {
										font-size: 12px;
										font-family: 宋体;
										color: black;
										text-decoration: none;
										background: #EFF7FE;
										line-height: 14px;
									}
								</style>
								<script language="javascript" src="system/resource/js/gotopage.js"></script>
								<script type="text/javascript">
									function a136240_gopage_fun() {
										_simple_list_gotopage_fun(1, 'a136240GOPAGE', 2)
									}
								</script>
								<table cellspacing="0" cellpadding="0" border="0" >
									<TR>
										<td colspan="0">
											<table cellspacing="0" class="headStyle4cb83oav5v" width="100%" cellpadding="1">
												<tr valign="middle">
													<TD nowrap align="left" width="1%" id="fanye136240">共${requestScope.count }条&nbsp;&nbsp;${requestScope.page+1 }/${requestScope.pageCount }&nbsp;</td>
													<td nowrap align="left">
													<div>
														<c:if test="${requestScope.page==0 }">
															<span class="PrevDisabled">首页</span><span class="PrevDisabled">上页</span>
														</c:if>
														<c:if test="${requestScope.page!=0 }">
															<a class="Prev" href="allMessages.action?page=0">首页</a>
															<a class="Prev" href="allMessages.action?page=${requestScope.page-1 }">上页</a>
														</c:if>
														<c:if test="${requestScope.page+1== requestScope.pageCount}">
															<span class="NextDisabled">下页</span><span class="NextDisabled">尾页</span>
														</c:if>
														<c:if test="${requestScope.page+1!= requestScope.pageCount}">
															<a class="Next" href="allMessages.action?page=${requestScope.page+1 }">下页</a>
															<a class="Next" href="allMessages.action?page=${requestScope.pageCount-1 }">尾页</a>
														</c:if>
														</div>
													</td>
												</tr>
											</table>
								</table>
							</div>
							<script>
								_showDynClickBatch(['dynclicks_u11_5417', 'dynclicks_u11_1861', 'dynclicks_u11_1860', 'dynclicks_u11_1859'], [5417, 1861, 1860, 1859], "wbnews", 1358721784)
							</script>
							<!--#endeditable-->
						</div>

					</div>
				
				
  </body>
</html>
