<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>
    		
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    		
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>LuschtiMescht</title>
		<c:import url="../subviews/importBootstrap.jsp" />
		
		<!-- SCRIPT -->
		<script type="text/javascript" src="scripts/divers.js"></script>
	</head>
	
	<body>
		<c:import url="../subviews/menu.jsp" />
		
		<!-- BODY -->
		<div class="container">
			<h1 class="page-header text-center">Dàs esch a LuschtiMescht !</h1>
			<img class="center-block" src="images/risk.jpg" alt="" style="width:600;height:375;">
		</div>
		
		<c:import url="../subviews/footer.jsp" />
		
		
		<c:if test="${displayModalDeleted == true}">
			<c:import url="../subviews/modal_deleted.jsp" />
			<div class="hidden"><a href="" id="link-user-deleted" data-toggle="modal" data-target="#modal-user-deleted"></a></div>
			<script type="text/javascript">displayModalDeleted();</script>
		</c:if>
		
	</body>
</html>