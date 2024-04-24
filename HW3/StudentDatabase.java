/**
 * 	@author 	Nhi Pham
 * 	@version 	1.0
 * 	Model to perform operations and manage Student data.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class StudentDatabase{
	
	// instance vars
	private ArrayList<Student> students;
	Iterator<Student> iterator;

	/** StudentDatabase constructor.
	 */
	public StudentDatabase(){
		students = new ArrayList<Student>();
	}

	public Student generateRandomStudent(){
        String[] firstNames = {"Joe","Yeongsik","Louis","Becky","Lamar","Steve","Stacey","Issa","James","Joan","Haydar","Joachim","Chris","Pham","Stan","Alice","Bob","Josie","Jose","Kendra","T-Bob","Maria","Satoshi","Tyson","Lars","Nolan","Doug","Xavier","Francine","Ann","Sridhar","Bhupinder","Jason","Walter","Brian","Nancy","Michael","Thien"};
        String[] middleInitials = {"A.","B.","C.","D.","E.","F.","G.","H.","I.","J.","K.","L.","M.","N.","O.","P.","Q.","R.","S.","T.","U.","V.","W.","X.","Y.","Z."};
        String[] lastNames = {"Jackson","Boudreaux","Thibodeaux","Landry","Nemoy","Kirk","Levitt","Pham","Nguyen","Wynn","Schwing","Johnson","Lee","Abdelguerfi","Yoo","Smith","Jones","Baker","Naquin","Nakamura","Keonnigsegg","Stuart","Tudor","Abromov","Jaeger","Jarndyce","Cooper","Dufresne","Singh","Grisham","Humbert","Einstein","Feynman","Marsalis","Fang","Chen","Charagundala"};
        String[] ethnicities = {"Asian","Hispanic/Latino","White","Black/African American","Two or more races","Native American","Not Specified"};
        String[] fafsaOrNot = {"Y","N"};
        String[] subPlans = {"BIOINFORM","CYBER","GAMEDEV",""};
        String[] genders = {"M","F"};

        Random rng = new Random();
        Student s = new Student();

        String name = "\"" + lastNames[rng.nextInt(lastNames.length)] + ", " + firstNames[rng.nextInt(firstNames.length)] + " " + middleInitials[rng.nextInt(middleInitials.length)] + "\"";
        double gpa = 1.0 + rng.nextDouble() * 3.0;
        String sex = genders[rng.nextInt(genders.length)];
        int studentID = rng.nextInt(999999) + 2600000;
        String ethnicGrp = ethnicities[rng.nextInt(ethnicities.length)];
        String fafsa = fafsaOrNot[rng.nextInt(fafsaOrNot.length)];
        String subPlan = subPlans[rng.nextInt(subPlans.length)];
        int strtLevel = rng.nextInt(40);
        double total = 4.0 * rng.nextInt(8);
        double takePrgrs = (double)(rng.nextInt(18)+1);
        double financialNeed = (double)(rng.nextInt(10000));

        s.setStudentID(studentID);
        s.setSex(sex);
        s.setEthnicGroup(ethnicGrp);
        s.setName(name);
        s.setProgram("USCI");
        s.setAcademicPlan("CSCI");
        s.setSubPlan(subPlan);
        s.setStrtLevel(strtLevel);
        s.setTotal(total);
        s.setGPA(gpa);
        s.setFAFSA(fafsa);
        s.setTakePrgrs(takePrgrs);
        s.setFinancialNeed(financialNeed);

        return s;
	}

/**	Add a student to the database.
 * 	@param newStudent
 */
	public void addStudent(Student newStudent){
		students.add(newStudent);
	}

/**	Remove a student from the database.
 *  @param index 	Position of Student record to remove in StudentDatabase.
 */
	public void removeStudent(int index){
		if (students.size() <= index){
			System.err.println("Student does not exist in database.");
        } else {
			students.remove(index);
		}
	}

/** Print contents of the database.
 */
	public void printDatabase(){
		iterator = students.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

/**	Return the index of a Student record based on their studentID.
 * 	@param studentID 	studentID to look for.
 * 	@return 			Index of Student in StudentDatabase.
 */
	public int indexOf(int studentID){
		iterator = students.iterator();
		int counter = 0;
		while (iterator.hasNext()){
			if ( (iterator.next()).getStudentID() == studentID )
				return counter;
			counter++;
		}
		System.out.println("Student does not exist.");
		return -1;
	}

}