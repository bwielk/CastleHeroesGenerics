package league;

public abstract class Barbarian extends Creature{

	protected boolean counterStrike;
	
	protected boolean isCounterStrike(){
		return counterStrike;
	};
	
	public void rage(){
		if(isCounterStrike()){
			this.hitpoints += this.hitpoints;
		}else{
			throw new UnsupportedOperationException();
		}
	};
}