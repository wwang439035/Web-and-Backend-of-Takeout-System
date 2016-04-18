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
		<h4 class="modal-title" id="addProductLabel">Add Product</h4>
	</div>
	<div id="incomplete" class="alert alert-warning fade in" hidden>
		<a href="javascript:hideAlert();" class="close" aria-label="close">&times;</a>
		<strong>Warning!</strong> The product information is invalid.
	</div>
	<form id="addaction" class=form-horizontal method="post">
		<div class="modal-body">
			<fieldset>
				<input name="mode" type="hidden" />
				<input name="userId" type="hidden" value='<%=request.getParameter("userId") %>' />
				<input name="firstName" type="hidden" value='<%=request.getParameter("firstName") %>' />
				<input name="role" type="hidden" value='<%=request.getParameter("role") %>' />
				<input name="func" type="hidden" value='<%=request.getParameter("func") %>' />

				<!-- Name input-->
				<div class="form-group">
				<label class="col-md-3 control-label" for="name">Product Name</label>
					<div class="col-md-9">
					<input id="name" name="name" type="text" placeholder="Product name" class="form-control">
					</div>
				</div>
							
				<!-- Type input-->
				<div class="form-group">
					<label class="col-md-3 control-label" for="type">Product Type</label>
					<div class="col-md-9">
						<select id="type" name="type" class="form-control">
							<option>Please select</option>
							<option>Dish</option>
							<option>Side</option>
							<option>Drink</option>
						</select>
					</div>
				</div>
								
				<!-- Price input-->
				<div class="form-group">
					<label class="col-md-3 control-label" for="price">Product Price</label>
					<div class="col-md-9">
						<input id="price" name="price" type="text" placeholder="$" class="form-control">
					</div>
				</div>

				<!-- Description body -->
				<div class="form-group">
					<label class="col-md-3 control-label" for="descrip">Brief description</label>
					<div class="col-md-9">
						<textarea class="form-control" id="brief" name="brief" placeholder="Please enter a brief description here..." rows="5"></textarea>
					</div>
				</div>
								
				<!-- Form actions -->
				<div class="modal-footer col-lg-12" align="right">
					<button type="reset" class="btn btn-default">Reset</button>
					<button type="button" class="btn btn-primary" onclick="createProduct()">Submit</button>
				</div>
			</fieldset>
		</div>
	</form>	

	<!-- 
	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	-->
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
