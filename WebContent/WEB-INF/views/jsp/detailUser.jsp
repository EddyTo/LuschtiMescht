<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>
    		
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

	<head>
		<title>User Details</title>
		<c:import url="../subviews/importBootstrap.jsp" />
		
		<!-- SCRIPT -->
		<script type="text/javascript" src="scripts/divers.js"></script>
	</head>
	
	<body>
	
		<c:import url="../subviews/menu.jsp" />
		
		<div class="container">
			<h2 class="page-header text-center">My Account</h2>
			
			<div class="jumbotron container">
				<div class="row">
					<div class="col-md-4"></div>
					<ul class="list-group col-md-4">
						<li class="list-group-item">
							<div class="row">
								<span class="col-md-6 text-right">Username:</span>
								<span class="col-md-6 text-left"><strong>${login}</strong></span>
							</div>
						</li>
						<li class="list-group-item">
							<div class="row">
								<span class="col-md-6 text-right">Email:</span>
								<span class="col-md-6 text-left"><strong>${email}</strong></span>
							</div>
						</li>
					</ul>
				</div>
			
				<div class="text-center">
					<a  href="UpdateUser" class="btn btn-lg btn-warning">Modify</a>
					<c:import url="../subviews/modal_deleteuser.jsp" />
					<button class="btn btn-lg btn-danger" id="link-modal-delete" data-toggle="modal" data-target="#modal-delete-user">Delete</button>
				</div>
			</div>
		</div>
		
		<c:import url="../subviews/footer.jsp" />
		
		<c:if test="${displayModalDelete == true}">
			<script type="text/javascript">displayModalDelete();</script>
		</c:if>
		
		
	</body>

</html>