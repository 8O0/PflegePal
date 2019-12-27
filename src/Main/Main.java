package Main;

import Controller.MainViewController;
import Model.DataModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

//
public class Main extends Application {

    private BorderPane rootLayout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("CareGiver");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("../View/MainView.fxml"));

        try {
            rootLayout = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        DataModel model = new DataModel();
        MainViewController mainViewController = loader.getController();
        mainViewController.initModel(model);

        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
