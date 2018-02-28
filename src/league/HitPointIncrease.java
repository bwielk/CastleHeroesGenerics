package league;

public class HitPointIncrease implements ReinforcementBehaviour {

	public void reinforce(Creature creature) {
		Barbarian soldier = (Barbarian) creature;
		if(soldier.isCounterStrike()){
			soldier.setHitpoints(2*soldier.getHitpoints());
		}else{
			throw new UnsupportedOperationException();
		}
	}
}