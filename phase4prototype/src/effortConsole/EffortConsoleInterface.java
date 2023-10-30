package effortConsole;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
 
public class EffortConsoleInterface extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) {
    	try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("consolePrototypeGUI.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    	} catch(Exception e) {
			e.printStackTrace();
		}

    }
}