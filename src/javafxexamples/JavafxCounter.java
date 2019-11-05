package javafxexamples;

import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavafxCounter extends Application {
	// Build GUI top down - Nodes first
	private Label lbCount = null;
	private TextField tfCount = null;
	private Button btnCount = null;
//	private Button btnDecrement = null;
//	private Button btnReset = null;
	private FlowPane flow = null; // Root node (Usually layout node)
	private Scene scene1 = null; // Scene
	private int counter = 0; // Create variable to store count

	@Override
	public void start(Stage primaryStage) {
		// Allocate controls
		lbCount = new Label("Count: ");
		tfCount = new TextField("0");
		btnCount = new Button("Count");
//		btnDecrement = new Button("Decrement");
//		btnReset = new Button("Reset");
		flow = new FlowPane();
		scene1 = new Scene(flow);
//		scene1 = new Scene(flow, 300, 50); // Adjust width and height of scene

		// Configure Nodes
		tfCount.setEditable(false); // Set Text Field to be non-editable
		// Register button event handler using Lambda Expression (JDK 8)
		btnCount.setOnAction(event -> tfCount.setText(Integer.toString(++counter)));
//		btnDecrement.setOnAction(event -> tfCount.setText(Integer.toString(--counter)));
//		btnReset.setOnAction(event -> tfCount.setText(Integer.toString(counter=0)));
//		flow.setPadding(new Insets(15, 12, 15, 12)); // top, right, bottom, left
//		flow.setVgap(10); // Vertical gap between nodes in pixels
//		flow.setHgap(10); // Horizontal gap between nodes in pixels
//		flow.setAlignment(Pos.CENTER); // Align node to center of scene

		// Create a scene graph of node rooted at a FlowPane
		flow.getChildren().addAll(lbCount, tfCount, btnCount);
//		flow.getChildren().addAll(lbCount, tfCount, btnCount, btnDecrement, btnReset);

		// Setup scene and stage
		primaryStage.setScene(scene1);
//		primaryStage.setTitle("JavaFX Counter");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
