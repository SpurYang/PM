<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>岗位管理</title>
		<meta name="keywords" content="" />
		<meta name="description" content="" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<!-- basic styles -->
		<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="assets/css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
		<![endif]-->

		<!-- page specific plugin styles -->

		<!-- fonts -->



		<!-- ace styles -->

		<link rel="stylesheet" href="assets/css/ace.min.css" />
		<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="assets/css/ace-skins.min.css" />

		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- ace settings handler -->

		<script src="assets/js/ace-extra.min.js"></script>

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="assets/js/html5shiv.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body>
		<div class="navbar navbar-default" id="navbar">
			<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>

			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left">
					<a href="#" class="navbar-brand"> <small> <i
							class="icon-leaf"></i> 人事管理系统 </small> </a>
					<!-- /.brand -->
				</div>
				<!-- /.navbar-header -->

				<div class="navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">

						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle"> <img
									class="nav-user-photo" src="assets/avatars/user.jpg"
									alt="Jason's Photo" /> <span class="user-info"> <small>欢迎光临,</small>
									Jason </span> <i class="icon-caret-down"></i> </a>

							<ul
								class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="#"> <i class="icon-cog"></i> 设置 </a>
								</li>

								<li>
									<a href="#"> <i class="icon-user"></i> 个人资料 </a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="#"> <i class="icon-off"></i> 退出 </a>
								</li>
							</ul>
						</li>
					</ul>
					<!-- /.ace-nav -->
				</div>
				<!-- /.navbar-header -->
			</div>
			<!-- /.container -->
		</div>

		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="#"> <span
					class="menu-text"></span> </a>

				<div class="sidebar" id="sidebar">
					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
					</script>

					<div class="sidebar-shortcuts" id="sidebar-shortcuts">
						<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
							<button class="btn btn-success">
								<i class="icon-signal"></i>
							</button>

							<button class="btn btn-info">
								<i class="icon-pencil"></i>
							</button>

							<button class="btn btn-warning">
								<i class="icon-group"></i>
							</button>

							<button class="btn btn-danger">
								<i class="icon-cogs"></i>
							</button>
						</div>

						<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
							<span class="btn btn-success"></span>

							<span class="btn btn-info"></span>

							<span class="btn btn-warning"></span>

							<span class="btn btn-danger"></span>
						</div>
					</div>
					<!-- #sidebar-shortcuts -->





					<ul class="nav nav-list">
						<!-- 系统管理TEST -->
						<li>
							<a href="index.html" class="dropdown-toggle"> <i
								class="icon-text-width"></i> <span class="menu-text">
									系统管理 </span> <b class="arrow icon-angle-down"></b> </a>
							<ul class="submenu">
								<li>
									<a href="User.html"> <i class="icon-double-angle-right"></i>
										用户管理 </a>
								</li>
							</ul>


							<!-- 系统管理END -->









							<!-- 员工管理开始 -->
						<li>
							<a href="#" class="dropdown-toggle"> <i
								class="icon-dashboard"></i> <span class="menu-text"> 员工管理
							</span> <b class="arrow icon-angle-down"></b> </a>

							<ul class="submenu">
								<li>
									<a href="Addjob.html"> <i class="icon-double-angle-right"></i>
										员工入职管理 </a>
								</li>

								<li>
									<a href="Message.html"> <i class="icon-double-angle-right"></i>
										员工信息管理 </a>
								</li>
								<li>
									<a href="Probation.html"> <i
										class="icon-double-angle-right"></i> 员工试用期管理 </a>
								</li>


								<li>
									<a href="#" class="dropdown-toggle"> <i
										class="icon-double-angle-right"></i> 员工其他信息管理 <b
										class="arrow icon-angle-down"></b> </a>

									<ul class="submenu">
										<li>
											<a href="Career.html"> <i class="icon-leaf"></i>
												职业生涯信息维护 </a>
										</li>
										<li>
											<a href="EnglishTalent.html"> <i class="icon-leaf"></i>
												外语能力信息维护 </a>
										</li>
										<li>
											<a href="FamilyRelationship.html"> <i class="icon-leaf"></i>
												家庭成员及社会关系信息维护 </a>
										</li>
									</ul>
								</li>
							</ul>
							<!-- 员工管理结束 -->
							<!-- 人才库管理开始 -->
						<li>
							<a href="TalentPool.html"> <i class="icon-desktop"></i> <span
								class="menu-text"> 人才库管理 </span> </a>
						</li>
						<!-- 人才库管理结束 -->


						<!-- 公司管理开始 -->
						<li>
							<a href="#" class="dropdown-toggle"> <i class="icon-edit"></i>
								<span class="menu-text"> 公司管理 </span> <b
								class="arrow icon-angle-down"></b> </a>

							<ul class="submenu">
								<li>
									<a href="ComMessage.html"> <i
										class="icon-double-angle-right"></i> 公司信息 </a>
								</li>

								<li>
									<a href="Department.html"> <i
										class="icon-double-angle-right"></i> 部门管理 </a>
								</li>
								<li>
									<a href="Post.html"> <i class="icon-double-angle-right"></i>
										岗位管理 </a>
								</li>
							</ul>
						</li>
						<!--公司管理结束-->






						<!-- 薪酬管理开始 -->
						<li>
							<a href="#" class="dropdown-toggle"> <i
								class="icon-list-alt"></i> <span class="menu-text"> 薪酬管理
							</span> <b class="arrow icon-angle-down"></b> </a>

							<ul class="submenu">
								<li>
									<a href="Salary.html"> <i class="icon-double-angle-right"></i>员工薪酬管理
									</a>


								</li>
							</ul>
						</li>
						<!--薪酬管理结束-->


						<!-- 报表管理开始 -->
						<li>
							<a href="#" class="dropdown-toggle"> <i class="icon-tag"></i>
								<span class="menu-text"> 报表管理 </span> <b
								class="arrow icon-angle-down"></b> </a>

							<ul class="submenu">
								<li>
									<a href="NewEmpTable.html"> <i
										class="icon-double-angle-right"></i> 新聘员工表 </a>
								</li>

								<li>
									<a href="LeaveEmpTable.html"> <i
										class="icon-double-angle-right"></i> 离职员工表 </a>
								</li>
								<li>
									<a href="DepTransferTable.html"> <i
										class="icon-double-angle-right"></i> 部门调动表 </a>
								</li>
								<li>
									<a href="PostTransferTable.html"> <i
										class="icon-double-angle-right"></i> 岗位调动表 </a>
								</li>
								<li>
									<a href="MonthReport.html"> <i
										class="icon-double-angle-right"></i> 人事月报 </a>
								</li>
							</ul>
						</li>
						<!-- 报表管理结束 -->

						<!-- 结算管理开始 -->
						<li>
							<a href="#" class="dropdown-toggle"> <i
								class="icon-file-alt"></i> <span class="menu-text"> 结算管理
							</span> <b class="arrow icon-angle-down"></b> </a>

							<ul class="submenu">
								<li>
									<a href="Accounts.html"> <i
										class="icon-double-angle-right"></i>工资结算 </a>


								</li>
							</ul>
						</li>
						<!--结算管理结束-->

						<!--数据维护开始-->
						<li>
							<a href="Data.html"> <i class="icon-list-alt"></i> <span
								class="menu-text"> 数据维护 </span> </a>
						</li>

						<!--数据维护结束-->

						<!-- 日志管理开始 -->
						<li>
							<a href="#" class="dropdown-toggle"> <i class="icon-desktop"></i>
								<span class="menu-text"> 日志管理 </span> <b
								class="arrow icon-angle-down"></b> </a>

							<ul class="submenu">
								<li>
									<a href="OperateLog"> <i class="icon-double-angle-right"></i>操作日志
									</a>
								</li>
								<li>
									<a href="SystemLog"> <i class="icon-double-angle-right"></i>系统日志
									</a>
								</li>
							</ul>
						</li>
						<!--日志管理结束-->



					</ul>
					<!-- /.nav-list -->

					<div class="sidebar-collapse" id="sidebar-collapse">
						<i class="icon-double-angle-left"
							data-icon1="icon-double-angle-left"
							data-icon2="icon-double-angle-right"></i>
					</div>

					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
					</script>
				</div>

				<div class="main-content">
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>


						<ul class="breadcrumb">
							<li>
								<i class="icon-home home-icon"></i>
								<a href="index.html">首页</a>
							</li>
							<li>
								<a href="#">公司管理</a>
							</li>
							<li class="active">
								岗位管理
							</li>



						</ul>
						<!-- .breadcrumb -->

						<div class="nav-search" id="nav-search">
							<form class="form-search">
								<span class="input-icon"> <input type="text"
										placeholder="Search ..." class="nav-search-input"
										id="nav-search-input" autocomplete="off" /> <i
									class="icon-search nav-search-icon"></i> </span>
							</form>
						</div>
						<!-- #nav-search -->
					</div>

					<div class="page-content">
						<div class="page-header">
							<h1>
								员工岗位调动
								<small> <i class="icon-double-angle-right"></i> Transfer
								</small>
							</h1>
						</div>
						<!-- /.page-header -->

						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->

								<form class="form-horizontal" role="form" id="form1"
									name="form1" method="post"
									action="<%=basePath%>postback/postbackAction2"> 
									<table id="sample-table-1"
										class="table table-striped table-bordered table-hover">
										<thead>
											<tr>
											    <th width="6%" class="center" >
													ID
												</th>
												
												<th width="6%" class="center" >
													岗位
												</th>
												<th width="6%" class="center"  >
													类型
												</th>
												<th width="6%" class="center"  >
													原因
												</th>
												<th width="6%" class="center"  >
													备注
												</th>
												<th width="6%" class="center"  >
													日期
												</th>
												<th width="10%" class="center" >
													操作
												</th>

											</tr>
										</thead>
										<tbody>
											<c:forEach items="${sessionScope.list}" var="list">
												<tr>
													<td >
														<input type="text" id="form-field-1"
												          class="col-xs-10 col-sm-5" value="${list.psEid}" name="postbackInf.psEid" />
													</td>
													<td   >
														<input type="text" id="form-field-1"
												          class="col-xs-10 col-sm-5" value="${list.psPost}" name="postbackInf.psPost" />
													</td>
													<td >
														<input type="text" id="form-field-1"
												          class="col-xs-10 col-sm-5" value="${list.psType}" name="postbackInf.psType" />
														
													</td>
													<td >
														
														<textarea name="postbackInf.psReason" class="form-control" placeholder=""
												         id="textarea" ><c:out value="${list.psReason}"></c:out></textarea>
													</td>
													<td >
					
														<textarea name="postbackInf.psNote" class="form-control" placeholder=""
												         id="textarea" ><c:out value="${list.psNote}"></c:out></textarea>
													</td>
													<td >
														<input type="text" id="form-field-1"
												          value="${list.psDate}" name="postbackInf.psDate" />
													</td>
													<td class="center">
													<input
														onclick="window.location.href='EmpTransfer.jsp'"
														name="Submit251" type="button" class="badge-primary"
														value="岗位调动" style="color: #FFFFFF">
													<input
													    onclick="window.location.href='<%=basePath%>postback/postbackAction1.action?id=${list.psEid}'"
													    name="Submit251" type="button" class="badge-primary"
													    value="删除" style="color: #FFFFFF">
													<input
													    name="Submit251" type="submit" class="badge-primary"
													    value="更新" style="color: #FFFFFF">
												</td>
												</tr>

											</c:forEach>
										</tbody>
									</table>
								</form>
							</div>
						</div>
						
					</div>
				</div>
			</div>

			<div id="modal-form" class="modal" tabindex="-1">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">
								&times;
							</button>
							<h4 class="blue bigger">
								Please fill the following form fields
							</h4>
						</div>

						<div class="modal-body overflow-visible">
							<div class="row">
								<div class="col-xs-12 col-sm-5">
									<div class="space"></div>

									<input type="file" />
								</div>

								<div class="col-xs-12 col-sm-7">


									<div class="space-4"></div>

									<div class="form-group">
										<label for="form-field-username">
											Username
										</label>

										<div>
											<input class="input-large" type="text"
												id="form-field-username" placeholder="Username"
												value="alexdoe" />
										</div>
									</div>

									<div class="space-4"></div>

									<div class="form-group">
										<label for="form-field-first">
											Name
										</label>

										<div>
											<input class="input-medium" type="text" id="form-field-first"
												placeholder="First Name" value="Alex" />
											<input class="input-medium" type="text" id="form-field-last"
												placeholder="Last Name" value="Doe" />
										</div>
									</div>
								</div>
							</div>
						</div>

						<div class="modal-footer">
							<button class="btn btn-sm" data-dismiss="modal">
								<i class="icon-remove"></i> Cancel
							</button>

							<button class="btn btn-sm btn-primary">
								<i class="icon-ok"></i> Save
							</button>
						</div>
					</div>
				</div>
			</div>
			<!-- PAGE CONTENT ENDS -->
		</div>
		<!-- /.col -->
		</div>
		<!-- /.row -->
		</div>
		<!-- /.page-content -->
		</div>
		<!-- /.main-content -->

		<div class="ace-settings-container" id="ace-settings-container">
			<div class="btn btn-app btn-xs btn-warning ace-settings-btn"
				id="ace-settings-btn">
				<i class="icon-cog bigger-150"></i>
			</div>

			<div class="ace-settings-box" id="ace-settings-box">
				<div>
					<div class="pull-left">
						<select id="skin-colorpicker" class="hide">
							<option data-skin="default" value="#438EB9">
								#438EB9
							</option>
							<option data-skin="skin-1" value="#222A2D">
								#222A2D
							</option>
							<option data-skin="skin-2" value="#C6487E">
								#C6487E
							</option>
							<option data-skin="skin-3" value="#D0D0D0">
								#D0D0D0
							</option>
						</select>
					</div>
					<span>&nbsp; Choose Skin</span>
				</div>

				<div>
					<input type="checkbox" class="ace ace-checkbox-2"
						id="ace-settings-navbar" />
					<label class="lbl" for="ace-settings-navbar">
						Fixed Navbar
					</label>
				</div>

				<div>
					<input type="checkbox" class="ace ace-checkbox-2"
						id="ace-settings-sidebar" />
					<label class="lbl" for="ace-settings-sidebar">
						Fixed Sidebar
					</label>
				</div>

				<div>
					<input type="checkbox" class="ace ace-checkbox-2"
						id="ace-settings-breadcrumbs" />
					<label class="lbl" for="ace-settings-breadcrumbs">
						Fixed Breadcrumbs
					</label>
				</div>

				<div>
					<input type="checkbox" class="ace ace-checkbox-2"
						id="ace-settings-rtl" />
					<label class="lbl" for="ace-settings-rtl">
						Right To Left (rtl)
					</label>
				</div>

				<div>
					<input type="checkbox" class="ace ace-checkbox-2"
						id="ace-settings-add-container" />
					<label class="lbl" for="ace-settings-add-container">
						Inside
						<b>.container</b>
					</label>
				</div>
			</div>
		</div>
		<!-- /#ace-settings-container -->
		</div>
		<!-- /.main-container-inner -->

		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse"> <i
			class="icon-double-angle-up icon-only bigger-110"></i> </a>
		</div>
		<!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->









		<script src="assets/js/jquery-2.0.3.min.js"></script>

		<!-- <![endif]-->

		<!--[if IE]>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->

		<!--[if !IE]> -->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>"+"<"+"script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>"+"<"+"script>");
