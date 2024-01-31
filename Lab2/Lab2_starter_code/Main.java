public class Main{
	public static void main(String[] args){

		Bird raven = new Bird("Raven");
		Fish glub = new Fish("Glub");
		Snake slip = new Snake("Slip");
		Dog stray = new Dog("Stray", 2, 2);
		Dog yip = new Terrier("Yip", 1.5, 1.5);
		HumanBeing oppenheimer = new HumanBeing("Oppenheimer");
		HumanBeing louis = new Student("Louis");


		System.out.println("These are the animals in my collection!\n");
		Animal[] petCollection = new Animal[] {raven, glub, slip, stray, yip, oppenheimer, louis};

		for (Animal a: petCollection){
			System.out.println(a.toString());
			a.move();

			if (a instanceof Student){
				System.out.println( a.name + "'s GPA is " + ((Student)louis).getGPA() );
			}
		}

		return;
	}
}