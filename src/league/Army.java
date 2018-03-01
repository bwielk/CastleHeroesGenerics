package league;

import java.util.ArrayList;

public class Army<T extends Creature> implements Comparable<Army>{
	
	protected int wins;
	protected int losts;
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

	public void reinforceUnits() {
		for(int i=0; i<getNumOfSoldiers(); i++){
			Creature soldier = soldiers.get(i);
			soldier.reinforce();
		}
	}
	
	public int calculateRankingPoints() {
		int result = 2*wins - losts;
		if(result < 0){
			return 0;
		}else{
			return result;
		}
	}
	
	public int compareTo(Army compareArmy) {
		if(this.calculateRankingPoints() > compareArmy.calculateRankingPoints()){
			return 1;
		}else if(this.calculateRankingPoints() < compareArmy.calculateRankingPoints()){
			return -1;
		}else{
			return 0;
		}
	}
}