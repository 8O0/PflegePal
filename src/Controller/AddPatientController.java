package Controller;

import Model.DataModel;
import Model.Patient;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddPatientController {

    /* Remember: Same names as the corresponding fx:id in SceneBuilder */
    @FXML
    public Button submitButton;
    @FXML
    public Button cancelButton;
    @FXML
    public TextField firstname;
    @FXML
    public TextField lastname;
    @FXML
    public TextField age;
    @FXML
    public TextField illness;

    /* Contains the data model for the Happy Children Healthcare */
    private DataModel model;

    public void initModel(DataModel model) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model;
    }

    /*
     * Called when the user clicks "Cancel".
     */
    @FXML
    private void handleCancel() {
        /* Close the window */
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    /*
     * Called when the user clicks "Submit".
     */
    @FXML
    private void handleSubmit() {
        /* Create patient from relevant fields in the form and the parent */
        Patient patient = new Patient(firstname.getText(), lastname.getText(),age.getText(), illness.getText());
        /* Add patient to the ObservableList in the Model */
        model.addPatient(patient);
        /* Close the window, so we get back to overview */
        Stage stage = (Stage) submitButton.getScene().getWindow();
        stage.close();
    }

}