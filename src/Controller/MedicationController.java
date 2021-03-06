package Controller;

import Model.DataModel;
import Model.Medication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MedicationController {

    @FXML
    public Button submitButton, cancelButton;

    @FXML
    public ListView<Medication> medicationList;

    @FXML
    public TextField medicationName, amount;

    @FXML
    public TextArea medicationComment;

    private DataModel model;

    /**
     * Initiates Model in Medication Controller
     * @param model Model
     */
    public void initModel(DataModel model) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model;
        medicationList.setItems(model.getMedications());
        System.out.println("Model init overview controller");
    }

    /**
     * Handles Cancel Button and closes Scene
     */
    @FXML
    private void handleCancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    /**
     * Handles Submission of Medication
     */
    @FXML
    private void handleSubmit() {
        Medication medication = new Medication(medicationName.getText(), amount.getText(), medicationComment.getText());
        model.addMedication(medication);
        submitButton.getScene().getWindow();
    }
}
