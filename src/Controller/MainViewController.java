package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

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
	
	
	
	public void handleWeekPlanButton() {
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/WeekPlanView.fxml"));
		Parent root1;
		try {
			root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(new Scene(root1));
			stage.show();
		} catch (IOException e) {
			System.err.println("Error");
		}
				
	}
	
	

}
