package revrev;
/*Super class Pere*/
public class Pere {
	/*Attributes*/
	protected int age;
	protected String nom;
	protected String chaine;
	/*constructor(Para)*/
	public Pere(String chaine) {
			this.chaine=chaine;
	}
	/*Default constructor*/
	protected Pere() {
		
	}
	/*Method to display the string*/
	public String affiche() {
		return this.chaine;
	}
	/*constructor(para,para)*/
	public Pere(String nom,int age) {
		this.nom=nom;
		this.age=age;
	}
	public String affiche2() {
		return this.nom+' '+this.age;
	}
	/*Method height*/
	protected int age() {
		return 20;
	}
	
}
