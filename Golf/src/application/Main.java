package application;





import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,140,100);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);

			//PUT OUR CODE HERE

			//ball
			Circle ball= new Circle(5);
			ball.setFill(Color.GREEN);
			root.getChildren().add(ball);

			//grass
			Rectangle grass=new Rectangle(0,60,120,20);
			grass.setFill(Color.CHOCOLATE);
			root.getChildren().add(grass);

			//Pole
			Line flagPole=new Line(120,10,120,60);
			flagPole.setFill(Color.ANTIQUEWHITE);
			root.getChildren().add(flagPole);

			//flag
			Polygon flag=new Polygon();
			flag.getPoints().addAll(new Double[]{
					100.0, 30.0,
					120.0, 10.0,
					120.0, 30.0
			});
			flag.setFill(Color.MEDIUMAQUAMARINE);
			root.getChildren().add(flag);

			//animation
			MoveTo ballOrigin=new MoveTo(15,55);
			QuadCurveTo arcPath=new QuadCurveTo();
			arcPath.setX(115.0);
			arcPath.setY(55.0);
			arcPath.setControlX(80);
			arcPath.setControlY(-100);

			Path ballPath=new Path();
			ballPath.getElements().add(ballOrigin);
			ballPath.getElements().add(arcPath);
			PathTransition ballAnimation=new PathTransition();
			ballAnimation.setDuration(Duration.seconds(1));
			ballAnimation.setPath(ballPath);
			ballAnimation.setNode(ball);
			ballAnimation.play();


			//END OUR CODE HERE
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
