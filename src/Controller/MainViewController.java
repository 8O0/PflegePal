package Controller;

import Model.DataModel;
import Model.Medication;
import Model.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

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

    @FXML
    public ListView<Medication> medicationList;

    private DataModel model;


    public void handleMedicationButton() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/MedicationView.fxml"));
        Parent root2;
        try {
            root2 = fxmlLoader.load();
            Stage stage = new Stage();

            MedicationController medicationController = fxmlLoader.getController();
            medicationController.initModel(model);

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

    public void handleImportButton() {

        FileChooser fs = new FileChooser();
        fs.setTitle("Open CSV File");
        fs.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV", "*.csv"));
        File file = fs.showOpenDialog(new Stage());


        File filePath = file.getAbsoluteFile();

        System.out.println(filePath);

        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        List<Patient> inputList = bufferedReader.lines()
                .map(Patient.mapToPatient)
                .collect(toList());

        System.out.println(inputList);

        for (int i = 0; i < inputList.size(); i++) {
            model.addPatient(inputList.get(i));
        }

    }



    public void handleExportButton() {

        FileChooser fs = new FileChooser();
        fs.setTitle("Save CSV File");
        File file = fs.showSaveDialog(new Stage());



    }


    public void handleAddPatientButton(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/AddPatientView.fxml"));
        Parent root3;
        try {
            root3 = fxmlLoader.load();
            Stage stage = new Stage();
            AddPatientController addPatientController = fxmlLoader.getController();
            addPatientController.initModel(model);

            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root3));
            stage.show();
        } catch (IOException e) {
            System.err.println("Error");
        }


    }

    public void initModel(DataModel model) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model;
        patientView.setItems(model.getPatients());
        medicationList.setItems((model.getMedications()));
        System.out.println("Model init overview controller");
    }
}
