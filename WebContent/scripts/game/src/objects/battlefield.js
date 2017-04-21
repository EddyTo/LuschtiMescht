function Battlefield() {
    this.cells = [];
    this.player1 = new Player(color(255,255,255))
}


Battlefield.prototype.draw = function() {
    for (var i = 0; i < this.cells.length; i++) {
        this.cells[i].draw();
    }
}

Battlefield.prototype.calcCenter = function() {
    this.cells[0].calculate(0, 0, -1);

    var posMin_X = 0;
    var min_X = this.cells[posMin_X].x;
    var posMin_Y = 0;
    var min_Y = this.cells[posMin_Y].y;
    for (var i = 1; i < this.cells.length; i++) {
        if (this.cells[i].x < min_X) {
            min_X = this.cells[i].x;
            posMin_X = i;
        }
        if (this.cells[i].y < min_Y) {
            min_Y = this.cells[i].y;
            posMin_Y = i;
        }
    }
    for (var i = 0; i < this.cells.length; i++) {
        this.cells[i].x += (-min_X) + CNV_MARGIN_WIDTH;
        this.cells[i].y += (-min_Y) + CNV_MARGIN_HEIGHT;
    }
}

Battlefield.prototype.findCell = function(id) {
    for (var i = 0; i < this.cells.length; i++) {
        if (this.cells[i].id = id) {
            return this.cells[i];
        }
    }
}

