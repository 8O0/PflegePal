package Controller;

import Model.DataModel;
import Model.Medication;
import Model.Patient;
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

public class WeekPlanViewController {
        @FXML
        public Button OkButton;

        @FXML
        public Button CancelButton;

        @FXML
        public ListView<Medication> medicationView;


        /* Contains the data model for the Happy Children Healthcare */
        private DataModel model;

        public void initModel(DataModel model) {
            if (this.model != null) {
                throw new IllegalStateException("Model can only be initialized once");
            }
            this.model = model;
            medicationView.setItems(model.getMedications());
            System.out.println("Model init overview controller");
        }






}
