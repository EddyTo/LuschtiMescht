var JSON_carte = null;


function loadGame(){
    $.ajax({
        url: "http://localhost:8080/risk.app/jaxrs/init/loadGame",
        type: "GET",
        dataType: 'text',
        success: function(data) {
        	JSON_carte = data;
        	setup();
        }
    })
}


var waitingGame = true;
function joinGame() {
    $.ajax({
        url: "http://localhost:8080/risk.app/jaxrs/init/addPlayer",
        type: "GET",
        dataType: 'text',
        success: function(data) {
            if (data == "Over") {
                alert("Game is full");
                waitingGame = false;
            } else {
                alert("you are: " + data);
                waitingGame = true;
                attente();
            }
        }
    })
}


function attack(player) {
    //gestion des erreurs
    var error = false;
    if (cellSelected.owner != player) {
        error = true;
        alert("Please choose one of your territory for launch an attack.");
    }
    if (cellSelected2.owner == player) {
        error = true;
        alert("You can not attack one of your territory.");
    }
    if (soldiersEnrolled <= 0) {
        error = true;
        alert("You must choose soldiers go fight with.");
    }

    if (!error) {
        //
        //appel du service
        //

        //courtcircuit
        if (Math.random() < 0.5) {
            cellSelected.owner = cellSelected2.owner;
        } else {
            cellSelected2.owner = cellSelected.owner;
        }
    }
}

function moove(player) {
    //gestion des erreurs
    var error = false;
    if (cellSelected.owner != player) {
        error = true;
        alert("Please choose one of your territory to begin a moove.");
    }
    if (cellSelected2.owner != player) {
        error = true;
        alert("Please choose one of your territory to end a moove.");
    }
    if (soldiersEnrolled <= 0) {
        error = true;
        alert("You must choose soldiers to moove.");
    }

    if (!error) {
        //
        //appel du service
        //

        //courtcircuit
        cellSelected.soldiers -= soldiersEnrolled;
        cellSelected2.soldiers += soldiersEnrolled;
    }
}

function defend() {
    //
    // send nbDefence au SERVICE
    //
}

function askTour() {
    var myTurnToAttack;
    var myTurnToDefend;

    //
    // myTurnToAttack = SERVICE
    //

    //
    // myTurnToDefend = SERVICE
    //

    if (myTurnToAttack) {
        defend = null;
        haveToDefend = false;
        soldiersEnrolled = -1;
        myTurn = true;
        nbDefence = -1;
    } else {
        defend = null;
        haveToDefend = false;
        soldiersEnrolled = -1;
        myTurn = false;
        nbDefence = -1;
    }
    if (myTurnToDefend) {
        defend = null;
        haveToDefend = true;
        soldiersEnrolled = -1;
        myTurn = false;
        nbDefence = 1;
    }
}
