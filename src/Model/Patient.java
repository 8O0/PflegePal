package Model;

public class Patient extends Person {

    private final String illness;

    public Patient(String surname, String name, int age, String illness) {
        super(name, surname, age);
        this.illness = illness;

    }

    public String toString() {
        return super.toString() + " Illness: " + illness;
    }
}