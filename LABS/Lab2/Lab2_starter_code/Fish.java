public class Fish extends Animal{

		// constructor - allows us to build and object an initialize the instance
		// variables - this method is going to have three parameters
		
		public Fish(String name) {
			this.name = name;
		} // end constructor

		// setters or commands
		// the don't return anything, but they do change the state

		@Override
		public void move() {
            System.out.println("Just keep swimming, just keep swimming!");
		}

		@Override
		public String toString(){
			String returnVal = "";
			returnVal += "A Fish named " + this.name;
			return returnVal;
		}

} // end class
