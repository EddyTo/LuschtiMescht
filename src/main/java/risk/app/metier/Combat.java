package risk.app.metier;

public class Combat {

	public static void main(String[] args) {
		
		Boolean Msg1 =Combat.combatType1();
		System.out.println(Msg1);
		
		Boolean Msg2 =Combat.combatType2();
		System.out.println(Msg2);
		
		Boolean Msg3 =Combat.combatType3();	
		System.out.println(Msg3);
		
		Boolean Msg4 =Combat.combatType4();
		System.out.println(Msg4);
		
		Boolean Msg5 =Combat.combatType5();
		System.out.println(Msg5);
		
		Boolean Msg6 =Combat.combatType6();
		System.out.println(Msg6);	
		
	}
	
	private	static int nbDesDeffenseur1 = Dés.nbAleatoire();
	private	static int nbDesDeffenseur2 = Dés.nbAleatoire();;

	private	static int nbDesAttaquant1 = Dés.nbAleatoire();;
	private	static int nbDesAttaquant2 = Dés.nbAleatoire();;
	private	static int nbDesAttaquant3 = Dés.nbAleatoire();;
	
	private Boolean combatPossible = null;
	
	private	static Boolean desDef1 = null;
	private	static Boolean desDef2 = null;

	private	static Boolean desAtt1 = null;
	private	static Boolean desAtt2 = null;
	private	static Boolean desAtt3 = null;

	private	static Boolean winDef = null;
	private	static Boolean winAtt = null;
	
		public static Boolean combatType1() {

			if ((desDef1 == true) && (desDef2 == false)) {

				if (desAtt1 == true && desAtt2 == false && desAtt3 == false) {

					if ((nbDesDeffenseur1 > nbDesAttaquant1) || (nbDesDeffenseur1 == nbDesAttaquant1)) {

						winDef = true;
					}

					else {
						winDef = false;
					}

				}

			}
			return winDef;
		}

