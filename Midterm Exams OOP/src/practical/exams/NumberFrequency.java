package practical.exams;

import java.util.Scanner;
public class NumberFrequency {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[101];
		int[] count = new int[101];
		
		int i, temp = 0;
		System.out.println("Enter number between 1 to 100 then enter 0 to terminate: ");
		for (i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
			if (num[i] == 0) {
				break;
			}
		}
		
		for (i = 0; i < num.length; i++) {
			temp = num[i];
			count [temp]++;
		}
		
		for (i = 1; i < count.length; i++) {
			
			if (count[i] > 0 && count[i] == 1) {
				System.out.printf("%d is occurs: %d time\n", i, count[i]);
			} else if (count[i] >= 2) {
				System.out.printf("%d is occurs: %d times\n", i, count[i]);
			}
		}
	}

}
