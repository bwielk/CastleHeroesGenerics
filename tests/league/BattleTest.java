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
		
		knightArmy1.add(monk1);
		knightArmy1.add(monk2);
		knightArmy1.add(crussader1);
		battle = barbarianArmy1.startBattle(elvenArmy1);
	}
	
	@Test
	public void anArmyWithStrongerStatsWinsOverAWeakerArmy() {
		assertEquals(Battle.class, battle.getClass());
	}
	
	@Test
	public void armiesGetsCalculatedStatsAtTheBeginningOfTheBattleLifePoints() {
		assertEquals(75, battle.calculateArmyHealth(elvenArmy1));
		assertEquals(80, battle.calculateArmyHealth(barbarianArmy1));
	}
	
	@Test
	public void armiesGetCalculatedStatsAtTheBeginningOfTheBattleHitpoints(){
		assertEquals(51, battle.calculateArmyHitpoints(elvenArmy1));
		assertEquals(16, battle.calculateArmyHitpoints(barbarianArmy1));
	}
	
	@Test
	public void statsIncreaseAfterApplyingABattleBonusToTroopsElvenArmyExample(){
		elvenArmy1.reinforceUnits();
		Elven elf1 = elvenArmy1.getSoldiers().get(0);
		System.out.println(elf1);
		Elven pegasus1 = elvenArmy1.getSoldiers().get(1);
		assertEquals(30, elf1.getLifePoints());
		assertEquals(60, pegasus1.getLifePoints());
		assertEquals(150, battle.calculateArmyHealth(elvenArmy1));
	}
	
	@Test
	public void statsIncreaseAfterApplyingABattleBonusToTroopsBarbarianArmyExample(){
		barbarianArmy1.reinforceUnits();
		Barbarian orc1 = barbarianArmy1.getSoldiers().get(0);
		System.out.println(orc1);
		Barbarian troll1 = barbarianArmy1.getSoldiers().get(3);
		System.out.println(troll1);
		assertEquals(4, orc1.getHitpoints());
		assertEquals(10, troll1.getHitpoints());
		assertEquals(80, battle.calculateArmyHealth(barbarianArmy1));
	}
	
	@Test
	public void strongerTeamWinsOverTheWeakerOne(){
		Battle battle1 = new Battle(barbarianArmy1, elvenArmy1);
		battle1.beginBattle();
		assertEquals(1, elvenArmy1.getWins());
		assertEquals(1, barbarianArmy1.getLosts());
		Battle battle2 = new Battle(barbarianArmy1, knightArmy1);
		battle2.beginBattle();
		assertEquals()
	}
}
