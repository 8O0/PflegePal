package Main;

import Controller.MainViewController;
import Model.DataModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Medication Plan");

        try {

            FXMLLoader loader = new FXMLLoader();
            BorderPane root = loader.load(getClass().getResource("../View/MainView.fxml"));
            Scene scene = new Scene(root, 800, 600);


            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}