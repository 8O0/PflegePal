package Model;

public class Person {

    private String address;
    private String gender;
    private String name;
    private String surname;
    private int age;

    /**
     * Main Constructor for Person
     * @param name The name of a Person
     * @param surname The Surname of a Person
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * Second Constructor for Person
     * @param name The Name of a Person
     * @param surname The Surname of a Person
     * @param age The Age of a Person
     * @param address The Address of a Person
     * @param gender The Gender of a Person
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
     * @return The name of a person
     */
    public String getName() {
        return name + " " + surname;
    }


}
