//Name: Burato, Vince Art | Section Code: T209 | Date: 10/27/2022
package burato;

//class Main
public class Main {
	public static void main(String[]args)
	{
		SubjectController subcon = new SubjectController(); //create object subcon
		StudentController studcon = new StudentController(subcon); //create object studcon with parameter subcon
		GradesController gradescon = new GradesController(studcon); //create object gradescon with parameter studcon
		MainMenu mainMenu = new MainMenu(subcon,studcon,gradescon); //create object mainMenu with parameter subcon, studcon, gradescon
		
		mainMenu.showMenu(); //using object mainMenu to use the method in MainMenu
	}

}