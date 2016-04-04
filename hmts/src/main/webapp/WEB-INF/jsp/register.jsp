<%@ page language="java" errorPage="../jsp/error.jsp" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>ADD PRODUCT</title>

<link href="./css/bootstrap.min.css" rel="stylesheet">
<link href="./css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="js/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>  
<body>
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
		<h4 class="modal-title" id="addProductLabel">Registration</h4>
	</div>
	<div id="incomplete" class="alert alert-warning fade in" hidden>
		<a href="javascript:hideAlert();" class="close" aria-label="close">&times;</a>
		<strong>Warning!</strong> The user information is invalid.
	</div>
	<form id="regaction" class=form-horizontal method="post">
		<div class="modal-body">
			<fieldset>
				<input name="mode" type="hidden" />
				<input name="userId" type="hidden" value='<%=request.getParameter("userId") %>' />
				<input name="firstName" type="hidden" value='<%=request.getParameter("firstName") %>' />
				<input name="role" type="hidden" value='<%=request.getParameter("role") %>' />
				<input name="func" type="hidden" value='<%=request.getParameter("func") %>' />

				<div class="form-group">
					<label class="col-md-3 control-label" for="name">Username</label>
					<div class="col-md-9">
						<input id="usernameNew" name="usernameNew" type="text" placeholder="Employee Username/Email..." class="form-control">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-3 control-label" for="name">First Name</label>
					<div class="col-md-9">
						<input id="firstNameNew" name="firstNameNew" type="text" placeholder="First Name..." class="form-control">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-3 control-label" for="name">Last Name</label>
					<div class="col-md-9">
						<input id="lastNameNew" name="lastNameNew" type="text" placeholder="Last Name..." class="form-control">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-3 control-label" for="type">Role</label>
					<div class="col-md-9">
						<select id="roleNew" name="roleNew" class="form-control">
							<option>Please select</option>
							<option>Manager</option>
							<option>Staff</option>
							<option>Delivery Man</option>
						</select>
					</div>
				</div>
                      
				<!-- Form actions -->
				<div class="modal-footer col-lg-12" align="right">
					<button type="reset" class="btn btn-default">Reset</button>
					<button type="button" class="btn btn-primary" onclick="register()">Register</button>
				</div>
			</fieldset>
		</div>
	</form>	
	<script src="./js/home.js"></script>
	<script>
		$(window).on('resize', function () {
		  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function () {
		  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		})
	</script>
</body>
</html>