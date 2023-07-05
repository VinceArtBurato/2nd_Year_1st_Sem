//Name: Burato, Vince Art | Section Code: T209 | Date: 10/10/2022
package assignment.inheritance.polymorphism;

// Animal is a Subclass to LivingThings. but it is a Superclass to Dog & Cat
public class Animal extends LivingThings {
	
	//Declare variables
	String name1, name2, name3, speaksD = "aw aw.", speaksC = "Meow Meow.";
	boolean legs, type;
	
	//Constructor using setters method
	public void animalName(String name1, String name2) {
		this.name1 = name1;
		this.name2 = name2;
		System.out.println("The dog " + name1 + " is lonely while watching."  );
		System.out.println("the Dog named " + name2 + " jumping and barking " + speaksD);
	}
	
	//Constructor using setters method
	public void dog1NoLegs(boolean legs) {
		this.legs = legs;
		if (legs == true) {
		System.out.println(name1 + " cannot jump because he do not have legs.");
		}
	}
	
	//Constructor using setters method. the constructor not duplicate because it uses different parameter
	public void animalName(String name3) {
		this.name3 = name3;
		System.out.println("while playing with " + name3 + " a Cat doing " + speaksC);
	}
	
	//Constructor using setters method
	public void typeOfAnimals(boolean type) {
		this.type = type;
		if (type == true) {
			System.out.println("An animal could be aquatic animal, land animal or both.");
		}
	}
	
}
