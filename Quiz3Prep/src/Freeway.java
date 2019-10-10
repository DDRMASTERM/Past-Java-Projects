import java.awt.Color;

/**
 * 
 * @author
 *
 */
public class Freeway {


	private String name;
	private int numberOfLanes;
	private int freewayCapacity;
	private int carNum;
	private Car [] cars;
	private static int totalCars;

	/**
	 * A new Freeway has 0 cars on it
	 * 
	 * @param name the name of the freeway
	 * @param numberOfLanes the number of lanes the freeway has
	 * @param freewayCapacity the total number of cars that can be on the freeway at any given time
	 *
	 * GOTCHA: there needs to be at least 1 lane, but no more than 6 (6 is ok).  If an
	 * improper value(less than 1 or more than 6) is given, set
	 * the number of lanes to 1
	 * 
	 * GOTCHA: freeway capacity should be at least 1.  On
	 * improper (negative or 0) values, set the number to 1 
	 */
	public Freeway(String name, int numberOfLanes, int freewayCapacity){
		this.name=name;
		if(numberOfLanes>0&&numberOfLanes<7)
			this.numberOfLanes=numberOfLanes;
		else
			this.numberOfLanes=1;
		if(freewayCapacity<1) {
			this.freewayCapacity=1;
			this.cars=new Car[1];
		}
		else {
			this.freewayCapacity=freewayCapacity;
			this.cars=new Car[freewayCapacity];
		}

	}

	/**
	 * 
	 * @return
	 */
	public String getNameOfFreeway(){
		return this.name;
	}

	/**
	 * 
	 * @return the number of lanes the freeway has
	 */
	public int getNumberOfLanes(){
		return this.numberOfLanes;
	}

	/**
	 * 
	 * @return the capacity of the freeway
	 */
	public int getFreewayCapacity(){
		return this.freewayCapacity;
	}
	

	/**
	 * 
	 * @param c the Car to add to the freeway
	 * @return true if the car can be added to the freeway, or 
	 * false if there is no room for the car
	 * 
	 * GOTCHA: return false and don't crash on invalid data
	 * GOTCHA: return false if the car is already on the freeway
	 */
	public boolean addACar(Car c){
		for(int i=0; i<this.cars.length; i++) {
			if(this.cars[i]==c)
				return false;
		}
		if(this.carNum<this.freewayCapacity) {
			this.cars[carNum]=c;
			this.carNum++;
			totalCars++;
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * 
	 * @return the number of cars currently on the freeway
	 */
	public int getNumberOfCarsOnFreeway(){
		return this.carNum;
	}

	/**
	 * 
	 * @param c the color of the cars that I want to know about
	 * 
	 * @return How many cars are on the freeway that are Color c
	 * 
	 * GOTCHA: don't crash on invalid data and return 0
	 */
	public int getNumberOfCarsWithColor(Color c){
		int cMatch=0;
		for(int i=0; i<carNum; i++) {
			if(this.cars[i].getColor()==c)
				cMatch++;
		}
		return cMatch;
	}

	/**
	 * 
	 * @return  The number of cars on every freeway.  For example:
	 * If there were 3 freeways, and each had 10 cars then this method
	 * would return 30
	 */
	public static int getNumberOfCarsOnEveryFreeway(){
		return totalCars;
	}
	
}
