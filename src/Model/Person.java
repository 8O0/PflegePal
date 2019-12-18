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

	public Person(String name, String surname, int age) {
		this.name=name;
		this.surname=surname;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", gender=" + gender + ", address=" + address
				+ ", age=" + age + "]";
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Person person = (Person) o;

		if (!name.equals(person.name)) return false;
		if (!surname.equals(person.surname)) return false;
		return gender.equals(person.gender);
	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + surname.hashCode();
		result = 31 * result + gender.hashCode();
		return result;
	}
}
