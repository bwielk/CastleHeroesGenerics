package league;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreatureTest {
	
	private Barbarian barbarianOrc1;
	private Barbarian barbarianTroll1;
	private Elven warriorElf1;
	private Elven warriorPegasus1;
	
	@Before
	public void before(){
		barbarianOrc1 = new Orc();
		barbarianTroll1 = new Troll();
		warriorElf1 = new WarriorElf();
		warriorPegasus1 = new Pegasus();
	}

	@Test
	public void creaturesHaveLifePoints() {
		assertEquals(10, barbarianOrc1.getLifePoints());
		assertEquals(50, barbarianTroll1.getLifePoints());
		assertEquals(15, warriorElf1.getLifePoints());
		assertEquals(30, warriorPegasus1.getLifePoints());
	}
	
	@Test
	public void creaturesHaveHitpoints(){
		assertEquals(2, barbarianOrc1.getHitpoints());
		assertEquals(10, barbarianTroll1.getHitpoints());
		assertEquals(5, warriorElf1.getHitpoints());
		assertEquals(23, warriorPegasus1.getHitpoints());
	}
	
	@Test
	public void creaturesHaveMagicImmunity(){
		assertEquals(false, barbarianOrc1.isMagicImmune());
		assertEquals(true, barbarianTroll1.isMagicImmune());
		assertEquals(false, warriorElf1.isMagicImmune());
		assertEquals(true, warriorPegasus1.isMagicImmune());
	}
	
	@Test
	public void creaturesCanCounterStrike(){
		assertEquals(true, barbarianOrc1.isCounterStrike());
		assertEquals(false, barbarianTroll1.isCounterStrike());
	}
	
	@Test
	public void creaturesCanBeBlessed(){
		assertEquals(true, warriorElf1.canBeBlessed());
		assertEquals(true, warriorPegasus1.canBeBlessed());
	}
}