<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>ADD PRODUCT</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="js/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#"><span>Happy Meal </span>Take-out System</a>
			</div>
							
		</div><!-- /.container-fluid -->
	</nav>
		
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><svg class="glyph stroked home"><use xlink:href="#stroked-home"></use></svg></a></li>
				<li class="active">Icons</li>
			</ol>
		</div><!--/.row-->
		
		<div class="col-sm-9">
			<div class="col-lg-12">
				<h1 class="page-header">ADD PRODUCT</h1>
			</div>
		</div><!--/.row-->
									
		<div class="row">
			<div class="col-md-8">
				<div class="panel panel-default">
					<div class="panel-body">
						<form class="form-horizontal" action="" method="post">
							<fieldset>
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
										<select class="form-control">
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
										<textarea class="form-control" id="description" name="description" placeholder="Please enter a brief description here..." rows="5"></textarea>
									</div>
								</div>
								
								<!-- Form actions -->
								<div class="form-group">
									<div class="col-md-12 widget-right">
										<button type="submit" class="btn btn-primary pull-right">Submit</button>
										<button type="reset" class="btn btn-default pull-right" onclick="javescript:window.close()">Cancel</button>
									</div>
								</div>
							</fieldset>
						</form>
					</div>
				</div>
			</div><!--/.col-->
		</div><!--/.row-->

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/bootstrap-table.js"></script>
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
	</script>	
</body>

</html>
