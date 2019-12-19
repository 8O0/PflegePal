package Model;

public class Patient extends Person {

    private final String illness;

    public Patient(String surname, String name, String age, String illness) {
        super(name, surname, age);
        this.illness = illness;

    }

    public String toString() {
        return "Name: " + super.toString() + " Illness: " + illness;
    }
}