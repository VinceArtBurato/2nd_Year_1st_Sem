package burato;

import java.util.LinkedList;

//class SubjectController, all the action is executing in this class
public class SubjectController  implements SubjectMethods{
	
	//Linkedlist of subject so that the properties will be used
	LinkedList<Subject> subjectList = new LinkedList<Subject> ();
	
	//The constructor from the SubjectMethods, the input data is manipulated in this constructors for add method 
	@Override
	public Subject add(Subject s) {
		Subject temp = getSubject(s.getId());
		if (temp != null) {
			System.out.println("\nFailed adding Subject! Subject already exist.");
		
		} else {
			subjectList.add(s);
		}
		return s;
	}

	//The constructor from the SubjectMethods, the input data is manipulated in this constructors for update method 
	@Override
	public Subject update(Subject s) {
		for (Subject temp : subjectList) {
			if (temp.getId().trim().equalsIgnoreCase(s.getId())) {
				int index = subjectList.indexOf(temp);
				System.out.println(index);
				subjectList.set(index, s);
				break;
			}
		}
		System.out.println("\nSubject Updated!");
		return null;
	}

	//The constructor from the SubjectMethods, the input data is manipulated in this constructors for delete method 
	@Override
	public Subject delete(Subject s) {
		subjectList.remove(s);
		return s;
	}

	//The constructor from the SubjectMethods, the input data is manipulated in this constructors for getSubject method 
	@Override
	public Subject getSubject(String id) {
		Subject s = null;
		for (Subject temp : subjectList) {
			if (temp.getId().trim().equalsIgnoreCase(id)) {
				s = temp;
				break;
			}
		}
		return s;
	}
	
	//The constructor from the SubjectMethods, the input data is manipulated in this constructors for getAllSubject method 
	@Override
	public void getAllSubject() {
		System.out.println("\n\n================================SUBJECT LIST=================================");
		System.out.println(String.format("%-25s %-25s", "Subject Code", "Subject Description"));
		System.out.println("------------------------------------------------------------------------------");
		for (Subject s : subjectList) {
			System.out.println(String.format("%-25s %-25s", s.getId(), s.getName()));
		}
		
	}
	
	//The constructor from the SubjectMethods, the input data is manipulated in this constructors for showSubject method 
	@Override
	public void showSubject(Subject s) {
		if (s != null) {
			System.out.println("\n\n=============================SUBJECT INFORMATION=============================");
			System.out.println(String.format("%-25s %-25s", "Subject", "Description"));
			System.out.println("------------------------------------------------------------------------------");
			System.out.println(String.format("%-25s %-25s", s.getId(), s.getName()));
		}
		
	}
	public void isExist(Subject s) {
		if (s == null) {
			System.out.println("\nSubject Code not found!");
		}
	}

	

}