package javafxexamples;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloWorld extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Setting the title for the primary Stage
		primaryStage.setTitle("Title for Primary Stage");	
		// Show the primary stage
		primaryStage.show();
	}
	
	// We must launch the JavaFX Application in the main method.
	public static void main(String[] args) {
		launch(args);
	}

}
