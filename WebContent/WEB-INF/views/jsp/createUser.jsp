<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>
    		
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Inscription</title>
		<c:import url="../subviews/importBootstrap.jsp" />
		
		<!-- script -->
		<script type="text/javascript" src=" scripts/divers.js"></script>
	</head>
	
	<body>
	
		<c:import url="../subviews/menu.jsp" />
		<div class="container">
			<h2 class="page-header text-center">Inscription</h2>
			<div class="jumbotron container">
			
				<form action="CreateUser" onsubmit="return checkFormulaire();" method="post">
				
					<div class="form-group row text-right">
						<label class="col-md-4">Username:</label>
						<input class="col-md-4" id="username" type="text" name="username" placeholder="Username">
					</div>
					
					<div class="form-group row text-right">
						<label class="col-md-4">Email:</label> 
						<input class="col-md-4" id="email" type="email" name="email" placeholder="Email">
					</div>
					
					<div class="form-group row text-right">
						<label class="col-md-4">Password:</label> 
						<input class="col-md-4" id="pass1" type="password"  name="password" placeholder="Password">
					</div>
						
						
					<div class="form-group row text-right">
						<label class="col-md-4">Repeat password:</label> 
						<input class="col-md-4" id="pass2" type="password" name="password2" placeholder="Password">
					</div>
					
					<div class="row">
						<div class="col-md-5"></div>
						<input class="col-md-2 btn btn-lg btn-success" type="submit" value="S'inscrire"/>
					</div>
				</form>
			</div>
		</div>
	
	</body>
</html>