package burato;

import java.util.LinkedList;

//class Grades and its properties and states
public class Grades {
	
	//properties of Grades
	String id,code;
	String grade;
	LinkedList<Student> studentList;
	LinkedList<Subject> subjectList ;
	
	public LinkedList<Subject> getSubjectList() {
		return subjectList;
	}
	//getter and setter of LinkedList setsubjectList
	public void setSubjectList(LinkedList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	
	//Generated constructor from superclass with parameter to store data
	public Grades(String id, String code, String grade) {
		this.id = id;
		this.code = code;
		this.grade = grade;
	}
	
	//getters and setters of properties of Student
	public Grades(String grade) {
		
		this.grade = grade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public LinkedList<Student> getStudentList() {
		return studentList;
	}
	
	//getter and setter of LinkedList setStudentList
	public void setStudentList(LinkedList<Student> studentList) {
		this.studentList = studentList;
	}
	
	
}