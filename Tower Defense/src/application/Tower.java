package application;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tower extends TowerDefenseObject{
	private int towerID;
	private int shotRadius;
	private int delay;
	private int initDelay;
	private int shotNum;
	private Projectile p;
	public Tower(int x, int y, BufferedImage i, int h, int w, int sR, int d, int sN, Projectile p, int TID) {
		super(x, y, i, h, w);
		this.shotRadius=sR;
		this.delay=d;
		this.initDelay=this.delay;
		this.shotNum=sN;
		this.p=p;
		this.towerID=TID;
	}
	public void drawTheImage(Graphics g) {
		super.drawTheImage(g);
		if(this.delay==0)
			delay=this.initDelay;
		delay--;
	}
	public int getShotRadius() {
		return shotRadius;
	}
	public void setShotRadius(int sR) {
		this.shotRadius=sR;
	}
	public int getDelay() {
		return delay;
	}
	public void setDelay(int d) {
		this.delay=d;
	}
	public int getShotNum() {
		return shotNum;
	}
	public void setShotNum(int sN) {
		this.shotNum=sN;
	}
	public Projectile getP() {
		return p;
	}
	public void setP(Projectile p) {
		this.p = p;
	}
	public int getTowerID() {
		return towerID;
	}
	public void setTowerID(int towerID) {
		this.towerID = towerID;
	}
	public Projectile fireAtEnemy(Enemy e) {
		if(delay!=0)
			return null;
		else {
			Projectile p2= new Projectile(this.p);
			p2.fireAtEnemy(e);
			return p2;
		}
	}
	

}
