package application;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class MapWithTowers extends JFrame {

	@SuppressWarnings("unused")
	@Override
	public void paint(Graphics g){
		super.paint(g);
		try{

			//Feel free to use a different image, but I just stuck this here for kicks
			BufferedImage towerImage = ImageIO.read(new File("barker_nathan.jpg"));
			BufferedImage towerImage2 = ImageIO.read(new File("Eviler_barker_nathan.jpg"));
			BufferedImage towerImage3 = ImageIO.read(new File("Evilest_barker_nathan.jpg"));
			//Use this to test your constructor
			Tower t1 = new Tower(64,64,towerImage, 64, 64, 10, 0, 1, null, 0);
			t1.drawTheImage(g);
			Tower t2 = new Tower(256,64,towerImage2, 64, 64, 10, 0, 1, null, 0);
			t2.drawTheImage(g);
			Tower t3 = new Tower(64,256,towerImage3, 64, 64, 10, 0, 1, null, 0);
			t3.drawTheImage(g);
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static void main (String [] args){
		MapWithTowers m = new MapWithTowers();
		m.setSize(600, 600);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
	}
}

