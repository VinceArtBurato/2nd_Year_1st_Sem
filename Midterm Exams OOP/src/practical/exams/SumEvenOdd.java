package practical.exams;

import java.util.Scanner;
public class SumEvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		  int sumE = 0, sumO = 0;
         
          System.out.println("Enter array elements:");
          String[] arr = scan.nextLine().split(" ");
          int n;
          
          System.out.println("\nEven number of the array:");
          for (int i = 0;i<arr.length ;i++ )
          {
        	  n = Integer.parseInt(arr[i]);
                  if (n % 2 == 0)
                  {
                          System.out.print( n +" ");
                          sumE += n;
                  } 
          }
          System.out.println("\nsum of even numbers: " + sumE);
          System.out.println("\nOdd number of the array:");
          for (int i = 0;i<arr.length ;i++ )
          {
        	  n = Integer.parseInt(arr[i]);
                  if (n % 2 != 0)
                  {
                   System.out.print( n +" ");
                   sumO += n;
                  }
          }
          System.out.println("\nsum of odd numbers: " + sumO);

	}

}
