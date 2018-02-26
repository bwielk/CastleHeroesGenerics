package league;

import java.util.ArrayList;

public class Army<T extends Creature>{
	
	private int wins;
	private int losts;
	private ArrayList<T> soldiers;
	
	public Army(){
		this.wins = 0;
		this.losts = 0;
		this.soldiers = new ArrayList<T>();
	}

	public int getWins() {
		return wins;
	}

	public int getLosts() {
		return losts;
	}

	public boolean add(T creature){
		if(!soldiers.contains(creature)){
			soldiers.add(creature);
			return true;
		}
		return false;
	}
	
	public int getNumOfSoldiers(){
		return soldiers.size();
	}
	
	public ArrayList<T> getSoldiers(){
		return soldiers;
	}

	public Battle startBattle(Army opponent) {
		return new Battle(this, opponent);
	}
}