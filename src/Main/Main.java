package Main;
	
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

import java.io.File;
import java.net.URL;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			URL url = new File("/home/abel/IdeaProjects/btx8052-mini-project/src/View/MainView.fxml").toURI().toURL();
			Parent root = FXMLLoader.load(url);
			//BorderPane root = FXMLLoader.load(getClass().getClassLoader().getResource());
			Scene scene = new Scene(root,800,600);
			primaryStage.setTitle("Medication Plan");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}