package Controller;

import Model.DataModel;
import Model.Patient;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddPatientController {

    @FXML
    public Button submitButton,cancelButton;

    @FXML
    public TextField firstname,lastname,age,illness, address;

    @FXML
    public RadioButton maleRadioButton, femaleRadioButton;

    private DataModel model;

    public void initModel(DataModel model) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model;
    }

    @FXML
    private void handleCancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void handleSubmit() {
        Patient patient = new Patient(firstname.getText(), lastname.getText(),Integer.valueOf(age.getText()).intValue(), illness.getText(), address.getText(), (maleRadioButton.isArmed()) ? "M" :  "F");
        model.addPatient(patient);
        Stage stage = (Stage) submitButton.getScene().getWindow();
        stage.close();
    }

    /*
    @FXML
    private void handleSubmit() {
        Patient patient = new Patient(firstname.getText(), lastname.getText(),Integer.valueOf(age.getText()).intValue(), illness.getText());
        model.addPatient(patient);
        Stage stage = (Stage) submitButton.getScene().getWindow();
        stage.close();
    }
*/
}