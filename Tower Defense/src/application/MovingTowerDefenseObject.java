package application;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class MovingTowerDefenseObject extends TowerDefenseObject{
	private double velocityX;
	private double velocityY;
	public MovingTowerDefenseObject(int x, int y, BufferedImage i, int h, int w, double vX, double vY) {
		super(x, y, i, h, w);
		this.velocityX=vX;
		this.velocityY=vY;
	}
	public double getVelocityX() {
		return velocityX;
	}
	public void setVelocityX(double x) {
		this.velocityX=x;
	}
	public double getVelocityY() {
		return velocityY;
	}
	public void setVelocityY(double y) {
		this.velocityY=y;
	}
	public void drawTheImage(Graphics g, boolean game) {
		// TODO Auto-generated method stub
		
	}
}
