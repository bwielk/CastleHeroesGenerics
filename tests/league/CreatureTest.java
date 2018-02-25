package league;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreatureTest {
	
	private Creature barbarianOrc1;
	private Creature barbarianTroll1;
	
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
}