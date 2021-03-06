package Controller;

import Model.DataModel;
import Model.Medication;
import Model.Patient;
import Model.PersonalMedication;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MainViewController {


    @FXML
    public Button medicationbutton, weeklyplanbutton, importbutton, exportbutton, prescribeButton;

    @FXML
    public CheckBox monday, tuesday, wednesday, thursday, friday, saturday, sunday;

    @FXML
    public ListView<Patient> patientView;

    @FXML
    public ListView<Medication> medicationList;

    private DataModel model;

    public void initModel(DataModel model) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model;
        patientView.setItems(model.getPatients());
        medicationList.setItems((model.getMedications()));
        System.out.println("Model init overview controller");
    }

    /**
     * Handles the Medicaiton ListView Observable
     */
    @FXML
    public void handleMedicationButton() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/MedicationView.fxml"));
        Parent root;
        Stage stage;
        MedicationController medicationController;
        try {
            root = fxmlLoader.load();
            stage = new Stage();

            medicationController = fxmlLoader.getController();
            medicationController.initModel(model);

            setSceneMethod(root, stage);
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
    }

    /**
     * Handles the Weekly Buttong Submit Medication
     */
    @FXML
    public void handleWeekPlanButton() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/WeekPlanView.fxml"));
        Parent root;
        Stage stage;
        WeekPlanViewController weekPlanViewController;
        try {
            root = fxmlLoader.load();
            stage = new Stage();

            weekPlanViewController = fxmlLoader.getController();
            weekPlanViewController.initModel(model);

            setSceneMethod(root, stage);
        } catch (IOException e) {
            System.err.println("Error");
        }
    }

    /**
     * Handles the add Patient BUtton
     */
    @FXML
    public void handleAddPatientButton() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/AddPatientView.fxml"));
        Parent root;
        Stage stage;
        AddPatientController addPatientController;
        try {
            root = fxmlLoader.load();
            stage = new Stage();

            addPatientController = fxmlLoader.getController();
            addPatientController.initModel(model);

            setSceneMethod(root, stage);
        } catch (IOException e) {
            System.err.println("Error");
        }
    }

    /**
     * Handles the Prescription Button
     */
    @FXML
    public void handlePrescribeButton() {
        String tempPatient;
        String tempMedication;
        String[] names;
        PersonalMedication personalMedication;

        ArrayList<String> weekdays = new ArrayList<>();
        checkWeekdays(weekdays);

        tempPatient = patientView.getSelectionModel().getSelectedItem().getName();
        tempMedication = medicationList.getSelectionModel().getSelectedItem().getName();

        names = tempPatient.split(" ");

        personalMedication = new PersonalMedication(names[0], names[1]);
        personalMedication.addPrescribedDays(weekdays, tempMedication);

        model.addPrescribtion(personalMedication);
    }

    /**
     * Handles the Import CSV Patients Plan Button
     */
    @FXML
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

        for (Patient patient : inputList) {
            model.addPatient(patient);
        }
    }

    /**
     * Handles the Weekly Plan Export button
     */
    @FXML
    public void handleExportButton() {

        FileChooser fs = new FileChooser();
        fs.setTitle("Export to CSV File");
        fs.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV", "*.csv"));
        File file = fs.showSaveDialog(new Stage());
        
        //System.out.println(model.getPatients());

        List<Patient> pats = model.getPatients();
        List<PersonalMedication> meds = model.getPrescribtions();

        System.out.println(meds);

        try {
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());

            for (int i = 0; i < meds.size(); i++) {
                fileWriter.append(meds.get(i).toString());
                fileWriter.append(System.lineSeparator());
            }
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


       // System.out.println(pats);
    }

    /**
     * ArrayList with the days of the week in it.
     * @param weekdays
     */

    private void checkWeekdays(ArrayList<String> weekdays) {
        if (monday.isSelected())
            weekdays.add("Monday");
        if (tuesday.isSelected())
            weekdays.add("Tuesday");
        if (wednesday.isSelected())
            weekdays.add("Wednesday");
        if (thursday.isSelected())
            weekdays.add("Thursday");
        if (friday.isSelected())
            weekdays.add("Friday");
        if (saturday.isSelected())
            weekdays.add("Saturday");
        if (sunday.isSelected())
            weekdays.add("Sunday");
    }

    private void setSceneMethod(Parent root, Stage stage) {
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(root));
        stage.show();
    }
}
