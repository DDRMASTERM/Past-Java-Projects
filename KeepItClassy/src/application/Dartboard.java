package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Dartboard{
	private int score;
	private boolean hit;
	private String name;
	public Dartboard() {
		score=0;
		hit=false;
		name="CPU";
	}
	
	public Dartboard(int score, boolean hit, String name) {
		this.score = score;
		this.hit = hit;
		this.name = name;
	}
	
	public void setScore() {
		this.score = score;
	}
	public int getScore(int score) {
		return score;
	}
	
	public void setHit() {
		this.hit = hit;
	}
	public boolean getHit(boolean hit) {
		return hit;
	}

	public void setName() {
		this.name = name;
	}
	public String getName(String name) {
		return name;
	}
}
