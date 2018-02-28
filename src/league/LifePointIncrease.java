package league;

public class LifePointIncrease implements ReinforcementBehaviour {

	public void reinforce(Creature creature) {
		Elven soldier = (Elven) creature;
		if(soldier.canBeBlessed()){
			soldier.setLifePoints(2*soldier.getLifePoints());
		}else{
			throw new UnsupportedOperationException();
		}
	}
}