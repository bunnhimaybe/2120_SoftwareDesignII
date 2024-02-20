public class Main{
	public static void main(String[] args){
		
		// PetiteBetes
		PetiteBete baby = new PetiteBete();
		PetiteBete child = new PetiteBete(5, 5, 5, 25, "Wittle Baby");
		PetiteBete adult = new PetiteBete(10, 10, 10, 50, "Jerk");

		// PetiteBete array
		PetiteBete[] petiteGroup = {baby, child, adult};

		adult.attack(baby);
		adult.attack(child);

		// group status
		PetiteBete.status(petiteGroup);
	}
}