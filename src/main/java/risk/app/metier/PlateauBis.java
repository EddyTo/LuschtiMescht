package risk.app.metier;

public class PlateauBis {

	public static void main(String[] args) {
		for (int i = -11; i < 10; i = i + 2) {

			for (int j = -6; j < 5; j = j + 2) {

				if ((i + j) < 11 && (i + j) > -11 && (i - j) > -11 && (j - i) > -11 && (j < 6) && (j > -6)) {
					System.out.println(("paire :" + i + ";" + "paire :" + j));

				}
				int i2 = i + 1;
				int j2 = j + 1;

				if ((i2 + j2) < 11 && (i2 + j2) > -11 && (i2 - j2) > -11 && (j2 - i2) > -11) {
					System.out.println(("impair :" + i2 + ";" + "impair :" + j2));

				}

			}

		}
	}
}