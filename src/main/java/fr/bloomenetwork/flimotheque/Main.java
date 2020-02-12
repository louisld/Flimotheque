package fr.bloomenetwork.flimotheque;

import com.goxr3plus.fxborderlessscene.borderless.BorderlessScene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Testing the application to see if it works
 * 
 * @author GOXR3PLUS
 *
 */
public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
		Parent root = (Parent)loader.load();
		
		BorderlessScene scene = new BorderlessScene(primaryStage, StageStyle.UNDECORATED, root, 250, 250);
		primaryStage.setScene(scene);
		
		HBox topbar = (HBox) loader.getNamespace().get("topbar");
		Button close = (Button) loader.getNamespace().get("close");
		Button maximize = (Button) loader.getNamespace().get("maximize");
		Button minimize = (Button) loader.getNamespace().get("minimize");
		
		scene.removeDefaultCSS();
		scene.setMoveControl(topbar);
		close.setOnAction(a -> primaryStage.close());
		maximize.setOnAction(a -> scene.maximizeStage());
		minimize.setOnAction(a -> primaryStage.setIconified(true));
		scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
		
		primaryStage.setTitle("Flimothèque");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}