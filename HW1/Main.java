public class Main{
	public static void main(String[] args){
		
		// generic PetiteBetes
		PetiteBete baby = new PetiteBete();
		PetiteBete child = new PetiteBete(5, 5, 5, 25, "Wittle Baby");
		PetiteBete adult = new PetiteBete(10, 10, 10, 50, "Jerk");

		// PetiteBetes in game
		PetiteBete[] petiteGame = {baby, child, adult};

		adult.attack(baby);
		adult.attack(child);

		// game status
		for (PetiteBete bete : petiteGame){
			System.out.println(bete.toString());
		}

	}
}