/**
 * 
 * @author barkern
 *
 */
public class Ant {

	private final int occupation;
	
	public final static int WORKER = 0;
	public final static int BUILDER = 1;
	public final static int QUEEN = 2;
	
	public Ant(int o){
		this.occupation = o;
	}
	
	public boolean isAWorker(){
		if(this.occupation==WORKER)
			return true;
		else {}
		return false;
	}
	
	public boolean isABuilder(){
		if(this.occupation==BUILDER)
			return true;
		else {}
		return false;
	}
	
	public boolean isAQueen(){
		if(this.occupation==QUEEN)
			return true;
		else {}
		return false;
	}
	
	
}
