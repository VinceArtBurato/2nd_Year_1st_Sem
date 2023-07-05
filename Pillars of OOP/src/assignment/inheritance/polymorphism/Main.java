//Name: Burato, Vince Art | Section Code: T209 | Date: 10/10/2022
package assignment.inheritance.polymorphism;

//Main method
public class Main {
	
	public static void main(String[] args) {
		
		//Using the class Dog and Cat
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		//Setting a variable and calling constructors. Polymorphism occurs
		dog.animalName("Bonak", "Bogart");
		cat.animalName("Kitty");
		
		//Setting value of the boolean variable legs to true
		dog.dog1NoLegs(true);
		
		//Using the class Animal
		Animal animals = new Animal();
		
		//Setting value of the boolean variable livingthing, grow_alive, and type to true
		animals.isLivingThing(true);
		animals.isGrowingAlive(true);
		animals.typeOfAnimals(true);
		
	}

}
