package league;

public class HitPointRage implements ReinforcementBehaviour {

	public void reinforce(Creature creature) {
		Barbarian soldier = (Barbarian) creature;
		if(soldier.isCounterStrike()){
			soldier.setHitpoints(2*soldier.getHitpoints());
		}else{
			;
		}
	}
}