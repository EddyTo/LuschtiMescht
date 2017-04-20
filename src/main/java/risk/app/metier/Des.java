package risk.app.metier;

public class Des {

	int nbAleatoire = Des.nbAleatoire();

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
