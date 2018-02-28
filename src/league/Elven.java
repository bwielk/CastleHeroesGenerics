package league;

public abstract class Elven extends Creature {
	
	protected boolean canBeBlessed;
	protected ReinforcementBehaviour reinforcement = new LifePointBlessing();
	
	public boolean canBeBlessed(){
		return canBeBlessed;
	};
	
	public void bless(){
		reinforcement.reinforce(this);
	}
}