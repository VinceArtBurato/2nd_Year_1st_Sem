package burato;

import java.util.LinkedList;

//class StudentController, all the action is executing in this class
public class StudentController implements StudentMethods {
	
	//Linkedlist of student so that the properties will be used
	LinkedList<Student> studentList = new LinkedList<Student>();
	SubjectController subjectController;
	StudentMenu studentMenu;
	
	public StudentController() {
	}
	//Generated constructor from superclass with parameter to store data
	public StudentController(SubjectController subjectController) {
		this.subjectController = subjectController;
	}
	public SubjectController getSubjectController() {
		return subjectController;
	}
	
	public void setSubjectController(SubjectController subjectController) {
		this.subjectController = subjectController;
	}
	//The method from the StudentMethods, the input data is manipulated in this constructors for add method 
	@Override
	public Student add(Student s) {
		Student temp = getStudent(s.getId());
		if (temp != null) {
			System.out.println("\nFail to add student! Student already exist.");
		} else if (idHasLetter(s.getId())) {
			System.out.println("\nInvalid ID! ID should not have letter or special character");
		} else {
			studentList.add(s);
		}
		return s;
	}

	//Generated method from class with parameter to store data
	@Override
	public Student updateStudent(Student s) {
		for (Student temp : studentList) {
			if (temp.getId().trim().equalsIgnoreCase(s.getId())) {
				temp.setName(s.getName());
				temp.setAddress(s.getAddress());
				temp.setId(s.getId());
				temp.setAge(s.getAge());
				break;
			}
		}
		return s;
	}

	//Generated method  from class with parameter to store data
	@Override
	public Student delete(String id)
	{
		Student s=null;
		for(Student temp: studentList)
		{
			if(temp.id.equals(id))
			studentList.remove(temp);
			s=temp;
		}
	return s;
	}
	
	//The method  from the StudentMethods, the input data is manipulated in this constructors for getStudent method
	@Override
	public Student getStudent(String id) {
		Student s = null;
		for (Student temp : studentList) {
			if (temp.getId().trim().equalsIgnoreCase(id)) {
				s = temp;
				break;
			}
		}
		return s;
	}

	//The method  from the StudentMethods, the input data is manipulated in this constructors for getAllStudent method 
	//This method printed the data in console.
	@Override
	public void getAllStudent() {
		System.out.println("\n\n===================================STUDENT LIST====================================");
		System.out.println(String.format("%-25s %-25s %-25s %-25s", "Student ID", "Name", "Address", "Age"));
		System.out.println("-----------------------------------------------------------------------------------");
		for (Student s : studentList) {
			System.out.println(String.format("%-25s %-25s %-25s %-25s", s.getId(), s.getName(), s.getAddress(), s.getAge()));
		}

	}

	//The method  from the StudentMethods, the input data is manipulated in this constructors for showStudent method 
	//This method printed the data in console.
	@Override
	public void showStudent(Student s) {
		if (s != null) {
			System.out.println("\n\n================================STUDENT INFORMATION================================");
			System.out.println(String.format("%-25s %-25s %-25s %-25s", "Student ID", "Name", "Address", "Age"));
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(String.format("%-25s %-25s %-25s %-25s", s.getId(), s.getName(), s.getAddress(), s.getAge()));
			System.out.println("*********************************************************************************");
			System.out.println(String.format("%-25s %-25s", "Subject List", "Final Grades"));
			System.out.println("*********************************************************************************");
			LinkedList<Subject> subjectList = s.getSubjectList();
			if(subjectList!=null) {
				for(Subject sub: subjectList)
				{
					String grade = " ";
					if(sub.getGradesList()!=null)
					{
						grade = sub.getStudentGrades(s.getId());
					}
					System.out.printf("%-25s %-25s", sub.getId(), grade);
				}
			}
		}

	}
	
	//The method  from the StudentMethods, the input data is manipulated in this constructors for enroll method 
	@Override
	public void enroll(String studentID, String subjectID) {
		Student s=getStudent(studentID);
		if(s==null)
		{
			System.out.println("\nFail to add subject! Student not found.");
			return;
		}
		Subject subject = subjectController.getSubject(subjectID);
		if(subject==null)
		{
			System.out.println("\nFail to add subject! Subject not found.");
			return;
		}
		LinkedList<Subject> subjectList = s.getSubjectList();
		if(subjectList==null)
		{
			subjectList = new LinkedList<Subject>();
		}
		subjectList.add(subject);
		s.setSubjectList(subjectList);
		System.out.println("\nStudent Officially Enrolled!");
		return;
	}
	//The constructor from the StudentMethods, the input data is manipulated in this constructors for dropAllStudent method 
	public void dropAllStudent() {
		studentList = null;
	}
	
	//The constructor from the StudentMethods, the input data is manipulated in this constructors for giveStudentGrades method 
	public void giveStudentGrades(String studID,String subject, String grades) {
		Student s = getStudent(studID);
		if(s==null)
		{
			System.out.println("\nStudent not Found!");
			return;
		}
		
		LinkedList<Subject> subjectList = s.getSubjectList();
		if(subjectList==null)
		{
			System.out.println("\nStudent is not enrolled to any subject.");
			return;
		}
		boolean check=false;
		for(Subject sub: subjectList) {
			if(sub.getId().trim().equalsIgnoreCase(subject))
			{;
				Grades grade = new Grades(studID,subject,grades);
				LinkedList<Grades> gradesList = sub.getGradesList();
				if(gradesList==null)
					{
						gradesList = new LinkedList<Grades>();
					}
					gradesList.add(grade);
					sub.setGradesList(gradesList);
					s.setSubjectList(subjectList);
					System.out.println("\n\nSuccesfully Give Grades!");
					check=true;
			}
		}
		if(!check)
		{
			System.out.println("\nFail to give Grade! Student is not yet enrolled in this subject.");
			return;
		}
	}
	
	//the input data is manipulated in this constructors for updateGrade method 
	public void updateGrade(String studID,String subject, String grades)
	{
		Student s = getStudent(studID);
		if(s==null)
		{
			System.out.println("\nStudent not Found!");
			return;
		}
		LinkedList<Subject> subjectList = s.getSubjectList();
		if(subjectList==null)
		{
			System.out.println("\nStudent is not enrolled to any subject.");
			return;
		}
		boolean check=false;
		for(Subject sub: subjectList) {
			if(sub.getId().trim().equalsIgnoreCase(subject))
			{
				for(Grades g: sub.getGradesList())
				{
					if(g.getId().trim().equalsIgnoreCase(studID))
					{
						g.setGrade(grades);
						check=true;
						System.out.println("Grade Updated!");
						break;
					}
				}
			}
		}
		if(!check)
		{
			System.out.println("\nFail to give Grade! Student is not yet enrolled in this subject.");
		}
		System.out.println("Grade Updated!");
	}
	//the input data is manipulated in this constructors for idHasLetter method
	public boolean idHasLetter(String id) {
		boolean check = false;
		for (int i = 0; i < id.length(); i++) {
			if (Character.isLetter(id.charAt(i))|| !Character.isLetter(id.charAt(i)) && !Character.isDigit(id.charAt(i))) {
				check = true;
				break;
			}
		}
		return check;
	}

}