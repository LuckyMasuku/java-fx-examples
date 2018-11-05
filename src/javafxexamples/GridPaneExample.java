package javafxexamples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("GridPane Experiment");

		Button button1 = new Button("Button 1");
		Button button2 = new Button("Button 2");
		Button button3 = new Button("Button 3");
		TextField text1 = new TextField("Button 1 Output");
		TextField text2 = new TextField("Button 2 Output");
		TextField text3 = new TextField("Button 3 Output");

		GridPane gridPane = new GridPane();
		
		//Add Horizontal and Vertical Spacing
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		
		// gridPane.add(Node, Column, Row, numColumns, numRows)
		gridPane.add(button1, 0, 0, 1, 1);
		gridPane.add(button2, 1, 0, 1, 1);
		gridPane.add(button3, 2, 0, 1, 1);
		gridPane.add(text1, 0, 1, 1, 1);
		gridPane.add(text2, 1, 1, 1, 1);
		gridPane.add(text3, 2, 1, 1, 1);
		
		// Register event handler using Lambda Expression (JDK 8)
		button1.setOnAction(event -> text1.setText("Button 1 Pressed"));
		button2.setOnAction(event -> text2.setText("Button 2 Pressed"));
		button3.setOnAction(event -> text3.setText("Button 3 Pressed"));
		
		Scene scene = new Scene(gridPane, 500, 100);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
