package Main;
	
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//
public class Main extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	@Override
	public void start(Stage primaryStage) {

		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("CareGiver");

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../View/MainView.fxml"));

		try {
			rootLayout = (BorderPane) loader.load();
		} catch (IOException e){
			e.printStackTrace();
		}

		Scene scene = new Scene(rootLayout);
		primaryStage.setScene(scene);

		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
