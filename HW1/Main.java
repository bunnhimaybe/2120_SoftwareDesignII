public class Main{
	public static void main(String[] args){
		
		// generic PetiteBetes
		PetiteBete baby = new PetiteBete();
		PetiteBete child = new PetiteBete(5, 5, 5, 25, "Wittle Baby");
		PetiteBete adult = new PetiteBete(10, 10, 10, 50, "Jerk");

		// PetiteBetes in a field
		PetiteBete[] petiteField = {baby, child, adult};

		adult.attack(baby);
		adult.attack(child);

		// roster status
		for (PetiteBete bete : petiteField){
			System.out.println(bete.toString());
		}

	}
}