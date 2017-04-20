<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>
    		
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Waiting</title>
		<script type="text/javascript" src="scripts/divers.js"></script>
		<c:import url="../subviews/importBootstrap.jsp" />
	</head>
	
	<body>
		<c:import url="../subviews/menu.jsp" />
		
		<div class="container text-center">
			<h2 class="page-header">Please wait :)</h2>
			
			<div class="progress-bar progress-bar-striped" role="progressbar" aria-valuenow="33" aria-valuemin="0" aria-valuemax="100" style="width: 60%">…</div>
			

			
		</div>
		
		<c:import url="../subviews/footer.jsp" />
	</body>
</html>