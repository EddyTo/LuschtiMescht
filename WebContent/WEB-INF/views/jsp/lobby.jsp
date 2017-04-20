<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>
    		
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Lobby</title>
		<script type="text/javascript" src="scripts/divers.js"></script>
		<c:import url="../subviews/importBootstrap.jsp" />
	</head>
	
	<body>
		<c:import url="../subviews/menu.jsp" />
		
		<div class="container text-center">
			<h2 class="page-header">Welcome into the Lobby of LuschtiMescht</h2>
			
			
			<form action="Lobby" method="post">
				<div class="jumbotron">
					<div class="text-center">
						<input type="submit" class="btn btn-success" value="PLAY"/>
					</div>
				</div>
			</form>
		</div>
		
		<c:import url="../subviews/footer.jsp" />
	</body>
</html>