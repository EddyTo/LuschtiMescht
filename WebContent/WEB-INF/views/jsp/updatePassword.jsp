<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <%@ page errorPage="error.jsp" %>  --%>
<!DOCTYPE html>
<html>
<head>

<title>Password Edit</title>
<script type="text/javascript" src=" ../scripts/divers.js"></script>
</head>
<body>
<c:import url="../subviews/menu.jsp" />
<h2 class="container">Informations personnelles</h2>
<form action="UpdatePassword" onsubmit = "checkPassword()" method="post">

<div class="container jumbotron form-group">


<p><label for="PreviousPassword">Précédent mot de passe:</label> <input type="password" class="form-control" name="previousPassword"  value=""></p>
<p><label for="NewPassword">Nouveau mot de passe:</label> <input id = "pass1" type="password"  class="form-control" name="newPassword" value=""></p>
<p><label for="ConfirmPassword">Confirmer le nouveau mot de passe:</label> <input id="pass2" type="password" class="form-control"  name="confirmPassword" value=""></p>
<p><input type="submit" class="btn btn-success" value="Enregistrer modifications"/></p>

</div>
</form>

</body>
</html>