package Model;

public class Person {
	
	private String name;
	private String surname;
	private String gender;
	private String address;
	int age;

	public Person(String name, String surname, int age, String gender, String address) {

		this.name = name; 
		this .surname = surname;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", gender=" + gender + ", address=" + address
				+ ", age=" + age + "]";
	}
	
	
	
}
