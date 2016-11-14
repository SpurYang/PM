<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<title>Loading</title>
<head>
<script language="javascript">
  function setSB(v, el) {
    var ie5 = (document.all  &&  document.getElementsByTagName);
    if (ie5 || document.readyState == "complete")     {
      filterEl = el.children[0];
      valueEl = el.children[1];
      filterEl.style.width = v + "%";
      valueEl.innerText = v + "%";
    }
  }
  function fakeProgress(v, el) {
    if (v > 100)
      location.href = "<%=basePath%>index.jsp";
    else     {
      setSB(v, el);
      window.setTimeout("fakeProgress(" + (++v) + ", document.all['" + el.id + "'])", 40);
    }
  }
</SCRIPT>
<style type="text/css">
<!--
.STYLE1 {
	font-family: "新宋体";
	font-size: 14px;
	color: #CC0066;
	font-weight: bold;
}
.STYLE2 {
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 36px;
	color: #3333FF;
}
-->
</style>
</head>

<body onload="fakeProgress(0, sb)" topmargin=180 bgcolor=#CCCCCC>
<center>
<p align=center class="STYLE1" style="font-szie:9pt; line-height: 100%">准备进入强劲的人事管理系统，请稍安勿躁，请稍侯……</p>
<p align=center class="STYLE2" style="font-szie:9pt; line-height: 100%">Loading......</p>
<span id=sb style="width: 500px">
<div style="filter: Alpha(Opacity=0, FinishOpacity=60, style=1, StartX=0, StartY=0, FinishX=100, FinishY=0); width: 0%; height: 12px; position: absolute; background: #9999ff"></div>
<div style="font-size: 15px; width: 100%; color: #ff3333; font-family: arial; text-align: center"></DIV>
</span>
</center>
</body>
</html>