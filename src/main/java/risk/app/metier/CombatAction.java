package risk.app.metier;

public class CombatAction {

	Boolean resultatCombat1 = Combat.combatType1();
	Boolean resultatCombat2 = Combat.combatType2();
	Boolean resultatCombat3 = Combat.combatType3();
	Boolean resultatCombat4 = Combat.combatType4();
	Boolean resultatCombat5 = Combat.combatType5();
	Boolean resultatCombat6 = Combat.combatType6();

	Boolean combatActionDeff = null;
	Boolean combatActionAttaque = null;

	public int combatAction() {
		
		int result = 0;
		
		if (combatActionAttaque == true) {

			if (resultatCombat1 == true) {

				result = -1;

			}

			else if (resultatCombat1 == false) {

				result = 1;
			}

			if (resultatCombat2 == true) {

				result = -1;
			}

			else if (resultatCombat2 == false) {

				result = 2;
			}

			if (resultatCombat3 == true) {

				result = -2;
			}

			else if (resultatCombat3 == false) {

				result = 1;
			}

			if (resultatCombat4 == true) {

				result = -3;
			}

			else if (resultatCombat4 == false) {

				result = 1;
			}

			if (resultatCombat5 == true) {

				result = -2;
			}

			else if (resultatCombat5 == false) {

				result = 2;
			}

			if (resultatCombat6 == true) {

				result = -3;
			}

			else if (resultatCombat6 == false) {

				result = 2;
			}

		}

		else if (combatActionDeff == true) {

			if (resultatCombat1 == true) {

				result = -1;

			}

			else if (resultatCombat1 == false) {

				result = 1;

			}

			if (resultatCombat2 == true) {

				result = -1;

			}

			else if (resultatCombat2 == false) {

				result = 2;
			}

			if (resultatCombat3 == true) {

				result = -2;

			}

			else if (resultatCombat3 == false) {

				result = 1;

			}

			if (resultatCombat4 == true) {

				result = -3;

			}

			else if (resultatCombat4 == false) {

				result = 1;
			}

			if (resultatCombat5 == true) {

				result = -2;

			}

			else if (resultatCombat5 == false) {

				result = 2;
			}

			if (resultatCombat6 == true) {

				result = -3;

			}

			else if (resultatCombat6 == false) {

				result = 2;
			}

		}
		return result;

	}
}