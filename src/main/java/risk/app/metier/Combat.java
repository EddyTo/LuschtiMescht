package risk.app.metier;

public class Combat {

	private static int nbDesDeffenseur1;
	private static int nbDesDeffenseur2;
	private static int nbDesAttaquant1;
	private static int nbDesAttaquant2;
	private static int nbDesAttaquant3;
	
	private static Boolean desDef1 = null;
	private static Boolean desDef2 = null;
	private static Boolean desAtt1 = null;
	private static Boolean desAtt2 = null;
	private static Boolean desAtt3 = null;

	static int result = 0;

	public static int globalFight(int desAttaquant, int desDeffenseur) {

		nbDesDeffenseur1 = Des.nbAleatoire();
		nbDesDeffenseur2 = Des.nbAleatoire();
		nbDesAttaquant1 = Des.nbAleatoire();
		nbDesAttaquant2 = Des.nbAleatoire();
		nbDesAttaquant3 = Des.nbAleatoire();

		if (desAttaquant == 1) {
			desAtt1 = true;
			desAtt2 = false;
			desAtt3 = false;
		}

		else if (desAttaquant == 2) {

			desAtt1 = true;
			desAtt2 = true;
			desAtt3 = false;
		}

		else if (desAttaquant == 3) {

			desAtt1 = true;
			desAtt2 = true;
			desAtt3 = true;
		}

		if (desDeffenseur == 1) {

			desDef1 = true;
			desDef2 = false;
		}

		else if (desDeffenseur == 2) {

			desDef1 = true;
			desDef2 = true;
		}


		return result;

	}

	public static int combatType1() {

		if ((desDef1 == true) && (desDef2 == false)) {

			if (desAtt1 == true && desAtt2 == false && desAtt3 == false) {

				if ((nbDesDeffenseur1 > nbDesAttaquant1) || (nbDesDeffenseur1 == nbDesAttaquant1)) {

					result = -1;
				}

				else {
					result = 1;
				}

			}

		}
		return result;
	}

	public static int combatType2() {

		if ((desDef1 == true) && (desDef2 == true)) {

			if (desAtt1 == true && desAtt2 == false && desAtt3 == false) {

				if ((nbDesDeffenseur1 > nbDesAttaquant1) || (nbDesDeffenseur1 == nbDesAttaquant1)
						|| (nbDesDeffenseur2 > nbDesAttaquant1) || (nbDesDeffenseur2 == nbDesAttaquant1)) {

					result = -1;

				}

				else {

					result = 2;

				}

			}

		}
		return result;
	}

	public static int combatType3() {

		if ((desDef1 == true) && (desDef2 == false)) {

			if (desAtt1 == true && desAtt2 == true && desAtt3 == false) {

				if (((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2))
						|| ((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2))
						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2))
						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2)))

				{

					result = -2;

				}

				else {

					result = 1;

				}

			}

		}
		return result;
	}

	public static int combatType4() {

		if ((desDef1 == true) && (desDef2 == false)) {

			if (desAtt1 == true && desAtt2 == true && desAtt3 == true) {

				if (((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2)
						&& (nbDesDeffenseur1 > nbDesAttaquant3))

						|| ((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2)
								&& (nbDesDeffenseur1 == nbDesAttaquant3))
						|| ((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2)
								&& (nbDesDeffenseur1 > nbDesAttaquant3))
						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2)
								&& (nbDesDeffenseur1 > nbDesAttaquant3))

						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2)
								&& (nbDesDeffenseur1 > nbDesAttaquant3))
						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2)
								&& (nbDesDeffenseur1 == nbDesAttaquant3))
						|| ((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2)
								&& (nbDesDeffenseur1 == nbDesAttaquant3))

						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2)
								&& (nbDesDeffenseur1 == nbDesAttaquant3)))

				{

					result = -3;

				}

				else {

					result = 1;

				}

			}

		}
		return result;
	}

	public static int combatType5() {

		if ((desDef1 == true) && (desDef2 == true)) {

			if (desAtt1 == true && desAtt2 == true && desAtt3 == false) {

				if (((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2))
						|| ((nbDesDeffenseur2 > nbDesAttaquant1) && (nbDesDeffenseur2 > nbDesAttaquant2))

						|| ((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2))
						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2))

						|| ((nbDesDeffenseur2 > nbDesAttaquant1) && (nbDesDeffenseur2 == nbDesAttaquant2))
						|| ((nbDesDeffenseur2 == nbDesAttaquant1) && (nbDesDeffenseur2 > nbDesAttaquant2))

						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2))
						|| ((nbDesDeffenseur2 == nbDesAttaquant1) && (nbDesDeffenseur2 == nbDesAttaquant2)))

				{

					result = -2;

				}

				else {

					result = 2;

				}

			}

		}
		return result;
	}

	public static int combatType6() {

		if ((desDef1 == true) && (desDef2 == true)) {

			if (desAtt1 == true && desAtt2 == true && desAtt3 == true) {

				if (((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2)
						&& (nbDesDeffenseur1 > nbDesAttaquant3))
						|| ((nbDesDeffenseur2 > nbDesAttaquant1) && (nbDesDeffenseur2 > nbDesAttaquant2)
								&& (nbDesDeffenseur2 > nbDesAttaquant3))

						|| ((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2)
								&& (nbDesDeffenseur1 == nbDesAttaquant3))
						|| ((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2)
								&& (nbDesDeffenseur1 > nbDesAttaquant3))
						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2)
								&& (nbDesDeffenseur1 > nbDesAttaquant3))

						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2)
								&& (nbDesDeffenseur1 > nbDesAttaquant3))
						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2)
								&& (nbDesDeffenseur1 == nbDesAttaquant3))
						|| ((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2)
								&& (nbDesDeffenseur1 == nbDesAttaquant3))

						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2)
								&& (nbDesDeffenseur1 == nbDesAttaquant3))

						|| ((nbDesDeffenseur2 > nbDesAttaquant1) && (nbDesDeffenseur2 > nbDesAttaquant2)
								&& (nbDesDeffenseur2 == nbDesAttaquant3))
						|| ((nbDesDeffenseur2 > nbDesAttaquant1) && (nbDesDeffenseur2 == nbDesAttaquant2)
								&& (nbDesDeffenseur2 > nbDesAttaquant3))
						|| ((nbDesDeffenseur2 == nbDesAttaquant1) && (nbDesDeffenseur2 > nbDesAttaquant2)
								&& (nbDesDeffenseur2 > nbDesAttaquant3))

						|| ((nbDesDeffenseur2 == nbDesAttaquant1) && (nbDesDeffenseur2 == nbDesAttaquant2)
								&& (nbDesDeffenseur2 > nbDesAttaquant3))
						|| ((nbDesDeffenseur2 == nbDesAttaquant1) && (nbDesDeffenseur2 > nbDesAttaquant2)
								&& (nbDesDeffenseur2 == nbDesAttaquant3))
						|| ((nbDesDeffenseur2 > nbDesAttaquant1) && (nbDesDeffenseur2 == nbDesAttaquant2)
								&& (nbDesDeffenseur2 == nbDesAttaquant3))

						|| ((nbDesDeffenseur2 == nbDesAttaquant1) && (nbDesDeffenseur2 == nbDesAttaquant2)
								&& (nbDesDeffenseur2 == nbDesAttaquant3)))

				{

					result = -3;

				}

				else {

					result = 2;

				}

			}

		}
		return result;
	}

}
