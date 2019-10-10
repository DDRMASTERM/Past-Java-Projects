package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			Rectangle noodleRec=new Rectangle(100,450,200,550);
			noodleRec.setFill(Color.YELLOW);
			root.getChildren().add(noodleRec);
			
			Polygon flag=new Polygon();
			flag.getPoints().addAll(new Double[]{
					100.0, 450.0,
					300.0, 450.0,
					200.0, 200.0
			});
			flag.setFill(Color.YELLOW);
			root.getChildren().add(flag);

			Line flagPole=new Line(200,200,200,100);
			flagPole.setFill(Color.YELLOW);
			root.getChildren().add(flagPole);
			
			Rectangle marshmellow=new Rectangle(150,50,100,100);
			marshmellow.setFill(Color.BROWN);
			root.getChildren().add(marshmellow);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
