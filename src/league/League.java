package league;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {
	
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
}