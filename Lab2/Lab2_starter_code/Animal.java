public abstract class Animal{

	// protected instance variables
	protected String name;

	// abstract method
	public abstract void move();

	// Animal will overload toString()
	@Override
	public abstract String toString();
}