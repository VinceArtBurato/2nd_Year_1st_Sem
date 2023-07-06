package burato;

import java.util.Scanner;

//class GradesMenu
	public class GradesMenu {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		MainMenu mainMenu;
		StudentController studcon; //each classes declared objects
		GradesController gradescon;
		
		//Generated constructor from superclass with parameter to store data 
		public GradesMenu(MainMenu mainMenu, SubjectController subcon, StudentController studcon,GradesController gradescon) {
			this.mainMenu=mainMenu;
			this.studcon=studcon;
			this.gradescon=gradescon;
		}
		
		//Method to be accessed in MainMenu class
		public void showMenu()
		{
			System.out.println("\n\n=================================GRADES MENU=================================");
			System.out.println("Give Student Grades     -->  (example: give,1111,T123,1.5)");
			System.out.println("Update Student Grades   -->  (example: update,1111,T123,2.0)");
			System.out.println("EXIT             		-->  (Go to Main Menu)");
			System.out.println("-----------------------------------GRADES MENU----------------------------------");
			System.out.print("Input Command: ");
			
			String input = scan.nextLine();
			String[] inputarr = input.split(",");

			switch(inputarr[0].toLowerCase().trim())
			{
				//using switch cases to call the methods in classes
				case "give":
					if (inputarr[1] == "" || inputarr[2] == "" || inputarr[3] == "") {
						System.out.println("\nIncomplete Input!");
						showMenu();
					}
					studcon.giveStudentGrades(inputarr[1], inputarr[2], inputarr[3]);
					showMenu();
					break;
				case "update": 
					studcon.updateGrade(inputarr[1], inputarr[2], inputarr[3]);
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
