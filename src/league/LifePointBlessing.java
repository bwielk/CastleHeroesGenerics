package league;

public class LifePointBlessing implements ReinforcementBehaviour {

	public void reinforce(Creature creature) {
		Elven unit = (Elven) creature;
		if(unit.canBeBlessed()){
			unit.setLifePoints(2*unit.getLifePoints());
		}else{
			throw new UnsupportedOperationException();
		}
	}
}