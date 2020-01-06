package Model;

public class Person {

    private String address;
    private String gender;
    private String name;
    private String surname;
    private int age;

    /**
     * Constructor for Person
     * @param name name
     * @param surname surname
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * Constructor for Person
     * @param name name
     * @param surname surname
     * @param age age
     * @param address address
     * @param gender gender
     */
    public Person(String name, String surname, int age, String address, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    /**
     * toString for Person
     * @return toString for Person
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Age: " + age + ", Gender: " + gender + ", Address: " + address;
    }

    /**
     * get Name
     * @return name
     */
    public String getName() {
        return name + " " + surname;
    }


}
