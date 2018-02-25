package league;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreatureTest {
	
	private Barbarian barbarianOrc1;
	private Barbarian barbarianTroll1;
	
	@Before
	public void before(){
		barbarianOrc1 = new Orc();
		barbarianTroll1 = new Troll();
	}

	@Test
	public void creaturesHaveLifePoints() {
		assertEquals(10, barbarianOrc1.getLifePoints());
		assertEquals(50, barbarianTroll1.getLifePoints());
	}
	
	@Test
	public void creaturesHaveHitpoints(){
		assertEquals(2, barbarianOrc1.getHitpoints());
		assertEquals(10, barbarianTroll1.getHitpoints());
	}
	
	@Test
	public void creaturesHaveMagicImmunity(){
		assertEquals(false, barbarianOrc1.isMagicImmune());
		assertEquals(true, barbarianTroll1.isMagicImmune());
	}
	
	@Test
	public void creaturesCanCounterStrike(){
		assertEquals(true, barbarianOrc1.isCounterStrike());
		assertEquals(false, barbarianTroll1.isCounterStrike());
	}
}