package application;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Enemy extends MovingTowerDefenseObject{
	private int health;
	public Enemy(int x, int y, BufferedImage i, int h, int w, double vX, double vY, int he) {
		super(x, y, i, h, w, vX, vY);
		this.health=he;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int h) {
		this.health=h;
	}
	public void reduceHealth(int damage) {
		this.health-=damage;
	}
	@Override
	public void drawTheImage(Graphics g) {
		super.drawTheImage(g);
		this.setX(this.getX()+(int)this.getVelocityX());
		this.setY(this.getY()+(int)this.getVelocityY());
	}
	
	

}
