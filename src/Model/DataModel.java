package Model;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataModel {

    ObservableList<Patient> patients;
    ObservableList<Medication> medications;

    public DataModel() {
        patients = FXCollections.observableArrayList();
        medications = FXCollections.observableArrayList();
        System.out.println("Model was initialized");


    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient was added.");
    }

    public void addMedication(Medication medication) {
        medications.add(medication);
        System.out.println("Medication was added.");
    }

    public ObservableList<Patient> getPatients() {
        return this.patients;
    }

    public ObservableList<Medication> getMedications() {
        return this.medications;
    }
}
