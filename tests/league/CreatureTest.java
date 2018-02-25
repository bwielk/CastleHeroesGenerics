package league;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreatureTest {
	
	private Barbarian barbarianOrc1;
	private Barbarian barbarianTroll1;
	private Elven warriorElf1;
	private Elven warriorPegasus1;
	private Knight crussader1;
	private Knight monk1;
	
	@Before
	public void before(){
		barbarianOrc1 = new Orc();
		barbarianTroll1 = new Troll();
		warriorElf1 = new WarriorElf();
		warriorPegasus1 = new Pegasus();
		crussader1 = new Crussader();
		monk1 = new Monk();
	}

	@Test
	public void creaturesHaveLifePoints() {
		assertEquals(10, barbarianOrc1.getLifePoints());
		assertEquals(50, barbarianTroll1.getLifePoints());
		assertEquals(15, warriorElf1.getLifePoints());
		assertEquals(30, warriorPegasus1.getLifePoints());
		assertEquals(18, crussader1.getLifePoints());
		assertEquals(18, monk1.getLifePoints());
	}
	
	@Test
	public void creaturesHaveHitpoints(){
		assertEquals(2, barbarianOrc1.getHitpoints());
		assertEquals(10, barbarianTroll1.getHitpoints());
		assertEquals(5, warriorElf1.getHitpoints());
		assertEquals(23, warriorPegasus1.getHitpoints());
		assertEquals(12, crussader1.getHitpoints());
		assertEquals(10, monk1.getHitpoints());
	}
	
	@Test
	public void creaturesHaveMagicImmunity(){
		assertEquals(false, barbarianOrc1.isMagicImmune());
		assertEquals(true, barbarianTroll1.isMagicImmune());
		assertEquals(false, warriorElf1.isMagicImmune());
		assertEquals(true, warriorPegasus1.isMagicImmune());
		assertEquals(false, crussader1.isMagicImmune());
		assertEquals(true, monk1.isMagicImmune());
	}
	
	@Test
	public void barbarianCreaturesCanCounterStrike(){
		assertEquals(true, barbarianOrc1.isCounterStrike());
		assertEquals(false, barbarianTroll1.isCounterStrike());
	}
	
	@Test
	public void barbarianCreaturesStatsIncreaseWhenCounterStrike(){
		barbarianOrc1.rage();
		assertEquals(4, barbarianOrc1.getHitpoints());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void trollsCannotRage(){
		barbarianTroll1.rage();
	}
	
	@Test
	public void elvenCreaturesCanBeBlessed(){
		assertEquals(true, warriorElf1.canBeBlessed());
		assertEquals(true, warriorPegasus1.canBeBlessed());
	}
	
	@Test
	public void elvenCreaturesStatsIncreseAfterBlessing(){
		warriorElf1.bless();
		warriorPegasus1.bless();
		assertEquals(30, warriorElf1.getLifePoints());
		assertEquals(60, warriorPegasus1.getLifePoints());
	}
	
	@Test
	public void knightCreaturesStatsIncreaseAfterStrenghtening(){
		crussader1.strenghten();
		assertEquals(23, crussader1.getLifePoints());
		assertEquals(15, crussader1.getHitpoints());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void monksCannotBeStrenghtened(){
		monk1.strenghten();
	}
}