package javafxexamples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class JavafxCounter extends Application {
	// Create variable to store count
	private int counter = 0;

	@Override
	public void start(Stage primaryStage) {
		// Allocate controls
		Label countLabel = new Label("Count: ");
		TextField tfCount = new TextField("0");
		Button btnCount = new Button("Count");
		Button btnDecrement = new Button("Decrement");

		// Set Text Field to be non-editable
		tfCount.setEditable(false);

		// Register event handler using Lambda Expression (JDK 8)
		btnCount.setOnAction(event -> tfCount.setText(Integer.toString(++counter)));
		// Register event handler using Lambda Expression (JDK 8)
		btnDecrement.setOnAction(event -> tfCount.setText(Integer.toString(--counter)));

		// Create a scene graph of node rooted at a FlowPane
		FlowPane flow = new FlowPane();
		flow.setPadding(new Insets(15, 12, 15, 12)); // top, right, bottom, left
		flow.setVgap(10); // Vertical gap between nodes in pixels
		flow.setHgap(10); // Horizontal gap between nodes in pixels
		flow.setAlignment(Pos.CENTER); // Alignment
		flow.getChildren().addAll(countLabel, tfCount, btnCount, btnDecrement);

		// Setup scene and stage
		primaryStage.setScene(new Scene(flow, 400, 80));
		primaryStage.setTitle("JavaFX Counter");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
