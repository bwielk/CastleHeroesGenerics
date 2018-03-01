package league;

public class HolyStrengthening implements ReinforcementBehaviour {

	public void reinforce(Creature creature) {
		Knight soldier = (Knight) creature;
		if(soldier.canBeStrengthened() && !soldier.isGrantedBonus()){
			soldier.setLifePoints(5 + soldier.getLifePoints());
			soldier.setHitpoints(3 + soldier.getHitpoints());
			soldier.bonusGranted();
		}else{
			;
		}
	}
}