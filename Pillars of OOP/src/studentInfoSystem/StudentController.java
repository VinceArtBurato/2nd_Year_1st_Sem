package studentInfoSystem;

import java.util.LinkedList;

public class StudentController implements StudentMethod{
	
	LinkedList<String> id = new LinkedList<String>();
	LinkedList<String> name = new LinkedList<String>();
	LinkedList<String> address = new LinkedList<String>();
	LinkedList<String> age = new LinkedList<String>();
	
	StudentMenu studentMenu = new StudentMenu();

	@Override
	public void add(String aID, String aName, String aAddress, String aAge) {
		for (int i = 0; i < id.size(); i++) {
			if (aID == id.get(i)) {
				System.out.println("Failed! Student already exist.");
			}
			studentMenu.showStudentMenu();
		}
		
		id.add(aID);
		name.add(aName);
		address.add(aAddress);
		age.add(aAge);
		
		printStudentList();
	}

	@Override
	public void update(String uID, String uName, String uAddress, String uAge) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String dId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(String sId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enroll(String eId, String eSubject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStudentList() {
		System.out.println("\n\nSTUDENT LIST\n");
		System.out.println(String.format("%-15s %-15s %-15s %-15s", "Student ID", "Name", "Address", "Age"));
		System.out.println("--------------------------------------------------------------");
		
		for (int i = 0; i < id.size(); i++) {
			System.out.println(String.format("%-15s %-15s %-15s %-15s", id.get(i), name.get(i), address.get(i), age.get(i)));
		}
		studentMenu.showStudentMenu();
	}

}
