/**
 * 
 * @author
 *
 */
public class AntFarm {
	private static int TotalTunnels=0;
	
	private Ant [] antFarm;
	private int numberOfAnts;
	private int numberOfTunnels;
	/**
	 * This constructor creates a new Ant Farm
	 * 
	 * An ant farm created with this constructor should have
	 * 
	 * @param maxAnts The maximum number of Ants the farm can ever have
	 * and 1 tunnel
	 * 
	 * GOTCHAS: Do not allow less than 1 maxAnt, or crash on invalid numbers.
	 */
	public AntFarm(int maxAnts){
		if(maxAnts<1)
			this.antFarm=new Ant[1];
		else
			this.antFarm=new Ant [maxAnts];
		this.numberOfAnts=0;
		this.numberOfTunnels=1;
		TotalTunnels++;
	}

	/**
	 * This method should
	 * @return the current number of tunnels in the farm
	 */
	public int getNumberOfTunnels(){
		return this.numberOfTunnels;
	}
	
	/**
	 * @return the total number of tunnels in every ant farm ever created
	 */
	public static int getTheTotalNumberOfTunnelsInEveryAntFarm(){
		return TotalTunnels;
	}

	/**
	 * This method should add a tunnel to the farm
	 */
	public void addATunnelToTheFarm(){
		this.numberOfTunnels++;
		TotalTunnels++;
		
	}

	/**
	 *This method should add an ant to the Farm 
	 * @param a the Ant to add
	 * @return true if there is room for the Ant, or false if there are too many ants
	 */
	public boolean addAnAnt(Ant a){
		if(this.numberOfAnts>=this.antFarm.length)
			return false;
		else {
			this.antFarm[numberOfAnts]=a;
			this.numberOfAnts++;
		}
		return true;
	}
	
	/**
	 * This method 
	 * @param a The Ant that we are looking for
	 * @return true if the ant is in the Farm, false if it is not
	 */
	public boolean isThisAntInTheFarm(Ant a){
		boolean equalsAnt=false;
		for(int i=0; i<this.antFarm.length; i++) {
			if(this.antFarm[i]==a)
				equalsAnt=true;
		}
		return equalsAnt;
	}
	
	/**
	 * @return the number of Ants that are Worker Ants
	 */
	public int howManyAntsAreWorkerAnts(){
		int workerAnts=0;
		for(int i=0; i<this.antFarm.length; i++) {
			if(this.antFarm[i].isAWorker()==true)
				workerAnts++;
		}
		return workerAnts;
	}
	
	/**
	 * @return the number of Ants that are Builder Ants
	 */
	public int howManyAntsAreBuilderAnts(){
		int builderAnts=0;
		for(int i=0; i<this.antFarm.length; i++) {
			if(this.antFarm[i].isABuilder()==true)
				builderAnts++;
		}
		return builderAnts;
	}

	/**
	 * @return true if there are 2 or more Queen ants, false otherwise
	 */
	public boolean canTheAntsStartANewFarm(){
		int queenAnts=0;
		for(int i=0; i<this.antFarm.length; i++) {
			if(this.antFarm[i].isAQueen()==true)
				queenAnts++;
		}
		if(queenAnts>1)
			return true;
		else {}
		return false;
	}
	
	/**
	 * @return true if there are no Queen ants in the farm, false otherwise
	 */
	public boolean willTheAntFarmDie(){
		int queenAnts=0;
		for(int i=0; i<this.antFarm.length; i++) {
			if(this.antFarm[i].isAQueen()==true)
				queenAnts++;
		}
		if(queenAnts<1)
			return true;
		else {}
		return false;
	}
	
	
}
