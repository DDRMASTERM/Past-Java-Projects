
public class Piano extends HouseObject{
	private int width;
	private int height;
	private int length;
	public Piano() {
		super();
		this.width=5;
		this.height=5;
		this.length=5;
	}
	public Piano(String c, String b, room r, int width, int height, int length) {
		super(c,b,r);
		this.width=width;
		this.height=height;
		this.length=length;
	}
	public int getPianoWidth() {
		return width;
	}
	public int getPianoHeight() {
		return height;
	}
	public int getPianoLength() {
		return length;
	}
	public void setPianoWidth(int w) {
		this.width=w;
	}
	public void setPianoHeight(int h) {
		this.height=h;
	}
	public void setPianolength(int l) {
		this.length=l;
	}
}
