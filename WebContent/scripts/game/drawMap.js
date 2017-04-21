var init=false;
var canvas;
var cellSelected;
var cellSelected2;
var soldiersEnrolled = -1;
var pos_text = 0;
var myTurn = false;
var haveToDefend = false;
var defend = []; // 0:player , 1:idcellattaquante , 2: idcelldefense , 3:
					// nbsoldierattaquant
var nbDefence = -1;


var player1, player2, player3;
var battlefield;

// courtcircuit du service
/*
 * var player1, player2; var battlefield; var id_index = 0;
 */

// timer
var datePrec = new Date();
var timerPrec = datePrec.getTime();
var dateNow;
var timerNow = 0;


function setup() {
	loadGame();
	if(!init){
	    dateNow = new Date();
	    timerNow = dateNow.getTime();
	
	    if(timerNow - timerPrec > 1000){
	      var datePrec = new Date();
	      var timerPrec = datePrec.getTime();
	      askTour();
	    }
	
	    canvas = createCanvas(CNV_WIDTH, CNV_HEIGHT);
	    canvas.parent("canvas");
	
	    COLOR_PONT = color(51);
	    COLOR_OCEAN = color(0, 0, 255);
	    
	
	    player1 = new Player(color(255, 0, 0));
	    player2 = new Player(color(255, 255, 0));
	    player3 = new Player(color(255, 0, 255));
	    
	    
	
	    /*
		 * //courtcircuit du service player1 = new Player(color(255, 0, 0));
		 * player2 = new Player(color(0, 255, 0)); battlefield = new
		 * Battlefield();
		 * 
		 * var origin = new Cell(null, TYPE_OCEAN);
		 * battlefield.cells.push(origin);
		 * 
		 * for (var j = 0; j < 4; j++) { var taille = battlefield.cells.length;
		 * for (var i = 0; i < taille; i++) {
		 * createCellAround(battlefield.cells[i]); } }
		 */
	    
	    // parseJSON
	    battlefield = new Battlefield();
	    var parsed = JSON.parse(JSON_carte);
	    
	    for(var i = 0; i < parsed.length; i++){
	    	if(parsed[i].couleur == "Rouge"){
	        	battlefield.cells[i] = new Cell(player1, TYPE_TERRAIN);
	    	} else if(parsed[i].couleur == "Jaune"){
	        	battlefield.cells[i] = new Cell(player2, TYPE_TERRAIN);
	    	}else if(parsed[i].couleur == "Rose"){
	    		battlefield.cells[i] = new Cell(player3, TYPE_TERRAIN);
	    	} else if(parsed[i].type == 0){
	    		battlefield.cells[i] = new Cell(null, TYPE_OCEAN);
	    	} else if(parsed[i].type == 1){
	    		battlefield.cells[i] = new Cell(null, TYPE_PONT);
	    	}
	    	
	    	battlefield.cells[i].id = parsed[i].id;
	    	battlefield.cells[i].soldiers = parsed[i].unite;
	    	for(var j = 0; j < parsed[i].voisins.length; j++){
	    		if(battlefield.findCell(parsed[i].voisins[j]) != null){
	    			battlefield.cells[i].addConnection(j, battlefield.findCell(parsed[i].voisins[j]));
	    		}
	    	}
	    }
	    
	    battlefield.calcCenter();
	    battlefield.draw();
	
	    console.log(battlefield);
	
	    // positionner le champ du "soldier enrollement"
	    var posMaxY = 0;
	    var maxY = battlefield.cells[posMaxY].y;
	    for (var i = 0; i < battlefield.cells.length; i++) {
	        if (battlefield.cells[i].y > maxY) {
	            maxY = battlefield.cells[i].y;
	            posMaxY = i;
	        }
	    }
	    pos_text = maxY + 3 * CELL_RADIUS;
	}
}

