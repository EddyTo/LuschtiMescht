function sendEmail() {
	document.getElementById('reception-email').value = document
			.getElementById('email').value;
}

function displayModalLogIn() {
	document.getElementById('link-modal-log-in').click();
}
function displayModalDelete() {
	document.getElementById('link-modal-delete').click();
}
function displayModalDeleted() {
	document.getElementById('link-user-deleted').click();
}

function displayModalConfirmPwd() {
	document.getElementById('link-confirm-password').click();
}

function checkInput() {
	var contenu = document.getElementById('email').value;
	var present = false;
	for (var i = 0; i < contenu.length; i++) {
		var lettre = contenu.substring(i, i + 1);
		if (lettre == "@") {
			present = true;
		}
	}
	if (present) {
		document.getElementById('link-confirm-password').disabled = '';
	} else {
		document.getElementById('link-confirm-password').disabled = 'disabled';
	}
}

function checkFormulaire() {
	var pass1 = document.getElementById("pass1").value;
	var pass2 = document.getElementById("pass2").value;
	var pseudo = document.getElementById("username").value;
	var email = document.getElementById("email").value;

	var ok = true;

	if (pseudo == "") {
		document.getElementById("username").style.borderColor = "#E34234";
		ok = false;
	} else {
		document.getElementById("username").style.borderColor = null;
	}

	if (email == "") {
		document.getElementById("email").style.borderColor = "#E34234";
		ok = false;
	} else {
		document.getElementById("email").style.borderColor = null;
	}

	if (pass1 != pass2 || pass1 == "" || pass2 == "") {
		// alert("Passwords Do not match");
		document.getElementById("pass1").style.borderColor = "#E34234";
		document.getElementById("pass2").style.borderColor = "#E34234";
		ok = false;
	} else {
		document.getElementById("pass1").style.borderColor = null;
		document.getElementById("pass2").style.borderColor = null;
	}

	return ok;
}

function checkPassword() {
	var pass1 = document.getElementById("pass1").value;
	var pass2 = document.getElementById("pass2").value;

	if (pass1 != pass2 || pass1 == "" || pass2 == "") {
		// alert("Passwords Do not match");
		document.getElementById("pass1").style.borderColor = "#E34234";
		document.getElementById("pass2").style.borderColor = "#E34234";
		return false;
	}

	return true;
}

function block() {
	var fight = document.getElementById("fight");
	var send = document.getElementsById('sendForFight');

	console.log('coucou');
	fight.disabled = "disabled";

}

function afficher() {
	document.getElementById('play').innerHTML = "<button onclick='joinGame();' class='btn btn-success' >PLAY</button>";
}

function attente(){
	document.getElementById('play').innerHTML ="<div class='progress-bar' role='progressbar' aria-valuenow='33' aria-valuemin='0' aria-valuemax='100' style='width: 33%;'>";
}
