package javafxexamples;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorld extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		int sceneWidth = 300;
		int sceneHeight = 300;
		
		// Create Text nodes
		Text text1 = new Text(0, 10, "Hello World1");
		Text text2 = new Text(0, 20, "Hello World2");
		Text text3 = new Text(0, 30, "Hello World3");
		text3.setFill(Color.BLUE);
		
		// Create a Root Node for our Scene Graph
		Group root = new Group();
		
		// Add the text nodes to our root node
		root.getChildren().add(text1);
		root.getChildren().add(text2);
		root.getChildren().add(text3);
		
		// Assigning the scene
		Scene scene = new Scene(root, sceneWidth, sceneHeight); // Must specify the root Node for the scene graph
		scene.setFill(Color.RED);
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
