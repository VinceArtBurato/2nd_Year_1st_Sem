package burato;

import java.util.LinkedList;

//class Student and its properties and states
public class Student {
	
	//properties of Student
	String id,name,address;
	int age;
	LinkedList<Subject> subjectList;
	
	//Generated constructor from superclass with parameter to store data 
	public Student(String id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter and setter of LinkedList subjectList
	public LinkedList<Subject> getSubjectList(){
		return subjectList;
	}
	public void setSubjectList(LinkedList<Subject> subjectList)
	{
		this.subjectList = subjectList;
	}
	
	//implementation of string
	public String toString() {
		return "Student: id: "+id+", name: "+name+", address: "+address+", age: "+age+".";
	}
}