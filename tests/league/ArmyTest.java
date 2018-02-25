package league;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArmyTest {
	
	private Barbarian barbarianOrc1;
	private Barbarian barbarianOrc2;
	private Barbarian barbarianOrc3;
	private Barbarian barbarianTroll1;
	private Elven warriorElf1;
	private Elven warriorPegasus1;
	private Elven warriorPegasus2;
	private Knight crussader1;
	private Knight monk1;
	private Knight monk2;
	private Army barbarianArmy1;
	private Army elvenArmy1;
	private Army knightArmy1;
	
	@Before
	public void before(){
		
		barbarianOrc1 = new Orc();
		barbarianOrc2 = new Orc();
		barbarianOrc3 = new Orc();
		barbarianTroll1 = new Troll();
		warriorElf1 = new WarriorElf();
		warriorPegasus1 = new Pegasus();
		warriorPegasus2 = new Pegasus();
		crussader1 = new Crussader();
		monk1 = new Monk();
		monk2 = new Monk();
		barbarianArmy1 = new Army();
		elvenArmy1 = new Army();
		knightArmy1 = new Army();
	}

	@Test
	public void armiesHaveStats() {
		//barbarianArmy1
		assertEquals(0, barbarianArmy1.getWins());
		assertEquals(0, barbarianArmy1.getLosts());
		//elvenArmy1
		assertEquals(0, elvenArmy1.getWins());
		assertEquals(0, elvenArmy1.getLosts());
		//knightArmy1
		assertEquals(0, knightArmy1.getWins());
		assertEquals(0, knightArmy1.getLosts());
	}
	
	private void addBarbarianSoldiers(){
		assertEquals(true, barbarianArmy1.add(barbarianOrc1));
		assertEquals(true, barbarianArmy1.add(barbarianOrc2));
		assertEquals(true, barbarianArmy1.add(barbarianOrc3));
		assertEquals(true, barbarianArmy1.add(barbarianTroll1));
	}
	
	@Test
	public void barbarianArmyStoresBarbarianTypeCreatures(){
		addBarbarianSoldiers();
		assertEquals(4, barbarianArmy1.getNumOfUnits());
	}
	
	@Test
	public void armiesCannotAddTheSameSoldiersTwice(){
		addBarbarianSoldiers();
		assertEquals(false, barbarianArmy1.add(barbarianOrc1));
		assertEquals(false, barbarianArmy1.add(barbarianOrc2));
		assertEquals(false, barbarianArmy1.add(barbarianOrc3));
	}
}