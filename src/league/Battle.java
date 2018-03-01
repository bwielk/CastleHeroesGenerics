package league;

import org.junit.Before;

public class Battle {
	
	private Army<Creature> army;
	private Army<Creature> opponent;
	
	public Battle(Army army2, Army opponent2){
		this.army = army2;
		this.opponent = opponent2;
	}
	
	public int calculateArmyHitpoints(Army army){
		int result = 0;
		for(int i=0; i<army.getNumOfSoldiers(); i++){
			Creature currentSoldier = (Creature) army.getSoldiers().get(i);
			result += currentSoldier.getHitpoints();
		}
		return result;
	}
	
	public int calculateArmyHealth(Army army){
		int result = 0;
		for(int i=0; i<army.getNumOfSoldiers(); i++){
			Creature currentSoldier = (Creature) army.getSoldiers().get(i);
			result += currentSoldier.getLifePoints();
		}
		return result;
	}

	public void beginBattle(){
		int armyStats = calculateArmyHealth(army) + calculateArmyHitpoints(army);
		int opponentStats = calculateArmyHealth(opponent) + calculateArmyHitpoints(opponent);
		if(armyStats > opponentStats){
			army.wins ++;
			opponent.losts ++;
		}else if(armyStats < opponentStats){
			army.losts ++;
			opponent.wins ++;
		}else{
			;
		}
	}
}