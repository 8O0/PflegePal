package Controller;

import Model.DataModel;
import Model.Medication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MedicationController {

    @FXML
    public Button SubmitButton;

    @FXML
    public Button CancelButton;

    @FXML
    public ListView<Medication> medicationList;

    @FXML
    public TextField name;

    @FXML
    public TextField amount;


    /* Contains the data model for the Happy Children Healthcare */
    private DataModel model ;

    public void initModel(DataModel model) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model;
        medicationList.setItems((model.getMedications()));
        System.out.println("Model init overview controller");
    }

    @FXML
    private void handleCancel() {
        /* Close the window */
        Stage stage = (Stage) CancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void handleSubmit() {

        Medication medication = new Medication(name.getText(), amount.getText());

        model.addMedication(medication);


        Stage stage = (Stage) SubmitButton.getScene().getWindow();
        stage.close();
    }





}
