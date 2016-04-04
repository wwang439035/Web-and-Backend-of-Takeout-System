/**
 * Home framework
 */

function displayHome(){
	var form = document.getElementById('actionform');
	form.action = 'front.do';
	form.method = 'Post';
	form.elements["mode"].value = 'dispatcher';
	form.elements["target"].value = 'home';
	form.submit();
}

function logout(){
	var form = document.getElementById('actionform');
	form.action = 'user.do';
	form.method = 'Post';
	form.elements["mode"].value = 'logout';
	form.submit();
}

function displayProducts(){
	var form = document.getElementById('actionform');
	form.action = 'operation.do';
	form.method= 'Post';
	form.elements["mode"].value = 'displayProducts';
	form.submit();
}

function createProduct(){
	var form = document.getElementById('addaction');
	var name = form.elements["name"].value;
	var price = form.elements["price"].value;
	if (name == '' || price == '' || isNaN(price) || price < 0
			|| form.elements["type"].value == 'Please select'){
		$('#incomplete').show();
	}
	else{
		$('#incomplete').hide();
		form.action = 'operation.do';
		form.method= 'Post';
		form.elements["mode"].value = 'createProduct';
		form.submit();
	}
}

function displayTeam(){
	var form = document.getElementById('actionform');
	form.action = 'front.do';
	form.method= 'Post';
	form.elements["mode"].value = 'dispatcher';
	form.elements["target"].value = 'team';
	form.submit();
}

function displayContact(){
	var form = document.getElementById('actionform');
	form.action = 'front.do';
	form.method= 'Post';
	form.elements["mode"].value = 'dispatcher';
	form.elements["target"].value = 'contact';
	form.submit();
}

function displayUsers(){
	var form = document.getElementById('actionform');
	form.action = 'user.do';
	form.method= 'Post';
	form.elements["mode"].value = 'displayUsers';
	form.submit();
}

function register(){
	var form = document.getElementById('regaction');
	var username = form.elements["usernameNew"].value;
	var firstName = form.elements["firstNameNew"].value;
	var lastName = form.elements["lastNameNew"].value;
	var role = form.elements["roleNew"].value;
	if (username == '' || firstName == '' || lastName == ''
			|| form.elements["role"].value == 'Please select'){
		$('#incomplete').show();
	}
	else{
		$('#incomplete').hide();
		form.action = 'user.do';
		form.method= 'Post';
		form.elements["mode"].value = 'register';
		form.submit();
	}
}

function hideAlert(){
	$('#incomplete').hide();
}


