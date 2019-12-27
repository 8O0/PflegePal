package Controller;

import Model.DataModel;
import Model.Patient;
import Model.WeekPlanMedication;
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
    public ListView<WeekPlanMedication> prescriptionList;

    private DataModel model;

    public void initModel(DataModel model) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model;
        prescriptionList.setItems(model.getPrescribtions());
        System.out.println("Model init overview controller");
    }

    @FXML
    private void handleReturn() {
        Stage stage = (Stage) returnButton.getScene().getWindow();
        stage.close();
    }
}
