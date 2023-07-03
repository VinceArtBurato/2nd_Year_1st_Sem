//Name: Burato, Vince Art | Section Code: T209 | Date: 11/17/2022
package practicalswing;

public class Student {
	
	private String id, name, address, age;

	public Student(String id, String name, String address, String age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}

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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
}
