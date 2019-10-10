
public class table extends HouseObject{
	private int width;
	private int height;
	private int length;
	public table() {
		super();
		this.width=5;
		this.height=5;
		this.length=5;
	}
	public table(String c, String b, room r, int width, int height, int length) {
		super(c,b,r);
		this.width=width;
		this.height=height;
		this.length=length;
	}
	public int getTableWidth() {
		return width;
	}
	public int getTableHeight() {
		return height;
	}
	public int getTableLength() {
		return length;
	}
	public void setTableWidth(int w) {
		this.width=w;
	}
	public void setTableHeight(int h) {
		this.height=h;
	}
	public void setTablelength(int l) {
		this.length=l;
	}

}
