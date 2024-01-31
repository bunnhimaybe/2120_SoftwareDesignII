public class Student extends HumanBeing{
	public Student(String name){
		super(name);
	}

	// subclass method
	public double getGPA(){
		return 4.0;
	}

	@Override
	public String toString(){
		String returnVal = "";
		returnVal += "A Student named " + this.name;
		return returnVal;
	}
}