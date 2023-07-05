//Name: Burato, Vince Art | Section Code: T209 | Date: 10/10/2022
package assignment.inheritance.polymorphism;

//LivingThings is a Superclass to all class
public class LivingThings {
	
	//Declare variables
	boolean livingthing, grow_alive;
	
	//Constructor using setters method
	public void isLivingThing(boolean livingthing) {
		this.livingthing = livingthing;
		
		//Using the if-else statement to determine the boolean value
		if (livingthing == true) {
			System.out.print("ALL Animal is a Living Things. ");
		} else {
			System.out.print("It is not a Living Thing. ");
		}
	}
	
	//Constructor using setters method
	public void isGrowingAlive(boolean grow_alive) {
		this.grow_alive = grow_alive;
		
		//Using the if-else statement to determine the boolean value
		if (grow_alive == true) {
			System.out.println("A living things is GROWING and ALIVE.");
		} else {
			System.out.println("It is not growing and alive.");
		}
	}
	
}
