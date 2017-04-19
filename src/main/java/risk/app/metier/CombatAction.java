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

	int nbArmeeMoi = 10;
	int nbArmeeEnnemi = 5;

	// Completer pour que maPosition prenne les infos lors du select de ma
	// position
	// Completer pour que ennemiPosition prenne les infos lors du select de
	// l'ennemi

	// Position ennemiPosition = position();
	// String nbArmeeMoi = maPosition.getContenu();

	// String nbArmeeEnemi = ennemiPosition.getContenu();

	// Passer combatPossible a true si les frontieres sont communes entre
	// l'ennemy et le joueur

	public void CombatAction() {

		if (combatActionAttaque == true) {

			if (resultatCombat1 == true) {

				nbArmeeMoi = nbArmeeMoi - 1;

			}

			else if (resultatCombat1 == false) {

				nbArmeeEnnemi = nbArmeeEnnemi - 1;
			}

			if (resultatCombat2 == true) {

				nbArmeeMoi = nbArmeeMoi - 1;
			}

			else if (resultatCombat2 == false) {

				nbArmeeEnnemi = nbArmeeEnnemi - 2;
			}

			if (resultatCombat3 == true) {

				nbArmeeMoi = nbArmeeMoi - 2;
			}

			else if (resultatCombat3 == false) {

				nbArmeeEnnemi = nbArmeeEnnemi - 1;
			}

			if (resultatCombat4 == true) {

				nbArmeeMoi = nbArmeeMoi - 3;
			}

			else if (resultatCombat4 == false) {

				nbArmeeEnnemi = nbArmeeEnnemi - 1;
			}

			if (resultatCombat5 == true) {

				nbArmeeMoi = nbArmeeMoi - 2;
			}

			else if (resultatCombat5 == false) {

				nbArmeeEnnemi = nbArmeeEnnemi - 2;
			}

			if (resultatCombat6 == true) {

				nbArmeeMoi = nbArmeeMoi - 3;
			}

			else if (resultatCombat6 == false) {

				nbArmeeEnnemi = nbArmeeEnnemi - 2;
			}

		}

		else if (combatActionDeff == true) {

			if (resultatCombat1 == true) {

				nbArmeeEnnemi = nbArmeeEnnemi - 1;

			}

			else if (resultatCombat1 == false) {

				nbArmeeMoi = nbArmeeMoi - 1;

			}

			if (resultatCombat2 == true) {

				nbArmeeEnnemi = nbArmeeEnnemi - 1;

			}

			else if (resultatCombat2 == false) {

				nbArmeeMoi = nbArmeeMoi - 2;
			}

			if (resultatCombat3 == true) {

				nbArmeeEnnemi = nbArmeeEnnemi - 2;

			}

			else if (resultatCombat3 == false) {

				nbArmeeMoi = nbArmeeMoi - 1;

			}

			if (resultatCombat4 == true) {

				nbArmeeEnnemi = nbArmeeEnnemi - 3;

			}

			else if (resultatCombat4 == false) {

				nbArmeeMoi = nbArmeeMoi - 1;
			}

			if (resultatCombat5 == true) {

				nbArmeeEnnemi = nbArmeeEnnemi - 2;

			}

			else if (resultatCombat5 == false) {

				nbArmeeMoi = nbArmeeMoi - 2;
			}

			if (resultatCombat6 == true) {

				nbArmeeEnnemi = nbArmeeEnnemi - 3;

			}

			else if (resultatCombat6 == false) {

				nbArmeeMoi = nbArmeeMoi - 2;
			}

		}

	}
}