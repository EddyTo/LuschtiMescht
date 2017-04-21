<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>
    		
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Lobby</title>
	
		<c:import url="../subviews/importBootstrap.jsp" />
		<script type="text/javascript" src="scripts/game/commands.js"></script>
	</head>
	
	<body>
		<c:import url="../subviews/menu.jsp" />
		
		<div class="container text-center">
			<h2 class="page-header">Welcome into the Lobby of LuschtiMescht</h2>
			
			
				<div class="jumbotron">
					<div id="play" class="text-center">
					</div>
				</div>
			
		</div>
		
		<c:import url="../subviews/footer.jsp" />
		<script type="text/javascript" src="scripts/divers.js"></script>
			<script type="text/javascript">
			if (waitingGame){
				afficher();
			} else {
				attente();
			}
			</script>
	</body>
</html>