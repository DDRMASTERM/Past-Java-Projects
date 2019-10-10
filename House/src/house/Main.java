package house;

public class Main{
	public static void house(){
		table t= new table("brown", "wood");
		chair c1= new chair("red", "wood");
		chair c2= new chair("red", "wood");
		chair c3= new chair("red", "wood");
		chair c4= new chair("red", "wood");
		couch couch=new couch("green", "cloth");
		tv TV= new tv("black", 71);
		piano p=new piano("tan", "wood");
		table t2= new table("clear", "glass");
		bed b=new bed("white", "straw");
		room bedroom= new room("bedroom", 144, 144, 84);
		room livingRoom=new room("Living room", 240, 144, 96);
		room basement=new room("basement", 240, 168, 84);
		room kitchen= room("kitchen", 96, 96, 108);
	}
}
