<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>
    		
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Password Edit</title>
		<script type="text/javascript" src="scripts/divers.js"></script>
		<c:import url="../subviews/importBootstrap.jsp" />
	</head>
	
	<body>
		<c:import url="../subviews/menu.jsp" />
		
		<div class="container text-center">
			<h2 class="page-header">Personal informations</h2>
			
			<form action="UpdatePassword" onsubmit = "return checkPassword();" method="post">
				<div class="jumbotron">
					<div class="container">
					
						<c:if test="${message != ''}">
							<p class="alert alert-danger">${message}</p>
						</c:if>
					
						<div class="col-md-4"></div>
						<div class="col-md-4">
							<label class="text-center">Previous password:</label>
							<input type="password" id="previous-pwd" class="form-control" name="previousPassword"  value="">
						</div>
					</div>
					<br />
					<div class="container">
						<div class="col-md-4"></div>
						<div class="col-md-4">
							<label class="text-center">New password:</label>
							<input type="password" id="pass1" class="form-control" name="previousPassword"  value="">
						</div>
					</div>
					<br />
					<div class="container">
						<div class="col-md-4"></div>
						<div class="col-md-4">
							<label class="text-center">Confirm new password:</label>
							<input type="password" id="pass2" class="form-control" name="previousPassword"  value="">
						</div>
					</div>
					<br />
					
					<div class="text-center">
						<input type="submit" class="btn btn-success" value="Enregistrer modifications"/>
					</div>
				</div>
			</form>
		</div>
		
		<c:import url="../subviews/footer.jsp" />
	</body>
</html>