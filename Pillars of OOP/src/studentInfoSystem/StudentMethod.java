package studentInfoSystem;

public interface StudentMethod {
	
	public void add (String aID, String aName, String aAddress, String aAge);
	public void update(String uID, String uName, String uAddress, String uAge);
	public void delete(String dId);
	public void search(String sId);
	public void getAll();
	public void enroll(String eId, String eSubject);
	public void exit();
	public void printStudentList();

}
