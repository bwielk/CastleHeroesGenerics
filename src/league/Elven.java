package league;

public abstract class Elven extends Creature {
	
	protected boolean canBeBlessed;
	protected ReinforcementBehaviour reinforcement = new LifePointIncrease();
	
	public boolean canBeBlessed(){
		return canBeBlessed;
	};
	
	public void bless(){
		reinforcement.reinforce((Elven)this);
	}
}