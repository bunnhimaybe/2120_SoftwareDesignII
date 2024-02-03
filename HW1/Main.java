public class Main{
	public static void main(String[] args){
		
		// generic PetiteBetes
		PetiteBete p1 = new PetiteBete();
		PetiteBete p2 = new PetiteBete();
		PetiteBete p3 = new PetiteBete();


		// PetiteBete array
		PetiteBete[] petiteField = {p1, p2, p3};

		// run tester class
		PetiteBeteTester test = new PetiteBeteTester();

		for (PetiteBete bete : petiteField){
			System.out.println(bete.toString());
		}

	}
}