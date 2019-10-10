package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Bike{
	private int price;
	private double tireWidth;
	private String bikeModel;
	public Bike() {
		price=0;
		tireWidth=4.9;
		bikeModel="This does not exist";
	}
	
	public Bike(int price, double tireWidth, String bikeModel) {
		this.price = price;
		this.tireWidth = tireWidth;
		this.bikeModel = bikeModel;
	}
	
	public void setPrice() {
		this.price = price;
	}
	public int getPrice(int price) {
		return price;
	}
	
	public void setHit() {
		this.tireWidth = tireWidth;
	}
	public double getHit(double tireWidth) {
		return tireWidth;
	}

	public void setName() {
		this.bikeModel = bikeModel;
	}
	public String getName(String bikeModel) {
		return bikeModel;
	}
}