package risk.app.metier;

import java.util.ArrayList;

public class Plateau {
	
	ArrayList<Position> casePlateau = new ArrayList<Position>();

	public Plateau() {
		for (int i = -11; i < 10; i = i + 2) {

			for (int j = -6; j < 5; j = j + 2) {

				if ((i + j) < 11 && (i + j) > -11 && (i - j) > -11 && (j - i) > -11 && (j < 6) && (j > -6)) {
					Position position = new Position(i, j);
					casePlateau.add(position);
				}
				int i2 = i + 1;
				int j2 = j + 1;

				if ((i2 + j2) < 11 && (i2 + j2) > -11 && (i2 - j2) > -11 && (j2 - i2) > -11) {
					Position position = new Position(i2, j2);
					casePlateau.add(position);
				}
			}
		}
	}
	
	
	public ArrayList<Position> getCasePlateau() {
		return casePlateau;
	}

	public void setCasePlateau(ArrayList<Position> casePlateau) {
		this.casePlateau = casePlateau;
	}
	
}