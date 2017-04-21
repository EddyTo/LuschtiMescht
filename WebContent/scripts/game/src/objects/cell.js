function Cell(owner, type) {
    this.id;
    this.x;
    this.y;

    this.calculated = false;
    this.voisins = [];

    this.soldiers = 0;
    this.type = type;

    this.owner = owner;

    this.setDefaultColor();
}

Cell.prototype.setDefaultColor = function(){
    if (this.type == TYPE_PONT) {
        this.color = COLOR_PONT;
    } else if (this.type == TYPE_OCEAN) {
        this.color = COLOR_OCEAN;
    } else if (this.type == TYPE_TERRAIN) {
        this.color = this.owner.color;
    }
}


Cell.prototype.draw = function() {
    var p1_x = this.x;
    var p1_y = this.y - CELL_RADIUS;
    var p2_x = this.x + sqrt(3) / 2 * CELL_RADIUS;
    var p2_y = this.y - CELL_RADIUS / 2;
    var p3_x = this.x + sqrt(3) / 2 * CELL_RADIUS;
    var p3_y = this.y + CELL_RADIUS / 2;
    var p4_x = this.x;
    var p4_y = this.y + CELL_RADIUS;
    var p5_x = this.x - sqrt(3) / 2 * CELL_RADIUS;
    var p5_y = this.y + CELL_RADIUS / 2;
    var p6_x = this.x - sqrt(3) / 2 * CELL_RADIUS;
    var p6_y = this.y - CELL_RADIUS / 2;
    fill(this.color);
    noStroke();
    quad(p1_x, p1_y, p4_x, p4_y, p5_x, p5_y, p6_x, p6_y);
    quad(p1_x, p1_y, p2_x, p2_y, p3_x, p3_y, p4_x, p4_y);
    stroke(0);
    line(p1_x, p1_y, p2_x, p2_y);
    line(p2_x, p2_y, p3_x, p3_y);
    line(p3_x, p3_y, p4_x, p4_y);
    line(p4_x, p4_y, p5_x, p5_y);
    line(p5_x, p5_y, p6_x, p6_y);
    line(p6_x, p6_y, p1_x, p1_y);
    if(this.type == TYPE_TERRAIN){
      fill(0);
      textSize(12);
      text(this.soldiers, this.x-5, this.y-3);
    }

    /*
        for (var i = 0; i < NB_VOISINS; i++) {
            if (this.voisins[i] != null) {
                line(this.x, this.y, this.voisins[i].x, this.voisins[i].y);
            }
        }*/
}

Cell.prototype.calculate = function(x0, y0, dir) {
    switch (dir) {
        case DIR_NE:
            this.x = x0 + sqrt(3) * CELL_RADIUS / 2;
            this.y = y0 - 3 * CELL_RADIUS / 2;
            break;
        case DIR_E:
            this.x = x0 + sqrt(3) * CELL_RADIUS;
            this.y = y0;
            break;
        case DIR_SE:
            this.x = x0 + sqrt(3) * CELL_RADIUS / 2;
            this.y = y0 + 3 * CELL_RADIUS / 2;
            break;
        case DIR_SO:
            this.x = x0 - sqrt(3) * CELL_RADIUS / 2;
            this.y = y0 + 3 * CELL_RADIUS / 2;
            break;
        case DIR_O:
            this.x = x0 - sqrt(3) * CELL_RADIUS;
            this.y = y0;
            break;
        case DIR_NO:
            this.x = x0 - sqrt(3) * CELL_RADIUS / 2;
            this.y = y0 - 3 * CELL_RADIUS / 2;
            break;
        case -1:
            this.x = x0;
            this.y = y0;
    }

    this.calculated = true;

    for (var i = 0; i < NB_VOISINS; i++) {
        if (this.voisins[i] != null && !this.voisins[i].calculated) {
            this.voisins[i].calculate(this.x, this.y, i);
        }
    }
}

Cell.prototype.addConnection = function(dir, cell) {
    this.voisins[dir] = cell;
    cell.voisins[getDirOpposee(dir)] = this;

    var next_trigo = getNextDir_trigo(dir);
    if (this.voisins[next_trigo] != null) {
        var newDir = getNextDir_trigo(getDirOpposee(next_trigo));
        if (cell.voisins[getDirOpposee(newDir)] == null) {
            this.voisins[next_trigo].addConnection(newDir, cell);
        }
    }

    var next_horaire = getNextDir_horaire(dir);
    if (this.voisins[next_horaire] != null) {
        var newDir = getNextDir_horaire(getDirOpposee(next_horaire));
        if (cell.voisins[getDirOpposee(newDir)] == null) {
            this.voisins[next_horaire].addConnection(newDir, cell);
        }
    }
}

Cell.prototype.over = function(x, y) {
    if (dist(this.x, this.y, x, y) < CELL_RADIUS) {
        return true;
    }
    return false;
}
