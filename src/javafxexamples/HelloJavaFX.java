package javafxexamples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Creating a Text node object
		// A node is a visual/graphical object e.g. button
		Text myText = new Text();

		Button myButton = new Button("Click Me");

		// Setting the text to be added.
		myText.setText("Hello JavaFX!");

		// Setting the size of the text
		myText.setFont(new Font(45));

		// Creating a Grid Pane
		// The grid pane layout arranges the nodes in our application in a way
		// that they form a grid of rows and columns.
		GridPane myGridPane = new GridPane();

		// Setting the padding
		myGridPane.setPadding(new Insets(10, 10, 10, 10));

		// Setting the vertical and horizontal gaps between the columns
		myGridPane.setVgap(10);
		myGridPane.setHgap(10);

		// Setting the Grid alignment
		myGridPane.setAlignment(Pos.CENTER);

		// Arranging all the nodes in the grid
		myGridPane.add(myText, 0, 0);
		myGridPane.add(myButton, 1, 0);

		/* Preparing the Scene */
		// Create a Scene by passing the root group object, height and width
		Scene scene = new Scene(myGridPane, 600, 300);
		// setting color to the scene
		scene.setFill(Color.RED);

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
