package league;

public abstract class Elven extends Creature {
	
	protected boolean canBeBlessed;
	
	public boolean canBeBlessed(){
		return canBeBlessed;
	};
	
	public void bless(){
		if(canBeBlessed()){
			this.lifepoints += lifepoints;
		}else{
			throw new UnsupportedOperationException();
		}
	};
}