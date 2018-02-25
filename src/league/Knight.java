package league;

public abstract class Knight extends Creature {
	
	protected boolean canBeStrengthened;
	
	protected boolean canBeStrengthened(){
		return canBeStrengthened;
	}
	
	public void strenghten(){
		if(canBeStrengthened()){
			this.lifepoints += 5;
			this.hitpoints += 3;
		}else{
			throw new UnsupportedOperationException();
		}
	}
}
