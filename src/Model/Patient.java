package Model;

import java.util.function.Function;

public class Patient extends Person {

    private final String illness;

    public Patient(String surname, String name, int age, String illness) {
        super(name, surname, age);
        this.illness = illness;

    }

    public String toString() {
        return super.toString() + " Illness: " + illness;
    }

    public static Function<String, Patient> mapToPatient = (line) -> {
        String[] p = line.split(", ");
        return new Patient(p[0], p[1], Integer.parseInt(p[2]), p[3]);
    };
    
}