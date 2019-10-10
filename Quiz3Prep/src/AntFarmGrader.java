/**
 * @author Dr. B.
 */
public class AntFarmGrader {

	public static void main(String[] args) {
		new AntFarmGrader().gradeIt();
	}

	public void gradeIt(){
		int points = 100;
		int deduction = 100/11;
		System.out.println("Starting grader");

		int numTunnels = 0;

		try{
			System.out.println("Testing constructor, getNumberOfTunnels()");
			for(int i = 0; i < 10; i++){
				int numAnts = (int)(Math.random()*100+50);
				AntFarm f = new AntFarm(numAnts);
				numTunnels++;
				if(f.getNumberOfTunnels() != 1){
					System.out.println("\tError: getNumberOfTunnels() is not coming back correctly");
					points -= deduction;
					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\tException error with previous test");
			points -= deduction;
		}

		try{
			System.out.println("Testing bad values for the constructor, getNumberOfTunnels()");
			for(int i = 0; i < 10; i++){
				int numAnts = (int)(Math.random()*100+50)*-1;
				AntFarm f = new AntFarm(numAnts);
				numTunnels++;
				if(f.getNumberOfTunnels() != 1){
					System.out.println("\tError: getNumberOfTunnels() is not coming back correctly");
					points -= deduction;
					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\tException error with previous test");
			points -= deduction;
		}

		try{
			System.out.println("Testing constructor and getTheTotalNumberOfTunnelsInEveryAntFarm()");
			for(int i = 0; i < 10; i++){
				int numAnts = (int)(Math.random()*100+50);
				new AntFarm(numAnts);
				numTunnels++;
				if(AntFarm.getTheTotalNumberOfTunnelsInEveryAntFarm() != numTunnels){
					System.out.println("\tError: getTheTotalNumberOfTunnelsInEveryAntFarm() is not coming back correctly");
					points -= deduction;
					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\tException error with previous test");
			points -= deduction;
		}

		try{
			System.out.println("Testing bad values for the constructor and getTheTotalNumberOfTunnelsInEveryAntFarm()");
			for(int i = 0; i < 10; i++){
				int numAnts = (int)(Math.random()*100+50)*-1;
				new AntFarm(numAnts);
				numTunnels++;
				if( AntFarm.getTheTotalNumberOfTunnelsInEveryAntFarm() != numTunnels){
					System.out.println("\tError: getTheTotalNumberOfTunnelsInEveryAntFarm() is not coming back correctly");
					points -= deduction;
					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\tException error with previous test");
			points -= deduction;
		}


		try{
			System.out.println("Testing addATunnelToTheFarm() with getNumberOfTunnels() and getTheTotalNumberOfTunnelsInEveryAntFarm()");
			for(int i = 0; i < 10; i++){
				int numAnts = (int)(Math.random()*100+50);
				AntFarm f = new AntFarm(numAnts);
				numTunnels++;
				for(int j = 0; j < (int)(Math.random()*100+5); j++){
					f.addATunnelToTheFarm();
					numTunnels++;
					if(f.getNumberOfTunnels() != j+2 || AntFarm.getTheTotalNumberOfTunnelsInEveryAntFarm() != numTunnels){
						System.out.println("\tError: getNumberOfTunnels() or getTheTotalNumberOfTunnelsInEveryAntFarm() is not coming back correctly");
						points -= deduction;

						i=10;
						break;
					}
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\tException error with previous test");
			points -= deduction;
		}

		//TODO = TOO MANY ANTS
		try{
			System.out.println("Testing addAnAnt() return values");
			for(int i = 0; i < 10; i++){
				int numAnts = (int)(Math.random()*100+50);
				AntFarm f = new AntFarm(numAnts);
				DrBsHelper z = new DrBsHelper();
				DrBsHelper y = new DrBsHelper();
				Ant[] a = getAnts(numAnts, z, 3);
				Ant[] b = getAnts(numAnts, y, 3);
				boolean worked = true;
				for(int j = 0; j < a.length; j++){
					worked = f.addAnAnt(a[j]);
					if(worked == false){
						break;
					}
				}
				for(int j = 0; j < a.length; j++){
					if(worked != true || f.addAnAnt(b[j]) != false){
						System.out.println("\tError: addAnAnt() does not return correctly");
						points -= deduction;

						i = 10;
						break;
					}
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\tException error with previous test");
			points -= deduction;
		}

		try{
			System.out.println("Testing addAnAnt() with isThisAntInTheFarm()");
			for(int i = 0; i < 10; i++){
				int numAnts = (int)(Math.random()*100+50);
				AntFarm f = new AntFarm(numAnts);
				DrBsHelper z = new DrBsHelper();
				DrBsHelper y = new DrBsHelper();
				Ant[] a = getAnts(numAnts, z, 3);
				Ant[] b = getAnts(numAnts, y, 3);
				for(int j = 0; j < a.length; j++){
					f.addAnAnt(a[j]);
				}
				for(int j = 0; j < a.length; j++){
					boolean a1;
					boolean a2;
					if(Math.random()< 0.5){
						a1 = f.isThisAntInTheFarm(a[j]);
						a2 = f.isThisAntInTheFarm(b[j]);
					}
					else{
						a2 = f.isThisAntInTheFarm(b[j]);
						a1 = f.isThisAntInTheFarm(a[j]);
					}

					if(a1 != true && a2 != false){
						System.out.println("\tError: isThisAntInTheFarm() is not coming back correctly");
						points -= deduction;

						i = 10;
						break;
					}
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\tException error with previous test");
			points -= deduction;
		}

		try{
			System.out.println("Testing addAnAnt() with howManyAntsAreWorkerAnts()");
			for(int i = 0; i < 10; i++){
				int numAnts = (int)(Math.random()*100+50);
				AntFarm f = new AntFarm(numAnts);
				DrBsHelper z = new DrBsHelper();
				Ant[] a = getAnts(numAnts, z, 3);
				for(int j = 0; j < a.length; j++){
					f.addAnAnt(a[j]);
				}
				if(f.howManyAntsAreWorkerAnts() != z.a){
					System.out.println("\tError: howManyAntsAreWorkerAnts() is not coming back correctly" + f.howManyAntsAreWorkerAnts() + " " + z.a + " " + z.b + " " + z.c);
					points -= deduction;

					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\tException error with previous test");
			points -= deduction;
		}

		try{
			System.out.println("Testing addAnAnt() with howManyAntsAreBuilderAnts()");
			for(int i = 0; i < 10; i++){
				int numAnts = (int)(Math.random()*100+50);
				AntFarm f = new AntFarm(numAnts);
				DrBsHelper z = new DrBsHelper();
				Ant[] a = getAnts(numAnts, z, 3);
				for(int j = 0; j < a.length; j++){
					f.addAnAnt(a[j]);
				}
				if(f.howManyAntsAreBuilderAnts() != z.b){
					System.out.println("\tError: howManyAntsAreBuilderAnts() is not coming back correctly");
					points -= deduction;

					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\tException error with previous test");
			points -= deduction;
		}

		try{
			System.out.println("Testing addAnAnt() with canTheAntsStartANewFarm() and willTheAntFarmDie() good values");
			for(int i = 0; i < 10; i++){
				int numAnts = (int)(Math.random()*100+50);
				AntFarm f = new AntFarm(numAnts);
				DrBsHelper z = new DrBsHelper();
				Ant[] a = getAnts(numAnts, z, 3);
				for(int j = 0; j < a.length; j++){
					f.addAnAnt(a[j]);
				}
				if((f.canTheAntsStartANewFarm()==false||f.willTheAntFarmDie()==true)&&z.c>1){
					System.out.println("\tError: canTheAntsStartANewFarm() or and willTheAntFarmDie() is not coming back correctly");
					points -= deduction;

					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\tException error with previous test");
			points -= deduction;
		}

		try{
			System.out.println("Testing addAnAnt() with canTheAntsStartANewFarm() and willTheAntFarmDie() bad values");
			for(int i = 0; i < 10; i++){
				int numAnts = (int)(Math.random()*100+50);
				AntFarm f = new AntFarm(numAnts);
				DrBsHelper z = new DrBsHelper();
				Ant[] a = getAnts(numAnts, z, 2);
				for(int j = 0; j < a.length; j++){
					f.addAnAnt(a[j]);
				}
				if((f.canTheAntsStartANewFarm()==true||f.willTheAntFarmDie()==false)&&z.c<1){
					System.out.println("\tError: canTheAntsStartANewFarm() or and willTheAntFarmDie() is not coming back correctly");
					points -= deduction;

					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\tException error with previous test");
			points -= deduction;
		}

		System.out.println("Final Score: " + points);

	}

	public static Ant[] getAnts(int num, DrBsHelper b,int maxO){
		Ant [] a = new Ant[num];
		for(int i = 0; i < a.length; i++){
			int z = (int)(Math.random()*maxO);
			b.a += z == 0? 1:0;
			b.b += z == 1? 1:0;
			b.c += z == 2? 1:0;
			a[i] = new Ant(z);
		}

		return a;
	}

	private class DrBsHelper{
		public int a,b,c;
	}

}
