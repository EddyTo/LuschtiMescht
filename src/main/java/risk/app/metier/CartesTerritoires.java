package risk.app.metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class CartesTerritoires {

	private List<Carte> cartesTerritoires = new ArrayList<Carte>();

	public CartesTerritoires() {

		this.cartesTerritoires.add(new Carte("Afrique du Nord", "fantassin"));
		this.cartesTerritoires.add(new Carte("Afrique du Sud", "canon"));
		this.cartesTerritoires.add(new Carte("Afrique Orientale", "canon"));
		this.cartesTerritoires.add(new Carte("Congo", "cavalier"));
		this.cartesTerritoires.add(new Carte("Egypte", "fantassin"));
		this.cartesTerritoires.add(new Carte("Madagascar", "fantassin"));
		this.cartesTerritoires.add(new Carte("Alaska", "fantassin"));
		this.cartesTerritoires.add(new Carte("Alberta", "fantassin"));
		this.cartesTerritoires.add(new Carte("Amérique Centrale", "cavalier"));
		this.cartesTerritoires.add(new Carte("Etat de l'Est", "canon"));
		this.cartesTerritoires.add(new Carte("Etat de l'Ouest", "fantassin"));
		this.cartesTerritoires.add(new Carte("Groenland", "cavalier"));
		this.cartesTerritoires.add(new Carte("Ontario", "cavalier"));
		this.cartesTerritoires.add(new Carte("Québec", "canon"));
		this.cartesTerritoires.add(new Carte("Territoire du Nord Ouest", "canon"));
		this.cartesTerritoires.add(new Carte("Argentine", "fantassin"));
		this.cartesTerritoires.add(new Carte("Brésil", "canon"));
		this.cartesTerritoires.add(new Carte("Pérou", "cavalier"));
		this.cartesTerritoires.add(new Carte("Venezuela", "canon"));
		this.cartesTerritoires.add(new Carte("Afghanistan", "fantassin"));
		this.cartesTerritoires.add(new Carte("Chine", "cavalier"));
		this.cartesTerritoires.add(new Carte("Inde", "fantassin"));
		this.cartesTerritoires.add(new Carte("Japon", "fantassin"));
		this.cartesTerritoires.add(new Carte("Kamchatka", "cavalier"));
		this.cartesTerritoires.add(new Carte("Mongolie", "canon"));
		this.cartesTerritoires.add(new Carte("Moyen Orient", "canon"));
		this.cartesTerritoires.add(new Carte("Oural", "cavalier"));
		this.cartesTerritoires.add(new Carte("Siam", "canon"));
		this.cartesTerritoires.add(new Carte("Sibérie", "canon"));
		this.cartesTerritoires.add(new Carte("Tchita", "fantassin"));
		this.cartesTerritoires.add(new Carte("Yakoutie", "cavalier"));
		this.cartesTerritoires.add(new Carte("Europe du Nord", "cavalier"));
		this.cartesTerritoires.add(new Carte("Europe du Sud", "cavalier"));
		this.cartesTerritoires.add(new Carte("Europe Occidentale", "fantassin"));
		this.cartesTerritoires.add(new Carte("Grande Bretagne", "cavalier"));
		this.cartesTerritoires.add(new Carte("Islande", "fantassin"));
		this.cartesTerritoires.add(new Carte("Scandinavie", "canon"));
		this.cartesTerritoires.add(new Carte("Ukraine", "canon"));
		this.cartesTerritoires.add(new Carte("Australie Occidentale", "canon"));
		this.cartesTerritoires.add(new Carte("Australie orientale", "fantassin"));
		this.cartesTerritoires.add(new Carte("Indonésie", "cavalier"));
		this.cartesTerritoires.add(new Carte("Nouvelle Guinée", "cavalier"));
		this.cartesTerritoires.add(new Carte("Joker1", "Joker"));
		this.cartesTerritoires.add(new Carte("Joker2", "Joker"));
	}

	public List<Carte> getCartesTerritoires() {
		return cartesTerritoires;
	}

	public Carte getCarteTerritoire(int i) {
		return cartesTerritoires.get(i);
	}

	public int size() {
		return cartesTerritoires.size();
	}

	public void remove(Integer i) {
		cartesTerritoires.remove(i);
	}

	@SuppressWarnings("unchecked")
	public static void melanger(CartesTerritoires cartes) {
		Collections.shuffle((List<Carte>) cartes);
	}

}
