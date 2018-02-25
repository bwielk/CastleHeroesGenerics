package league;

public abstract class Creature {
	
	protected String name;
	protected int hitpoints;
	protected int lifepoints;
	protected boolean magicImmune;
	
	public String getName(){
		return name;
	}
	
	public int getHitpoints(){
		return hitpoints;
	}
	
	public int getLifePoints(){
		return lifepoints;
	}
	
	public boolean isMagicImmune(){
		return magicImmune;
	}
}