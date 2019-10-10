
public class ElevatorGrader{

	public static void main (String [] args){

		int points = 100;
		int deduction = points/8;

		/*
		System.out.println("Testing 1 argument Constructor and 5 getters");
		try{

			for(int i = 0; i < 100; i++){

				int totalFloorsHigh = (int)(Math.random()*65)+2;
				Elevator b = new Elevator(totalFloorsHigh);

				if(b.getCurrentFloor() != 1 || b.getNumFloorsHigh() != totalFloorsHigh || b.getMaxWeight() != 2500 || b.getCurrentWeightInElevator() != 2 || b.getCurrentNumberOfPeopleOnTheElevator() != 0){
					points -= deduction;
					System.out.println("\tError");
					break;
				}
			}	
		}
		catch(Exception e){
			e.printStackTrace();
			points -= deduction;
			System.out.println("\tError");
		}
		System.out.println("Testing 1 argument Constructor and 5 getters on BAD values");
		try{

			for(int i = 0; i < 100; i++){

				int totalFloorsHigh = ((int)(Math.random()*65)+2)*-1;
				Elevator b = new Elevator(totalFloorsHigh);

				int totalFloorsHigh2 = ((int)(Math.random()*65)+72);
				Elevator b2 = new Elevator(totalFloorsHigh2);

				if(b.getCurrentFloor() != 1 || b.getNumFloorsHigh() != 10 || b.getMaxWeight() != 2500 || b.getCurrentWeightInElevator() != 2 || b.getCurrentNumberOfPeopleOnTheElevator() != 0 ||
						b2.getCurrentFloor() != 1 || b2.getNumFloorsHigh() != 10 || b2.getMaxWeight() != 2500 || b2.getCurrentWeightInElevator() != 2 || b2.getCurrentNumberOfPeopleOnTheElevator() != 0){
					points -= deduction;
					System.out.println("\tError");
					break;
				}
			}	
		}
		catch(Exception e){
			e.printStackTrace();
			points -= deduction;
			System.out.println("\tError");
		}
		*/
		System.out.println("Testing 2 argument Constructor and 5 getters");
		try{

			for(int i = 0; i < 100; i++){

				int totalFloorsHigh = (int)(Math.random()*65)+2;
				int weight = (int)(Math.random()*48000)+1000;
				Elevator b = new Elevator(totalFloorsHigh,weight);

				if(b.getCurrentFloor() != 1 || b.getNumFloorsHigh() != totalFloorsHigh || b.getMaxWeight() != weight || b.getCurrentWeightInElevator() != 2 || b.getCurrentNumberOfPeopleOnTheElevator() != 0){
					points -= deduction;
					System.out.println("\tError");
					break;
				}
			}	
		}
		catch(Exception e){
			e.printStackTrace();
			points -= deduction;
			System.out.println("\tError");
		}
		System.out.println("Testing 2 argument Constructor and 5 getters on BAD values");
		try{

			for(int i = 0; i < 100; i++){

				int totalFloorsHigh = ((int)(Math.random()*65)+2)*-1;
				int weight = ((int)(Math.random()*48000)+1000)*-1;
				Elevator b = new Elevator(totalFloorsHigh,weight);

				int totalFloorsHigh2 = ((int)(Math.random()*65)+72);
				int weight2 = (int)(Math.random()*48000)+50001;
				Elevator b2 = new Elevator(totalFloorsHigh2,weight2);

				if(b.getCurrentFloor() != 1 || b.getNumFloorsHigh() != 10 || b.getMaxWeight() != 4000 || b.getCurrentWeightInElevator() != 2 || b.getCurrentNumberOfPeopleOnTheElevator() != 0 ||
						b2.getCurrentFloor() != 1 || b2.getNumFloorsHigh() != 10 || b2.getMaxWeight() != 4000 || b2.getCurrentWeightInElevator() != 2 || b2.getCurrentNumberOfPeopleOnTheElevator() != 0){
					points -= deduction;
					System.out.println("\tError");
					break;
				}
			}	
		}
		catch(Exception e){
			e.printStackTrace();
			points -= deduction;
			System.out.println("\tError");
		}





		System.out.println("Testing goToFloor");
		try{

			for(int i = 0; i < 100; i++){

				int totalFloorsHigh = (int)(Math.random()*65)+2;
				int weight = (int)(Math.random()*48000)+1000;
				Elevator b = new Elevator(totalFloorsHigh,weight);

				for(int j = 0; j < 50; j++){
					int rand = (int)(Math.random()*(totalFloorsHigh-1)+1);
					b.goToFloor(rand);

					if(b.getCurrentFloor() != rand){
						points -= deduction;
						System.out.println("\tError");
						i = 100;
						break;
					}
				}

			}	
		}
		catch(Exception e){
			e.printStackTrace();
			points -= deduction;
			System.out.println("\tError");
		}

		System.out.println("Testing personEnteredElevator, and getCurrentWeightInElevator");
		try{

			for(int i = 0; i < 100; i++){

				int totalFloorsHigh = (int)(Math.random()*65)+2;
				int weight = (int)(Math.random()*48000)+1000;
				Elevator b = new Elevator(totalFloorsHigh,weight);

				int [] w = new int[10];
				int current = 2;
				for(int j = 0; j < 10; j++){
					w[j] = (int)(Math.random()*(100)+1);
				}
				for(int j = 0; j < 10; j++){
					b.personEnteredElevator(generateName(), w[j]);
					current+=w[j];

					if(b.getCurrentWeightInElevator() != current){
						points -= deduction;
						System.out.println("\tError");
						i = 100;
						break;
					}
				}

			}	
		}
		catch(Exception e){
			e.printStackTrace();
			points -= deduction;
			System.out.println("\tError");
		}

		System.out.println("Testing personEnteredElevator, and getCurrentNumberOfPeopleOnTheElevator");
		try{

			for(int i = 0; i < 100; i++){

				int totalFloorsHigh = (int)(Math.random()*65)+2;
				int weight = (int)(Math.random()*48000)+1000;
				Elevator b = new Elevator(totalFloorsHigh, weight);

				for(int j = 0; j < 10; j++){
					b.personEnteredElevator(generateName(), (int)(Math.random()*100+1));

					if(b.getCurrentNumberOfPeopleOnTheElevator() != j+1){
						points -= deduction;
						System.out.println("\tError");
						i = 100;
						break;
					}
				}

			}	
		}
		catch(Exception e){
			e.printStackTrace();
			points -= deduction;
			System.out.println("\tError");
		}

		System.out.println("Testing personEnteredElevator, and getPersonByNumber");
		try{

			for(int i = 0; i < 100; i++){

				int totalFloorsHigh = (int)(Math.random()*65)+2;
				int weight = (int)(Math.random()*48000)+1000;
				Elevator b = new Elevator(totalFloorsHigh,weight);

				String [] w = new String[10];
				for(int j = 0; j < 10; j++){
					w[j] = "Dr " + generateName();
				}
				for(int j = 0; j < 10; j++){
					b.personEnteredElevator(w[j], (int)(Math.random()*100+1));
				}
				for(int j = 0; j < 10; j++){
					if(! w[j].equals(b.getPersonByNumber(j))){
						points -= deduction;
						System.out.println("\tError");
						i = 100;
						break;
					}
				}
			}	
		}
		catch(Exception e){
			e.printStackTrace();
			points -= deduction;
			System.out.println("\tError");
		}

		System.out.println("Testing getPersonByNumber on bad values");
		try{

			for(int i = 0; i < 100; i++){

				int totalFloorsHigh = (int)(Math.random()*65)+2;
				int weight = (int)(Math.random()*48000)+1000;
				Elevator b = new Elevator(totalFloorsHigh,weight);

				int num = (int)Math.random()*5+5;
				String [] w = new String[num];
				for(int j = 0; j < num; j++){
					w[j] = "Dr " + generateName();
				}
				for(int j = 0; j < num; j++){
					b.personEnteredElevator(w[j], (int)(Math.random()*100+1));
				}
				for(int j = -5; j < 30; j++){
					if(j < 0 || j >= num){
						if(! "INVALID".equals(b.getPersonByNumber(j))){
							points -= deduction;
							System.out.println("\tError");
							i = 100;
							break;
						}
					}
				}
			}	
		}
		catch(Exception e){
			e.printStackTrace();
			points -= deduction;
			System.out.println("\tError");
		}


		System.out.println("Testing Copy Constructor, with Deep copy");
		try{
			for(int i = 0; i < 100; i++){

				int totalFloorsHigh = (int)(Math.random()*45)+10;
				int weight = (int)(Math.random()*48000)+1000;
				Elevator b = new Elevator(totalFloorsHigh,weight);

				int num = (int)Math.random()*5+5;
				String [] w = new String[num];
				for(int j = 0; j < num; j++){
					w[j] = "Dr " + generateName();
				}
				int current = 2;
				for(int j = 0; j < num; j++){
					int r = (int)(Math.random()*100+1);
					b.personEnteredElevator(w[j], r);
					current+=r;
				}
				int f = (int)(Math.random()*5)+1;
				b.goToFloor(f);
				
				Elevator b2 = new Elevator(b);
				int num2 = (int)Math.random()*3+3;
				String [] w2 = new String[num2];
				int current2 = current;
				for(int j = 0; j < num2; j++){
					w2[j] = "Dr " + generateName();
				}
				for(int j = 0; j < num2; j++){
					int r = (int)(Math.random()*100+1);
					b2.personEnteredElevator(w2[j], r);
					current2+=r;
				}
				
				//Test the primitives
				if(b.getCurrentFloor() != f || b.getNumFloorsHigh() != totalFloorsHigh || b.getMaxWeight() != weight || b.getCurrentWeightInElevator() != current || b.getCurrentNumberOfPeopleOnTheElevator() != num ||
						b2.getCurrentFloor() != f || b2.getNumFloorsHigh() != totalFloorsHigh || b2.getMaxWeight() != weight || b2.getCurrentWeightInElevator() != current2 || b2.getCurrentNumberOfPeopleOnTheElevator() != num+num2){

					points -= deduction;
					System.out.println("\tError with non-array variables");
					i = 100;
					break;

				}
				//test all the good values
				for(int j = 0; j < num; j++){
					if(! w[j].equals(b.getPersonByNumber(j)) || ! w[j].equals(b2.getPersonByNumber(j))){
						points -= deduction;
						System.out.println("\tError with first group of people");
						i = 100;
						break;
					}
				}
				for(int j = 0; j < num2; j++){
					if(! "INVALID".equals(b.getPersonByNumber(j+num)) || ! w2[j].equals(b2.getPersonByNumber(j+num))){
						points -= deduction;
						System.out.println("\tError with out of bounds people on the first elevator, and good people on the second");
						i = 100;
						break;
					}
				}
			}	
		}
		catch(Exception e){
			e.printStackTrace();
			points -= deduction;
			System.out.println("\tError");
		}


		if(points < 5){
			points = 0;
		}
		System.out.println("Score for Elevator: " + points);

	}

	public static boolean isInTheArray(int num, int [] a){
		for(int i = 0; i < a.length; i++){
			if(a[i] == num){
				return true;
			}
		}
		return false;
	}

	public static boolean notClose(double a, double b){
		double ep = 0.0000001;
		if(a + ep > b && b + ep > a){
			return false;
		}
		return true;
	}

	public static String generateName(){
		String t = "";
		String [] args = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(int j = 0; j < 200; j++){
			int rand = (int)(Math.random()*args.length);
			t = t + args[rand];
		}
		return t;
	}


}
