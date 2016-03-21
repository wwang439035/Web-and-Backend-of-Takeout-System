<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Employee Registration</title>
</head>
		<script src="js/jquery.js"></script>
        <link rel="stylesheet" href="css/bootstrap.min.css">
		<link rel="stylesheet" href="css/form-elements.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="js/bootstrap.js">
        <script src="js/bootstrap.js"></script>
        
<body>
 <div class="row">
                        <div class="col-sm-5">
                        	
                        	<div class="form-box">
	                        	<div class="form-top">
	                        		<div class="form-top-left">
	                        			<h3>Welcome Manager.</h3>
	                            		<p>Please enter new employee registration information below:</p>
	                        		</div>
	                        		<div class="form-top-right">
	                        			<i class="fa fa-key"></i>
	                        		</div>
	                            </div>
	                            <div class="form-bottom">
				                    <form role="form" action="" method="post" class="login-form">
				                    	<div class="form-group">
				                    		<label class="sr-only" for="email">Email</label>
				                        	<input type="text" name="email" placeholder="Employee Username/Email..." class="form-email form-control" id="email">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="first_name">name</label>
				                        	<input type="text" name="first_name" placeholder="First Name..." class="form-last_name form-control" id="first_name">
				                        </div>
				                      	<div class="form-group">
				                        	<label class="sr-only" for="last_name">name</label>
				                        	<input type="text" name="last_name" placeholder="Last Name..." class="form-last_name form-control" id="last_name">
				                        </div>

				                      
				                        <div class="dropdown">
				                        	<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Employee Role/Credentials<span class="caret"></span> </button>
				                        	<ul class="dropdown-menu">
				                        	<li><a href="#">Manager</a> </li>
				                        	<li><a href="#">Staff</a> </li>
				                        	<li><a href="#">Deliveryman</a> </li>
				                        	</ul>
				                         </div>
				                         
				                         <div class="form-group">
				                         	<label class="sr-only" for="comments">comments</label>
				                         	<input type="text" name="comments" placeholder="Enter any comments here..." class="form-comments form-control" id="comments">
				                         </div>
				                       
				                     
				         
				                        <button type="submit" class="btn">Proceed</button>
				                        
				                        <p>
				                        System will autogenerate password for employee</p>
				                        
				                    </form>
			                    </div>
		                    </div>
		                    </div>
		                    
</body>
</html>