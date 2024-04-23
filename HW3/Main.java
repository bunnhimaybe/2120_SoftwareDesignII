/**
 * 	@author 	Nhi Pham
 * 	@version 	1.0
 * 	Builds a model (StudentDatabase) and a user interface (StudentDatabaseTUI)
 * 		to interact with the model and runs it. 
 */

public class Main{
	public static void main(String[] args){
		StudentDatabase model = new StudentDatabase();
		StudentDatabaseTUI userInterface = new StudentDatabaseTUI(model);
		userInterface.run();
	}
}