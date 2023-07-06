package burato;

import java.util.Scanner;

//class GradesMenu
public class SubjectMenu {
	Scanner scan = new Scanner(System.in).useDelimiter("\n");
	MainMenu mainMenu;		//each classes declared objects
	SubjectController sc;
	
	//Generated constructor from superclass with parameter to store data 
	public SubjectMenu(MainMenu mainMenu, SubjectController subcon) {
		this.mainMenu=mainMenu;
		this.sc = subcon;
	}
	
	//Method to be accessed in MainMenu class
	public void showMenu()
	{
		System.out.println("\n\n=================================SUBJECT MENU=================================");
		System.out.println("Add Subject       -->  (example: add,T123,OOP)");
		System.out.println("Update Subject    -->  (example: update,T123,Data Structure)");
		System.out.println("Delete Subject    -->  (example: delete,T123)");
		System.out.println("Search Subject    -->  (example: search,T123)");
		System.out.println("Get all Subject   -->  (example: all)");
		System.out.println("EXIT              -->  (Go to Main Menu)");
		System.out.println("-----------------------------------SUBJECT MENU----------------------------------");
		System.out.print("Input Command: ");
		
		String input = scan.nextLine();
		String[] inputarr = input.split(",");
		Subject s;
		switch(inputarr[0].toLowerCase().trim())
		{
			//using switch cases to call the methods in classes
			case "add":
				s = new Subject(inputarr[1],inputarr[2]);
				if (inputarr[1].trim().length() <=0 || inputarr[2].trim().length() <=0) {
					System.out.println("\nIncomplete Input!");
					showMenu();
				}
				sc.add(s);
				sc.getAllSubject();
				showMenu();
				break;
			case "update": 
				s = new Subject(inputarr[1],inputarr[2]);
				sc.update(s);
				sc.getAllSubject();
				showMenu();
				break;
			case "delete": 
				s = sc.getSubject(inputarr[1]);
				sc.isExist(s);
				sc.delete(s);
				sc.getAllSubject();
				showMenu();
				break;
			case "search":
				if(inputarr.length==2) {
					s = sc.getSubject(inputarr[1]);
					sc.showSubject(s);
				}
				showMenu();
				break;
			case "all":
				sc.getAllSubject();
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