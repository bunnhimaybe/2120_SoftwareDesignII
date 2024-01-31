public class Snake extends Animal {

		// constructor - allows us to build and object an initialize the instance
		// variables - this method is going to have three parameters
		
		public Snake(String name) {
			this.name = name;
		} // end constructor

		// setters or commands
		// the don't return anything, but they do change the state

		@Override
		public void move() {
            System.out.println("I sssslither across the ground and can even climb trees!");
		}

		@Override
		public String toString(){
			String returnVal = "";
			returnVal += "A Snake named " + this.name;
			return returnVal;
		}

} // end class
