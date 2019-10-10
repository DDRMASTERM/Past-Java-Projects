
public class Elevator{

	private int numFloorsHigh;
	private int maxWeight;
	private String [] nameOfPerson = {"no", "no", "no", "no","no", "no", "no", "no","no","no", "no","no", "no", "no", "no","no","no"};
	private int [] weightOfPerson = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	private int peopleNum=0;
	private int currentFloor=1;

	/**
	 * The 2 parameter constructor
	 * 
	 * An elevator constructed with this constructor should have or be:
	 * @param numFloorsHigh - How high the elevator can go
	 * @param maxWeight - The maximum weight capacity of the elevator
	 * A current weight of 2 (due to the carpet, or something)
	 * The ability to hold 17 people - You will remember their names as Strings
	 * No people on the elevator currently
	 * Be on the first (1) floor
	 * 
	 * GOTCHAS - Elevators must be at least 2 floors high, but no more than 70
	 * Elevators floor numbers start at 1
	 * On bad numFloorsHigh values, set the number to 10
	 * 
	 * The maxWeight must be at least 1,000, with a max limit of 50,000
	 * on bad values, set the maximum weight to 4000
	 */
	public Elevator(int numFloorsHigh, int maxWeight){
		if(numFloorsHigh<1||numFloorsHigh>70)
			this.numFloorsHigh=10;
		else {
			this.numFloorsHigh=numFloorsHigh;
		}
		if(maxWeight<1000||maxWeight>50000)
			this.maxWeight=4000;
		else {
			this.maxWeight=maxWeight;
		}
		
		
	}
	
	/**
	 * This is the copy constructor.
	 * Make sure you create an exact copy of e
	 * @param e The elevator to copy
	 * 
	 * GOTCHAS: Don't forget to do a deep copy
	 */
	public Elevator(Elevator e){
		this.maxWeight=e.maxWeight;
		this.currentFloor=e.currentFloor;
		this.numFloorsHigh=e.numFloorsHigh;
		this.peopleNum=e.peopleNum;
		for(int i=0; i<this.nameOfPerson.length; i++) {
			this.nameOfPerson[i]=e.nameOfPerson[i];
		}
		for(int i=0; i<this.weightOfPerson.length; i++) {
			this.weightOfPerson[i]=e.weightOfPerson[i];
		}
		/* Deep copy syntax
		 * int [] a = {8,8,8,8,8,8,8,7,8};
		 * int [] b = a[a.length];\
		 * for(int=0; i<a.length; i++){
		 * b[i] = a[i];
		 * }
		 */
	}

	/**
	 * @return how many floors the elevator spans
	 */
	public int getNumFloorsHigh(){
		return this.numFloorsHigh;
	}

	/**
	 * @return the maximum weight the elevator can hold
	 */
	public int getMaxWeight(){
		return this.maxWeight;
	}

	/**
	 * @return how much weight the elevator currently holds
	 */
	public int getCurrentWeightInElevator(){
		int currentWeight=2;
		for(int i=0; i<weightOfPerson.length; i++) {
			if(this.weightOfPerson[i]==-1) 
				break;
			else {
				currentWeight=weightOfPerson[i]+currentWeight;
			}
		}
		return currentWeight;
	}

	/**
	 * @return which floor the elevator currently is on
	 */
	public int getCurrentFloor(){
		return currentFloor;
	}

	/**
	 * @return How many people are on the elevator currently
	 */
	public int getCurrentNumberOfPeopleOnTheElevator(){
		return peopleNum;
	}
	
	/**
	 * This methods 'moves' the elevator to a different floor
	 * 
	 * @param floorNumber The new floor number
	 * 
	 * GOTCHAS - Don't allow invalid floor numbers (less than 1), but keep the elevator on the same floor in those cases
	 */
	public void goToFloor(int floorNumber){
		if(floorNumber<1||floorNumber>numFloorsHigh) {}
		else
			this.currentFloor=floorNumber;
		
	}

	/**
	 * This is the method that allows people on the elevator
	 * 
	 * @param nameOfPerson
	 * @param weightOfPerson
	 * 
	 * You don't need to remember everyone's weight individually, but you do need to remember each person's name
	 * Assume the first person to enter the elevator has a number of 0
	 * After this method call, there should be 1 more person on the elevator than before
	 * 
	 * GOTCHAS - There are some, but due to time limits, I won't make you code them in.
	 * Just assume these will be good numbers
	 */
	public void personEnteredElevator(String nameOfPerson, int weightOfPerson){
 		this.nameOfPerson[this.peopleNum]=nameOfPerson;
		this.weightOfPerson[this.peopleNum]=weightOfPerson;
		this.peopleNum++;
	}
	
	/**
	 * 
	 * @param number The number of the person we want the name for
	 * @return The person's name
	 * 
	 * GOTCHAS - Don't crash on invalid numbers, but return "INVALID" in those cases
	 * Remember, if only 1 person is on the elevator, then 8 is "INVALID"
	 */
	public String getPersonByNumber(int number){
		if(number<0||number>=this.peopleNum)
			return "INVALID";
		else{}
		return this.nameOfPerson[number];
	}
	
}

