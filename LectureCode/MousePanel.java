import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author
 *
 */
@SuppressWarnings("serial")
public class MousePanel extends JPanel{

	private int x = 10;
	private int y = 10;
	private Color c = Color.red;

	
	public MousePanel(){
		super();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		
		//Erase the old image
		g.setColor(Color.gray);
		g.fillRect(0, 0, 500, 500);
		
		g.setColor(c);
		g.fillOval(x, y, 50, 50);
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Mouse Panel Example");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MousePanel p = new MousePanel();
		f.add(p);
		f.setSize(400,400);
		f.setVisible(true);
	}

}
