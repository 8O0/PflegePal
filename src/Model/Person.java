package Model;

public class Person {

    private String address;
    private String gender;
    private String name;
    private String surname;
    private int age;

    /*
        public Person(String surname, String name, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }
    */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String address, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Age: " + age + ", Gender: " + gender + ", Address: " + address;
    }

    public String getName() {
        return name + " " + surname;
    }


}
