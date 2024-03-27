// JUNit 5 imports
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class StudentTester{

	private int i1, i2, i3;
	private Student s1, s2, s3, s4, s5;
	private ArrayList<Student> studentArray;
	private ArrayList<Student> emptyArray;

	@BeforeEach 
	public void setup(){
		i1 = 0;
		i2 = 1;
		i3 = 3;
		s1 = new Student("Duo", "Lingo", 18, 4.0);
		s2 = new Student("Rosetta", "Stone", 72, 3.0);
		s3 = new Student("Khan", "Academy", 04, 5.0);
		s4 = new Student("Healthy", "Gamer", 01, 5.0);		// minimum Student
		s5 = new Student("Pearson", "Education", 56, 3.5);

		emptyArray = new ArrayList<Student>();
		studentArray = new ArrayList<Student>();
		studentArray.add(s1);
		studentArray.add(s2);
		studentArray.add(s3);
		studentArray.add(s4);
		studentArray.add(s5);
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
	public void testInitialState(){
		assertEquals( "Duo", (studentArray.get(0)).getFirstName() );	// s1.firstName
		assertEquals( "Stone", s2.getLastName() );						// s2.lastName
		assertEquals( 4, (studentArray.get(2)).getID() );				// s3.studentID
		assertEquals( 5.0, s4.getGPA() );								// s5.gpa
	}

	@Test
	public void testEquality(){
		assertEquals(0, s5.compareTo(studentArray.get(4)) );	// s5 = s5
		assertTrue((studentArray.get(4)).compareTo(s4) > 0); 	// s3 > s4
		assertTrue(s4.compareTo(studentArray.get(2)) < 0);		// s4 < s3
	}

	@Test
	public void testMinimum(){
		assertNull(Student.findMinimum(emptyArray));
		assertEquals(s4, Student.findMinimum(studentArray));
	}

}