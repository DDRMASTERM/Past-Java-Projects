import java.awt.Color;

public class BrickWall {
	
	
	private int maxNumOfBricks;
	private int startingDonation;
	private Person p;
	private int numBricks=0;
	private Brick [] bricks;
	private int wallDonations=0;
	private static int totalDonations;
	private int largestDonation = 10;
	private Person largestDPerson;
	/**
	 * This is the 3 argument constructor
	 * A BrickWall created with this constructor should have 
	 * @param maxNumOfBricks This is how many bricks will be needed to build the wall
	 * @param startingDonation The amount of money donated by Person P
	 * @param p The Person who initially funded the building of the wall
	 * 
	 * Not shown is that you need to know
	 *   which Person donated the most
	 *   there are 0 bricks in the wall currently
	 *   A way to store all the Bricks
	 *   How much money was made for every brick wall, ever
	 *   Any other information you might need
	 * 
	 * GOTCHAS:
	 * There must always be at least 1 brick in the wall
	 * The starting donation must always be at least 10
	 * If p is invalid, create a new Person with the first name "Unknown" and last name "Donation"
	 * 
	 * 
	 */
	public BrickWall(int maxNumOfBricks, int startingDonation, Person p){
		if(maxNumOfBricks<1) {
			this.maxNumOfBricks=1;
			this.bricks=new Brick[1];
		}
		else {
			this.maxNumOfBricks=maxNumOfBricks;
			this.bricks=new Brick[maxNumOfBricks];
		}
		if(startingDonation<10) {
			this.startingDonation=10;
			this.wallDonations+=10;
			totalDonations+=10;
		}
		else {
			this.startingDonation=startingDonation;
			this.wallDonations+=startingDonation;
			totalDonations+=startingDonation;
			this.largestDonation=startingDonation;
			
		}
		if(p==null) {
			this.p=new Person("Unknown","Donation");
			this.largestDPerson=new Person("Unknown","Donation");
		}
		else {
			this.p=new Person(p.getFirstName(),p.getLastName());
			this.largestDPerson=new Person(p.getFirstName(),p.getLastName());
		}
	}
	
	/**
	 * 
	 * @return how many bricks have been added to the wall
	 */
	public int getCurrentAmountOfBricks(){
		return this.numBricks;
	}
	
	/**
	 * 
	 * @return how many empty spots are left in the wall
	 */
	public int getAmountOfBricksLeftToAdd(){
		int left=this.maxNumOfBricks-numBricks;
		return left;
	}
	
	/**
	 * 
	 * @return how much has currently been donated
	 */
	public int getCurrentDonationAmount(){
		return this.wallDonations;
	}
	
	/**
	 * 
	 * @return The Person who donated the most in either the constructor(s) or the newDoner method
	 */
	public Person getPersonWhoDonatedTheMost(){
		return null;
	}

	
	/**
	 * This method is called when a Person donates money to the wall
	 * 
	 * @param p The Person who donated the money
	 * @param amount The amount they donated
	 * 
	 * You will need to remember the Person who donated the most
	 * Ties remain with the first person who donated
	 * 
	 * GOTCHAS:
	 * Don't crash on invalid values for p, but still count the donation if it is good
	 * negative amounts shouldn't win, or change the total
	 */
	public void newDoner(Person p, int amount){
		if(amount<1) {
		}
		else {
			this.wallDonations+=amount;
			totalDonations+=amount;
		}
		if(amount>largestDonation) {
			this.largestDonation=amount;
			this.largestDPerson=new Person(p.getFirstName(),p.getLastName());
		}
	}

	
	
	/**
	 * This method adds a single brick at a time to the wall
	 * 
	 * Not shown is that you will need to remember every single brick added
	 */
	public void addABrick(Brick b){
		if(this.numBricks<this.bricks.length) {
			this.bricks[numBricks]=b;
		}
		else {}

	}
	
	/**
	 * This method returns a brick that was added (but leaves it in the wall)
	 * 
	 * @param number The number of the brick.  Assume the first brick is number 0
	 * @return the Brick, or null if the number is bad
	 * 
	 * GOTCHAS:
	 * Don't crash on invalid numbers
	 */
	public Brick getABrickByNumber(int number){
		if(number>=0&&number<bricks.length)
			return this.bricks[number];
		else
			return null;
	}
	
	/**
	 * Look through all the bricks and count the number that are broken
	 * @return the number of broken bricks
	 */
	public int howManyBricksAreBroken(){
		int broken=0;
		for(int i=0; i<this.numBricks; i++) {
			if(this.bricks[i].isBroken()==true)
				broken++;
		}
		return broken;
	}
	
	/**
	 * Look through all the bricks and count the number that match param c
	 * @param c The Color of the brick
	 * @return the number of bricks of Color c
	 */
	public int howManyBricksAreThisColor(Color c){
		int cMatch=0;
		for(int i=0; i<numBricks; i++) {
			if(this.bricks[i].getColor()==c)
				cMatch++;
		}
		return cMatch;
	}
	
	/**
	 * This method should return the total amount of money made for every single brick wall
	 * 
	 * Doners donate in the newDoner method and also in the constructor
	 * 
	 * @return The total amount
	 */
	public static int howMuchMoneyWasMadeForAllBrickWalls(){
		return totalDonations;
	}
	
	
}
