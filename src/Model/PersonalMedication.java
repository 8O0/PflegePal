package Model;

import java.util.ArrayList;

public class PersonalMedication extends Person {

    ArrayList<String> weekdays = new ArrayList<>();
    private String medication;

    /**
     * Constructor for PersonalMedication
     * @param name name
     * @param surname surname
     */
    public PersonalMedication(String name, String surname) {
        super(name, surname);
    }

    /**
     * toString method for Medications
     * @return toString for Personal Medication
     */
    public String toString() {
        return "Name: " + getName() + ", Days: " + weekdays.toString() +
                ", Medication: " + medication;
    }

    /**
     * get name from super class
     * @return name
     */
    public String getName() {
        return super.getName();
    }

    /**
     * Add Prescription Days
     * @param prescribedWeekdays Weekly Prescrption
     * @param prescribedMedication Medicine Prescription
     */
    public void addPrescribedDays(ArrayList<String> prescribedWeekdays, String prescribedMedication) {
        weekdays.addAll(prescribedWeekdays);
        medication = prescribedMedication;
    }

    /**
     * gets the day of the week.
     * @return Selected days of the week.
     */
    public String getWeekdays() {
        return weekdays.toString();
    }

    /**
     * gets the Medication
     * @return medication
     */
    public String getMedication() {
        return medication;
    }
}
