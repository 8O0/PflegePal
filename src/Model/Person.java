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

	public Person(String name, String surname, int age) {
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
		return name + "," + surname + ", " + age + ", ";

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
}
