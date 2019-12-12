package Controller;

import Model.Patient;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {


    @FXML
    public Button medicationbutton;

    @FXML
    public Button weeklyplanbutton;

    @FXML
    public Button addpatientbutton;

    @FXML
    public Button importbutton;

    @FXML
    public Button exportbutton;

    @FXML
    public ListView<Patient> patientView;


    public void handleMedicationButton() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/MedicationView.fxml"));
        Parent root2;
        try {
            root2 = fxmlLoader.load();
            Stage stage = new Stage();

            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root2));
            stage.show();
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }

    }


    public void handleWeekPlanButton() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/WeekPlanView.fxml"));
        Parent root1;
        try {
            root1 = fxmlLoader.load();
            Stage stage = new Stage();

            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException e) {
            System.err.println("Error");
        }

    }

    public void handleAddPatientButton() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/AddPatientView.fxml"));
        Parent root3;
        try {
            root3 = fxmlLoader.load();
            Stage stage = new Stage();

            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root3));
            stage.show();
        } catch (IOException e) {
            System.err.println("Error");
        }

    }

}
