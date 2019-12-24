package Model;

import java.util.function.Function;

public class Patient extends Person {

    private final String illness;

    public Patient(String name, String surname, int age, String illness) {
        super(name, surname, age);
        this.illness = illness;

    }

    public String toString() {
        return super.toString() + illness;
    }

    public static Function<String, Patient> mapToPatient = (line) -> {
        String[] p = line.split(", ");
        return new Patient(p[0], p[1], Integer.parseInt(p[2]), p[3]);
    };

    public String getIllness() {
        return illness;
    }
}