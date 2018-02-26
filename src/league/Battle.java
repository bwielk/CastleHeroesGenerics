package league;

import org.junit.Before;

public class Battle {
	
	private Army<Creature> army;
	private Army<Creature> opponent;
	
	public Battle(Army army2, Army opponent2){
		this.army = army2;
		this.opponent = opponent2;
	}
}
