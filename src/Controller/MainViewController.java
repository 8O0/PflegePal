package Controller;

import Model.DataModel;
import Model.Patient;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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



    private DataModel model;

    public void initModel(DataModel model){
        if (this.model != null){
    throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model;
patientView.setItems(model.getPatients());
        System.out.println("Model init overview controller");
    }



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
            AddPatientController addController =fxmlLoader.getController();
            addController.initModel(model);

            stage.initModality(Modality.APPLICATION_MODAL);

            stage.setScene(new Scene(root3));
            stage.show();
        } catch (IOException e) {
            System.err.println("Error");
        }

    }

    public void handleExportButton(){

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save CSV File");
        fileChooser.setInitialFileName("data");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("CSV Comma Separated Value", "*.csv"));

        String userDirectoryString = System.getProperty("user.home");
        File userDirectory = new File(userDirectoryString);

        fileChooser.setInitialDirectory(userDirectory);

        File chosenFile = fileChooser.showSaveDialog(null);
        String path;
        if(chosenFile != null){
            path = chosenFile.getPath();
        } else path = null;

        System.out.println(path);
    }


    public void handleImportButton() throws FileNotFoundException {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open CSV File");

        String userDirectoryString = System.getProperty("user.home");
        File userDirectory = new File(userDirectoryString);

        fileChooser.setInitialDirectory(userDirectory);

        File chosenFile = fileChooser.showOpenDialog(null);
        String path;
        if(chosenFile != null){
            path = chosenFile.getPath();
        } else path = null;

        System.out.println(path);

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(records);
    }

}
