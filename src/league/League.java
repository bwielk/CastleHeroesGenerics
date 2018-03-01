package league;

import java.util.ArrayList;

public class League implements Comparable{
	
	private ArrayList<Army> armies;
	
	public League(){
		armies = new ArrayList<Army>();
	}
	
	public boolean addArmy(Army army) {
		if(armies.contains(army)){
			return false;
		}else{
			armies.add(army);
			return true;
		}
	}

	public ArrayList<Army> getArmies() {
		return armies;
	}

	public int compareTo(Object arg0) {
		int compareArmy
	}
}