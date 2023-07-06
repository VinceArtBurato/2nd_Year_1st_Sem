package group2;

public class WaterBottle {
	String brand;
	boolean open = false, close = true, pouring = false, storing = false;
	
	public WaterBottle(String b) {
		this.brand = b;
		System.out.println("Water Bottle brand is: " + brand);
	}
	
	public void open() {
		System.out.println(brand + " lid is open");
		open = true;
		close = false;
	}
	
	public void close() {
		System.out.println(brand + " lid is close");
		open = false;
		close = true;
	}
	
	public void pouring() {
		if (close) {
			System.out.println("Open the bottle first.");
		} else {
			System.out.println(brand + " is Now Pouring");
		}
	}
	
	public void storing() {
		if (open) {
			System.out.println("Open the bottle Second.");
		} else {
			System.out.println(brand + " is Now Storing");
		}
	}

}
