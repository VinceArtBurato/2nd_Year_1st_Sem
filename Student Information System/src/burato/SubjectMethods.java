package burato;

//interface of SubjectController to use the constructors of SubjectMethods interface
public interface SubjectMethods {
	
	//constructors
	public Subject add(Subject s);
	public Subject update(Subject s);
	public Subject delete(Subject s);
	public Subject getSubject(String id);
	public void getAllSubject();
	public void showSubject(Subject s);
}