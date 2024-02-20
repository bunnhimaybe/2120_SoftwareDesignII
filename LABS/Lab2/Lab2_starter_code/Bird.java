public class Bird extends Animal{

		// constructor - allows us to build and object an initialize the instance
		// variables - this method is going to have three parameters
		
		public Bird(String name) {
			this.name = name;
		} // end constructor

		// setters or commands
		// the don't return anything, but they do change the state

		@Override
		public void move() {
            System.out.println("I soar through the air, majestic and free!");
		}

		@Override
		public String toString(){
			String returnVal = "";
			returnVal += "A Bird named " + this.name;
			return returnVal;
		} 

} // end class