</script>
<![endif]-->

		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"script>");
		</script>
		<script src="assets/js/bootstrap.min.js"></script>
		<script src="assets/js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<!--[if lte IE 8]>
		  <script src="assets/js/excanvas.min.js"></script>
		<![endif]-->

		<script src="assets/js/jquery-ui-1.10.3.custom.min.js"></script>
		<script src="assets/js/jquery.ui.touch-punch.min.js"></script>
		<script src="assets/js/jquery.slimscroll.min.js"></script>
		<script src="assets/js/jquery.easy-pie-chart.min.js"></script>
		<script src="assets/js/jquery.sparkline.min.js"></script>
		<script src="assets/js/flot/jquery.flot.min.js"></script>
		<script src="assets/js/flot/jquery.flot.pie.min.js"></script>
		<script src="assets/js/flot/jquery.flot.resize.min.js"></script>

		<!-- ace scripts -->

		<script src="assets/js/ace-elements.min.js"></script>
		<script src="assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->

		<script type="text/javascript">
			jQuery(function($) {
				$('.easy-pie-chart.percentage').each(function(){
					var $box = $(this).closest('.infobox');
					var barColor = $(this).data('color') || (!$box.hasClass('infobox-dark') ? $box.css('color') : 'rgba(255,255,255,0.95)');
					var trackColor = barColor == 'rgba(255,255,255,0.95)' ? 'rgba(255,255,255,0.25)' : '#E2E2E2';
					var size = parseInt($(this).data('size')) || 50;
					$(this).easyPieChart({
						barColor: barColor,
						trackColor: trackColor,
						scaleColor: false,
						lineCap: 'butt',
						lineWidth: parseInt(size/10),
						animate: /msie\s*(8|7|6)/.test(navigator.userAgent.toLowerCase()) ? false : 1000,
						size: size
					});
				})
			
				$('.sparkline').each(function(){
					var $box = $(this).closest('.infobox');
					var barColor = !$box.hasClass('infobox-dark') ? $box.css('color') : '#FFF';
					$(this).sparkline('html', {tagValuesAttribute:'data-values', type: 'bar', barColor: barColor , chartRangeMin:$(this).data('min') || 0} );
				});
			
			
			
			
			  var placeholder = $('#piechart-placeholder').css({'width':'90%' , 'min-height':'150px'});
			  var data = [
				{ label: "social networks",  data: 38.7, color: "#68BC31"},
				{ label: "search engines",  data: 24.5, color: "#2091CF"},
				{ label: "ad campaigns",  data: 8.2, color: "#AF4E96"},
				{ label: "direct traffic",  data: 18.6, color: "#DA5430"},
				{ label: "other",  data: 10, color: "#FEE074"}
			  ]
			  function drawPieChart(placeholder, data, position) {
			 	  $.plot(placeholder, data, {
					series: {
						pie: {
							show: true,
							tilt:0.8,
							highlight: {
								opacity: 0.25
							},
							stroke: {
								color: '#fff',
								width: 2
							},
							startAngle: 2
						}
					},
					legend: {
						show: true,
						position: position || "ne", 
						labelBoxBorderColor: null,
						margin:[-30,15]
					}
					,
					grid: {
						hoverable: true,
						clickable: true
					}
				 })
			 }
			 drawPieChart(placeholder, data);
			
			 /**
			 we saved the drawing function and the data to redraw with different position later when switching to RTL mode dynamically
			 so that's not needed actually.
			 */
			 placeholder.data('chart', data);
			 placeholder.data('draw', drawPieChart);
			
			
			
			  var $tooltip = $("<div class='tooltip top in'><div class='tooltip-inner'></div></div>").hide().appendTo('body');
			  var previousPoint = null;
			
			  placeholder.on('plothover', function (event, pos, item) {
				if(item) {
					if (previousPoint != item.seriesIndex) {
						previousPoint = item.seriesIndex;
						var tip = item.series['label'] + " : " + item.series['percent']+'%';
						$tooltip.show().children(0).text(tip);
					}
					$tooltip.css({top:pos.pageY + 10, left:pos.pageX + 10});
				} else {
					$tooltip.hide();
					previousPoint = null;
				}
				
			 });
			
			
			
			
			
			
				var d1 = [];
				for (var i = 0; i < Math.PI * 2; i += 0.5) {
					d1.push([i, Math.sin(i)]);
				}
			
				var d2 = [];
				for (var i = 0; i < Math.PI * 2; i += 0.5) {
					d2.push([i, Math.cos(i)]);
				}
			
				var d3 = [];
				for (var i = 0; i < Math.PI * 2; i += 0.2) {
					d3.push([i, Math.tan(i)]);
				}
				
			
				var sales_charts = $('#sales-charts').css({'width':'100%' , 'height':'220px'});
				$.plot("#sales-charts", [
					{ label: "Domains", data: d1 },
					{ label: "Hosting", data: d2 },
					{ label: "Services", data: d3 }
				], {
					hoverable: true,
					shadowSize: 0,
					series: {
						lines: { show: true },
						points: { show: true }
					},
					xaxis: {
						tickLength: 0
					},
					yaxis: {
						ticks: 10,
						min: -2,
						max: 2,
						tickDecimals: 3
					},
					grid: {
						backgroundColor: { colors: [ "#fff", "#fff" ] },
						borderWidth: 1,
						borderColor:'#555'
					}
				});
			
			
				$('#recent-box [data-rel="tooltip"]').tooltip({placement: tooltip_placement});
				function tooltip_placement(context, source) {
					var $source = $(source);
					var $parent = $source.closest('.tab-content')
					var off1 = $parent.offset();
					var w1 = $parent.width();
			
					var off2 = $source.offset();
					var w2 = $source.width();
			
					if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
					return 'left';
				}
			
			
				$('.dialogs,.comments').slimScroll({
					height: '300px'
			    });
				
				
				//Android's default browser somehow is confused when tapping on label which will lead to dragging the task
				//so disable dragging when clicking on label
				var agent = navigator.userAgent.toLowerCase();
				if("ontouchstart" in document && /applewebkit/.test(agent) && /android/.test(agent))
				  $('#tasks').on('touchstart', function(e){
					var li = $(e.target).closest('#tasks li');
					if(li.length == 0)return;
					var label = li.find('label.inline').get(0);
					if(label == e.target || $.contains(label, e.target)) e.stopImmediatePropagation() ;
				});
			
				$('#tasks').sortable({
					opacity:0.8,
					revert:true,
					forceHelperSize:true,
					placeholder: 'draggable-placeholder',
					forcePlaceholderSize:true,
					tolerance:'pointer',
					stop: function( event, ui ) {//just for Chrome!!!! so that dropdowns on items don't appear below other items after being moved
						$(ui.item).css('z-index', 'auto');
					}
					}
				);
				$('#tasks').disableSelection();
				$('#tasks input:checkbox').removeAttr('checked').on('click', function(){
					if(this.checked) $(this).closest('li').addClass('selected');
					else $(this).closest('li').removeClass('selected');
				});
				
			
			})
		</script>


	</body>
</html>