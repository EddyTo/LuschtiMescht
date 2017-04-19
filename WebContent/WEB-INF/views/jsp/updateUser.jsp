<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>
    		
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
	<head>
		<title>User Edit</title>
		<c:import url="../subviews/importBootstrap.jsp" />
		
		<!-- SCRIPT -->
		<script type="text/javascript" src="scripts/divers.js"></script>
	</head>
	
	<body>
		
		
		<c:import url="../subviews/menu.jsp" />
		
		<div class="container">
			<h2 class="page-header text-center">Personal informations</h2>
		
			<form>
				<div class="container jumbotron">
					<div class="row">
						<div class="col-md-4"></div>
						<ul class="list-group col-md-4">
							<li class="list-group-item">
								<div class="row">
									<span class="col-md-4 text-right">Username:</span>
									<span class="col-md-8 text-center"><strong>${login}</strong></span>
								</div>
							</li>
							<li class="list-group-item">
								<div class="row">
									<span class="col-md-4 text-right">Email:</span>
									<input type="email" class="col-md-7 text-center" id="email" value="${email}" required onchange="checkInput();"/>
								</div>
							</li>
						</ul>
					</div>
					
					<div class="text-center">
						<a href="UpdatePassword" class="btn btn-primary">Change password</a>
						<c:import url="../subviews/modal_askPassword.jsp" />
						<button type="submit" id="link-confirm-password" class="btn btn-success"  data-toggle="modal" data-target="#modal-confirm-password" disabled="disabled">Confirm</button>
					</div>
					
				</div>
				
			</form>
		
		</div>
		
		<c:import url="../subviews/footer.jsp" />
		
		<c:if test="${displayModalConfirmPwd == true}">
			<script type="text/javascript">displayModalConfirmPwd();</script>
		</c:if>
		
	</body>
</html>