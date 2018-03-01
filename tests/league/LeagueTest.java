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
		barbarianArmy1 = new Army<Barbarian>("Barbarian Army");
		elvenArmy1 = new Army<Elven>("Elven Army");
		knightArmy1 = new Army<Knight>("Knight Army");
		league = new League();
		
		barbarianArmy1.add(barbarianOrc1);//LifePoints 10, HitPoints 2
		barbarianArmy1.add(barbarianOrc2);//LifePoints 10, HitPoints 2
		barbarianArmy1.add(barbarianOrc3);//LifePoints 10, HitPoints 2
		barbarianArmy1.add(barbarianTroll1);//LifePoints 50, HitPoints 10
		
		elvenArmy1.add(warriorElf1);//LP 15, HP 5
		elvenArmy1.add(warriorPegasus1);//LP 30, HP 23
		elvenArmy1.add(warriorPegasus2);//LP 30, HP 23
		
		knightArmy1.add(monk1);//LP:18 HP: 10
		knightArmy1.add(monk2);//LP:18 HP: 10
		knightArmy1.add(crussader1);//LP: 18 HP: 12
	}

	@Test
	public void armiesAreIncludedInTheLeague(){
		assertEquals(true, league.addArmy(barbarianArmy1));
		assertEquals(true, league.addArmy(elvenArmy1));
		assertEquals(true, league.addArmy(knightArmy1));
		assertEquals(3, league.getArmies().size());
	}
	
	@Test
	public void armiesGetRanked(){
		System.out.println("/////////////// Sorting test /////////////////");
		System.out.println("Battle 1");
		barbarianArmy1.reinforceUnits();
		Battle battle1 = new Battle(barbarianArmy1, elvenArmy1);
		battle1.beginBattle();
		System.out.println("Battle 2");
		Battle battle2 = new Battle(barbarianArmy1, knightArmy1);
		battle2.beginBattle();
		System.out.println("Battle 3");
		knightArmy1.reinforceUnits();
		Battle battle3 = new Battle(knightArmy1, elvenArmy1);
		battle3.beginBattle();
		knightArmy1.add(new Crussader());
		knightArmy1.add(new Crussader());
		System.out.println("Battle 4");
		Battle battle4 = new Battle(knightArmy1, elvenArmy1);
		battle4.beginBattle();
		System.out.println("Battle 5");
		Battle battle5 = new Battle(knightArmy1, elvenArmy1);
		battle5.beginBattle();
		assertEquals(true, league.addArmy(barbarianArmy1));
		assertEquals(true, league.addArmy(elvenArmy1));
		assertEquals(true, league.addArmy(knightArmy1));
		league.displayRanking();
	}
}