function draw() {
    if (myTurn) {
        background(255);
    } else {
        background(73);
    }
    battlefield.draw();

    // reset color
    for (var i = 0; i < battlefield.cells.length; i++) {
        battlefield.cells[i].setDefaultColor();
    }
    // mouseover
    for (var i = 0; i < battlefield.cells.length; i++) {
        if (battlefield.cells[i].over(mouseX, mouseY)) {
            var curColor = battlefield.cells[i].color;
            battlefield.cells[i].color = color(red(curColor) / 1.5, green(curColor) / 1.5, blue(curColor) / 1.5);
            i = battlefield.cells.length;
        }
    }
    // cellSelected
    if (cellSelected2 != null) {
        var cur = cellSelected2.color;
        cellSelected2.color = color(155 + red(cur) / 3, 155 + green(cur) / 3, 155 + blue(cur) / 3);
        cur = cellSelected.color;
        cellSelected.color = color(155 + red(cur) / 3, 155 + green(cur) / 3, 155 + blue(cur) / 3);
        line(cellSelected.x, cellSelected.y + 5, cellSelected2.x, cellSelected2.y + 5);
        line(cellSelected2.x, cellSelected2.y - CELL_RADIUS * 0.2 + 5, cellSelected2.x, cellSelected2.y + CELL_RADIUS * 0.2 + 5);
        line(cellSelected2.x - CELL_RADIUS * 0.2, cellSelected2.y + 5, cellSelected2.x + CELL_RADIUS * 0.2, cellSelected2.y + 5);
        if (soldiersEnrolled == -1) {
            soldiersEnrolled = 1;
        }
    } else {
        if (cellSelected != null) {
            var cur = cellSelected.color;
            cellSelected.color = color(155 + red(cur) / 3, 155 + green(cur) / 3, 155 + blue(cur) / 3);
            for (var i = 0; i < NB_VOISINS; i++) {
                if (cellSelected.voisins[i] != null) {
                    if (cellSelected.voisins[i].type == TYPE_TERRAIN) {
                        var curr = cellSelected.voisins[i].color;
                        cellSelected.voisins[i].color = color(100 + red(curr) * 0.5, 100 + green(curr) * 0.5, 100 + blue(curr) * 0.5);
                    }
                }
            }
        }
        soldiersEnrolled = -1;
    }
    // soldiers choice :
    if (soldiersEnrolled != -1) {
        fill(255);
        noStroke();
        textSize(20);
        if (cellSelected.owner == cellSelected2.owner) {
            text("How many have to moove? ", CELL_RADIUS, pos_text);
        } else {
            text("How many have to go fighting? ", CELL_RADIUS, pos_text);
        }
        fill(210);
        text("Selected: " + soldiersEnrolled + " (max: " + cellSelected.soldiers + ")", CELL_RADIUS, pos_text + 20);
    }
    // have to defend
    if (haveToDefend) {

        var cell_attck = battlefield.findCell(defend[1]);
        var cell_defend = battlefield.findCell(defend[2]);

        cell_attck.color = color(0);
        cell_defend.color = color(255);

        soldiersEnrolled = -1;
        text("YOU ARE UNDER ATTACK !!", CELL_RADIUS, pos_text);
        text("With how many soldiers do you want to defend this attack of " + defend[3] + "? ", CELL_RADIUS, pos_text + 20);
        text("==> " + nbDefence + " (max: " + cell_defend.soldiers + ")", CELL_RADIUS, pos_text + 20);
    }
}

function keyPressed() {
    if (soldiersEnrolled != -1 && keyCode == 107) {
        if (soldiersEnrolled < cellSelected.soldiers) {
            soldiersEnrolled++;
        }
    } else if (soldiersEnrolled != -1 && keyCode == 109) {
        if (soldiersEnrolled > 1) {
            soldiersEnrolled--;
        }
    }
}

function mouseClicked() {

    if(true){// if (myTurn) {
        var another = true;

        if (cellSelected != null) {
            for (var i = 0; i < NB_VOISINS; i++) {
                if (cellSelected.voisins[i] != null) {
	                    if (cellSelected.voisins[i].over(mouseX, mouseY)) {
	                        cellSelected2 = cellSelected.voisins[i];
	                        another = false;
	                    }
                }
            }
        }
        if (another) {
            for (var i = 0; i < battlefield.cells.length; i++) {
                if (battlefield.cells[i].over(mouseX, mouseY) && battlefield.cells[i].type == TYPE_TERRAIN) {
                    cellSelected = battlefield.cells[i];
                    cellSelected2 = null;
                    i = battlefield.cells.length;
                }
            }
        }
    }
}

function createCellAround(cell) {
    for (var i = 0; i < 6; i++) {
        if (cell.voisins[i] == null) {
            var newCell;
            if (Math.random() < 0.8) {
                if (Math.random() < 0.5) {
                    newCell = new Cell(player1, TYPE_TERRAIN);
                } else {
                    newCell = new Cell(player2, TYPE_TERRAIN);
                }
                newCell.soldiers = Math.floor(Math.random() * 100);
            } else if (Math.random() < 0.8) {
                newCell = new Cell(null, TYPE_OCEAN);
            } else {
                newCell = new Cell(null, TYPE_PONT);
            }
            id_index++;
            newCell.id = id_index;
            cell.addConnection(i, newCell);
            battlefield.cells.push(newCell);
        }
    }
}
