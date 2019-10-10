
public class Box {

	private int area;
	private boolean theBoxIsOpen;
	private String theWritingOnTheBox;

	/**
	 * This is the no argument constructor.
	 * 
	 * A box created with this constructor should be
	 * 
	 * closed, not open
	 * have an area of 51
	 * have the following writing on it "For Dr. B."
	 */
	public Box(){
		area=51;
		theBoxIsOpen=false;
		theWritingOnTheBox="For Dr. B.";
		
	}
	
	
	/**
	 * This is the 2 argument constructor
	 * 
	 * A box created with this constructor should have
	 * 
	 * @param area - This is the area
	 * @param theBoxIsOpen - If this is true, the box is open
	 * have the following writing on it "Area 51"
	 * 
	 * GOTCHAS:
	 * Don't allow negative area, but set the area to 20 in these cases
	 * 
	 */
	public Box(int area, boolean theBoxIsOpen){
		if(area<0) 
			this.area=20;
		else
			this.area=area;
		this.theBoxIsOpen=theBoxIsOpen;
		theWritingOnTheBox="Area 51";
	}
	
	/**
	 * This is the 3 argument constructor
	 * 
	 * A box created with this constructor should have
	 * 
	 * @param area - This is the area
	 * @param theBoxIsOpen - If this is true, the box is open
	 * @param theWritingOnTheBox - This is what someone wants written on the box
	 * 
	 * GOTCHAS:
	 * Don't allow negative area, but set the area to 5 in these cases
	 * Don't all the writing to be null, but set the text to be "Hagrid's Hut" in these cases
	 * 
	 */
	public Box(int area, boolean theBoxIsOpen, String theWritingOnTheBox){
		this.area=area;
		this.theBoxIsOpen=theBoxIsOpen;
		this.theWritingOnTheBox=theWritingOnTheBox;
		if(area<=0)
			this.area=5;
		if(theWritingOnTheBox==null)
			this.theWritingOnTheBox="Hagrid's Hut";
	}

	/**
	 * This method should 
	 * @return the area of the box
	 */
	public int getArea(){
		return area;
	}

	/**
	 * This method should 
	 * @return true if the box is open, and false if it is not
	 */
	public boolean isTheBoxOpen(){
		return theBoxIsOpen;
	}

	/**
	 * This method should 
	 * @return the current writing on the box
	 */
	public String getTheWritingOnTheBox(){
		return theWritingOnTheBox;
	}

	/**
	 * This method should change the text on the box
	 * 
	 * @param theNewTextForTheBox
	 * 
	 * GOTCHAS:
	 * Don't allow the writing to be null, but set the text to be "Isn't Java Beautiful" in these cases
	 */
	public void writeSomethingOnTheBox(String theNewTextForTheBox){
		theWritingOnTheBox=theNewTextForTheBox;
		if(theWritingOnTheBox==null)
			theWritingOnTheBox="Isn't Java Beautiful";
	}

	/**
	 * This method should record that the box is now open
	 */
	public void openTheBox(){
		theBoxIsOpen=true;
	}
	
	/**
	 * This method should record that the box is now closed
	 */
	public void closeTheBox(){
		theBoxIsOpen=false;
	}

	/**
	 * This method should double (multiply by 2) what the area currently is
	 */
	public void doubleTheArea(){
		area=area*2;
	}
	
}
