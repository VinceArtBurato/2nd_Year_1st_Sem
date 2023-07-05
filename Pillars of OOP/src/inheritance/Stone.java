//Name: Burato, Vince Art | Section Code: T209 | Date: 10/10/2022
package inheritance;

//Stone is Subclass to Gem
public class Stone extends Gem {
	//Declare variables
	boolean hardness;
	
	//Constructor using setters method
	public void setHardness(boolean hardness) {
		this.hardness = hardness;
		System.out.println("Gem is a Hard Stone");
	}
	
	//Constructor
	public String sentence() {
		return name + " is a stone not a metal, it is a gem. Iron is a metal.";
	}
}
