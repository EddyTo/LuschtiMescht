package risk.app.metier;

public class Plateau {
	
	public Plateau(int taille){
		taille = 91;
		for (int i=0; i<taille; i++){
			if (i==1 || i==7 || i==8 || i==9 || i==14 || i==15 || i==16 || i==22 || i==23 || i==24 || i==25 || i==33 || i==34){
				ajouterPosition(Continent.Asie, i);
			}
			else if (i==10 || i==11 || i==19 || i==18 || i==28 || i==27){
				ajouterPosition(Continent.Afrique, i);
				}
			else if (i==66 || i==74 || i==75 || i==76 || i==77 || i==82 || i==83 || i==84 || i==90){
				ajouterPosition(Continent.AmeriqueDuNord, i);
			}
			else if (i==54 || i==63 || i==64 || i==73){
				ajouterPosition(Continent.AmeriqueDuSud, i);
			}
			else if (i==35 || i==46 || i==47 || i==48 || i==49 || i==58 || i==59){
				ajouterPosition(Continent.Europe, i);
			}
			else if (i==30 || i==40 || i==41 || i==51){
				ajouterPosition(Continent.Oceanie, i);
			}
			else {
				ajouterPosition(Continent.Ocean, i);
			}
		}
		
	}
	
	private void ajouterPosition(Continent continent, int id){
		Position position = new Position(continent, id);
	}

}
