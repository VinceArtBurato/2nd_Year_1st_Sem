package studentInfoSystem;

import java.util.Scanner;

public class MainMenu {

	public void showMainMenu() {
		Scanner scan = new Scanner(System.in);
		
		StudentMenu stm = new StudentMenu();
		
		System.out.println(" 	     Student Information System");
		System.out.println("====================MAIN MENU====================");
		System.out.println("[1] Student");
		System.out.println("[2] Subject");
		System.out.println("[3] Exit");
		System.out.println("[4] Grades");
		System.out.println("--------------------MAIN MENU--------------------");
		System.out.print("Choice: ");
		
		int choice = scan.nextInt();
		
		switch (choice) {
			case 1:
				stm.showStudentMenu();
				break;
				
			default:
				System.out.println("Error");
				break;
		}
	}

}
