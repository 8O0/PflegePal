package Controller;

import Model.DataModel;
import Model.Patient;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static java.lang.Boolean.TRUE;

public class AddPatientController {

    @FXML
    public Button submitButton, cancelButton;

    @FXML
    public TextField firstname, lastname, age, illness, address;

    @FXML
    public RadioButton maleRadioButton, femaleRadioButton;

    private DataModel model;

    /**
     * Model Initialization
     * @param model our model
     */
    public void initModel(DataModel model) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model;
    }

    /**
     * Closes stage
     */
    @FXML
    private void handleCancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    /**
     * Adds Patient to model
     */
    @FXML
    private void handleSubmit() {
        Patient patient = new Patient(firstname.getText(), lastname.getText(), Integer.parseInt(age.getText()), (isGender(maleRadioButton.isSelected(), femaleRadioButton.isSelected())), address.getText(), illness.getText());
        model.addPatient(patient);
        Stage stage = (Stage) submitButton.getScene().getWindow();
        stage.close();
    }

    /**
     * returns Gender
     * @param isMale
     * @param isFemale
     * @return
     */
    private String isGender(boolean isMale, boolean isFemale) {
        return (isMale == TRUE) ? "Male" : (isFemale == TRUE) ? "Female" : "Not disclosed";
    }
}

