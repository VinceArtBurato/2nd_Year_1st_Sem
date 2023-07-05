package practical.exams;

import java.util.Scanner;
public class ParallelOrIntersectingLine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter coordinates for the first line: ");
		String[] FirstLine = input.nextLine().split(" ");
		
		System.out.println("Enter coordinates for the second line: ");
		String[] SecondLine = input.nextLine().split(" ");
		
		int x1 = Integer.parseInt(FirstLine[0]);
		int y1 = Integer.parseInt(FirstLine[1]);
		int x2 = Integer.parseInt(FirstLine[2]);
		int y2 = Integer.parseInt(FirstLine[3]);
		
		int xx1 = Integer.parseInt(SecondLine[0]);
		int yy1 = Integer.parseInt(SecondLine[1]);
		int xx2 = Integer.parseInt(SecondLine[2]);
		int yy2 = Integer.parseInt(SecondLine[3]);
		
		
		int dy = y2 - y1;
		int dx = x2 - x1;
		
		float m1 = dy/dx;
		
		
		int dy1 = yy2 - yy1;
		int dx1 = xx2 - xx1;
		
		float m2 = dy1/dx1;
		
		
		if((m1-m2) == 0) {
			System.out.println("Parallel");
		}

		else if ((m1-m2) != 0) {
			System.out.println("Intersecting");
		}
		
	}

}
