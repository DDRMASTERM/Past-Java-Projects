 * 
 * @author Dr B
 *
 */
public class BoxGrader {

	public static void main(String[] args) {
		int score = 100;
		int deduction = 100/9;

		try{
			//Default Constructor
			Box b = new Box();
			if(!"For Dr. B.".equals(b.getTheWritingOnTheBox()) || b.isTheBoxOpen() != false || b.getArea() != 51){
				System.out.println("Error with no argument constructor or getters.");
				System.out.println("\tA new box should be closed, have an area of 51, and have the name 'For Dr. B.'");
				score -= deduction;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with no argument constructor or getters.");
			System.out.println("\tA new box should be closed, have an area of 51, and have the name 'For Dr. B.'");
			score -= deduction;
		}

		try{
			//2 argument constructor
			for (int i = 0; i < 100; i++){
				int area = (int)((Math.random()*100)+1);
				boolean isOpen = Math.random()<.5;

				Box b = new Box(area, isOpen);
				if(!"Area 51".equals(b.getTheWritingOnTheBox()) || b.isTheBoxOpen() != isOpen || b.getArea() != area){
					System.out.println("Error with 2 argument constructor or getters.");
					System.out.println("\tA new box should have the area given, be open or closed as given, and have the name 'Area 51'");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with 2 argument constructor or getters.");
			System.out.println("\tA new box should have the area given, be open or closed as given, and have the name 'Area 51'");
			score -= deduction;
		}

		try{
			//3 argument constructor
			for (int i = 0; i < 100; i++){
				int area = (int)((Math.random()*100)+1);
				boolean isOpen = Math.random()<.5;
				String word = "Dr B Says " + makeUpWord();

				Box b = new Box(area, isOpen, word);
				if(!word.equals(b.getTheWritingOnTheBox()) || b.isTheBoxOpen() != isOpen || b.getArea() != area){
					System.out.println("Error with 3 argument constructor or getters.");
					System.out.println("\tA new box should have the area given, be open or closed as given, and have the name as given");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with 3 argument constructor or getters.");
			System.out.println("\tA new box should have the area given, be open or closed as given, and have the name as given");
			score -= deduction;
		}


		try{
			//bad values in 2 argument constructor
			for (int i = 0; i < 100; i++){

				int area = (int)((Math.random()*100)+1);
				boolean isOpen = Math.random()<.5;

				Box b2 = new Box(-1*area, isOpen);

				if(!"Area 51".equals(b2.getTheWritingOnTheBox()) || b2.isTheBoxOpen() != isOpen || b2.getArea() != 20){

					System.out.println("Error with 2 argument constructor or getters on bad values.");
					System.out.println("\tA new box should have the area given, or 20 if negative, be open or closed as given, and have the name 'Area 51'");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with 2 argument constructor or getters on bad values.");
			System.out.println("\tA new box should have the area given, or 20 if negative, be open or closed as given, and have the name 'Area 51'");
			score -= deduction;
		}

		try{
			//bad values in 3 argument constructor
			for (int i = 0; i < 100; i++){
				int area = (int)((Math.random()*100)+1);
				boolean isOpen = Math.random()<.5;
				String word = "Dr B Says " + makeUpWord();

				Box b1 = new Box(area, isOpen, null);
				Box b2 = new Box(-1*area, isOpen, word);
				Box b3 = new Box(-1*area, isOpen, null);

				if(!"Hagrid's Hut".equals(b1.getTheWritingOnTheBox()) || b1.isTheBoxOpen() != isOpen || b1.getArea() != area ||
						!word.equals(b2.getTheWritingOnTheBox()) || b2.isTheBoxOpen() != isOpen || b2.getArea() != 5 ||
						!"Hagrid's Hut".equals(b3.getTheWritingOnTheBox()) || b3.isTheBoxOpen() != isOpen || b3.getArea() != 5
						){

					System.out.println("Error with 3 argument constructor or getters on bad values.");
					System.out.println("\tA new box should have the area given, or 5 if negative, be open or closed as given, and have the name as given, or 'Hagrid's Hut' if null");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with 3 argument constructor or getters on bad values.");
			System.out.println("\tA new box should have the area given, or 5 if negative, be open or closed as given, and have the name as given, or 'Hagrid's Hut' if null");
			score -= deduction;
		}



		try{
			//writeSomethingOnTheBox - Good Values
			for (int i = 0; i < 100; i++){
				Box b = new Box();

				String word = "Dr B Says " + makeUpWord();
				
				b.writeSomethingOnTheBox(word);
				
				if(!word.equals(b.getTheWritingOnTheBox())){
					System.out.println("Error with writeSomethingOnTheBox method or getters.");
					System.out.println("\tA box should be able to change the writing as given");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with writeSomethingOnTheBox method or getters.");
			System.out.println("\tA box should be able to change the writing as given");
			score -= deduction;
		}

		try{
			//writeSomethingOnTheBox - bad Values
			for (int i = 0; i < 100; i++){
				Box b = new Box();

				b.writeSomethingOnTheBox(null);
				
				if(!"Isn't Java Beautiful".equals(b.getTheWritingOnTheBox())){
					System.out.println("Error with writeSomethingOnTheBox method or getters on bad valuse.");
					System.out.println("\tA box should change the writing to 'Isn't Java Beautiful' for these values");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with writeSomethingOnTheBox method or getters on bad valuse.");
			System.out.println("\tA box should change the writing to 'Isn't Java Beautiful' for these values");
			score -= deduction;
		}
		

		try{
			//Opening and closing the box
			for (int i = 0; i < 100; i++){
				int area = (int)((Math.random()*100)+1);
				boolean isOpen = Math.random()<.5;

				Box b1 = new Box(area, isOpen);
				Box b2 = new Box(area, isOpen);

				b1.openTheBox();
				b2.closeTheBox();
				
				if(b1.isTheBoxOpen() != true || b2.isTheBoxOpen() != false){
					System.out.println("Error with openTheBox, or closeTheBox or the getters.");
					System.out.println("\tA box should be able to be opened or closed");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with openTheBox, or closeTheBox or the getters.");
			System.out.println("\tA box should be able to be opened or closed");
			score -= deduction;
		}
		
		try{
			//Doubling the area
			for (int i = 0; i < 100; i++){
				int area = (int)((Math.random()*100)+2);
				boolean isOpen = Math.random()<.5;

				Box b1 = new Box((int)area/2, isOpen);

				b1.doubleTheArea();
				
				if(b1.getArea() != ((int)(area/2)*2)){
					System.out.println("Error with doubleTheArea or the getters.");
					System.out.println("\tA box should be able to double the area.  Ok, maybe not really, but go with me on this one");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with doubleTheArea or the getters.");
			System.out.println("\tA box should be able to double the area.  Ok, maybe not really, but go with me on this one");
			score -= deduction;
		}


		if(score < 5){
			score = 0;
		}
		System.out.println("Score for Box.java: " + score);


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

}
