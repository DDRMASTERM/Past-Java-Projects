
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.color.*;;

public class MiceStroke extends JPanel{
	private int radius;
	private int x;
	private int y;
	private Color c;
	
	public MiceStroke(int r, int x, int y) {
		setRadius(r);
		this.x=x;
		this.y=y;
		this.c=Color.RED;
		this.setSize(300,400);
		this.setMinimumSize(new Dimension(300,400));
		
		DrBsMouseListener m= new DrBsMouseListener();
		this.addMouseMotionListener(m);
	}

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if(radius > 0)
			this.radius = radius;
		else
			this.radius=20;
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, getHeight(), getWidth());
		g.setColor(c);
		g.fillOval(y,x,radius,radius);
	}
	
	private class DrBsMouseListener implements MouseListener, MouseMotionListener{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			x = e.getY();
			y = e.getX();
			repaint();
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	
}
