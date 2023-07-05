package studentInfoSystem;

import java.util.Scanner;

public class StudentMenu {
	
	public void showStudentMenu() {
		Scanner scan = new Scanner(System.in);
		StudentController studentCon = new StudentController();
		
		System.out.println("\n\n====================STUDENT MENU====================");
		System.out.println("Each function should be done be calling command.");
		System.out.println("Commands example: add, update, delete, find, all, enroll");
		System.out.println("Example formats in the following:");
		System.out.println("ADD Student:               add,1111,Vince Burato,Barangay 1,20");
		System.out.println("UPDATE Student:            update,0000,Vince Burato,Barangay 1,20");
		System.out.println("DELETE Student:            delete,1111");
		System.out.println("SEARCH Student:            search,1111");
		System.out.println("GET ALL Student:           all");
		System.out.println("ENROLL Student:            enroll,1111,IT123");
		System.out.println("EXIT (back to Main Menu):  exit");
		System.out.println("--------------------STUDENT MENU--------------------");
		System.out.print("Choice: ");
		String choice = scan.nextLine();
		
		String[] input = choice.split(",");
		String command = input[0].trim();
		
		switch (command.toLowerCase()) {
		case "add":
			String aID = input[1];
			String aName = input[2];
			String aAddress = input[3];
			String aAge = input[4];
			
			studentCon.add(aID, aName, aAddress, aAge);
			break;
			
		default:
			System.out.println("Error");
			break;
		}
	}

}
