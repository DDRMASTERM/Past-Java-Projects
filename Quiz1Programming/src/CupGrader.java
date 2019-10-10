/**
 * 
 * @author Dr B
 *
 */
public class CupGrader {

	public static void main(String[] args) {
		int score = 100;
		int deduction = 100/12;

		try{
			//Default Constructor
			Cup c = new Cup();
			if(!"Worlds Best Student".equals(c.getWordsOnTheSide()) || notCloseEnough(c.getWeightOfDrink(),17.8) || notCloseEnough(c.getSipSize(),1.3)){
				System.out.println("Error with no argument constructor or getters.");
				System.out.println("\tCups should have the name 'Worlds Best Student', a weight of 17.8 and a sip size of 1.3");
				score -= deduction;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with no argument constructor or getters.");
			System.out.println("\tCups should have the name 'Worlds Best Student', a weight of 7.8 and a sip size of 1.3");
			score -= deduction;
		}

		try{
			//2 argument constructor
			for (int i = 0; i < 100; i++){
				String word = "Hogwarts Student " + makeUpWord();
				double weight = Math.random()*10+10;

				Cup c = new Cup(word, weight);
				if(!word.equals(c.getWordsOnTheSide()) || notCloseEnough(c.getWeightOfDrink(),weight) || notCloseEnough(c.getSipSize(),2.1)){
					System.out.println("Error with 2 argument constructor or getters.");
					System.out.println("\tCups should have the name of what it was given, a weight of what it was given, and a sip size of 2.1");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with 2 argument constructor or getters.");
			System.out.println("\tCups should have the name of what it was given, a weight of what it was given, and a sip size of 2.1");
			score -= deduction;
		}

		try{
			//3 argument constructor
			for (int i = 0; i < 100; i++){

				String word = "Hogwarts Student " + makeUpWord();
				double weight = Math.random()*10+10;
				double sipSize = Math.random()*2+1;

				Cup c = new Cup(word, weight, sipSize);
				if(!word.equals(c.getWordsOnTheSide()) || notCloseEnough(c.getWeightOfDrink(),weight) || notCloseEnough(c.getSipSize(),sipSize)){
					System.out.println("Error with 3 argument constructor or getters.");
					System.out.println("\tCups should have the name of what it was given, a weight of what it was given, and a sip size of what was given");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with 3 argument constructor or getters.");
			System.out.println("\tCups should have the name of what it was given, a weight of what it was given, and a sip size of what was given");
			score -= deduction;
		}


		try{
			//bad values in 2 argument constructor
			for (int i = 0; i < 100; i++){
				String word = "Hogwarts Student " + makeUpWord();
				double weight = Math.random()*10+10;

				Cup c = new Cup(null, weight);
				Cup c2 = new Cup(word, weight-13);
				if(!"Hogwart's Rules".equals(c.getWordsOnTheSide()) || notCloseEnough(c.getWeightOfDrink(),weight) || notCloseEnough(c.getSipSize(),2.1) ||
						!word.equals(c2.getWordsOnTheSide()) || notCloseEnough(c2.getWeightOfDrink(),8.0) || notCloseEnough(c2.getSipSize(),2.1)){
					System.out.println("Error with 2 argument constructor or getters.");
					System.out.println("\tCups should have the name of what it was given or \"Hogwart's Rules\" if invalid, a weight of what it was given or 8.0 if invalid, and a sip size of 2.1");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with 2 argument constructor or getters on bad values.");
			System.out.println("\tCups should have the name of what it was given or \"Hogwart's Rules\" if invalid, a weight of what it was given or 8.0 if invalid, and a sip size of 2.1");
			score -= deduction;
		}

		try{
			//bad values in 3 argument constructor
			for (int i = 0; i < 100; i++){
				String word = "Hogwarts Student " + makeUpWord();
				double weight = Math.random()*10+10;
				double sipSize = Math.random()*5+1;

				Cup c = new Cup(null, weight, sipSize);
				Cup c2 = new Cup(word, weight-16, sipSize);
				Cup c3 = new Cup(word, weight, sipSize-6);

				if(!"Friday Fun-day".equals(c.getWordsOnTheSide()) || notCloseEnough(c.getWeightOfDrink(),weight) || notCloseEnough(c.getSipSize(),sipSize) ||
						!word.equals(c2.getWordsOnTheSide()) || notCloseEnough(c2.getWeightOfDrink(),5.0) || notCloseEnough(c2.getSipSize(),sipSize) ||
						!word.equals(c3.getWordsOnTheSide()) || notCloseEnough(c3.getWeightOfDrink(),weight) || notCloseEnough(c3.getSipSize(),1.0)){
					System.out.println("Error with 3 argument constructor or getters on bad values.");
					System.out.println("\tCups should have the name of what it was given or \"Friday Fun-day\" if invalid, a weight of what it was given or 5.0 if invalid, and a sip size of what was given, or 1.0 if invalid");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with 3 argument constructor or getters on bad values.");
			System.out.println("\tCups should have the name of what it was given or \"Friday Fun-day\" if invalid, a weight of what it was given or 5.0 if invalid, and a sip size of what was given, or 1.0 if invalid");
			score -= deduction;
		}



		try{
			//redoTheWordsOnTheCup - Good Values
			for (int i = 0; i < 100; i++){
				Cup c = new Cup();

				String word = "Fun Slogan " + makeUpWord();

				c.redoTheWordsOnTheCup(word);

				if(!word.equals(c.getWordsOnTheSide())){
					System.out.println("Error with redoTheWordsOnTheCup method or getters.");
					System.out.println("\tCups should be able to change the words on the side of them");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with redoTheWordsOnTheCup method or getters.");
			System.out.println("\tCups should be able to change the words on the side of them");
			score -= deduction;
		}

		try{
			//redoTheWordsOnTheCup - bad Values
			for (int i = 0; i < 100; i++){
				Cup c = new Cup();

				String word = "Fun Slogan " + makeUpWord();

				c.redoTheWordsOnTheCup(word);
				c.redoTheWordsOnTheCup(null);

				if(!word.equals(c.getWordsOnTheSide())){
					System.out.println("Error with redoTheWordsOnTheCup method or getters.");
					System.out.println("\tCups should be able to change the words on the side of them for good values, and leave it what it was for bad values");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with redoTheWordsOnTheCup method or getters.");
			System.out.println("\tCups should be able to change the words on the side of them for good values, and leave it what it was for bad values");
			score -= deduction;
		}


		try{
			//takeADrink Good Values
			for (int i = 0; i < 50; i++){
				String word = "Hogwarts Student " + makeUpWord();
				double weight = Math.random()*10+100;
				double sipSize = Math.random()*2+1;

				Cup c = new Cup(word, weight, sipSize);


				for(int j = 0; j < 3; j++) {
					c.takeADrink();
					weight = makeItHappen(weight,sipSize);
					if(notCloseEnough(c.getWeightOfDrink(),weight)){
						System.out.println("Error with takeADrink or getters.");
						System.out.println("\tCups reduce their weight by the sip size for each time this method is called");
						score -= deduction;
						i=1000;
						break;
					}
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with takeADrink or getters.");
			System.out.println("\tCups reduce their weight by the sip size for each time this method is called");
			score -= deduction;
		}

		try{
			//takeADrink Bad Values
			for (int i = 0; i < 50; i++){
				String word = "Hogwarts Student " + makeUpWord();
				double weight = Math.random()*10+10;
				double sipSize = Math.random()*2+1;

				Cup c = new Cup(word, weight, sipSize);
				Cup c2 = new Cup(word, weight, sipSize);


				for(int j = 0; j < 30; j++) {
					c.takeADrink();
				}
				if(notCloseEnough(c2.getWeightOfDrink(),weight) || notCloseEnough(c.getWeightOfDrink(),0)){
					System.out.println("Error with takeADrink or getters when drinking more than is in the cup.");
					System.out.println("\tCups reduce their weight by the sip size for each time this method is called, and stop at 0");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with takeADrink or getters when drinking more than is in the cup.");
			System.out.println("\tCups reduce their weight by the sip size for each time this method is called, and stop at 0");
			score -= deduction;
		}

		try{
			//fillItUp good values
			for (int i = 0; i < 25; i++){
				String word = "Hogwarts Student " + makeUpWord();
				double weight = Math.random()*10+10;
				double sipSize = Math.random()*2+1;

				Cup c = new Cup(word, weight, sipSize);


				for(int j = 0; j < 4; j++) {
					double d2 = Math.random()*10+1;
					c.fillItUp(d2);
					d2 = incrementer(weight, d2);
					weight = d2;
					if(notCloseEnough(c.getWeightOfDrink(),weight)){
						System.out.println("Error with fillItUp or getters on good values.");
						System.out.println("\tThe cup should increase its weight by the value of what was given");
						score -= deduction;
						i = 100;
						break;
					}
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with fillItUp or getters on good values.");
			System.out.println("\tThe cup should increase its weight by the value of what was given");
			score -= deduction;
		}

		try{
			//fillItUp bad values
			for (int i = 0; i < 25; i++){
				String word = "Hogwarts Student " + makeUpWord();
				double weight = Math.random()*10+10;
				double sipSize = Math.random()*2+1;

				Cup c = new Cup(word, weight, sipSize);


				for(int j = 0; j < 4; j++) {
					double d2 = Math.random()*10+1;
					c.fillItUp(d2);
					c.fillItUp(d2*-1);
					d2 = incrementer(weight, d2);
					weight = d2;
					if(notCloseEnough(c.getWeightOfDrink(),weight)){
						System.out.println("Error with fillItUp or getters on good values.");
						System.out.println("\tThe cup should increase its weight by the value of what was given, but not increase it when given negative values");
						score -= deduction;
						i = 100;
						break;
					}
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with fillItUp or getters on good values.");
			System.out.println("\tThe cup should increase its weight by the value of what was given, but not increase it when given negative values");
			score -= deduction;
		}

		try{
			//theCupHasLessThanOneSipLeft
			for (int i = 0; i < 25; i++){
				String word = "Hogwarts Student " + makeUpWord();
				double weight = Math.random()*10+10;
				double sipSize = weight - 4 ;

				Cup c = new Cup(word, weight, sipSize);
				Cup c2 = new Cup(word, weight, sipSize);

				c.takeADrink();

				if(!c.theCupHasLessThanOneSipLeft() || c2.theCupHasLessThanOneSipLeft()){
					System.out.println("Error with theCupHasLessThanOneSipLeft");
					System.out.println("\tThe math needs to work correctly on this one");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with theCupHasLessThanOneSipLeft");
			System.out.println("\tThe math needs to work correctly on this one");
			score -= deduction;
		}



		if(score < 5){
			score = 0;
		}
		System.out.println("Score for Cup.java: " + score);


	}

	public static String makeUpWord(){
		String t = "";
		String [] args = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(int j = 0; j < 20; j++){
			int rand = (int)(Math.random()*args.length);
			t = t + args[rand];
		}
		return t;
	}

	public static boolean notCloseEnough(double a, double b) {
		double delta = 0.000001;
		if(a + delta > b && b + delta > a) {
			return false;
		}
		return true;
	}

	public static double makeItHappen(double a, double b) {
		return (a*2-b*2)/2;
	}
	public static double incrementer(double a, double b) {
		return (a*2+b*2)/2;
	}
}
