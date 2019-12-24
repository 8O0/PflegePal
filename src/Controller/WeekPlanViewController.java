package Controller;

import Model.DataModel;
import Model.Medication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class WeekPlanViewController {
    @FXML
    public Button returnButton;

    @FXML
    public TextField name;

    @FXML
    public ListView<Medication> medicationList;

    private DataModel model;

    public void initModel(DataModel model) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model;
        medicationList.setItems((model.getMedications()));
        System.out.println("Model init overview controller");
    }

    @FXML
    private void handleReturn() {
        Stage stage = (Stage) returnButton.getScene().getWindow();
        stage.close();
    }


}
