
public class Desk {
	

	private boolean isLocked;
	private boolean isClosed;
	private int maxNumberOfPapers;
	private Paper [] p;
	private int pNum=0;
	private static int totalDesks;

	/**
	 * The no argument constructor
	 * 
	 * A desk created with this constructor should:
	 * have no Papers in the drawer
	 * be locked
	 * have the drawer be closed
	 * have room for 10,000 Papers
	 */
	public Desk() {
		this.isLocked=true;
		this.isClosed=true;
		this.maxNumberOfPapers=10000;
		this.p=new Paper[10000];
		totalDesks++;
	}
	
	/**
	 * This is the 3 argument constructor
	 * A desk created with this constructor should
	 * 
	 * have no Papers in the drawer
	 * be locked or unlocked base on the isLocked parameter
	 * have the maximum number of Papers specified in the maxNumberOfPapers variable
	 * be open or closed based on the isClosed variable
	 * 
	 * @param isLocked
	 * @param maxNumberOfPapers
	 * @param isClosed
	 * 
	 * GOTCHAS: Don't allow the maxNumberOfPapers to be less than 1000, but set it to 1000 if that is the case
	 */
	public Desk(boolean isLocked, int maxNumberOfPapers, boolean isClosed) {
		this.isLocked=isLocked;
		this.isClosed=isClosed;
		if(maxNumberOfPapers<1000) {
			this.maxNumberOfPapers=1000;
			this.p=new Paper[1000];
		}
		else {
			this.maxNumberOfPapers=maxNumberOfPapers;
			this.p=new Paper[maxNumberOfPapers];
		}
		totalDesks++;
	}

	/**
	 * 
	 * @return true if the desk is locked, or false if it is unlocked
	 */
	public boolean theDeskIsLocked() {
		return this.isLocked;
	}

	/**
	 * 
	 * @return true if the desk is open, and false if it is closed
	 */
	public boolean theDrawerIsOpen() {
		boolean isOpen=false;
		if(this.isClosed==false)
			isOpen=true;
		return isOpen;
	}

	/**
	 * 
	 * @return the number of papers that can still fit in the drawer
	 */
	public int howManyPapersCanStillFitInTheDrawer() {
		int left=this.maxNumberOfPapers-this.pNum;
		return left;
	}

	/**
	 * This method opens the drawer
	 * 
	 * GOTCHAS:
	 * don't open the drawer if it is locked
	 * If the drawer is open, and they call this method again, leave it open 
	 */
	public void openDrawer() {
		if(this.isLocked==false&&this.isClosed==true)
			this.isClosed=false;
		else {}
	}
	
	/**
	 * This method closes the drawer
	 * 
	 * GOTCHAS:
	 * don't close the drawer if it is locked
	 * If the drawer is closed, and they call this method again, leave it closed 
	 */
	public void closeDrawer() {
		if(this.isLocked==false&&this.isClosed==false)
			this.isClosed=true;
		else {}
	}

	/**
	 * This method adds a paper to the drawer
	 * You will need to remember every paper added to the drawer
	 * 
	 * @param p The paper to be added
	 * 
	 * GOTCHAS:
	 * Don't allow more papers than can fit into the drawer.
	 * If someone tries to add too many papers, just don't add it, and don't crash
	 * 
	 * We could check for p == null, but let's assume that won't happen for this exam
	 * 
	 */
	public void addAPaperToDrawer(Paper p) {
		if(this.pNum<this.maxNumberOfPapers) {
			this.p[pNum]=p;
			this.pNum++;
		}
	}
	
	/**
	 * This method looks through the desk for a paper
	 * @param p The Paper to look for
	 * @return true if that paper is in the desk, false if it isn't
	 */
	public boolean isThisPaperInTheDesk(Paper p) {
		for(int i=0; i<this.pNum; i++) {
			if(this.p[i]==p)
				return true;
		}
		return false;
	}
	
	/**
	 * This method looks at every paper for specific writing
	 * 
	 * @param s The writing to look for
	 * @return the number of papers with that writing
	 */
	public int howMayPapersHaveThisExactWriting(String s) {
		int wMatch=0;
		for(int i=0; i<this.pNum; i++) {
			if(this.p[i].getWriting().equals(s))
				wMatch++;
		}
		return wMatch;
	}
	
	/**
	 * This method looks at every paper for a specific height
	 * 
	 * @param height The height to look for
	 * @return how many papers are that high
	 */
	public int howManyPapersInTheDrawerAreThisHigh(int height) {
		int hMatch=0;
		for(int i=0; i<this.pNum; i++) {
			if(this.p[i].getHeight()==height)
				hMatch++;
		}
		return hMatch;
	}
	
	/**
	 * 
	 * @return the number of desks that have ever been created
	 */
	public static int howManyDesksHaveBeenCreated() {
		return totalDesks;
	}
	
	
}