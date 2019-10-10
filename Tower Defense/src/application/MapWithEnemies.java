package application;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class MapWithEnemies extends JFrame {

	private Enemy e1;
	private Enemy e2;

	@SuppressWarnings("unused")
	public MapWithEnemies(){
		try{
			//Use this to test your constructor
			BufferedImage enemyImage1 = ImageIO.read(new File("A_Grade.jpg"));
			BufferedImage enemyImage2 = ImageIO.read(new File("A_Grade.jpg"));
			e1 = new Enemy(68, 138, enemyImage1, 48, 48, 20, 0, 80);
			e2 = new Enemy(0, 138, enemyImage1, 48, 48, 20, 0, 80);

		}catch (IOException e) {
			e.printStackTrace();

		}
	}
	@Override
	public void paint(Graphics g){
		super.paint(g);
		try{

			e1.drawTheImage(g);
			e2.drawTheImage(g);
			
			Thread.sleep(1000);
			repaint();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}




	public static void main (String [] args){
		MapWithEnemies m = new MapWithEnemies();
		m.setSize(600, 600);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
	}
}