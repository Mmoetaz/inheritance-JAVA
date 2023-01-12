package revrev;
/*inherited class in java: Using EXTENDS key word*/
public class Fils extends Pere{
	/*The subclass has the same method as the super class(Pere ==>(protected double height() {return 4;})*/
	@Override
	protected int age(){
		return 20;
	}
	/*Access to super class Constructor (public Pere(){})*/
	public Fils() {
		super("Mohamed Moetaz Boughalmi");
	}
}
