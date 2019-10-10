import java.awt.Color;

/**
 * 
 * @author Dr. B.
 *
 */
public class FreewayGrader {

	public static void main(String[] args) {
		int points = 100;
		int deduction = 10;
		System.out.println("Starting grader");

		//Test constructor and getters with good values
		try{
			for(int i = 0; i < 100; i++){
				String s = "Dr Bs Freeway " + i;
				int capacity = (int)(Math.random() * 1000+30);
				Freeway f = new Freeway(s, i%6+1,capacity);
				if(!s.equals(f.getNameOfFreeway())){
					System.out.println("Error: get name of freeway is returning the wrong value");
					points -= deduction;
					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error: get name of freeway is returning the wrong value");
			points -= deduction;
		}
		try{
			for(int i = 0; i < 100; i++){
				String s = "Dr Bs Freeway " + i;
				int capacity = (int)(Math.random() * 1000+30);
				Freeway f = new Freeway(s, i%6+1,capacity);
				if(f.getNumberOfLanes() != i%6+1){
					System.out.println("Error: You do not have the correct number of lanes");
					points -= deduction;
					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error: You do not have the correct number of lanes");
			points -= deduction;
		}
		try{
			for(int i = 0; i < 100; i++){
				String s = "Dr Bs Freeway " + i;
				int capacity = (int)(Math.random() * 1000+30);
				Freeway f = new Freeway(s, i%6+1,capacity);
				if(f.getNumberOfCarsOnFreeway() != 0){
					System.out.println("Error: getNumberOfCarsOnFreeway should return 0 for a new freeway");
					points -= deduction;
					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error: getNumberOfCarsOnFreeway should return 0 for a new freeway");
			points -= deduction;
		}

		//Constructor with bad values
		try{
			for(int i = -1000; i < -6; i++){
				String s = "Dr Bs Freeway " + i;
				int capacity = (int)(Math.random() * 1000+30);
				Freeway f = new Freeway(s, i,capacity);
				Freeway f2 = new Freeway(s, i*-1,capacity);
				if(f.getNumberOfLanes() != 1 || f2.getNumberOfLanes() != 1 ){
					System.out.println("Error: getNumberOfLanes should return 1 when given improper values in the constructor");
					points -= deduction;
					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error: getNumberOfLanes should return 1 when given improper values in the constructor");
			points -= deduction;
		}
		try{
			for(int i = -1000; i < 1; i++){
				String s = "Dr Bs Freeway " + i;
				Freeway f = new Freeway(s, i%6+1,i);
				if(f.getFreewayCapacity() != 1){
					System.out.println("Error: getFreewayCapacity should return 1 when given improper values in the constructor");
					points -= deduction;
					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error: getFreewayCapacity should return 1 when given improper values in the constructor");
			points -= deduction;
		}



		int numCarsAdded = 0;
		//create a few freeways and fill them up to capacity and over fill them
		boolean deductForCapacity = false;
		boolean deductForWrongNumbers = false;
		boolean deductForWrongColorNumber = false;
		try{
			for(int i = 50; i < 100; i++){
				Color [] colors = new Color[10];
				int [] info = new int[colors.length];
				for(int j = 0; j < colors.length; j++){
					colors[j] = new Color((float)Math.random(),(float)Math.random(),(float)Math.random());
				}

				Freeway f = new Freeway("Dr Bs Freeway " + i, i%6+1,i);
				numCarsAdded += i;
				//fill it up
				for(int j = 0; j < i; j++){
					int whichColor = (int)(Math.random()*colors.length);
					info[whichColor]++;
					Car c = new Car(colors[whichColor]);
					boolean b = f.addACar(c);
					
					if(b == false && deductForCapacity == false){
						deductForCapacity = true;
					}
					if(f.getNumberOfCarsOnFreeway() != j+1){
						deductForWrongNumbers = true;
					}
				}
				//Go over the capacity limit
				for(int j = 0; j < i; j++){
					Car c = new Car(Color.RED);
					boolean b = f.addACar(c);
					if(b == true && deductForCapacity == false){
						deductForCapacity = true;
					}
					if(f.getNumberOfCarsOnFreeway() != i){
						deductForWrongNumbers = true;
					}
				}

				//check to see if they got the colors correct
				for(int j = 0; j < info.length; j++){
					if(deductForWrongColorNumber == false && f.getNumberOfCarsWithColor(colors[j])!=info[j]){
						deductForWrongColorNumber = true;
					}
				}

			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("You threw an exception, so the above code didn't work.\n I don't know which methods work or not, so I have to dock you for everything in the grader, then look at it more closely when you turn it in");
			deductForCapacity = true;
			deductForWrongNumbers = true;
			deductForWrongColorNumber = true;
		}

		if(deductForCapacity == true){
			System.out.println("Error: adding a car to a freeway should return true when under capacity and false when over capacity");
			points -= deduction;
		}
		if(deductForWrongNumbers == true){
			System.out.println("Error: adding a car to a freeway should give the correct numbers when calling the getNumberOfCarsOnFreeway method");
			points -= deduction;
		}
		if(deductForWrongColorNumber == true){
			System.out.println("Error: the getNumbersOfCarsWithColor method is not returning the correct results");
			points -= deduction;
		}

		//Check all cars on all freeways
		try{
			int numNewCars = (int)(Math.random()*1000+1000);
			Freeway f = new Freeway("Just for fun", 3,numNewCars+100);
			for(int i = 0; i < numNewCars; i++){
				f.addACar(new Car(Color.RED));
			}
			if(Freeway.getNumberOfCarsOnEveryFreeway() != numCarsAdded + numNewCars){
				System.out.println("Error: the getNumberOfCarsOnEveryFreeway is not returning the correct results");
				points -= deduction;
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error: the getNumberOfCarsOnEveryFreeway is not returning the correct results");
			points -= deduction;
		}

		
		//Try a few gotchas
		try{
			int numNewCars = (int)(Math.random()*1000+1000);
			Freeway f = new Freeway("Just for fun", 3,numNewCars+100);
			for(int i = 0; i < 25; i++){
				f.addACar(new Car(Color.RED));
			}
			boolean b = f.addACar(null);
			if(b != false){
				System.out.println("Error: the addACar method is not returning false on invalid data");
				points -= deduction;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error: the addACar method is not returning false on invalid data");
			points -= deduction;
		}

		
		try{
			int numNewCars = (int)(Math.random()*1000+1000);
			Freeway f = new Freeway("Just for fun", 3,numNewCars+100);
			Car [] c = new Car[100];
			for(int i = 0; i < 25; i++){
				c[i] = new Car(Color.RED);
				f.addACar(c[i]);
			}
			for(int i = 0; i < 25; i++){
				boolean b = f.addACar(c[i]);
				if(b != false){
					System.out.println("Error: the addACar method is not returning false for cars already on the freeway");
					points -= deduction;
					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error: the addACar method is not returning false for cars already on the freeway");
			points -= deduction;
		}

		
		try{
			int numNewCars = (int)(Math.random()*1000+1000);
			Freeway f = new Freeway("Just for fun", 3,numNewCars+100);
			for(int i = 0; i < 25; i++){
				f.addACar(new Car(Color.RED));
			}
			int b = f.getNumberOfCarsWithColor(null);
			if(b != 0){
				System.out.println("Error: the getNumberOfCarsWithColor method is not returning 0 on invalid data");
				points -= deduction;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error: the getNumberOfCarsWithColor method is not returning 0 on invalid data");
			points -= deduction;
		}
		System.out.println("Final Score: " + points);
	}

}
