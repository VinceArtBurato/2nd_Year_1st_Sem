package animals;

public class Main {

	public static void main(String[] args) {
		
		Dog bonak = new Dog ("Bonak", true);
		Dog bogart = new Dog ("Bogart", false, 4);
		
		System.out.println(bonak.toString());
		System.out.println(bogart.toString());
		bogart.jump();
		bogart.bark();
		bogart.play();
		
		Alligator ali = new Alligator();
		ali.swimming();

	}

}
