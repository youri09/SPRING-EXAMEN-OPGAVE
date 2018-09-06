<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Random joke generator</title>
</head>
<body>

<div class='well'>
<h1>Random joke generator</h1>
<br/>
<form method=POST action='joke'>
		<div class='form-group row'>
		 	<div class='col-xs-4'>
				<label for='firstName'>First Name : </label>
		    		<input type='text' class='form-control' name='firstName' id='firstName'>
	    		</div>
	    	</div>
		<div class='form-group row'>
			<div class='col-xs-4'>
				<label for='lastName'>Last Name : </label>
		    		<input type='text' class='form-control' name='lastName' id='lastName'>
		    	</div>
	    	</div>
	    	
		<input type=SUBMIT value='Generate'>
</form>
</div>

</body>
</html>