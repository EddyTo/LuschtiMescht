package risk.app.metier;

public class Combat {

	Boolean Msg1 = Combat.combatType1();

	Boolean Msg2 = Combat.combatType2();

	Boolean Msg3 = Combat.combatType3();

	Boolean Msg4 = Combat.combatType4();

	Boolean Msg5 = Combat.combatType5();

	Boolean Msg6 = Combat.combatType6();

	private static int nbDesDeffenseur1 = Des.nbAleatoire();
	private static int nbDesDeffenseur2 = Des.nbAleatoire();;

	private static int nbDesAttaquant1 = Des.nbAleatoire();;
	private static int nbDesAttaquant2 = Des.nbAleatoire();;
	private static int nbDesAttaquant3 = Des.nbAleatoire();;

	private static Boolean desDef1 = null;
	private static Boolean desDef2 = null;

	private static Boolean desAtt1 = null;
	private static Boolean desAtt2 = null;
	private static Boolean desAtt3 = null;

	static Boolean winDef1 = null;
	static Boolean winDef2 = null;
	static Boolean winDef3 = null;
	static Boolean winDef4 = null;
	static Boolean winDef5 = null;
	static Boolean winDef6 = null;

	public static Boolean combatType1() {

		if ((desDef1 == true) && (desDef2 == false)) {

			if (desAtt1 == true && desAtt2 == false && desAtt3 == false) {

				if ((nbDesDeffenseur1 > nbDesAttaquant1) || (nbDesDeffenseur1 == nbDesAttaquant1)) {

					winDef1 = true;
				}

				else {
					winDef1 = false;
				}

			}

		}
		return winDef1;
	}

	public static Boolean combatType2() {

		if ((desDef1 == true) && (desDef2 == true)) {

			if (desAtt1 == true && desAtt2 == false && desAtt3 == false) {

				if ((nbDesDeffenseur1 > nbDesAttaquant1) || (nbDesDeffenseur1 == nbDesAttaquant1)
						|| (nbDesDeffenseur2 > nbDesAttaquant1) || (nbDesDeffenseur2 == nbDesAttaquant1)) {

					winDef2 = true;

				}

				else {

					winDef2 = false;

				}

			}

		}
		return winDef2;
	}

	public static Boolean combatType3() {

		if ((desDef1 == true) && (desDef2 == false)) {

			if (desAtt1 == true && desAtt2 == true && desAtt3 == false) {

				if (((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2))
						|| ((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2))
						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2))
						|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2)))

				{

					winDef3 = true;

				}

				else {

					winDef3 = false;

				}

			}

		}
		return winDef3;
	}

	public static Boolean combatType4() {

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

					winDef4 = true;

				}

				else {

					winDef4 = false;

				}

			}

		}
		return winDef4;
	}

	public static Boolean combatType5() {

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

					winDef5 = true;

				}

				else {

					winDef5 = false;

				}

			}

		}
		return winDef5;
	}

	public static Boolean combatType6() {

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

					winDef6 = true;

				}

				else {

					winDef6 = false;

				}

			}

		}
		return winDef6;
	}
}
