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

	static int winDef1 = 0;
	static Boolean winDef2 = null;
	static Boolean winDef3 = null;
	static Boolean winDef4 = null;
	static Boolean winDef5 = null;
	static Boolean winDef6 = null;

	static int resultatCombat1 = 0;
	static int resultatCombat2 = 0;
	static int resultatCombat3 = 0;
	static int resultatCombat4 = 0;
	static int resultatCombat5 = 0;
	static int resultatCombat6 = 0;
	static Boolean combatActionDeff = null;
	static Boolean combatActionAttaque = null;
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

		resultatCombat1 = Combat.combatType1();
		resultatCombat2 = Combat.combatType2();
		resultatCombat3 = Combat.combatType3();
		resultatCombat4 = Combat.combatType4();
		resultatCombat5 = Combat.combatType5();
		resultatCombat6 = Combat.combatType6();

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
