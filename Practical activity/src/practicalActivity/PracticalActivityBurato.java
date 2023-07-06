package practicalActivity;

import java.util.Scanner;

public class PracticalActivityBurato {
	
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
		System.out.println("==================================");
		
		for (int i = 0; i < n.length; i++) {
			int sum = 0;
			int totalScores = 0;
			
			System.out.println("Name: " + n[i].toUpperCase());
			
			String[] Scores = s[i].split(" ");
			System.out.println("Scores: " + s[i]);
			
			for (int j = 0; j < Scores.length; j++) {
				sum += Integer.parseInt(Scores[j]);
				totalScores++;
			}
			
			average = sum/totalScores;
			System.out.println("Average: " + average);
			
			if (average >= 75) {
				System.out.println("Status: PASSED");
				System.out.println("==================================");
			} else {
				System.out.println("Status: FAILED ");
				System.out.println("==================================");
			}
			
		}
		
	}
}

