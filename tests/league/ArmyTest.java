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
	private Army<Barbarian> barbarianArmy1;
	private Army<Elven> elvenArmy1;
	private Army <Knight>knightArmy1;
	
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
		barbarianArmy1 = new Army<Barbarian>();
		elvenArmy1 = new Army<Elven>();
		knightArmy1 = new Army<Knight>();
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
	
	private void addKnightSoldiers(){
		assertEquals(true, knightArmy1.add(crussader1));
		assertEquals(true, knightArmy1.add(monk1));
		assertEquals(true, knightArmy1.add(monk2));
	}
	
	private void addElvenSoldiers(){
		assertEquals(true, elvenArmy1.add(warriorElf1));
		assertEquals(true, elvenArmy1.add(warriorPegasus1));
		assertEquals(true, elvenArmy1.add(warriorPegasus2));
	}
	
	@Test
	public void armiesStoreGenericCreatureTypes(){
		addBarbarianSoldiers();
		addElvenSoldiers();
		addKnightSoldiers();
		assertEquals(4, barbarianArmy1.getNumOfSoldiers());
		assertEquals(3, elvenArmy1.getNumOfSoldiers());
		assertEquals(3, knightArmy1.getNumOfSoldiers());
	}
	
	@Test
	public void armiesCannotAddTheSameSoldiersTwice(){
		//Barbarian army
		addBarbarianSoldiers();
		assertEquals(false, barbarianArmy1.add(barbarianOrc1));
		assertEquals(false, barbarianArmy1.add(barbarianOrc2));
		assertEquals(false, barbarianArmy1.add(barbarianOrc3));
		assertEquals(true, barbarianArmy1.add(new Orc()));
		assertEquals(5, barbarianArmy1.getNumOfSoldiers());
		//Elven army
		addElvenSoldiers();
		assertEquals(false, elvenArmy1.add(warriorElf1));
		assertEquals(false, elvenArmy1.add(warriorPegasus1));
		assertEquals(false, elvenArmy1.add(warriorPegasus2));
		assertEquals(true, elvenArmy1.add(new Pegasus()));
		assertEquals(true, elvenArmy1.add(new Pegasus()));
		assertEquals(5, elvenArmy1.getNumOfSoldiers());
		//Knight army
		addKnightSoldiers();
		assertEquals(false, knightArmy1.add(crussader1));
		assertEquals(true, knightArmy1.add(new Crussader()));
		assertEquals(true, knightArmy1.add(new Monk()));
		assertEquals(true, knightArmy1.add(new Monk()));
		assertEquals(6, knightArmy1.getNumOfSoldiers());
	}
	
	@Test(expected = Error.class)
	public void barbarianArmyCannotAcceptOtherRacesToTheArmy(){
		barbarianArmy1.add(crussader1);
		barbarianArmy1.add(monk1);
		barbarianArmy1.add(monk2);
		barbarianArmy1.add(warriorElf1);
		barbarianArmy1.add(warriorPegasus1);
		barbarianArmy1.add(warriorPegasus2);
	}
	
	@Test(expected = Error.class)
	public void elvenArmyCannotAcceptOtherRacesToTheArmy(){
		elvenArmy1.add(crussader1);
		elvenArmy1.add(monk1);
		elvenArmy1.add(barbarianOrc1);
		elvenArmy1.add(barbarianOrc2);
		elvenArmy1.add(barbarianTroll1);
	}
	
	@Test(expected = Error.class)
	public void knightArmyCannotAcceptOtherRacesToTheArmy(){
		knightArmy1.add(warriorElf1);
		knightArmy1.add(warriorPegasus1);
		knightArmy1.add(barbarianOrc1);
		knightArmy1.add(barbarianOrc2);
		knightArmy1.add(barbarianTroll1);
	}
}