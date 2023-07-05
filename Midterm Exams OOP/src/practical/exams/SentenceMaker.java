package practical.exams;

import java.util.Arrays;
import java.util.Scanner;
public class SentenceMaker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		
		System.out.println("Enter the list of letters: ");
		str = scan.nextLine();
		char[] arr = str.toCharArray();
		
		System.out.println("Enter the sentence to be formed: ");
		str = scan.nextLine();
		char[] array = str.toCharArray();
		
		if (Arrays.equals(arr, array) == (Arrays.compare(arr, array) == 0)) {
			System.out.println("\npossible");
		}else if (Arrays.equals(arr, array) == (Arrays.compare(arr, array) != 0)){
			System.out.println("\n nothing possible");
		}


	}

}
