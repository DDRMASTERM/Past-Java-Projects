
public class Couch extends HouseObject{
	private int cushions;
	private int length;
	public Couch() {
		super();
		this.cushions=1;
		this.length=5;
	}
	public Couch(String c, String b, room r, int cushions, int length) {
		super(c,b,r);
		this.cushions=cushions;
		this.length=length;
	}
	public int getCushions() {
		return cushions;
	}
	public void setCusions(int cushions) {
		this.cushions=cushions;
	}
	public int getCouchLength() {
		return length;
	}
	public void setCouchLength(int length) {
		this.length=length;
	}
}
