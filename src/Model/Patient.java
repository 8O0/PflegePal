package Model;

import java.util.function.Function;

public class Patient extends Person {

    public static Function<String, Patient> mapToPatient = (line) -> {
        String[] p = line.split(", ");
        return new Patient(p[0], p[1], Integer.parseInt(p[2]), p[3]);
    };

    private String illness;

    public Patient(String surname, String name, int age, String illness) {
        super(name, surname, age);
        this.illness = illness;
    }

    public Patient(String name) {
        super(name);
    }

    public String toString() {
        return super.toString() + " Illness: " + illness;
    }

}