package burato;

import java.util.LinkedList;

//class GradesController, all the action is executing in this class
public class GradesController implements GradesMethods{
	
	//Linkedlist of grades so that the properties will be used
	LinkedList<Grades> gradesList = new LinkedList<Grades> ();
	StudentController studcon;
	
	//Generated constructor from superclass with parameter to store data
	public GradesController(StudentController studcon) {
		this.studcon = studcon;
	}

	//The constructor from the GradesMethods, the input data is manipulated in this constructors for addGrades method 
	@Override
	public Grades addGrades(Grades g) {
		Grades temp = getGrades(g.getGrade());
		if (temp != null) {
			System.out.println("\nFailed to Add Grade! This Student subject is already Graded");
		}
		else {
			gradesList.add(g);
		}
		return g;
	}
	
	//The constructor from the GradesMethods, the input data is manipulated in this constructors for updateGrades method 
	@Override
	public Grades updateGrades(Grades g) {
		for (Grades temp :gradesList) {
			if (temp.getGrade()==(g.getGrade())) {
				int index = gradesList.indexOf(temp);
				System.out.println(index);
				gradesList.set(index, g);
			}
		}
		return null;
	}
	
	//Generated constructor from class with parameter to store data
	public Grades getGrades(String grade)
	{
		Grades g = null;
		for(Grades temp: gradesList)
		{
			if (temp.getGrade()==grade) {
				g = temp;
				break;
			}
		}
		return g;
	}
}