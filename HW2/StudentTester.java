// JUNit 5 imports
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class StudentTester{

	private int i1, i2, i3;
	private Student s1, s2, s3;

	@BeforeEach 
	public void setup(){
		i1 = 0;
		i2 = 1;
		i3 = 3;
		s1 = new Student("Duo", "Lingo", 5, 4.0);
		s2 = new Student("Rosetta", "Stone", 10, 3.0);
		s3 = new Student("David", "Lynch", 1, 5.0);
	}

	@Test
	public void multiplyTest(){
		assertEquals(0, Student.singleDigitMultiply(i1, i1)); // 0 * 0 = 0
		assertEquals(0, Student.singleDigitMultiply(i1, i2)); // 0 * 1 = 0
		assertEquals(0, Student.singleDigitMultiply(i2, i1)); // 1 * 0 = 0
		assertEquals(1, Student.singleDigitMultiply(i2, i2)); // 1 * 1 = 1
		assertEquals(3, Student.singleDigitMultiply(i2, i3)); // 1 * 3 = 3
		assertEquals(3, Student.singleDigitMultiply(i3, i2)); // 3 * 1 = 3
	}

	@Test
	public void minStudentTest(){

	}

}