package burato;

import java.util.Scanner;

// class Student Menu
public class StudentMenu {
	
	Scanner scan = new Scanner(System.in).useDelimiter("\n");
	MainMenu mainMenu;		//each classes declared objects
	StudentController sc;
	
	//Generated constructor from superclass with parameter to store data 
	public StudentMenu(MainMenu mainMenu, StudentController studcon) {
		this.mainMenu = mainMenu;
		this.sc = studcon;
	}
	
	//Method to be accessed in MainMenu class
	public void showMenu()
	{
		System.out.println("\n\n=================================STUDENT MENU=================================");
		System.out.println("Add Student      -->  (example: add,1111,VinceBurato,BarangayUno,20)");
		System.out.println("Update Student   -->  (example: update,1111,ArtMalaque,BarangayTres,19)");
		System.out.println("Delete Student   -->  (example: delete,1111)");
		System.out.println("Search Student   -->  (example: search,1111)");
		System.out.println("Get all Student  -->  (example: all)");
		System.out.println("Enroll Student   -->  (example: enroll,1111,T123)");
		System.out.println("EXIT             -->  (Go to Main Menu)");
		System.out.println("-----------------------------------STUDENT MENU---------------------------------");
		System.out.print("Input Command: ");
		
		String input = scan.nextLine();
		String[] inputarr = input.split(",");
		
		Student s;
		switch(inputarr[0].toLowerCase().trim())
		{
			//using switch cases to call the methods in classes
			case "add":
				if (inputarr[1].trim().length() <=0 || inputarr[2].trim().length() <=0 || inputarr[3].trim().length() <=0 || inputarr[4].trim().length() <=0) {
					System.out.println("\nIncomplete Input!");
					showMenu();
				}
				s = new Student(inputarr[1].toLowerCase().trim(),inputarr[2].toLowerCase().trim(),inputarr[3].toLowerCase().trim(),Integer.parseInt(inputarr[4].toLowerCase().trim()));
				sc.add(s);
				sc.getAllStudent();
				showMenu();
				break;
			case "update": 
				s = new Student(inputarr[1],inputarr[2],inputarr[3],Integer.parseInt(inputarr[4]));
				sc.updateStudent(s);
				sc.getAllStudent();
				showMenu();
				break;
			case "delete": 
				sc.delete(inputarr[1]);
				sc.getAllStudent();
				showMenu();
				break;
			case "search":
				s = sc.getStudent(inputarr[1]);
				sc.showStudent(s);
				showMenu();
				break;
			case "all":
				sc.getAllStudent();
				showMenu();
				break;
			case "enroll":
				sc.enroll(inputarr[1], inputarr[2]);
				showMenu();
				break;
			case "exit":
					mainMenu.showMenu();
				break;
			default:
				System.out.println("\nInvalid Input!");
				showMenu();
				break;

		}
	}
}

