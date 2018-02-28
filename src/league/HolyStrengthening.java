package league;

public class HolyStrengthening implements ReinforcementBehaviour {

	public void reinforce(Creature creature) {
		Knight unit = (Knight) creature;
		if(unit.canBeStrengthened()){
			unit.setLifePoints(5 + unit.getLifePoints());
			unit.setHitpoints(3 + unit.getHitpoints());
		}else{
			throw new UnsupportedOperationException();
		}
	}
}