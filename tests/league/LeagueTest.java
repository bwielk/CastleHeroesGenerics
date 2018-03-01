package league;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LeagueTest extends League {

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
	private Army<Knight> knightArmy1;
	private League league;

	@Before
	public void before() {

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
		league = new League();
	}

	@Test
	public void armiesAreIncludedInTheLeague(){
		assertEquals(true, league.addArmy(barbarianArmy1));
		assertEquals(true, league.addArmy(elvenArmy1));
		assertEquals(true, league.addArmy(knightArmy1));
		assertEquals(3, league.getArmies().size());
	}
	
	@Test
	public void armiesCanGetARankingValue(){
		Battle battle1 = new Battle()
		assertEquals()
	}
}
