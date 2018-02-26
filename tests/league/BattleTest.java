package league;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BattleTest {

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
	private Battle battle;
	
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
		
		barbarianArmy1.add(barbarianOrc1);//LifePoints 10, HitPoints 2
		barbarianArmy1.add(barbarianOrc2);//LifePoints 10, HitPoints 2
		barbarianArmy1.add(barbarianOrc3);//LifePoints 10, HitPoints 2
		barbarianArmy1.add(barbarianTroll1);//LifePoints 50, HitPoints 10
		
		elvenArmy1.add(warriorElf1);//LP 15, HP 5
		elvenArmy1.add(warriorPegasus1);//LP 30, HP 23
		elvenArmy1.add(warriorPegasus2);//LP 30, HP 23
		battle = barbarianArmy1.startBattle(elvenArmy1);
	}
	
	@Test
	public void anArmyWithStrongerStatsWinsOverAWeakerArmy() {
		assertEquals(Battle.class, battle.getClass());
	}
	
	@Test
	public void theArmyGetCalculatedStatsAtTheBeginningOfTheWar() {
		
	}
}
