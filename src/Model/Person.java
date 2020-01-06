package Model;

public class Person {

    private String address;
    private String gender;
    private String name;
    private String surname;
    private int age;

    /**
     * Constructor for Person
     * @param name
     * @param surname
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * Constructor for Person
     * @param name
     * @param surname
     * @param age
     * @param address
     * @param gender
     */
    public Person(String name, String surname, int age, String address, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    /**
     * toString for PErson
     * @return
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Age: " + age + ", Gender: " + gender + ", Address: " + address;
    }

    /**
     * get Name
     * @return
     */
    public String getName() {
        return name + " " + surname;
    }


}
