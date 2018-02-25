package league;

import java.util.ArrayList;

public class Army<T extends Creature>{
	
	private int wins;
	private int losts;
	private ArrayList<T> army;
	
	public Army(){
		this.wins = 0;
		this.losts = 0;
		this.army = new ArrayList<T>();
	}

	public int getWins() {
		return wins;
	}

	public int getLosts() {
		return losts;
	}

	public boolean add(T creature){
		if(!army.contains(creature)){
			army.add(creature);
			return true;
		}
		return false;
	}
	
	public int getNumOfUnits(){
		return army.size();
	}
}