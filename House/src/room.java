
public class room {
	private String name;
	private int width;
	private int height;
	private int floorNumber;
	public room() {
		this.name="ROOMY";
		this.width=2;
		this.height=1;
		this.floorNumber=9001;
	}
	public room(String name, int width, int height, int floorNumber) {
		this.name=name;
		this.width=width;
		this.height=height;
		this.floorNumber=floorNumber;
	}
	public String getRoomName() {
		return name;
	}
	public void setRoomName(String name) {
		this.name=name;
	}
	public int getRoomWidth() {
		return width;
	}
	public void setRoomWidth(int width) {
		this.width=width;
	}
	public int getRoomHeight() {
		return height;
	}
	public void setRoomheight(int height) {
		this.height=height;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber=floorNumber;
	}
	
}
