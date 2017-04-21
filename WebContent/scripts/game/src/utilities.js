function getDirOpposee(dir) {
    switch (dir) {
        case DIR_NE:
            return DIR_SO;
        case DIR_E:
            return DIR_O;
        case DIR_SE:
            return DIR_NO;
        case DIR_SO:
            return DIR_NE;
        case DIR_O:
            return DIR_E;
        case DIR_NO:
            return DIR_SE;
    }
}

function getNextDir_horaire(dir){
    var aReturn = dir + 1
    return aReturn % 6;
}
function getNextDir_trigo(dir){
  var aReturn = dir - 1 ;
  return (aReturn + 6) % 6;
}
