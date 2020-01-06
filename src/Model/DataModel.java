package Model;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataModel {

    ObservableList<Patient> patients;
    ObservableList<Medication> medications;
    ObservableList<PersonalMedication> prescribedMedications;

    /**
     * Observable components needed to move data around.
     */
    public DataModel() {
        patients = FXCollections.observableArrayList();
        medications = FXCollections.observableArrayList();
        prescribedMedications = FXCollections.observableArrayList();
        System.out.println("Model was initialized");
    }

    /**
     * Add Patient to model
     * @param patient
     */
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient was added.");
    }

    /**
     * Add Medication to model
     * @param medication
     */
    public void addMedication(Medication medication) {
        medications.add(medication);
        System.out.println("Medication was added.");
    }

    /**
     * Add Prescription to model
     * @param personalMedication
     */
    public void addPrescribtion(PersonalMedication personalMedication) {
        prescribedMedications.add(personalMedication);
        System.out.println("Week plan medication was added.");
    }

    /**
     * Observable Patients
     * @return
     */
    public ObservableList<Patient> getPatients() {
        return this.patients;
    }

    /**
     * Obsercable Medications
     * @return
     */
    public ObservableList<Medication> getMedications() {
        return this.medications;
    }

    /**
     * Observable Prescriptions
     * @return
     */
    public ObservableList<PersonalMedication> getPrescribtions() {
        return this.prescribedMedications;
    }
}
