package Model;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataModel {
	
	ObservableList<Patient> patients;
	ObservableList<Medication> medications;
	
	public DataModel() {
		patients = FXCollections.observableArrayList();
		System.out.println("Model was initialized");
	}
	
	public void addPatient(Patient p) {
		patients.add(p);
		System.out.println("Patient was added.");
		
	}
	
	public ObservableList<Patient> getList() {
		return this.patients;
	}
	
}
