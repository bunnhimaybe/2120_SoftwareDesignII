/**
 * 	@author 	Nhi Pham
 * 	@version 	1.0
 * 	Text-based user interface for interacting with StudentDatabase.
 */
import java.util.Scanner;

public class StudentDatabaseTUI{

	private String input;
	private Scanner scanner;
	private StudentDatabase database;
	private boolean running;

	/** StudentDatabaseTUI overloaded constructor. 
	 *  @param StudentDatabase 	preexisting model to interact with
	 */
	public StudentDatabaseTUI(StudentDatabase database){
		this.scanner = new Scanner(System.in);
		this.database = database;
		running = true;
	}

	/** StudentDatabaseTUI default constructor (empty initial database)
	 */
	public StudentDatabaseTUI(){
		this.scanner = new Scanner(System.in);
		database = new StudentDatabase();
		running = true;
	}


	/** Main Menu - display possible operations.
	 */
	public void mainMenu(){
		System.out.println("Please enter a choice:");	
		System.out.println("1) Create a new student record and add it to the database");
		System.out.println("2) Delete a student record based on its index in the database");
		System.out.println("3) Find a student's record index based on the Student's ID");
		System.out.println("4) Print the database");
		System.out.println("5) Exit");
	}

	/** Run user interface to modify StudentDatabase and return to Main Menu until user quits.
	 */
	public void run(){

        while (running) {

            mainMenu();
            input = scanner.next();
            switch (input) {
                case "1": // generate random student and add to StudentDatabase
                	database.addStudent(database.generateRandomStudent());
                    break;
                case "2": // remove student at index
                	System.out.println("Enter the student record index to delete: ");
                    input = scanner.next();
                    database.removeStudent(Integer.parseInt(input));
                    break;
                case "3":
                	input = scanner.next();
                    database.indexOf(Integer.parseInt(input));
                    break;
                case "4":
                    database.printDatabase();
                    break;
                case "5":
                	running = false;
                	break;
                default:
                	System.out.println("Invalid input. Please try again.");
                	running = false;
            }
        }

        scanner.close();
	}

}