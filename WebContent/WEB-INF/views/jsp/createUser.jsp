<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page errorPage="error.jsp" %> 

<!DOCTYPE html>
<html>
<head>
<c:import url="../subviews/style.jsp"/>
<title>Inscription</title>

<!-- script -->
<script type="text/javascript" src=" ../scripts/divers.js"></script>
</head>
<body>
<c:import url="/WEB-INF/views/Menu.jsp" />
<h2 class="container">Inscription</h2>
<c:if test="${error != null}">${error}</c:if>
<div class="jumbotron container">
<form action="CreateUser" onsubmit="checkFormulaire()" method="post">
<div class="form-group">
<p class="texte"><label for="pseudo">Pseudo:</label> <input id="pseudo" type="text" class="form-control" name="pseudo" placeholder="pseudo"></p>
<p class="texte"><label for="email">Email:</label> <input id="email" type="email" class="form-control"  name="email" placeholder="email"></p>
<p class="texte"><label for="password">Mot de passe:</label> <input id="pass1" type="password" class="form-control"  name="password" placeholder="mot de passe"></p>
<p class="texte"><label for="password2">Saisir à nouveau le mot de passe:</label> <input id="pass2" type="password" class="form-control"  name="password2" placeholder="mot de passe"></p>
<input type="submit" class="btn btn-lg btn-success" value="S'inscrire"/></div>
</form>
</div>

</body>
</html>