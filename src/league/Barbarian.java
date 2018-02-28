package league;

public abstract class Barbarian extends Creature{

	protected boolean counterStrike;
	protected ReinforcementBehaviour reinforcement = new HitPointRage();
	
	protected boolean isCounterStrike(){
		return counterStrike;
	};
	
	public void rage(){
		reinforcement.reinforce(this);
	};
}