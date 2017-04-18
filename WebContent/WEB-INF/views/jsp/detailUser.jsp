<%@ page language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <%@ page errorPage="error.jsp" %>  --%>


<!DOCTYPE html>
<html>
<head>

<title>User Details</title>
</head>

<body>
<%-- 	<c:import url="../subviews/menu.jsp" /> --%>
	<div class="container">
		<ul class="list-group">
			<li class="list-group-item">Pseudo : ${user.getUsername()}</li>
			<li class="list-group-item">Email : ${user.getEmail()}</li>
		</ul>
	</div>


</body>

</html>