package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

	Button [] buttons;
	Image xImage;
	Image oImage;
	Image blankImage;
	ImageView xView;
	ImageView oView;
	ImageView blankView;



	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			Scene scene = new Scene(root,360,360);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			int clicks=0;
			buttons=new Button[9];
			xImage=new Image("x-treme.png");
			oImage=new Image("CircleAround.png");
			blankImage=new Image("WalkTheBlank.png");
			xView=new ImageView(xImage);
			oView=new ImageView(oImage);
			blankView=new ImageView(blankImage);
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					buttons[3*i+j]= new Button();
					root.add(buttons[3*i+j], j, i);
					buttons[3*i+j].setGraphic(new ImageView(blankImage));
					buttons[3*i+j].setPrefHeight(120);
					buttons[3*i+j].setPrefWidth(120);
					buttons[3*i+j].setOnAction(new EventHandler<ActionEvent>(){
						public void handle(ActionEvent e){
							Button clickedButton=(Button)e.getSource();
							if(((ImageView)clickedButton.getGraphic()).getImage().equals(blankImage)){
								clickedButton.setGraphic(new ImageView(xImage));
							if(checkWin(xImage)){
								Alert alert=new Alert(AlertType.INFORMATION);
								alert.setTitle("Winner");
								alert.setContentText("Congratulations, x won!");
								alert.show();
								reset();
							}
							for(int k=0; k<buttons.length; k++){
								if(((ImageView)buttons[k].getGraphic()).getImage().equals(blankImage)){
									buttons[k].setGraphic(new ImageView(oImage));
									return;
								}
							}
							}
						}
				});
			}
			}
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void reset(){
		for(int i=0; i<9; i++){
			buttons[i].setGraphic(new ImageView(blankImage));
		}
	}
	public boolean checkWin(Image player){
		int[][] wins=  {
				{0,1,2},
				{3,4,5},
				{6,7,8},
				{0,3,6},
				{1,4,7},
				{2,5,8},
				{0,4,8},
				{2,4,6},
		};

		for(int i=0; i<8; i++){
			if(((ImageView)buttons[wins[i][0]].getGraphic()).getImage().equals(player)&&
					((ImageView)buttons[wins[i][1]].getGraphic()).getImage().equals(player)&&
					((ImageView)buttons[wins[i][2]].getGraphic()).getImage().equals(player)){
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
