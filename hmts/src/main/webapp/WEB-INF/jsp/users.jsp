<%@ page language="java" errorPage="error.jsp" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Happy Meal Take-out System</title>

<link href="./css/bootstrap.min.css" rel="stylesheet">
<link href="./css/bootstrap-table.css" rel="stylesheet">
<link href="./css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="./js/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="./js/html5shiv.js"></script>
<script src="./js/respond.min.js"></script>
<![endif]-->

</head>

<body>
	<form id="actionform">
		<input name="mode" type="hidden" />
		<input name="target" type="hidden" />
		<input name="userId" type="hidden" value="${userId}" />
		<input name="firstName" type="hidden" value="${firstName}" />
		<input name="role" type="hidden" value="${role}" />
		<input name="func" type="hidden" value="${func}" />
		<input name="userList" id="userList" type="hidden" value='${userList}' />
	</form>
	<div class="modal modal-transparent fade" id="modal-transparent" tabindex="-1" role="dialog" aria-labelledby="addProductLabel" aria-hidden="true">
	  <div class="modal-dialog modal-md">
	    <div class="modal-content">
	    	<jsp:include page="register.jsp" flush="true">
	    		<jsp:param name="userId" value='<%=request.getParameter("userId") %>' />
	    		<jsp:param name="firstName" value='<%=request.getParameter("firstName") %>' />
	    		<jsp:param name="role" value='<%=request.getParameter("role") %>' />
	    		<jsp:param name="func" value='<%=request.getParameter("func") %>' />
	    	</jsp:include>
	    </div>
	  </div>
	</div>
	
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>Happy Meal</span>Take-out System</a>
				<ul class="user-menu">
					<li class="dropdown pull-right">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> ${firstName} <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="javascript:logout();"><svg class="glyph stroked cancel"><use xlink:href="#stroked-cancel"></use></svg> Logout</a></li>
						</ul>
					</li>
				</ul>
			</div>
							
		</div><!-- /.container-fluid -->
	</nav>
		
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<ul class="nav menu">
			<li class="active"><a href="javascript:displayHome();"><svg class="glyph stroked dashboard-dial"><use xlink:href="#stroked-dashboard-dial"></use></svg> Home</a></li>
			
			<li><a href="javascript:displayProducts();"><svg class="glyph stroked calendar"><use xlink:href="#stroked-calendar"></use></svg> Product</a></li>
			<li><a href="#"><svg class="glyph stroked line-graph"><use xlink:href="#stroked-line-graph"></use></svg> Order</a></li>
			<li><a href="javascript:displayTeam();"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Team</a></li>
			<li><a href="javascript:displayContact();"><svg class="glyph stroked pencil"><use xlink:href="#stroked-pencil"></use></svg> Contact</a></li>
			<li role="presentation" class="divider"></li>
			<% Object func = request.getAttribute("func");
			if (func != null && func.toString().indexOf("3,") > -1){
				out.print("<li id=\"usermgmnt\"><a href=\"javascript:displayUsers();\"><svg class=\"glyph stroked table\"><use xlink:href=\"#stroked-table\"></use></svg> User</a></li>");
			} %>
		</ul>

	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><svg class="glyph stroked home"><use xlink:href="#stroked-home"></use></svg></a></li>
				<li class="active"><svg class="glyph stroked table"><use xlink:href="#stroked-table"></use></svg></li>
			</ol>
		</div><!--/.row-->

		<div class="row">
			<div class="col-lg-12">
				<h3 class="page-header">USER</h3>
			</div>
		</div><!--/.row-->
				
		<div class="row">
			<div class="col-lg-12" align="right">
				<button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#modal-transparent" style="margin-right: 30px">REGISTRATION</button>
			</div>
		</div><br>
		
		<div class="col-sm-12">
			<div class="panel panel-default">
				<div class="panel-body">
					<table id="usertable" data-pagination="true" data-search="true" data-toggle="table" 
						data-show-refresh="true" data-sort-name="productId" data-sort-order="asc" class="table table-striped table-hover">
						<thead>
						    <tr>
						        <th data-sortable="true" data-field="userId" data-align="center">User ID</th>
						        <th data-sortable="true" data-field="username" data-align="center" >Username</th>
						        <th data-field="password" data-align="center" >Password</th>
						        <th data-sortable="true" data-field="firstName" data-align="center">First Name</th>
						        <th data-sortable="true" data-field="lastName" data-align="center">Last Name</th>
						        <th data-field="phone" data-align="center">Phone</th>
						        <th data-field="role" data-align="center">Role</th>
						    </tr>
						</thead>
					</table>
				</div>
			</div>
		</div><!--/.row-->
	</div>	<!--/.main-->
	
	<script src="./js/jquery-1.11.1.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/bootstrap-table.js"></script>
	<script src="./js/home.js"></script>
	<script>
		!function ($) {
		    $(document).on("click","ul.nav li.parent > a > span.icon", function(){          
		        $(this).find('em:first').toggleClass("glyphicon-minus");      
		    }); 
		    $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		}(window.jQuery);

		$(window).on('resize', function () {
		  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function () {
		  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		})
	
		var data = JSON.parse($('#userList').attr("value"));
		$('#usertable').bootstrapTable({data:data});
		
	</script>

</body>

</html>
