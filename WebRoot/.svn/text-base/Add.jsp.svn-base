<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="<%=basePath%>/fckeditor/fckeditor.js"></script>
  </head>
  
  <body>

  <form id="form1" name="form1" method="post" action="<%=basePath%>guestbook/guestbookAction"> 
  <table width="600" height="400" border="0" align="center">
    <tr>
      <td width="100">姓名：</td>
      <td width="500">
        <input name="name" type="text" id="name" size="40" maxlength="20" />
      </td>
    </tr>
    <tr>
      <td>E-Mail：</td>
      <td>
        <input name="email" type="text" id="email" size="40" maxlength="40" />
      </td>
    </tr>
    <tr>
      <td>电话：</td>
      <td>
        <input name="phone" type="text" id="phone" size="40" maxlength="20" />
      </td>
    </tr>
    <tr>
      <td>主题：</td>
      <td>
        <input name="title" type="text" id="title" size="80" maxlength="80" />
      </td>
    </tr>
    <tr>
      <td valign="top">内容：</td>
      <td>
		<script type="text/javascript">
		    var oFCKeditor = new FCKeditor("content");    
		    oFCKeditor.BasePath	= '<%=basePath%>/fckeditor/' ;
		    oFCKeditor.Height	= 300 ;
			oFCKeditor.ToolbarSet = 'Basic';
			oFCKeditor.Create() ;
		</script>
	</td>
    </tr>
    <tr>
      <td></td>
      <td>
         <input type="submit" name="Submit" value="提交"/>
         <input type="reset" name="Reset" value="重置"/> 
      </td>
    </tr>   
  </table>
</form>


  </body>
</html>
