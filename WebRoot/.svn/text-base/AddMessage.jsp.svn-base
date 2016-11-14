<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="">
		<link rel="shortcut icon" href="ico/favicon.png">

		<title>Signin Template for Bootstrap</title>

		<!-- Bootstrap core CSS -->
		<link href="css/bootstrap.css" rel="stylesheet">

		<!-- Custom styles for this template -->
		<link href="css/signin.css" rel="stylesheet">

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
      <script src="../../docs-assets/js/html5shiv.js"></script>
      <script src="../../docs-assets/js/respond.min.js"></script>
    <![endif]-->
		<link rel="stylesheet" type="text/css"
			href="CLEditor1_3_0/jquery.cleditor.css" />
		<script type="text/javascript" src="CLEditor1_3_0/jquery.min.js"></script>
		<script type="text/javascript"
			src="CLEditor1_3_0/jquery.cleditor.min.js"></script>
		<script type="text/javascript">
      		$(document).ready(function() {
        		$("#input").cleditor();
      		});
    	</script>
	</head>

	<body>

		<div class="container">
			<form class="form-horizontal" method="post" action="<%=basePath%>guestbook/guestbookAction">
				<fieldset>
					<legend align="center">
						<h1>
							添加留言信息
						</h1>
					</legend>
					<div class="form-group">
						<label for="inputName3" class="col-md-4 control-label">
							姓名：
						</label>
						<div class="col-md-4">
							<input type="text" class="form-control" id="inputName3" name="guestbook.name"
								placeholder="姓名">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPhone3" class="col-md-4 control-label">
							电话号码：
						</label>
						<div class="col-md-4">
							<input type="text" class="form-control" id="inputPhone3" name="guestbook.phone"
								placeholder="电话号码">
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-md-4 control-label">
							电子邮件：
						</label>
						<div class="col-md-4">
							<input type="text" class="form-control" id="inputEmail3" name="guestbook.email"
								placeholder="xxxx@163.com">
						</div>
					</div>
					<div class="form-group">
						<label for="inputTitle3" class="col-md-4 control-label">
							标题：
						</label>
						<div class="col-md-4">
							<input type="text" class="form-control" id="inputTitle3" name="guestbook.title"
								placeholder="请输入标题">
						</div>
					</div>
					<div class="form-group">
						<label for="inputContent3" class="col-md-4 control-label">
							内容：
						</label>
						<div class="col-md-4">
							<textarea class="form-control" rows="10" cols="25" id="input"
								name="guestbook.content"></textarea>
						</div>
					</div>
					<div class="form-group" align="center">
						<button type="submit" class="btn btn-primary btn-lg">
							添加留言
						</button>
						<button type="reset" class="btn btn-default btn-lg">
							重置留言
						</button>
					</div>
					<legend align="center"></legend>
				</fieldset>
			</form>
		</div>
		<!-- /container -->
		<!-- Bootstrap core JavaScript
    ================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
	</body>
</html>
