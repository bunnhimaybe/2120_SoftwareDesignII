// JUNit 5 imports
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class PetiteBeteTester{
	
	// instance variables
	private PetiteBete baby;
	private PetiteBete child;
	private PetiteBete adult;
	PetiteBete[] petite = {baby, child, adult};

	@BeforeEach
	public void setup(){
		baby = new PetiteBete();
		child = new PetiteBete(5, 5, 5, 25, "Wittle Baby");
		adult = new PetiteBete(10, 10, 10, 50, "Jerk");
	}

	@Test
	public void testDefault(){
		assertEquals(1, baby.getLvl());
		assertEquals(1, baby.getAtk());
		assertEquals(1, baby.getSpd());
		assertEquals(5, baby.getTol());
		assertEquals("Baby", baby.getName());
	}

	@Test
	public void testSet(){
		baby.setLvl(5);
		baby.setAtk(5);
		baby.setSpd(5);
		baby.setTol(25);
		baby.setName("Wittle Baby");

		assertEquals(5, baby.getLvl());
		assertEquals(5, baby.getAtk());
		assertEquals(5, baby.getSpd());
		assertEquals(25, baby.getTol());
		assertEquals("Wittle Baby", baby.getName());
	}

	@Test 
	public void testBattle(){
		adult.attack(baby);

		assertEquals(0, baby.getTol);
	}
}