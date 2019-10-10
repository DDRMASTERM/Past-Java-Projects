import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 * @author
 *
 */
@SuppressWarnings({ "serial", "unused" })
public class FileReader extends JFrame {

	public FileReader(){
		super("Maze");
		try {
		int numRows = 0;
		int numCols = 0;
		MyCanvas myCanvas = null; 
		//Do Not Make Any Changes Above This Line
		Scanner input=new Scanner(System.in);
		String x="";
		//Here is where you need to ask the user to enter the name of the maze file, or just hard code it in
		x = JOptionPane.showInputDialog("Please enter a file name:");
		//Use the first 2 integers in the file to make the following method call work
		Scanner file = new Scanner(new File(x));
		
		numRows=file.nextInt();
		numCols=file.nextInt();
		String s="";
		myCanvas = new MyCanvas(numRows, numCols);
		//Now the hard part.  Figure out what picture should be printed at each position
		//Using a Scanner you can read in ints and doubles, and Strings
		//Note: loops are very good for this type of exercise
		//The following method call adds picture A at position 0 0
		for(int i=0; i<numRows; i++) {
			for(int j=0; j<numCols; j++) {
				s=file.next();
				myCanvas.addPicture(i, j, s + ".png");
			}
		}
		
		

		
		
		//You can change the size of the Frame if you want
		this.setSize(600, 600);

		//Do Not Make Any Changes Below This Line
		if (myCanvas != null){
			this.add(myCanvas);
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		} catch (FileNotFoundException e) {
			System.out.println("That is not a valid file.");
		}
	}

	public static void main(String[] args) {
		new FileReader();
	}

 
}

@SuppressWarnings("serial")
class MyCanvas extends JPanel{
	private BufferedImage[][] imgs;
	private int rows;
	private int cols;
	private final int tileSize = 64;
	public MyCanvas(int rows, int cols){
		super();
		this.rows = rows;
		this.cols = cols;
		imgs = new BufferedImage[rows][cols];
	}
	public void addPicture(int x, int y, String filename){
		if (x < 0 || x >= rows){
			System.err.println("There is no row " + x);
		}
		else if (y < 0 || y >= cols){
			System.err.println("There is no col " + y);
		}
		else{
				try {
					imgs[x][y] = ImageIO.read(new File(filename));
				} catch (IOException e) {
					System.err.println("Unable to read the file: " + filename);
				}
		}
	}
	public void paint(Graphics g){
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < cols; j++){
				g.drawImage(imgs[i][j], j*tileSize, i*tileSize, null);
			}
		}
	}
}