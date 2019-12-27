package Model;

import java.util.ArrayList;

public class WeekPlanMedication extends Person {

    ArrayList<String> weekdays = new ArrayList<>();
    private String medication;

    public WeekPlanMedication(String name, String surname) {
        super(name, surname);
    }


    public String toString() {
        return "Name: " + getName() + ", Days: " + weekdays.toString() +
                ", Medication: " + medication;
    }

    public String getName() {
        return super.getName();
    }

    public void addPrescribedDays(ArrayList<String> prescribedWeekdays, String prescribedMedication) {
        weekdays.addAll(prescribedWeekdays);
        medication = prescribedMedication;
    }
}
