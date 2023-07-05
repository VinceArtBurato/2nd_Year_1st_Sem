package animals;

public class Dog extends LandAnimals{
	
	String name;
	boolean lonely;
	int legs;
	
	public Dog (String name, boolean lonely, int legs) {
		super();
		this.name = name;
		this.lonely = lonely;
		this.legs = legs;
	}
	
	public Dog(String name, boolean lonely) {
		super();
		this.name = name;
		this.lonely = lonely;
	}



	public void bark() {
		System.out.println(name + " is barking Aw aw");
	}
	
	public void play() {
		System.out.println(name + " is playing");
	}
	
	public void jump() {
		if (legs != 0) {
			System.out.println(name + " is jumping");
		}
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", lonely=" + lonely + ", legs=" + legs + "]";
	}
	
	

}
