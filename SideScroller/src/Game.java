import java.util.Random;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Game
{
  private Grid grid;
  private int userRow;
  private int msElapsed;
  private int timesGet;
  private int timesAvoid;
  private int rowLocation[]=new int[11];
  private boolean rowSafe[]=new boolean[11];
  private boolean nineTrue=false;
  private boolean eightTrue=false;
  private boolean sevenTrue=false;
  private boolean sixTrue=false;
  private boolean fiveTrue=false;
  private boolean fourTrue=false;
  private boolean threeTrue=false;
  private boolean twoTrue=false;
  private boolean oneTrue=false;
  private boolean zeroTrue=false;
  private boolean onlyOneAdd=false;

//http://nifty.stanford.edu/2011/feinberg-generic-scrolling-game/assignment.html
  public Game()
  {
	rowLocation[0]=10;
    grid = new Grid(5, 10);
    userRow = 2;
    msElapsed = 0;
    timesGet = 0;
    timesAvoid = 0;
    updateTitle();
    grid.setImage(new Location(userRow, 0), "userImage.gif");
  }


public void play()
  {
    while (!isGameOver()) // While game isn't over.
    {
      grid.pause(100);
      handleKeyPress();
      handleCollision();
      if (msElapsed % 4 == 0)
      {
        populateRightEdge();
        scrollLeft();
        handleCollision();
        System.out.println(timesGet);
        System.out.println(timesAvoid);
        onlyOneAdd=false;
      }
      updateTitle();
      msElapsed += 1;
      if(timesAvoid==3){
    	  isGameOver();
      }
    }
  }

  public void handleKeyPress()
  {
	  int key = grid.checkLastKeyPressed();
	  if(key == 38 && userRow>0){
		  grid.setImage(new Location(userRow, 0), null);
		  userRow-=1;
		  grid.setImage(new Location(userRow, 0), "userImage.gif");
	  }
	  if(key == 40 && userRow<4){
		  grid.setImage(new Location(userRow, 0), null);
		  userRow+=1;
		  grid.setImage(new Location(userRow, 0), "userImage.gif");
	  }
  }

  public void populateRightEdge()
  {
	 if(timesAvoid<3){
		  Random random=new Random();
		  int rV1= random.nextInt(9);
		  int rV2= random.nextInt(5);
		  if(rV1%2==1){
			  rowLocation[10]=rV2;
			  rowSafe[10]=true;
		  }
		  else{
			  rowLocation[10]=rV2;
			  rowSafe[10]=false;
		  }
		  grid.setImage(new Location(rowLocation[9], 9), null);
	  }
  }

  public void scrollLeft()
  {
	if(timesAvoid<3){
			  if(zeroTrue==true&&rowLocation[0]<5){
				  grid.setImage(new Location(rowLocation[0], 0), null);
			  }
			  if(oneTrue==true){
				  zeroTrue=true;
				  rowLocation[0]=rowLocation[1];
				  rowSafe[0]=rowSafe[1];
				  grid.setImage(new Location(rowLocation[1], 1), null);
				  if(rowSafe[0]==true){
					  grid.setImage(new Location(rowLocation[0], 0), "getImage.gif");
				  }
				  else{
					  grid.setImage(new Location(rowLocation[0], 0), "avoidImage.gif");
				  }
			  }
			  if(twoTrue==true){
				  oneTrue=true;
				  rowLocation[1]=rowLocation[2];
				  rowSafe[1]=rowSafe[2];
				  grid.setImage(new Location(rowLocation[2], 2), null);
				  if(rowSafe[1]==true){
					  grid.setImage(new Location(rowLocation[1], 1), "getImage.gif");
				  }
				  else{
					  grid.setImage(new Location(rowLocation[1], 1), "avoidImage.gif");
				  }
			  }
			  if(threeTrue==true){
				  twoTrue=true;
				  rowLocation[2]=rowLocation[3];
				  rowSafe[2]=rowSafe[3];
				  grid.setImage(new Location(rowLocation[3], 3), null);
				  if(rowSafe[2]==true){
					  grid.setImage(new Location(rowLocation[2], 2), "getImage.gif");
				  }
				  else{
					  grid.setImage(new Location(rowLocation[2], 2), "avoidImage.gif");
				  }
			  }
			  if(fourTrue==true){
				  threeTrue=true;
				  rowLocation[3]=rowLocation[4];
				  rowSafe[3]=rowSafe[4];
				  grid.setImage(new Location(rowLocation[4], 4), null);
				  if(rowSafe[3]==true){
					  grid.setImage(new Location(rowLocation[3], 3), "getImage.gif");
				  }
				  else{
					  grid.setImage(new Location(rowLocation[3], 3), "avoidImage.gif");
				  }
			  }
			  if(fiveTrue==true){
				  fourTrue=true;
				  rowLocation[4]=rowLocation[5];
				  rowSafe[4]=rowSafe[5];
				  grid.setImage(new Location(rowLocation[5], 5), null);
				  if(rowSafe[4]==true){
					  grid.setImage(new Location(rowLocation[4], 4), "getImage.gif");
				  }
				  else{
					  grid.setImage(new Location(rowLocation[4], 4), "avoidImage.gif");
				  }
			  }
			  if(sixTrue==true){
				  fiveTrue=true;
				  rowLocation[5]=rowLocation[6];
				  rowSafe[5]=rowSafe[6];
				  grid.setImage(new Location(rowLocation[6], 6), null);
				  if(rowSafe[5]==true){
					  grid.setImage(new Location(rowLocation[5], 5), "getImage.gif");
				  }
				  else{
					  grid.setImage(new Location(rowLocation[5], 5), "avoidImage.gif");
				  }
			  }
			  if(sevenTrue==true){
				  sixTrue=true;
				  rowLocation[6]=rowLocation[7];
				  rowSafe[6]=rowSafe[7];
				  grid.setImage(new Location(rowLocation[7], 7), null);
				  if(rowSafe[6]==true){
					  grid.setImage(new Location(rowLocation[6], 6), "getImage.gif");
				  }
				  else{
					  grid.setImage(new Location(rowLocation[6], 6), "avoidImage.gif");
				  }
			  }
			  if(eightTrue==true){
				  sevenTrue=true;
				  rowLocation[7]=rowLocation[8];
				  rowSafe[7]=rowSafe[8];
				  grid.setImage(new Location(rowLocation[8], 8), null);
				  if(rowSafe[7]==true){
					  grid.setImage(new Location(rowLocation[7], 7), "getImage.gif");
				  }
				  else{
					  grid.setImage(new Location(rowLocation[7], 7), "avoidImage.gif");
				  }
			  }
			  if(nineTrue==true){
				  eightTrue=true;
				  rowLocation[8]=rowLocation[9];
				  rowSafe[8]=rowSafe[9];
				  if(rowSafe[8]==true){
					  grid.setImage(new Location(rowLocation[8], 8), "getImage.gif");
				  }
				  else{
					  grid.setImage(new Location(rowLocation[8], 8), "avoidImage.gif");
				  }
			  }
			  rowLocation[9]=rowLocation[10];
			  rowSafe[9]=rowSafe[10];
			  if(rowSafe[9]==true){
				  grid.setImage(new Location(rowLocation[9], 9), "getImage.gif");
			  }
			  else{
				  grid.setImage(new Location(rowLocation[9], 9), "avoidImage.gif");
			  }
			  nineTrue=true;
			  grid.setImage(new Location(userRow, 0), "userImage.gif");
		  }
  }

  public void handleCollision()
  {
	  if(userRow==rowLocation[0]){
		  grid.setImage(new Location(userRow, 0), "userImage.gif");
		  if(rowSafe[0]==true&&onlyOneAdd==false){
			  timesGet++;
			  rowLocation[0]=10;
			  onlyOneAdd=true;
		  }
		  if(rowSafe[0]==false&&onlyOneAdd==false){
			  timesAvoid++;
			  rowLocation[0]=10;
			  onlyOneAdd=true;
		  }
	  }
  }

  public int getScore()
  {
    return timesGet;
  }

  public void updateTitle()
  {
	  if(timesAvoid<3){
		  grid.setTitle("Score:  " + getScore() + "  Life:  " +(3-timesAvoid));
	  }
	  else{
		  grid.setTitle("Game Over (Close to restart)");
	  }

  }

  public boolean isGameOver()
  {
	  /*if(timesAvoid==3){
		  nineTrue=false;
	  eightTrue=false;
	  sevenTrue=false;
	  sixTrue=false;
	  fiveTrue=false;
	  fourTrue=false;
	  threeTrue=false;
	  twoTrue=false;
	  oneTrue=false;
	  zeroTrue=false;
	  onlyOneAdd=false;
	  for(int i=0; i<10; i++){
		  grid.setImage(new Location(rowLocation[i], i), null);
	  }
	  }*/
    return false;
  }

  public static void test()
  {
    Game game = new Game();
    game.play();
  }

  public static void main(String[] args)
  {
    test();
  }
}