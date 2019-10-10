import java.awt.Color;

public class Brick {

	private boolean isBroken;
	private int width;
	private int height;
	private Color c;
	
	public Brick(){
		c = Color.RED;
	}
	
	
	
	public Brick(boolean isBroken, int width, int height, Color c) {
		this.isBroken = isBroken;
		this.width = width;
		this.height = height;
		this.c = c;
	}
	
	public boolean isBroken() {
		return isBroken;
	}
	public void setBroken(boolean isBroken) {
		this.isBroken = isBroken;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Color getColor() {
		return c;
	}
	public void setColor(Color c) {
		this.c = c;
	}
	
	
	
}
