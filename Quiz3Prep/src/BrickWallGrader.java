import java.awt.Color;
import java.util.Vector;

public class BrickWallGrader {

	public static void main(String[] args) {
		int points = 100;
		int deduction = points/9;

		int totalMoney = 0;

		System.out.println("Testing 3 argument Constructor and getters on good values");
		try{

			for(int i = 0; i < 50; i++){

				Person p = createDoner();
				int numBricks = (int)(1+Math.random()*10000);
				int d = (int)(Math.random()*10000+11);
				totalMoney+=d;

				BrickWall b = new BrickWall(numBricks,d,p);

				if(b.getCurrentAmountOfBricks() != 0 || b.getAmountOfBricksLeftToAdd() != numBricks || b.getCurrentDonationAmount() != d || b.getPersonWhoDonatedTheMost() != p){
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
		
		System.out.println("Testing 3 argument Constructor and getters on bad values");
		try{

			for(int i = 0; i < 100; i++){

				Person p = createDoner();
				int numBricks = (int)(Math.random()*20+1); //1 - 20
				int d = (int)(Math.random()*10+11); //11 - 20
				totalMoney+=d;
				totalMoney+=d;
				totalMoney+=20;


				BrickWall b1 = new BrickWall(numBricks*-20,d,p); //Bad first parameter
				BrickWall b2 = new BrickWall(numBricks,d*-20,p); //Bad second parameter
				BrickWall b3 = new BrickWall(numBricks,d,null); //Bad third parameter
				BrickWall b4 = new BrickWall(numBricks*-20,d*-20,null); //Bad all parameters



				if(b1.getCurrentAmountOfBricks() != 0 || b2.getCurrentAmountOfBricks() != 0 || b3.getCurrentAmountOfBricks() != 0 ||  b4.getCurrentAmountOfBricks() != 0 ||   
						b1.getAmountOfBricksLeftToAdd() != 1 || b2.getAmountOfBricksLeftToAdd() != numBricks || b3.getAmountOfBricksLeftToAdd() != numBricks || b4.getAmountOfBricksLeftToAdd() != 1 || 
						b1.getCurrentDonationAmount() != d || b2.getCurrentDonationAmount() != 10 || b3.getCurrentDonationAmount() != d || b4.getCurrentDonationAmount() != 10 ||
						b1.getPersonWhoDonatedTheMost() != p || b2.getPersonWhoDonatedTheMost() != p || !"Unknown".equals(b3.getPersonWhoDonatedTheMost().getFirstName()) || !"Donation".equals(b3.getPersonWhoDonatedTheMost().getLastName()) || !"Unknown".equals(b4.getPersonWhoDonatedTheMost().getFirstName()) || !"Donation".equals(b4.getPersonWhoDonatedTheMost().getLastName())
						){
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
		
		System.out.println("Testing newDoner on good values, with the getCurrentDonationAmount and getPersonWhoDonatedTheMost");
		try{

			for(int i = 0; i < 50; i++){

				Person p = createDoner();
				int numBricks = (int)(1+Math.random()*10000);
				int d = (int)(Math.random()*10+11);
				int max = d;
				int total = d;
				totalMoney+=d;

				BrickWall b = new BrickWall(numBricks,d,p);

				for(int j = 0; j < 100; j++){
					Person p1 = createDoner();
					int amount = (int)(Math.random()*1000+100);
					totalMoney+=amount;
					b.newDoner(p1, amount);
					total += amount;
					if(amount > max){
						max = amount;
						p = p1;
					}
				}


				if(b.getCurrentDonationAmount() != total || b.getPersonWhoDonatedTheMost() != p){
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

		System.out.println("Testing newDoner on bad values, with the getCurrentDonationAmount and getPersonWhoDonatedTheMost");
		try{

			for(int i = 0; i < 50; i++){

				Person p = createDoner();
				int numBricks = (int)(1+Math.random()*10000);
				int d = (int)(Math.random()*10+11);
				int max = d;
				int total = d;
				totalMoney+=d;

				BrickWall b = new BrickWall(numBricks,d,p);

				for(int j = 0; j < 100; j++){
					Person p1 = createDoner();
					int amount = (int)(Math.random()*1000+100);

					if(Math.random() < 0.5){
						p1 = null;
						total += amount;
						totalMoney+=amount;
					}
					else{
						amount *= -1;
					}

					b.newDoner(p1, amount);
					if(amount > max && p1 != null){
						max = amount;
						p = p1;
					}
				}


				if(b.getCurrentDonationAmount() != total || b.getPersonWhoDonatedTheMost() != p){
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

		System.out.println("Testing addABrick and getABrickByNumber on good values");
		try{

			for(int i = 0; i < 50; i++){

				Person p = createDoner();
				int numBricks = (int)(1+Math.random()*10000);
				int d = (int)(Math.random()*10+11);
				totalMoney+=d;

				BrickWall b = new BrickWall(numBricks,d,p);

				Vector<Brick> z = cb(numBricks, null);

				for(int j = 0; j < numBricks; j++){
					b.addABrick(z.elementAt(j));
				}
				for(int j = 0; j < numBricks; j++){
					if(b.getABrickByNumber(j) != z.elementAt(j)){
						points -= deduction;
						System.out.println("\tError");
						i = 50;
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

		System.out.println("Testing addABrick and getABrickByNumber on bad values");
		try{

			for(int i = 0; i < 50; i++){

				Person p = createDoner();
				int numBricks = (int)(1+Math.random()*10000);
				int d = (int)(Math.random()*10+11);
				totalMoney+=d;

				BrickWall b = new BrickWall(numBricks,d,p);

				Vector<Brick> z = cb(numBricks, null);

				for(int j = 0; j < numBricks; j++){
					b.addABrick(z.elementAt(j));
				}
				boolean firstStop = false;
				for(int j = -10; j < 0; j++){
					if(b.getABrickByNumber(j) != null){
						points -= deduction;
						System.out.println("\tError");
						i = 50;
						firstStop = true;
						break;
					}
				}	
				for(int j = numBricks+1; j < numBricks+10 && firstStop == false; j++){
					if(b.getABrickByNumber(j) != null){
						points -= deduction;
						System.out.println("\tError");
						i = 50;
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

		System.out.println("Testing addABrick and howManyBricksAreBroken");
		try{

			for(int i = 0; i < 50; i++){

				Person p = createDoner();
				int numBricks = (int)(1+Math.random()*10000);
				int d = (int)(Math.random()*10+11);
				totalMoney+=d;

				BrickWall b = new BrickWall(numBricks,d,p);

				Vector<Brick> z = cb(numBricks, null);

				for(int j = 0; j < numBricks; j++){
					b.addABrick(z.elementAt(j));
				}

				if(b.howManyBricksAreBroken() != broken){
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

		System.out.println("Testing addABrick and howManyBricksAreThisColor");
		try{

			for(int i = 0; i < 50; i++){

				Person p = createDoner();
				int numBricks = (int)(1+Math.random()*10000);
				int d = (int)(Math.random()*10+11);
				totalMoney+=d;

				BrickWall b = new BrickWall(numBricks,d,p);

				Color c = colors[(int)(Math.random()*colors.length)];

				Vector<Brick> z = cb(numBricks, c);

				for(int j = 0; j < numBricks; j++){
					b.addABrick(z.elementAt(j));
				}

				if(b.howManyBricksAreThisColor(c) != color){
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


		System.out.println("Testing howMuchMoneyWasMadeForAllBrickWalls");
		try{

			if(BrickWall.howMuchMoneyWasMadeForAllBrickWalls() != totalMoney){
				points -= deduction;
				System.out.println("\tError");

			}
		}
		catch(Exception e){
			e.printStackTrace();
			points -= deduction;
			System.out.println("\tError");
		}

		if(points < 3){
			points = 0;
		}
		System.out.println("Score for BrickWallGrader: " + points);

	}


	private static String [] names = {"Albus Percival Wulfric Brian Dumbledore","Serverus Snape","Miverva McGonagall","Filius Flitwick","Pomona Sprout","Horace Slughorn","Barty Crouch","Mad-Eye Moody","Wilhelmina Grubbly-Plank","Dolores Umbridge","Rubeus Hagrid","Sybill Trelawney","Rolanda Hooch","Quirinus Quirrell","Gilderoy Lockheart"};
	private static Person createDoner(){
		int n = (int)(Math.random()*names.length);
		String first = names[n].substring(0, names[n].indexOf(" "));
		String last  = names[n].substring(names[n].indexOf(" ")+1);;
		//System.out.println("First: '"+first+"' '" + last+"'");

		return new Person(first,last);
	}

	private static Color [] colors = null;
	private static int broken = 0;
	private static int color = 0;
	private static Vector<Brick> cb(int m, Color c){
		broken = 0;
		color = 0;
		Vector<Brick> a = new Vector<Brick>();
		for(int i = 0; i < m;  i++){
			Brick b = createBrick();
			a.add(b);
			if(b.isBroken()){
				broken++;
			}
			if(c == b.getColor()){
				color++;
			}
		}
		return a;
	}
	private static Brick createBrick(){
		if(colors == null){
			colors = new Color[300];
			for(int i = 0; i < colors.length; i++){
				colors[i] = new Color((float)(Math.random()),(float)(Math.random()),(float)(Math.random()));
			}
		}
		boolean isBroken = Math.random() < .7;
		int width = (int)(Math.random()*1000+10);
		int height = (int)(Math.random()*1000+10);
		Color c = colors[(int)(Math.random()*colors.length)];
		return new Brick(isBroken, width, height, c);
	}



}
