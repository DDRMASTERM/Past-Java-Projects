import java.awt.Color;
import java.util.Collections;
import java.util.Vector;

public class DeskGrader {

	public static void main(String[] args) {
		int points = 100;
		int deduction = points/11;

		int totalDesks = 0;

		System.out.println("Testing no argument Constructor and getters on good values");
		try{

			for(int i = 0; i < 50; i++){
				Desk d = new Desk();
				totalDesks+=1;

				if(d.howManyPapersCanStillFitInTheDrawer() != 10000 || d.theDeskIsLocked() != true || d.theDrawerIsOpen() != false){
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

		System.out.println("Testing 3 argument Constructor and getters on good values");
		try{

			for(int i = 0; i < 50; i++){
				boolean a = Math.random() < 0.5;
				boolean b = Math.random() < 0.5;
				int max = (int)(Math.random() * 100000+1001);
				Desk d = new Desk(a,max,b);
				totalDesks+=1;

				if(d.howManyPapersCanStillFitInTheDrawer() != max || d.theDeskIsLocked() != a || d.theDrawerIsOpen() == b){
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
				boolean a = Math.random() < 0.5;
				boolean b = Math.random() < 0.5;
				int max = (int)(Math.random() * 2000-1000);
				Desk d = new Desk(a,max,b);
				totalDesks+=1;

				if(d.howManyPapersCanStillFitInTheDrawer() != 1000 || d.theDeskIsLocked() != a || d.theDrawerIsOpen() == b){
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

		System.out.println("Testing openDrawer and closeDrawer, with theDrawerIsOpen method, and not having it locked");
		try{

			for(int i = 0; i < 50; i++){

				boolean a = Math.random() < 0.5;
				boolean b = Math.random() < 0.5;
				int max = (int)(Math.random() * 100000+1001);
				Desk d = new Desk(false,max,a);
				totalDesks+=1;

				for(int j = 0; j < 100; j++) {
					if(Math.random() < 0.5) {
						d.openDrawer();
						if(d.theDrawerIsOpen() != true){
							points -= deduction;
							System.out.println("\tError");
							i = 100;
							break;
						}
					}
					else {
						d.closeDrawer();
						if(d.theDrawerIsOpen() != false){
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

		System.out.println("Testing openDrawer and closeDrawer, with theDrawerIsOpen method, and when drawer is locked");
		try{

			for(int i = 0; i < 100; i++){

				boolean a = Math.random() < 0.5;
				boolean b = Math.random() < 0.5;
				int max = (int)(Math.random() * 100000+1001);
				Desk d = new Desk(true,max,a);
				totalDesks+=1;

				for(int j = 0; j < 50; j++) {
					if(Math.random() < 0.5) {
						d.openDrawer();
						if(d.theDrawerIsOpen() == a){
							points -= deduction;
							System.out.println("\tError");
							i = 100;
							break;
						}
					}
					else {
						d.closeDrawer();
						if(d.theDrawerIsOpen() == a){
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

		System.out.println("Testing addAPaperToDrawer with howManyPapersCanStillFitInTheDrawer");
		try{

			for(int i = 0; i < 50; i++){
				Desk d = new Desk();
				totalDesks+=1;
				for(int j = 0; j < 500; j++) {
					Paper p = createPaper();
					d.addAPaperToDrawer(p);

					if(d.howManyPapersCanStillFitInTheDrawer() != 10000-j-1){
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

		System.out.println("Testing addAPaperToDrawer with howManyPapersCanStillFitInTheDrawer by trying to cram in too many papers");
		try{

			for(int i = 0; i < 50; i++){
				boolean a = Math.random() < 0.5;
				boolean b = Math.random() < 0.5;
				int max = (int)(Math.random() * 100000+1001);
				Desk d = new Desk(a,max,b);
				totalDesks+=1;
				
				for(int j = 0; j < max; j++) {
					Paper p = createPaper();
					d.addAPaperToDrawer(p);
				}
				
				for(int j = 0; j < max; j++) {
					Paper p = createPaper();
					d.addAPaperToDrawer(p);
					if(d.howManyPapersCanStillFitInTheDrawer() != 0) {
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

		
		System.out.println("Testing isThisPaperInTheDesk with papers that are in the desk, and papers that are not in the desk");
		try{

			for(int i = 0; i < 50; i++){
				Desk d = new Desk();
				totalDesks+=1;


				String s = makeUpWord();
				int w = (int)(Math.random()*1000+1000);
				int x = (int)(Math.random()*30+1);
				Vector<Paper> z = cb(w,x,s);

				for(int j = 0; j < w; j++){
					d.addAPaperToDrawer(z.elementAt(j));
				}
				Collections.shuffle(z);

				for(int j = 0; j < w; j++) {

					int small = (int)(Math.random() * 5+3);

					for (int k = 0; k < small; k++) {
						Paper p = createPaper();
						if(d.isThisPaperInTheDesk(p) == true) {
							points -= deduction;
							System.out.println("\tError");
							i = 100;
							j = w;
							break;
						}
					}
					if(j != w && d.isThisPaperInTheDesk(z.elementAt(j)) != true){
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

		System.out.println("Testing howMayPapersHaveThisExactWriting after adding papers");
		try{

			for(int i = 0; i < 50; i++){
				Desk d = new Desk();
				totalDesks+=1;


				String s = makeUpWord();
				int w = (int)(Math.random()*1000+1000);
				int x = (int)(Math.random()*30+1);
				Vector<Paper> z = cb(w,x,s);

				for(int j = 0; j < w; j++){
					d.addAPaperToDrawer(z.elementAt(j));
				}

				if(d.howMayPapersHaveThisExactWriting(s) != color){
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

		System.out.println("Testing howManyPapersInTheDrawerAreThisHigh after adding papers");
		try{

			for(int i = 0; i < 50; i++){
				Desk d = new Desk();
				totalDesks+=1;


				String s = makeUpWord();
				int w = (int)(Math.random()*1000+1000);
				int x = (int)(Math.random()*30+1);
				Vector<Paper> z = cb(w,x,s);

				for(int j = 0; j < w; j++){
					d.addAPaperToDrawer(z.elementAt(j));
				}

				if(d.howManyPapersInTheDrawerAreThisHigh(x) != broken){
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


		System.out.println("Testing howManyDesksHaveBeenCreated");
		try{

			if(Desk.howManyDesksHaveBeenCreated() != totalDesks){
				points -= deduction;
				System.out.println("\tError");

			}
		}
		catch(Exception e){
			e.printStackTrace();
			points -= deduction;
			System.out.println("\tError");
		}
		
		if(points == 1) {
			points = 0;
		}

		System.out.println("Score for DeskGrader: " + points);

	}


	private static String [] names = {"Albus Percival Wulfric Brian Dumbledore","Serverus Snape","Miverva McGonagall","Filius Flitwick","Pomona Sprout","Horace Slughorn","Barty Crouch","Mad-Eye Moody","Wilhelmina Grubbly-Plank","Dolores Umbridge","Rubeus Hagrid","Sybill Trelawney","Rolanda Hooch","Quirinus Quirrell","Gilderoy Lockheart"};
	private static Paper createPaper(){
		int n = (int)(Math.random()*names.length);
		int height = (int)(Math.random()*30+1);

		return new Paper("Belongs to " + names[n], height);
	}

	private static int broken = 0;
	private static int color = 0;
	private static Vector<Paper> cb(int n, int m, String s){
		Vector<Paper> a = new Vector<Paper>();
		broken = 0;
		color = 0;
		for(int i = 0; i < n;  i++){
			Paper b = createPaper();
			a.add(b);
			if(b.getHeight() == m){
				broken++;
			}
			if(Math.random() < 0.15){
				b.setWriting(new String(s));
				color++;
			}
		}
		return a;
	}

	public static String makeUpWord(){
		String t = "";
		String [] args = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z", " "};
		for(int j = 0; j < 25; j++){
			int rand = (int)(Math.random()*args.length);
			t = t + args[rand];
		}
		return "Belongs to "+t;
	}




}
