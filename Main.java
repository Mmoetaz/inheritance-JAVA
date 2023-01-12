package revrev;

public class Main {
	public static void main(String [] args) {
		/*Fils is inherited from pere (we can use Pere or Fils in creating an instance)*/
		Pere f=new Fils();/*Creating new instance*/
		System.out.println(f.affiche());
		Pere p=new Fils();
		System.out.println("Age: "+p.age());
		System.out.println("\n\nUsing public Pere(para,para) Constructor:");
		Pere p1=new Pere("MohamedMoetaz Boughalmi",20);
		System.out.println(p1.affiche2());
		

	}
}
