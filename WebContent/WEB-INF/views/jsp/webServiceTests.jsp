<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Web Service Tests</title>

<script src="scripts/jquery.js"></script>
</head>
<body>

<script type="text/javascript">

$.getJSON('http://localhost:8080/TestJAX-RS/jaxrs/helloworld/nom-KARIM/id-30', function(data,status,xhr) {
    //data is the JSON string
	console.log(status);
	myJson = data;
    document.getElementById("para").innerHTML = data.name;
});

function getJsonService(name,age){
	$.getJSON('http://localhost:8080/risk.app/jaxrs/service/nom-'+document.getElementById(name).value+'/id-'+document.getElementById(age).value, function(data,status,xhr) {
	    //data is the JSON string
		console.log(status);
		myJson = data;
	    document.getElementById("para").innerHTML = data.username + ", " + data.id + " ans" + ", " + data.gameIdList[1];
	});	
}

function RestScopeTest(){
    $.ajax({

       url : 'http://localhost:8080/risk.app/jaxrs/service/scopesTests', // La ressource ciblée
       type : 'GET', // Le type de la requête HTTP
       dataType : 'html', // Le type de données à recevoir, ici, du HTML.
       success : function(code_html, statut){ // code_html contient le HTML renvoyé
    	   document.getElementById("refrechable").innerHTML = "Application attribute : (Set) ${sessAtt}";
    	   //document.getElementById("msg").append(status + ", " + code_html);
    	   document.getElementById("msg").innerHTML = "status : " + status + ", html response : " + code_html;
       }
    });
}

function PostJsonService(){
    $.ajax({

       url : 'http://localhost:8080/risk.app/jaxrs/service/scopesTests', // La ressource ciblée
       type : 'POST', // Le type de la requête HTTP
       dataType : 'html', // Le type de données à recevoir, ici, du HTML.
       success : function(code_html, statut){ // code_html contient le HTML renvoyé
    	   document.getElementById("refrechable").innerHTML = "Application attribute : (Set) ${sessAtt}";
    	   //document.getElementById("msg").append(status + ", " + code_html);
    	   document.getElementById("msg").innerHTML = "status : " + status + ", html response : " + code_html;
       }
    });
}
</script>


Web Service Tests
<p id="para"></p>

<input type="text" id="name" placeholder="set the name here"/>
<input type="number" id="age" placeholder="set the age here"/>

<button onclick="getJsonService('name','age')">REST</button>

<button id="test" onclick="RestScopeTest()">TEST</button>


<p id="refrechable">Application attribute : ${sessAtt}</p>
<p><%= session.getId() %></p>
<p id="msg"></p>




</body>
</html>