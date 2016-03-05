<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Happy Meal Take-out System</title>

<link href="./css/bootstrap.min.css" rel="stylesheet">
<link href="./css/datepicker3.css" rel="stylesheet">
<link href="./css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="./js/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="./js/html5shiv.js"></script>
<script src="./js/respond.min.js"></script>
<![endif]-->

<Script type="text/javascript">
<!--
	function logout(){
		var form = document.getElementById('actionform');
		form.action = 'user.do';
		form.method = 'Post';
		form.elements["mode"].value = 'logout';
		form.submit();
	}

	function visualizeProducts(){
		var form = document.getElementById('actionform');
		form.action = 'operaview.do';
		form.element["mode"].value = 'displayproducts';
		form.submit();
	}
-->
</Script>

</head>

<body>
	<form id="actionform">
		<input name="mode" type="hidden" />
		<input name="userId" type="hidden" value="${userId}" />
		<input name="firstName" type="hidden" value="${firstName}" />
		<input name="role" type="hidden" value="${role}" />
		<input name="func" type="hidden" value="${func}" />
	</form>
	
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
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> ${firstName},${func} <span class="caret"></span></a>
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
			<li class="active"><a href=""><svg class="glyph stroked dashboard-dial"><use xlink:href="#stroked-dashboard-dial"></use></svg> Home</a></li>
			
			<li><a href=""><svg class="glyph stroked calendar"><use xlink:href="#stroked-calendar"></use></svg> Product</a></li>
			<li><a href=""><svg class="glyph stroked line-graph"><use xlink:href="#stroked-line-graph"></use></svg> Order</a></li>
			<li><a href=""><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Team</a></li>
			<li><a href=""><svg class="glyph stroked pencil"><use xlink:href="#stroked-pencil"></use></svg> Contact</a></li>
			<li role="presentation" class="divider"></li>
			<% Object func = request.getAttribute("func");
			if (func != null && func.toString().indexOf("3,") > -1){
				out.print("<li id=\"usermgmnt\"><a href=\"\"><svg class=\"glyph stroked table\"><use xlink:href=\"#stroked-table\"></use></svg> User</a></li>");
			} %>
		</ul>

	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<img src="./images/home.png" alt="home image" width="100%">
	</div>	<!--/.main-->

	<script src="./js/jquery-1.11.1.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/chart.min.js"></script>
	<script src="./js/chart-data.js"></script>
	<script src="./js/easypiechart.js"></script>
	<script src="./js/easypiechart-data.js"></script>
	<script src="./js/bootstrap-datepicker.js"></script>
	<script>
		$('#calendar').datepicker({
		});

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
	</script>	
</body>

</html>
