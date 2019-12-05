package Main;
	
import java.awt.MenuBar;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			MenuBar menuBar = new MenuBar();
			final String os = System.getProperty("os.name");
			if (os != null && os.startsWith("Mac"));
			
			final Menu menu1 = new Menu("File");
		    final Menu menu2 = new Menu("Options");
		    final Menu menu3 = new Menu("Help");
		   			
			
			
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../View/MainView.fxml"));
			Scene scene = new Scene(root,400,400);
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