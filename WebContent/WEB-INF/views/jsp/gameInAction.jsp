<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<title>LuschtiMescht</title>
<script type="text/javascript" src="scripts/divers.js"></script>
<c:import url="../subviews/importBootstrap.jsp" />
</head>

<body>
	<c:import url="../subviews/menu.jsp" />

	<div class="form-group row" style="padding: 18px;">

		<div id="canvas" class="col-md-8" style="border: 2px solid black">

		</div>

		<div class="col-md-4 text-center"
			style="border: 2px solid black; background-color: rgba(240, 175, 78, 0.74); padding: 5px;">
			<input id="fight" type="button" class="col-md-12 btn btn-danger" data-toggle="collapse"
				href="#collapseOne" aria-expanded="false"
				aria-controls="collapseOne" value="Fight"/>
			<br>
			<div>Click on the "Fight" button to unlock the fight control</div>
			<div class="collapse" id="collapseOne">
				<div class="card card-block"><hr><strong>Select the start cell of your troops<br>then the destination of them (must be an enemy cell)</strong></div>
				<br>
				<form action="" method="post">
				<label class="col-md-6">Amount of units to move:</label>
				<input class="col-md-4" id="troops" type="number" name="troops" max="3" required>
				<input class="hidden" id="startCell" type="text" name="startCell" value="${startCell}"/>
				<input class="hidden" id="destination" type="text" name="destination" value="${destination}"/>
				<button id="sendForFight" type="submit" class="col-md-4 text-center btn btn-warning button-center" onclick="block()">Send Troops</button>
				</form>
				
				<br>
			</div>
		</div>
		
		<div class="col-md-4 text-center"
			style="border: 2px solid black; border-top: 0; background-color: rgba(240, 175, 78, 0.74); padding: 5px;">
			<input id="move" type="button" class="col-md-12 btn btn-success" data-toggle="collapse"
				href="#collapseTwo" aria-expanded="false"
				aria-controls="collapseTwo" value="Move Units" />
			<br>
			<div>Click on the "Move Units" button to unlock the fight control</div>
			<div class="collapse" id="collapseTwo">
				<div class="card card-block"><hr><strong>Select the start cell of your troops<br>then the destination of them (must be an allied cell)</strong></div>
				<br>
				<form action="" method="post">
				<label class="col-md-6">Amount of units to move:</label>
				<input class="col-md-4" id="troops" type="number" name="troops" required>
				<input class="hidden" id="startCell" type="text" name="startCell" value="${startCell}"/>
				<input class="hidden" id="destination" type="text" name="destination" value="${destination}"/>
				<button id="sendForMove" type="submit"class="col-md-4 text-center btn btn-warning button-center">Send Troops</button>
				</form>
				
				<br>
			</div>
		</div>
		
		<div class="col-md-4 text-center"
			style="border: 2px solid black; border-top: 0; background-color: rgba(240, 175, 78, 0.74); padding: 5px;">
			<input id="move" type="button" class="col-md-12 btn btn-success" data-toggle="collapse"
				href="#collapse3" aria-expanded="false"
				aria-controls="collapseTwo" value="Defend" />
			<br>
			<div>Click on the "Defend" button to unlock the fight control</div>
			<div class="collapse" id="collapse3">
				<form action="" method="post">
				<label class="col-md-6">Amount of units who will defend:</label>
				<input class="col-md-4" id="troops" type="number" name="troops" max="2" required>
				<button id="sendForDefend" type="submit"class="col-md-4 text-center btn btn-warning button-center">Send Troops</button>
				</form>
				<br>
			</div>
		</div>
		
		
		<div class="col-md-4 text-center">
			<form action="" method="post">
				<br>
				<br>
				<input id="move" type="button" class="col-md-12 btn btn-primary" value="End turn" />
			</form>
		</div>
		
	</div>
	<c:import url="../subviews/footer.jsp" />
	<script type="text/javascript" src="scripts/game/include.js"></script>
	<button class="btn btn-primary" onclick="loadGame();">Load Game</button>
</body>
</html>