<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page errorPage="error.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<c:import url="../subviews/style.jsp" />
<title>User Edit</title>
</head>
<body>
<c:import url="../subviews/menu.jsp" />
<h2 class="container">Informations personnelles</h2>
<form action="UpdateUser" method="post">

<div class="container jumbotron form-group">

<p><label for="firstname">Pseudo:</label><input type="text" class="form-control" name="pseudo"  value="${user.getPseudo()}"></p>
<p><label for="email">Email:</label> <input type="email" class="form-control"  name="email"  value="${user.getEmail()}"></p>
<p><input type="submit" class="btn btn-success" value="Enregistrer modifications"/></p>

</div>
</form>

</body>
</html>