package practicalActivity;

import java.util.Scanner;

public class practice {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in).useDelimiter("\\n");
		
		String names;
		String scores; 
		float average = 0;
		
		names = scan.nextLine();
		scores = scan.nextLine();
		
		String[] n = names.split(",");
		String[] s = scores.split(";");
		
		System.out.println("Total Number of Students: " + n.length);
		System.out.println("=================================");
		
		for (int i = 0; i < n.length; i++) {
			int sum = 0;
			int numScores = 0;
			
			System.out.println("NAME: " + n[i].toUpperCase());
			
			String[] Scores = s[i].split(" ");
			System.out.println("SCORES: " + s[i]);
			
			for (int j = 0; j < Scores.length; j++) {
				sum += Integer.parseInt(Scores[j]);
				numScores++;
			}
			
			average = sum/numScores;
			System.out.println("AVERAGE: " + average);
			
			if (average >= 75) {
				System.out.println("STATUS: PASSED");
			} else {
				System.out.println("STATUS: FAILED ");
			}
			
		}
	}
}