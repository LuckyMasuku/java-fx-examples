package javafxexamples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Creating a Text node object
		// A node is a visual/graphical object e.g. button
		Text myText = new Text();

		// Setting the text to be added.
		myText.setText("Hello JavaFX!");

		// Creating a Stack Pane
		// The stack pane layout arranges the nodes in our application on top of
		// one another just like in a stack.
		StackPane myStackPane = new StackPane();

		// Adding text object to the pane
		myStackPane.getChildren().add(myText);
		// The getChildren() method gives you an object of the ObservableList
		// class which holds the nodes. We must retrieve this object and then
		// add nodes to it as shown above.
		
		/* Preparing the Scene */
		// Create a Scene by passing the root group object
		Scene scene = new Scene(myStackPane);

		/* Preparing the Stage (i.e. the container of any JavaFX application) */
		// Setting the title to Stage.
		primaryStage.setTitle("Title for my Window");
		// Setting the scene to Stage
		primaryStage.setScene(scene);
		// Displaying the stage
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
