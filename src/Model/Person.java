package Model;

public class Person {

	private String name;
	private String surname;
	private String gender;
	private String address;
	private String age;

	public Person(String surname, String name, String age, String gender, String address) {

		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public Person(String surname, String name, String age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	/*
        @Override
        public String toString() {
            return "Person [name=" + name + ", surname=" + surname + ", gender=" + gender + ", address=" + address
                    + ", age=" + age + "]";
        }
    */
	@Override
	public String toString() {
		return "Name: " + name + ", Surname: " + surname + ", Age: " + age + ", ";

	}
}
