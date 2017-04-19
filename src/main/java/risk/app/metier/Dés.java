package risk.app.metier;

public class Dés {

	public static void main(String[] args) {

	int nbAleatoire = Dés.nbAleatoire();
		System.out.println(nbAleatoire);

	}

	public static Integer nbAleatoire() {

		int nbAleatoire = (int) Math.round(Math.random() * 6);

		if (nbAleatoire < 1) {

			while (nbAleatoire < 1) {
				nbAleatoire = (int) Math.round(Math.random() * 6);
			}

		}

		return nbAleatoire;

	}
}
