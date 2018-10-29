package javafxexamples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Stage secondaryStage = new Stage(); // Create a secondary stage

		Button button1 = new Button("Open Secondary Stage");

		// Create two scenes and place a button in each scene
		Scene scene1 = new Scene(button1, 300, 300);
		Scene scene2 = new Scene(new Button("Scene2 Button"), 250, 250);

		primaryStage.setTitle("Primary Stage"); // Set the stage title
		primaryStage.setScene(scene1); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		secondaryStage.setTitle("Secondary Stage"); // Set the second stage title
		secondaryStage.setScene(scene2); // Place the scene in the stage
		button1.setOnAction(event -> secondaryStage.show());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