		public static Boolean combatType2() {

			if ((desDef1 == true) && (desDef2 == true)) {

				if (desAtt1 == true && desAtt2 == false && desAtt3 == false) {

					if ((nbDesDeffenseur1 > nbDesAttaquant1) || (nbDesDeffenseur1 == nbDesAttaquant1)
							|| (nbDesDeffenseur2 > nbDesAttaquant1) || (nbDesDeffenseur2 == nbDesAttaquant1)) {

						winDef = true;

					}

					else {

						winDef = false;

					}

				}

			}
			return winDef;
		}
		
		
		public static Boolean combatType3() {

			if ((desDef1 == true) && (desDef2 == false)) {

				if (desAtt1 == true && desAtt2 == true && desAtt3 == false) {

					if (((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2))
							|| ((nbDesDeffenseur1 >  nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2))
							|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2))
							|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2)))
					
					{

						winDef = true;

					}

					else {

						winDef = false;

					}

				}

			}
			return winDef;
		}
		
		public static Boolean combatType4() {

			if ((desDef1 == true) && (desDef2 == false)) {

				if (desAtt1 == true && desAtt2 == true && desAtt3 == true) {

					if (((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2) && (nbDesDeffenseur1 > nbDesAttaquant3))
							
							|| ((nbDesDeffenseur1 >  nbDesAttaquant1) && (nbDesDeffenseur1 >  nbDesAttaquant2) && (nbDesDeffenseur1 == nbDesAttaquant3))
							|| ((nbDesDeffenseur1 >  nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2) && (nbDesDeffenseur1 >  nbDesAttaquant3))
							|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 >  nbDesAttaquant2) && (nbDesDeffenseur1 >  nbDesAttaquant3))
							
							|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2) && (nbDesDeffenseur1 >  nbDesAttaquant3))
							|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 >  nbDesAttaquant2) && (nbDesDeffenseur1 == nbDesAttaquant3))
							|| ((nbDesDeffenseur1  > nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2) && (nbDesDeffenseur1 == nbDesAttaquant3))
							
							|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2) && (nbDesDeffenseur1 == nbDesAttaquant3)))
						
					{

						winDef = true;

					}

					else {

						winDef = false;

					}

				}

			}
			return winDef;
		}
		
		public static Boolean combatType5() {

			if ((desDef1 == true) && (desDef2 == true)) {

				if (desAtt1 == true && desAtt2 == true && desAtt3 == false) {

					if (((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2))
							|| ((nbDesDeffenseur2 > nbDesAttaquant1) && (nbDesDeffenseur2 > nbDesAttaquant2))
							
							|| ((nbDesDeffenseur1 >  nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2))
							|| ((nbDesDeffenseur1 ==  nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2))
							
							|| ((nbDesDeffenseur2 >  nbDesAttaquant1) && (nbDesDeffenseur2 == nbDesAttaquant2))
							|| ((nbDesDeffenseur2 == nbDesAttaquant1) && (nbDesDeffenseur2 >  nbDesAttaquant2))
							
							|| ((nbDesDeffenseur1 ==  nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2))
							|| ((nbDesDeffenseur2 ==  nbDesAttaquant1) && (nbDesDeffenseur2 == nbDesAttaquant2)))
						
					{

						winDef = true;

					}

					else {

						winDef = false;

					}

				}

			}
			return winDef;
		}
		
		public static Boolean combatType6() {

			if ((desDef1 == true) && (desDef2 == true)) {

				if (desAtt1 == true && desAtt2 == true && desAtt3 == true) {

					if (((nbDesDeffenseur1 > nbDesAttaquant1) && (nbDesDeffenseur1 > nbDesAttaquant2) && (nbDesDeffenseur1 > nbDesAttaquant3))
							|| ((nbDesDeffenseur2 > nbDesAttaquant1) && (nbDesDeffenseur2 > nbDesAttaquant2) && (nbDesDeffenseur2 > nbDesAttaquant3))
							
							
							|| ((nbDesDeffenseur1 >  nbDesAttaquant1) && (nbDesDeffenseur1 >  nbDesAttaquant2) && (nbDesDeffenseur1 == nbDesAttaquant3))
							|| ((nbDesDeffenseur1 >  nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2) && (nbDesDeffenseur1 >  nbDesAttaquant3))
							|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 >  nbDesAttaquant2) && (nbDesDeffenseur1 >  nbDesAttaquant3))
							
							|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2) && (nbDesDeffenseur1 >  nbDesAttaquant3))
							|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 >  nbDesAttaquant2) && (nbDesDeffenseur1 == nbDesAttaquant3))
							|| ((nbDesDeffenseur1  > nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2) && (nbDesDeffenseur1 == nbDesAttaquant3))
							
							|| ((nbDesDeffenseur1 == nbDesAttaquant1) && (nbDesDeffenseur1 == nbDesAttaquant2) && (nbDesDeffenseur1 == nbDesAttaquant3))
						
							|| ((nbDesDeffenseur2 >  nbDesAttaquant1) && (nbDesDeffenseur2 >  nbDesAttaquant2) && (nbDesDeffenseur2 == nbDesAttaquant3))
							|| ((nbDesDeffenseur2 >  nbDesAttaquant1) && (nbDesDeffenseur2 == nbDesAttaquant2) && (nbDesDeffenseur2 >  nbDesAttaquant3))
							|| ((nbDesDeffenseur2 == nbDesAttaquant1) && (nbDesDeffenseur2 >  nbDesAttaquant2) && (nbDesDeffenseur2 >  nbDesAttaquant3))
						
							|| ((nbDesDeffenseur2 == nbDesAttaquant1) && (nbDesDeffenseur2 == nbDesAttaquant2) && (nbDesDeffenseur2 >  nbDesAttaquant3))
							|| ((nbDesDeffenseur2 == nbDesAttaquant1) && (nbDesDeffenseur2 >  nbDesAttaquant2) && (nbDesDeffenseur2 == nbDesAttaquant3))
							|| ((nbDesDeffenseur2  > nbDesAttaquant1) && (nbDesDeffenseur2 == nbDesAttaquant2) && (nbDesDeffenseur2 == nbDesAttaquant3))
						
							|| ((nbDesDeffenseur2 == nbDesAttaquant1) && (nbDesDeffenseur2 == nbDesAttaquant2) && (nbDesDeffenseur2 == nbDesAttaquant3)))
						
						
					{

						winDef = true;
						
					}

					else {

						winDef = false;

					}

				}

			}
			return winDef;
		}
	}



