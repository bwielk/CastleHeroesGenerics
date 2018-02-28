package league;

public abstract class Knight extends Creature {
	
	protected boolean canBeStrengthened;
	protected ReinforcementBehaviour reinforcement = new HolyStrengthening();
	
	protected boolean canBeStrengthened(){
		return canBeStrengthened;
	}
	
	public void reinforce(){
		reinforcement.reinforce(this);
	}
}