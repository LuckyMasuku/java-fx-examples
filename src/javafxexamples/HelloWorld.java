package javafxexamples;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorld extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a Text node
		Text text = new Text(0, 10, "Hello World");
		
		// Create a Root Node for our Scene Graph
		Group root = new Group();
		
		// Add the text node to our root node
		root.getChildren().add(text);
		
		// Assigning the scene
		Scene scene = new Scene(root); // Must specify the root Node for the scene graph
		// Setting the title for the primary Stage
		primaryStage.setTitle("Title for Primary Stage");	
		// Set the scene
		primaryStage.setScene(scene);
		// Show the primary stage
		primaryStage.show();
	}
	
	// We must launch the JavaFX Application in the main method.
	public static void main(String[] args) {
		launch(args);
	}

}
