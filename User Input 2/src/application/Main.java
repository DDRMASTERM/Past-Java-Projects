package application;
	
import java.util.Random;
import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		int rand= random.nextInt(5);
		String q;
		System.out.println("What is your question?");
		q = input.nextLine();
		if(rand==0) {
			System.out.println("You have a future.");
		}
		if(rand==1) {
			System.out.println("You most likely exist.");
		}
		if(rand==2) {
			System.out.println("Remember to eat food and drink water.");
		}
		if(rand==3) {
			System.out.println("Response not found");
		}
		if(rand==4) {
			System.out.println("You will win unless you lose.");
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
