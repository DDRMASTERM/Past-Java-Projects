package application;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class TowerDefenseObject<image> {
	private int coordinateX;
	private int coordinateY;
	private BufferedImage bufferedImage;
	private int height;
	private int width;
	public TowerDefenseObject(int x, int y, BufferedImage i, int h, int w) {
		this.coordinateX=x;
		this.coordinateY=y;
		this.bufferedImage=i;
		this.height=h;
		this.width=w;
	}
	public int getX() {
		return coordinateX;
	}
	public void setX(int x) {
		this.coordinateX=x;
	}
	public int getY() {
		return coordinateY;
	}
	public void setY(int y) {
		this.coordinateY=y;
	}
	public BufferedImage getImage() {
		return bufferedImage;
	}
	public void setImage(BufferedImage i) {
		this.bufferedImage=i;
	}
	public void drawTheImage(Graphics g) {
		g.drawImage(this.bufferedImage,(int)this.coordinateX, (int)this.coordinateY,width,height,null);
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int w) {
		this.width=w;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int h) {
		this.height=h;
	}
	

}
