<%@page import="com.pratice.entity.StuDiary"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
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

			<div class="navdivout">
				<div class="navdiv">
					<div class="navul">
						<ul id="sddm" style="float: right;">
							<!--#begineditable name="网站导航" action="" layout="" tpltype="" contype="" clone="" viewid="136193" contentviewid="" tagname="网站导航"-->
							<li >
								<a onmouseover="mopen('m1036')" onmouseout="mclosetime()" href="http://jxzx.wzu.edu.cn/">
								当前登陆:<s:if test="#session.identity==2">（管理员）</s:if>
								<s:if test="#session.identity==1">（教师）</s:if>
								<s:if test="#session.identity==0">（学生）</s:if>
								<s:property value="#session.user.name"/></a>
							</li>
							<li>
								<a onmouseover="mopen('m1037')" onmouseout="mclosetime()" href="../gzzd.htm">个人中心</a>
							</li>
							<li>
								<a onmouseover="mopen('m1045')" onmouseout="mclosetime()" href="login.jsp">注销</a>
							</li>
							
							<!--#endeditable-->
						</ul>
					</div>
				</div>

			</div>

		</div>

		</div>
		<!--头部结束-->

		<!--内页主模块-->
		<div class="submain png">
			<div class="submainin png">
				<div class="submainleft">
					<div class="smleftnav">
						<div class="smleftnavin"></div>
						<div class="smleftnavtop">
							<!--#begineditable name="栏目名称-左侧一级" action="" layout="" tpltype="" contype="" clone="" viewid="136231" contentviewid="" tagname="栏目名称-左侧一级"-->用户操作
							<!--#endeditable-->
						</div>
						<div class="smleftnavmid">
							<ul>
								<!--#begineditable name="网站导航-左侧二级" action="" layout="" tpltype="" contype="" clone="" viewid="136230" contentviewid="" tagname="网站导航-左侧二级"-->
								<li>
									<a href="#" title="实习见习">查看通知</a>
								</li>
								<s:if test="#session.identity==2">
									<li><a href="#" >发布通知</a></li>
									<li><a href="#" >查看信息</a></li>
									<li><a href="#" >抽查记录</a></li>
									<li><a href="#" >导入信息</a></li>
									<li><a href="#" >导出信息</a></li>
								</s:if>
								<s:elseif test="#session.identity==1">
									<li><a href="#" >查看学生</a></li>
									<li><a href="#" >填写联系表</a></li>
									<li><a href="#" >成绩填写</a></li>
									<li><a href="#" >实习总结</a></li>
								</s:elseif>
								<s:elseif test="#session.identity==0">
									<%  SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
										String nowDate=df.format(new Date());
										if((String)session.getAttribute("start")==null || nowDate.compareTo((String)session.getAttribute("start"))<0) {%>
									<li><a href="toIntention.action" >意向调查表<s:if test="#session.intention==1">(已填写)</s:if></a></li>
									<li><a href="toPractice.action" >岗位信息表<s:if test="#session.practiced==1">(已填写)</s:if></a></li><%} %>
									<% if((String)session.getAttribute("start")!=null &&
											(String)session.getAttribute("end")!=null &&
											nowDate.compareTo((String)session.getAttribute("start"))>0) {%>
									<li><a href="toDiary.action" >日记</a></li><% } %>
									<% if((String)session.getAttribute("end")!=null &&
											nowDate.compareTo((String)session.getAttribute("end"))>0){ %>
									<li><a href="#" >实习报告</a></li>
									<li><a href="#" >实习总结</a></li><%} %>
								</s:elseif>


								<!--#endeditable-->
							</ul>
							<!--<ul>
                    <li><a href="/index.aspx">&nbsp;</a></li>
                
                </ul>-->
						</div>
						<div class="smleftnavfoot">

						</div>
					</div>
					<div class="smleftsearch">
						<!--#begineditable name="全文检索" action="" layout="" tpltype="" contype="" clone="" viewid="136237" contentviewid="" tagname="全文检索"-->
						<script type="text/javascript">
							function _nl_ys_check() {

								var keyword = document.getElementById('showkeycode136237').value;
								if(keyword == null || keyword == "") {
									alert("请输入你要检索的内容！");
									return false;
								}
								if(window.toFF == 1) {
									document.getElementById("lucenenewssearchkeyword136237").value = Simplized(keyword);
								} else {
									document.getElementById("lucenenewssearchkeyword136237").value = keyword;
								}
								var base64 = new Base64();
								document.getElementById("lucenenewssearchkeyword136237").value = base64.encode(document.getElementById("lucenenewssearchkeyword136237").value);
								new VsbFormFunc().disableAutoEnable(document.getElementById("showkeycode136237"));
								return true;
							}
						</script>
						<form action="../search.jsp?wbtreeid=1021" method="post" id="au7a" name="au7a" onsubmit="return _nl_ys_check()" style="display: inline">
							<input type="hidden" id="lucenenewssearchkeyword136237" name="lucenenewssearchkeyword" value=""><input type="hidden" id="_lucenesearchtype136237" name="_lucenesearchtype" value="1"><input type="hidden" id="searchScope136237" name="searchScope" value="0">
							<ul class="search">
								<li style="padding-right: 6px; float: left"><input name="showkeycode" id="showkeycode136237" class="kuang1 png" type="text" /></li>
								<li style="float: left"><input class="anniu png" type="submit" value="&nbsp;" style="cursor: pointer" /></li>
							</ul>
						</form>
						<script language="javascript" src="system/resource/js/base64.js"></script>
						<script language="javascript" src="system/resource/js/formfunc.js"></script>
						<!--#endeditable-->
					</div>
					<div class="smleftimfserv">
						<!--#begineditable name="链接列表-信息服务" action="" layout="" tpltype="" contype="" clone="" viewid="136220" contentviewid="" tagname="链接列表-信息服务"-->
						<a target="_blank" href="../index/xxfw/bszn1/xsbszn.htm">&nbsp;</a>
						<a target="_blank" href="../index/xxfw/wzdxkb.htm">&nbsp;</a>
						<a target="_blank" href="../index/xxfw/xl_zxsj.htm">&nbsp;</a>
						<a target="_blank" href="../index/cx.htm">&nbsp;</a>
						<!--#endeditable-->
					</div>
				</div>
				<div class="submainright">
					<div class="place">
						<div class="placeright">
							<!--#begineditable name="当前位置" action="" layout="" tpltype="" contype="" clone="" viewid="136233" contentviewid="" tagname="当前位置"-->
							<a href="../index.htm" style="color: red;">新增日记</a>
							<!--#endeditable-->
						</div>
						<div class="placeleft">
							<!--#begineditable name="栏目名称-右侧" action="" layout="" tpltype="" contype="" clone="" viewid="136232" contentviewid="" tagname="栏目名称-右侧"-->日记列表
							<!--#endeditable-->
						</div>
					</div>
					
					<div class="sbmaincontent" style="float: right;">
						<div class="newslist">
							<!--#begineditable name="静态翻页列表" action="webber.wbst.com.news.ColumnNews" layout="/system/_component/news/list/stattplpagedownv2.jsp" tpltype="1" contype="news" clone="" viewid="136240" contentviewid="" tagname="静态翻页列表"-->

							<script language="javascript" src="system/resource/js/news/statpagedown.js"></script>
							<s:if test="#session.diaries!=null">
							<%  List<StuDiary> sd=(List<StuDiary>)session.getAttribute("diaries"); 
							    int num =sd.size();
							    int dpage=(Integer)session.getAttribute("diaryPage");
							    int n=7>(num-((dpage-1)*7-1))?(num):(dpage*7-1);
							    session.putValue("n", n);%>
								<ul>
									<s:iterator value="#session.diaries" var="my" begin="(#session.diaryPage-1)*7" end="#session.n-1">
										<li>
											<a><span class="newslistatime"><s:date name="#my.date" format="yyyy-MM-dd"/></span><span style="float:left;"><s:property value="#my.title"/></span></a>
										</li>
									</s:iterator>
								</ul>
								<br/>
								<div align="center">
									<a class="page" style="<%if(dpage<=1){ %>pointer-events:none;<%}else{ %>color:blue;<%} %>" href="toDiary.action?diaryPage=1">首页</a>&nbsp;&nbsp;&nbsp;
									<a style="<%if(dpage<=1){ %>pointer-events:none;<%}else{ %>color:blue;<%} %>" href="toDiary.action?diaryPage=<s:property value="#session.diaryPage-1"/>">上一页</a>&nbsp;&nbsp;&nbsp;
									<%=dpage %>/<%=(num-1)/7+1 %>&nbsp;&nbsp;&nbsp;
									<a style="<%if(dpage>=(num-1)/7+1){ %>pointer-events:none;<%}else{ %>color:blue;<%} %>" href="toDiary.action?diaryPage=<s:property value="#session.diaryPage+1"/>">下一页</a>&nbsp;&nbsp;&nbsp;
									<a style="<%if(dpage>=(num-1)/7+1){ %>pointer-events:none;<%}else{ %>color:blue;<%} %>" href="toDiary.action?diaryPage=<%=(num-1)/7+1%>">尾页</a>
								</div>
							</s:if>
							<br />
							
							<script>
								_showDynClickBatch(['dynclicks_u11_5417', 'dynclicks_u11_1861', 'dynclicks_u11_1860', 'dynclicks_u11_1859'], [5417, 1861, 1860, 1859], "wbnews", 1358721784)
							</script>
							<!--#endeditable-->
						</div>

					</div>
				
				
				</div>

				<div class="submainfoot">
					<!--#begineditable name="主页|收藏" action="" layout="" tpltype="" contype="" clone="" viewid="136236" contentviewid="" tagname="主页|收藏"-->
					<script language="javascript">
						function dosuba136236a() {
							try {
								var ua = navigator.userAgent.toLowerCase();
								if(ua.indexOf("msie 8") > -1) {
									window.external.AddToFavoritesBar(document.location.href, document.title, ""); //IE8
								} else if(ua.toLowerCase().indexOf("rv:") > -1) {
									window.external.AddToFavoritesBar(document.location.href, document.title, ""); //IE11+
								} else {
									if(document.all) {
										window.external.addFavorite(document.location.href, document.title);
									} else if(window.sidebar) {
										window.sidebar.addPanel(document.title, document.location.href, ""); //firefox
									} else {
										alert(hotKeysa136236a());
									}
								}

							} catch(e) {
								alert("无法自动添加到收藏夹，请使用 Ctrl + d 手动添加");
							}
						}

						function hotKeysa136236a() {
							var ua = navigator.userAgent.toLowerCase();
							var str = "";
							var isWebkit = (ua.indexOf('webkit') != -1);
							var isMac = (ua.indexOf('mac') != -1);
							if(ua.indexOf('konqueror') != -1) {
								str = 'CTRL + B'; // Konqueror   
							} else if(window.home || isWebkit || isMac) {
								str = (isMac ? 'Command/Cmd' : 'CTRL') + ' + D'; // Netscape, Safari, iCab, IE5/Mac   
							}
							return((str) ? '无法自动添加到收藏夹，请使用' + str + '手动添加' : str);
						}

						function setHomepagea136236a() {
							var url = document.location.href;
							if(document.all) {
								document.body.style.behavior = 'url(#default#homepage)';
								document.body.setHomePage(url);
							} else if(window.sidebar) {
								if(window.netscape) {
									try {
										netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
									} catch(e) {
										alert("该操作被浏览器拒绝，如果想启用该功能，请在地址栏内输入 about:config,然后将项 signed.applets.codebase_principal_support 值该为true");
									}
								}
								var prefs = Components.classes['@mozilla.org/preferences-service;1'].getService(Components.interfaces.nsIPrefBranch);
								prefs.setCharPref('browser.startup.homepage', url);
							} else {
								alert("浏览器不支持自动设为首页，请手动设置");
							}
						}
					</script>

					<a href="javascript:setHomepagea136236a()">设为首页</a>|
					<a onclick="javascript:dosuba136236a();" href="#">加入收藏</a>|
					<a href="../index/lxwm.htm" target="_blank">联系我们</a>
					<!--#endeditable-->
				</div>
			</div>
		</div>
		<!--内页主模块结束-->

		
		<script>
			$(function() {
				$("#m72").css("visibility", "hidden");
			})
		</script>
  </body>
</html>
