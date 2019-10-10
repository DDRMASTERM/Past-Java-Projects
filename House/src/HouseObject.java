
public class HouseObject {
	private String color;
	private String brand;
	private room room;
	public HouseObject() {
		this.color="redder";
		this.brand="generic";
		this.room=new room();
	}
	public HouseObject(String c, String b, room r) {
		this.color=c;
		this.brand=b;
		this.room=r;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public room getRoom() {
		return room;
	}
	public void setRoom(room room) {
		this.room=room;
	}

}
