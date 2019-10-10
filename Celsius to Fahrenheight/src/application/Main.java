package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			Scene scene=new Scene(root,400,50);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);

			Label cLabel=new Label("Celsius");
			root.add(cLabel, 0, 0);

			TextField cField=new TextField();
			root.add(cField, 1, 0);

			Button cButton=new Button("Convert to Fahrenheit");
			root.add(cButton, 2, 0);

			Label fLabel=new Label("fahrenheit");
			root.add(fLabel, 0, 1);

			TextField fField=new TextField();
			root.add(fField, 1, 1);

			Button fButton=new Button("Convert to Celsius");
			root.add(fButton, 2, 1);

			fButton.setOnAction(new EventHandler<ActionEvent>(){

				public void handle(ActionEvent e){
					double f=Double.parseDouble(fField.getText());
					double c= (f-32)*(5.0/9.0);
					cField.setText(""+c);

				}

			});

			cButton.setOnAction(new EventHandler<ActionEvent>(){

				public void handle(ActionEvent e){
					double c=Double.parseDouble(cField.getText());
					double f= (c*1.8)+32;
					fField.setText(""+f);

				}

			});

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
