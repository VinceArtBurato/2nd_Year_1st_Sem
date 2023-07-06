package group2;

public class Main {
	public static void main(String[] args) {
		
		WaterBottle bottle1 = new WaterBottle ("Nature Spring");
		WaterBottle bottle2 = new WaterBottle ("Wilkins");
		
		bottle1.open();
		bottle1.pouring();
		bottle1.close();
		
		bottle2.close();
		bottle2.storing();
		bottle2.open();
	}

}
