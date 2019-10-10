package application;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Projectile extends MovingTowerDefenseObject{
	private int damage;
	private int delay;
	private int ogX;
	private int ogY;
	private int currentY;
	private int currentX;
	private int initDelay;
	
	public Projectile(int x, int y, BufferedImage i, int h, int w, double vX, double vY, int d, int d2) {
		super(x, y, i, h, w, vX, vY);
		this.damage=d;
		this.ogX=this.getX();
		this.ogY=this.getY();
		this.delay=d2;
		this.initDelay=this.delay;
	}
	
	

	public Projectile(Projectile p) {
		super(p.getX(), p.getY(), p.getImage(), p.getHeight(), p.getWidth(), p.getVelocityX(), p.getVelocityY());
		this.damage=p.damage;
	}
	public int getOgX() {
		return ogX;
	}

	public void setOgX(int ogX) {
		this.ogX = ogX;
	}

	public int getOgY() {
		return ogY;
	}

	public void setOgY(int ogY) {
		this.ogY = ogY;
	}
	public int getDamage(){
		return damage;
	}
	public void setDamage(int d) {
		this.damage=damage;
	}
	@Override
	public void drawTheImage(Graphics g, boolean game) {
		super.drawTheImage(g);
		if(game==true) {
			this.setX(this.getX()+(int)this.getVelocityX());
			this.setY(this.getY()+(int)this.getVelocityY());
			this.delay--;
			if(this.delay==0) {
				this.setX(this.ogX);
				this.setY(this.ogY);
				this.delay=this.initDelay;
			}
		}
	}
	public int getDelay() {
		return delay;
	}
	public void setDelay(int delay) {
		this.delay = delay;
	}
	public void fireAtEnemy(Enemy e) {
		this.setVelocityX(e.getX()-this.getX());
		this.setVelocityY(e.getY()-this.getY());
	}
}
