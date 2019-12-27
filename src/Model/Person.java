package Model;

public class Person {

	private String name;
	private String surname;
	private String gender;
	private String address;
	private int age;

	public Person(String surname, String name, int age, String gender, String address) {

		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public Person(String surname, String name, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Surname: " + surname + ", Age: " + age;
	}

	public String getName() {
		return name +", "+ surname;
	}
}
