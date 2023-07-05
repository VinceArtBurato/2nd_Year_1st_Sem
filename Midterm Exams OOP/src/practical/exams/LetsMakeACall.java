//Name: Burato, Vince Art    Date: 2/10/2022   Assignment Title: Lets Make A Call   Class Code: T209
package practical.exams;

import java.util.Scanner;
public class LetsMakeACall {

	public static void main(String[] args) {
	      String letters;
	    
			   Scanner input = new Scanner(System.in);
			  
			   System.out.print("Enter the Phone Number: ");
			   letters = input.nextLine();
			   
			   String number = letters.replaceAll("[ABCabc]", "2");
			   number = number.replaceAll("[DEFdef]", "3");
			   number = number.replaceAll("[GHIghi]", "4");
			   number = number.replaceAll("[JKLjkl]", "5");
			   number = number.replaceAll("[MNOmno]", "6");
			   number = number.replaceAll("[PQRSpqrs]", "7");
			   number = number.replaceAll("[TUVtuv]", "8");
			   number = number.replaceAll("[WXYZwxyz]", "9");
			   number = number.replaceAll("[+]", "0");
			  
			   System.out.println(number);	   
	}

}
