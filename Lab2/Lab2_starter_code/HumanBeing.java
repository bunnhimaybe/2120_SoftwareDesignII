public class HumanBeing extends Animal{
	
	public HumanBeing(String name){
		this.name = name;
	}
	
	public void move(){
        System.out.println("NOW I AM BECOME DEATH, THE DESTROYER OF WORLDS");
	}

	@Override
	public String toString(){
		String returnVal = "";
		returnVal += "A Human Being named " + this.name;
		return returnVal;
	}
}