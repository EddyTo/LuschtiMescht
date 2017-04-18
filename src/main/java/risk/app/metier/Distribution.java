package risk.app.metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import risk.app.metier.CartesTerritoires;

public class Distribution {

	private CartesTerritoires cartesTerritoiresDistribuer = new CartesTerritoires();

	private ListeJoueurs joueurs = new ListeJoueurs();

	public Distribution(int nbJoueurs) {
		CartesTerritoires.melanger(cartesTerritoiresDistribuer);

		if (nbJoueurs == 3) {
			List<Carte> main1 = new ArrayList<Carte>();
			List<Carte> main2 = new ArrayList<Carte>();
			List<Carte> main3 = new ArrayList<Carte>();
			for (int i = 0; i < 14; i++) {
				main1.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 14; i < 29; i++) {
				main2.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 29; i < 44; i++) {
				main3.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
		} else if (nbJoueurs == 4) {
			List<Carte> main1 = new ArrayList<Carte>();
			List<Carte> main2 = new ArrayList<Carte>();
			List<Carte> main3 = new ArrayList<Carte>();
			List<Carte> main4 = new ArrayList<Carte>();
			for (int i = 0; i < 11; i++) {
				main1.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 11; i < 22; i++) {
				main2.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 22; i < 33; i++) {
				main3.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 33; i < 44; i++) {
				main4.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}

		} else if (nbJoueurs == 5) {
			List<Carte> main1 = new ArrayList<Carte>();
			List<Carte> main2 = new ArrayList<Carte>();
			List<Carte> main3 = new ArrayList<Carte>();
			List<Carte> main4 = new ArrayList<Carte>();
			List<Carte> main5 = new ArrayList<Carte>();
			for (int i = 0; i < 8; i++) {
				main1.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 8; i < 17; i++) {
				main2.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 17; i < 26; i++) {
				main3.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 26; i < 35; i++) {
				main4.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 35; i < 44; i++) {
				main5.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
		} else if (nbJoueurs == 6) {
			List<Carte> main1 = new ArrayList<Carte>();
			List<Carte> main2 = new ArrayList<Carte>();
			List<Carte> main3 = new ArrayList<Carte>();
			List<Carte> main4 = new ArrayList<Carte>();
			List<Carte> main5 = new ArrayList<Carte>();
			List<Carte> main6 = new ArrayList<Carte>();
			for (int i = 0; i < 7; i++) {
				main1.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 7; i < 14; i++) {
				main2.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 14; i < 21; i++) {
				main3.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 21; i < 28; i++) {
				main4.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 28; i < 36; i++) {
				main5.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
			for (int i = 36; i < 44; i++) {
				main6.add(cartesTerritoiresDistribuer.getCarteTerritoire(i));
			}
		}
	}

}
