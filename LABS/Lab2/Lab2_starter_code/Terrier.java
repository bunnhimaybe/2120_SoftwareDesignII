public class Terrier extends Dog{

    // invoke superclass constructor
    public Terrier(String name, double height, double weight) {
        super(name, height, weight);
    }

    @Override
    public void speak(){
        System.out.println("Woowoowoowoowoo");
    }
    
    // subclass method
    public void actPsycho(){
        System.out.println("I'm PSYCHO man!!!");
    }

    @Override       
    public String toString() {
        String returnVal = "";
        returnVal += "A Terrier named " + this.name + " that weighs ";
        returnVal += this.weight + " lbs and is " + this.height;
        returnVal += " inches at the shoulder.";
        return returnVal;
    }
}
