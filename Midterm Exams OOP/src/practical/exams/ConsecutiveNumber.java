package practical.exams;

import java.util.Scanner;
public class ConsecutiveNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num;
		int convertInt;
		int convertInt2;
		int count;
		int repeatedNum = 0;
		
		System.out.println("Enter your numbers separated by a space");
		num = scan.nextLine();
		
		String numSplit[] = num.split(" ");
		
		for(int i = 0; i < numSplit.length; i++)
		{
			convertInt = Integer.parseInt(numSplit[i]);
			count = 1;
			
			for(int j = i+1; j<numSplit.length; j++)
			{
				convertInt2 = Integer.parseInt(numSplit[j]);
				if(convertInt == convertInt2)
				{
					count++;
					if(count == 3)
					{
						System.out.println("Consecutive values found for "+numSplit[j]);
						repeatedNum++;
						break;
					}
					
				}
				
				if(convertInt != convertInt2)
				{
					count = 1;
				}
			}
		}
		if(repeatedNum == 0)
		{
			System.out.println("Consecutive values not found!");
		}

	}

}
