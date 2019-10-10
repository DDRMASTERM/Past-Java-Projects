
public class chairs extends HouseObject{
	private String type;
	public chairs() {
		super();
		this.type="wood";
	}
	public chairs(String c, String b, room r, String t) {
		super(c,b,r);
		this.type=t;
	}
	public String getChairType() {
		return type;
	}
	public void setChairType(String type) {
		this.type=type;
	}
}
