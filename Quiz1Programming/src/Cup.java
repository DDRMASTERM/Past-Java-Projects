
public class Cup {
	private String wordsForSide;
	private double weightOfDrinkInCup;
	private double sipSize;
	/**
	 * This is the no argument constructor.
	 * 
	 * A cup created with this constructor should
	 * 
	 * have the words "Worlds Best Student" on the side
	 * be currently holding a drink that weighs 17.8 units
	 * have a sip size of 1.3 units
	 * 
	 */
	public Cup(){
		this.wordsForSide="Worlds Best Student";
		this.weightOfDrinkInCup=17.8;
		this.sipSize=1.3;
	}
	/**
	 * This is the 2 argument constructor.
	 * 
	 * A cup created with this constructor should
	 * 
	 * have a sip size of 2.1 units
	 * 
	 * @param wordForSide This is the string with the words for the side
	 * @param weightOfDrinkInCup This is how much the drink currently weighs
	 * 
	 *  GOTCHAS:
	 *  Don't the the wordsForSide be null, but set it to "Hogwart's Rules" instead
	 *  Don't let the weight be less than 8.0, but set it to 8.0 instead
	 */
	public Cup(String wordsForSide, double weightOfDrinkInCup){
		if(wordsForSide==null)
			this.wordsForSide="Hogwart's Rules";
		else
			this.wordsForSide=wordsForSide;
		if(weightOfDrinkInCup<8.0)
			this.weightOfDrinkInCup=8.0;
		else
			this.weightOfDrinkInCup=weightOfDrinkInCup;
		this.sipSize=2.1;
	}

	/**
	 * This is the 3 argument constructor.
	 * 
	 * A cup created with this constructor should
	 * 
	 * @param wordForSide This is the string with the words for the side
	 * @param weightOfDrinkInCup This is how much the drink currently weighs
	 * @param sipSize This is the amount that the person using the cup currently sips
	 * 
	 *  GOTCHAS:
	 *  Don't the the wordsForSide be null, but set it to "Friday Fun-day" instead
	 *  Don't let the weight be less than 5.0, but set it to 5.0 instead
	 *  Don't let the sipSize be less than 1.0, but set it to 1.0 instead
	 */
	public Cup(String wordsForSide, double weightOfDrinkInCup, double sipSize){
		if(wordsForSide==null)
			this.wordsForSide="Friday Fun-day";
		else
			this.wordsForSide=wordsForSide;
		if(weightOfDrinkInCup<5.0)
			this.weightOfDrinkInCup=5.0;
		else
			this.weightOfDrinkInCup=weightOfDrinkInCup;
		if(sipSize<1.0)
			this.sipSize=1.0;
		else
			this.sipSize=sipSize;
	}

	/**
	 * 
	 * @return the words that are currently on the side of the cup
	 */
	public String getWordsOnTheSide() {
		return wordsForSide;
	}
	
	/**
	 * 
	 * @return how much the current drink weighs
	 */
	public double getWeightOfDrink() {
		return weightOfDrinkInCup;
	}
	
	/**
	 * 
	 * @return the sip size of the current person drinking from the cup
	 */
	public double getSipSize() {
		return sipSize;
	}
	
	/**
	 * This method is used to change what is currently written on the ucp
	 *  
	 * @param newWords These are what should be written on the cup
	 * 
	 *  GOTCHAS:
	 *  Don't let the newWords be null, but just leave the old message if that is the case
	 */
	public void redoTheWordsOnTheCup(String newWords) {
		if(newWords==null) {}
		else
			this.wordsForSide=newWords;
	}
	
	/**
	 *  This method reduces the weight of the cup by the current sip size
	 *  
	 *   GOTCHAS:
	 *   Don't let the weight go below 0, but set it to 0 if that is the case
	 */
	public void takeADrink() {
		if(weightOfDrinkInCup<sipSize)
			this.weightOfDrinkInCup=0;
		else
			this.weightOfDrinkInCup=weightOfDrinkInCup-sipSize;
	}
	
	/**
	 * This method is used to add back drink into the cup
	 *  
	 * @param weightOfWhatIsAdded This is how much the new liquid weights.
	 * It should be added to the old liquid, and not replace the old liquid
	 * 
	 *  GOTCHAS:
	 *  Don't let weights of less than 0 be added, but just leave the weight what it was if that happens
	 */
	public void fillItUp(double weightOfWhatIsAdded) {
		if(weightOfWhatIsAdded<0) {}
		else
			this.weightOfDrinkInCup=weightOfDrinkInCup+weightOfWhatIsAdded;
	}
	
	/**
	 * 
	 * @return true is there is less than 1 sip left.
	 * This can be determined using the weight of the cup, and how much the current drinker sips
	 */
	public boolean theCupHasLessThanOneSipLeft() {
		if(weightOfDrinkInCup<sipSize)
			return true;
		else {}
		return false;
	}
}
