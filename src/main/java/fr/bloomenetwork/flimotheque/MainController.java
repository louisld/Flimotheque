package fr.bloomenetwork.flimotheque;


import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;

public class MainController {

	@FXML
	private HBox topbar;
	@FXML
	private Button close;
	@FXML
	private Button maximize;
	@FXML
	private Button minimize;

	public void initialize() {
		//Topbar icons
		Region closeIcon = new Region();
		closeIcon.getStyleClass().add("close-icon");
		close.setGraphic(closeIcon);
		Region maximizeIcon = new Region();
		maximizeIcon.getStyleClass().add("maximize-icon");
		maximize.setGraphic(maximizeIcon);
		Region minimizeIcon = new Region();
		minimizeIcon.getStyleClass().add("minimize-icon");
		minimize.setGraphic(minimizeIcon);
	}

}
