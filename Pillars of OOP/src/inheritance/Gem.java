//Name: Burato, Vince Art | Section Code: T209 | Date: 10/10/2022
package inheritance;

//Gem is a Superclass
public class Gem {
	
	//Declare variables
	String name, color;
	
	//Constructor using setters method
	public void setName(String name) {
		this.name = name;
		System.out.println(name + " is Gem");
		System.out.println(name + " is Stone");
	}

	//Constructor using setters method
	public void setColor(String color) {
		this.color = color;
		System.out.println(name + " is " + color);
	}

}
