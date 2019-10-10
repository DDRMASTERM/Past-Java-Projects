/**
 * 
 * @author Dr. B.
 *
 */
public class OurTimeClass {

	private int hour;   //0 - 23
	private int minute; //0 - 59
	private int second; //0 - 59
	
	public OurTimeClass() {
		hour=0;
		minute=0;
		second=0;
	}
	
	public OurTimeClass(int hour) {
		this(hour,0,0);
	}
	
	public OurTimeClass(int hour, int minute) {
		this(hour,minute,0);
	}
	
	public OurTimeClass(int hour, int minute, int second) {
		setTime(hour,minute,second);
	}
	
	public OurTimeClass(OurTimeClass t) {
		hour=t.hour;
		minute=t.minute;
		second=t.second;
	}

	public void setHour(int hour) {
		if(hour<0)
			hour=0;
		else if(hour>23)
			hour=23;
		else
			hour = hour;
	}
	
	public void setMinute(int minute) {
		if(minute<0)
			minute=0;
		else if(minute>59)
			minute=59;
		else
			minute = minute;
	}
	
	public void setSecond(int second) {
		if(second<0)
			second=0;
		else if(second>59)
			second=59;
		else
			second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	
	
	
	
	//Military time HH:MM:SS
	public String toUniversalString(){
		return String.format( "%02d:%02d:%02d", hour, minute, second);
	}
	
	//Regular Time H:MM:SS: AM or PM
	public String toString(){
		int h = hour;
		if (h == 0){
			h = 12;// 0 should read 12 in regular time
		}

		if (hour < 12){
			return String.format( "%02d:%02d:%02d AM", h, minute, second);
		}
		else{
			return String.format( "%02d:%02d:%02d PM", h%12, minute, second);
		}
	}
	
	public boolean isAM() {
		if(hour < 12)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {

		OurTimeClass time = new OurTimeClass();
		OurTimeClass time2 = new OurTimeClass(8);
		OurTimeClass time3 = new OurTimeClass(8,25);
		OurTimeClass time4 = new OurTimeClass(6,59,59);
		OurTimeClass time5 = new OurTimeClass(time4);
		
		System.out.print("The initial universal time is: " );
		System.out.println(time.toUniversalString());
		System.out.print("The initial standard time is: ");
		System.out.println(time.toString());
		System.out.println();
		
		time.setTime(13,27,6);
		System.out.print("Universal time after setTime is: " );
		System.out.println(time4.toUniversalString());
		System.out.print("Standard time after setTime is: ");
		System.out.println(time5.toString());
		System.out.println();
		
		//Use invalid times
		time.setTime(99, 99, 99);
		System.out.println("After attempting invalid settings: ");
		System.out.print("Universal time after setTime is: " );
		System.out.println(time.toUniversalString());
		System.out.print("Standard time after setTime is: ");
		System.out.println(time.toString());
		System.out.println();
		
		
		
		
		
		/*
		//Make 50 more objects.
		 for (int i = 0; i < 50; i++){
				OurTimeClass t = new OurTimeClass(1,1,1);
		 }
		 int x = time.getNumOfTimeObjectsCreated();
		 System.out.println("There are now a total of " + x + " time objects (should be 50");
		*/
		
	}

}
