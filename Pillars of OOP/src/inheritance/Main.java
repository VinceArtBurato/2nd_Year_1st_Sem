//Name: Burato, Vince Art | Section Code: T209 | Date: 10/10/2022
package inheritance;

//Main method
public class Main {

	public static void main(String[] args) {
		
		//Using the class Stone & Metal
		Stone gem1 = new Stone();
		Metal m1 = new Metal();
		
		//Setting a variable and calling constructors
		gem1.setName("Ruby");
		gem1.setColor("Red");
		gem1.setHardness(true);
		
		m1.setType("Iron");
		
		//Printing the sentence
		System.out.println(gem1.sentence());
		
	}

}
