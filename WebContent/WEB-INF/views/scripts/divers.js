

function checkFormulaire() {
    var pass1 = document.getElementById("pass1").value;
    var pass2 = document.getElementById("pass2").value;
    var pseudo = document.getElementById("pseudo").value;
    var email = document.getElementById("email").value;
    
    if (pseudo == "") {
		document.getElementById("pseudo").style.borderColor = "#E34234";
		return false
	}
    
    if (email == "") {
    	document.getElementById("email").style.borderColor = "#E34234";
    	return false
    }
    
    if (pass1 != pass2 || pass1 == "" || pass2 == "") {
        //alert("Passwords Do not match");
        document.getElementById("pass1").style.borderColor = "#E34234";
        document.getElementById("pass2").style.borderColor = "#E34234";
       return false;
    }
   
    return true;
}

