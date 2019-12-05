package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import Model.Patient;

public class MainViewController {
	
	
	@FXML
	public Button medicationbutton;
	
	
	@FXML 
	public Button weeklyplanbutton;
	
	@FXML
	public Button importbutton;
	
	@FXML
	public Button exportbutton;
	
	@FXML
	public ListView<Patient> patientView;
	
	
	
	

}
