package league;

public class HitPointRage implements ReinforcementBehaviour {

	public void reinforce(Creature creature) {
		Barbarian soldier = (Barbarian) creature;
		if(soldier.isCounterStrike() && !soldier.isGrantedBonus){
			soldier.setHitpoints(2*soldier.getHitpoints());
			soldier.bonusGranted();
		}else{
			;
		}
	}
}