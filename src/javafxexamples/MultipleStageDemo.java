package javafxexamples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Stage secondaryStage = new Stage(); // Create a secondary stage

		// Create two scenes and place a button in each scene
		Scene scene1 = new Scene(new Button("Scene1 Button"), 300, 300);
		Scene scene2 = new Scene(new Button("Scene2 Button"), 300, 300);

		primaryStage.setTitle("Primary Stage"); // Set the stage title
		primaryStage.setScene(scene1); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		secondaryStage.setTitle("Secondary Stage"); // Set the second stage title
		secondaryStage.setScene(scene2); // Place the scene in the stage
		secondaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}
