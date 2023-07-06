package burato;

import java.util.Scanner;

//class Main menu
public class MainMenu {
	Scanner scan = new Scanner(System.in);
	SubjectController subcon; 
	StudentController studcon;
	GradesController gradescon; //each classes declared objects
	StudentMenu studentMenu;
	SubjectMenu subjectMenu;
	GradesMenu gradesMenu;
	
	//Generated constructor from superclass with parameter to store data 
	public MainMenu(SubjectController subcon, StudentController studcon,GradesController gradescon) {
		this.subcon = subcon;
		this.studcon = studcon;
		this.gradescon = gradescon;
		this.subjectMenu = new SubjectMenu(this,subcon);
		this.studentMenu = new StudentMenu(this,studcon);
		this.gradesMenu = new GradesMenu(this,subcon,studcon,gradescon);
	}
	
	//Method to be accessed in Main class
	public void showMenu()
	{
		System.out.println("\n\n=================================MAIN MENU==================================");
		System.out.println("1.Student Menu");
		System.out.println("2.Subject Menu");
		System.out.println("3.Grades Menu");
		System.out.println("4.Exit");
		System.out.println("---------------------------------MAIN MENU----------------------------------");
		System.out.print("Select Choice: ");
		
		String input = scan.nextLine(); 
		switch(input) 
		{
			//using switch cases to call the methods in classes
			case "1": 
				studentMenu.showMenu();
				break;
			case "2": 
				subjectMenu.showMenu();
				break;
			case "3": 
				gradesMenu.showMenu();
				break;
			case "4": 
				System.out.println("\nSystem Terminated");
				break;
		   default: 
				System.out.println("\nInvalid Input!");
				showMenu();
				break;
		}
	}

}
