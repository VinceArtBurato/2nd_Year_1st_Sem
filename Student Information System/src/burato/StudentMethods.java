package burato;

//interface of StudentController to use the constructors of StudentMethods interface
public interface StudentMethods {
	
	//constructors
	public Student add(Student s);
	public Student updateStudent(Student s);
	public Student delete(String id);
	public Student getStudent(String id);
	public void getAllStudent();
	public void showStudent(Student s);
	public void enroll(String studentID, String subjectID);
	
}