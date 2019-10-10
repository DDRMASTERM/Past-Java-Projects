package inupt;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class input1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			Scene scene=new Scene(root,400,25);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);

			Label iLabel=new Label("Integer");
			root.add(iLabel, 0, 0);

			TextField iField=new TextField();
			root.add(iField, 1, 0);

			Button iButton=new Button("Enter an integer");
			root.add(iButton, 2, 0);

			iButton.setOnAction(new EventHandler<ActionEvent>(){

				public void handle(ActionEvent e){
					int c=(int) Double.parseDouble(iField.getText());
					Alert alert=new Alert(AlertType.INFORMATION);
					if (c<0) {
						alert.setContentText("Proper integers should only be positive.");
					}
					if (c>=0 && c<=10) {
						alert.setContentText("That number is too low.");
					}
					if (c>=11 && c<=50) {
						alert.setContentText("That is a great number.");
					}
					if (c>50 && c<=9000) {
						alert.setContentText("That number is too large.");
					}
					if (c>9000) {
						alert.setContentText("It's over 9000!");
					}
					alert.show();
			}});

			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}