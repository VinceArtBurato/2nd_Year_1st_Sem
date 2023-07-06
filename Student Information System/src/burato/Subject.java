package burato;

import java.util.LinkedList;

//class Subjects and its properties and states
public class Subject {
	
	//properties of Subject
	String id,name;
	LinkedList<Grades> gradesList;
	
	//Generated constructor from superclass with parameter to store data
	public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//getters and setters of properties of Student
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//getter and setter of LinkedList subjectList
	public LinkedList<Grades> getGradesList(){
		return gradesList;
	}

	public void setGradesList(LinkedList<Grades> gradesList) {
		this.gradesList = gradesList;
	}

	//method to get the id
	public String getStudentGrades(String id){
		String s=" ";
		for(Grades g: gradesList)
		{
			if(g.getId().trim().equalsIgnoreCase(id))
			{
				s=g.getGrade();
			}
		}
		 return s;
	 }
	
}