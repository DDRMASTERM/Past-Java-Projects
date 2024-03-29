package application;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class DrBsMousePanel extends JPanel implements MouseListener, MouseMotionListener{
	
	private int diameter;
	private int x;
	private int y;
	private Color c;
	private BufferedImage[][] imgs;
	
	private boolean game;
	private boolean gamestarted;
	private boolean towerPlaced;

	private int diameter2;
	private int x2;
	private int y2;
	private Color c2;
	
	private Tower [] tArray= new Tower[100];
	private Enemy [] eArray= new Enemy[10];
	private int [] currentImage= new int[100];
	private int tNum;
	private int [] pNum=new int[100];
	private int cE;
	
	private BufferedImage [] images = new BufferedImage[6];

	
	private boolean showTheCircle;
	private int picture;
	
	private DrBsJFrame drBsJFrame;
	private int money;
	private int numLives;
	
	private int rows;
	private int cols;
	private final int tileSize = 64;
	
	
	public boolean isShowTheCircle() {
		return showTheCircle;
	}


	public void setShowTheCircle(boolean showTheCircle, int pic) {
		this.showTheCircle = showTheCircle;
		this.picture=pic;
		
		
		
		
		repaint();
	}
	
	public Tower[] gettArray() {
		return tArray;
	}


	public void settArray(Tower[] tArray) {
		this.tArray = tArray;
	}
	
	public DrBsMousePanel() {
		
	}

	public DrBsMousePanel(int r, int x, int y, DrBsJFrame f, int rows, int cols) {
		setRadius(r);
		this.x = x;
		this.y = y;
		c = Color.RED;
		this.rows=rows;
		this.cols=cols;
		this.game=false;
		this.gamestarted=false;
		numLives = 100;
		this.money=50;
		drBsJFrame = f;
		this.picture=5;
		try {
			this.images[0] = ImageIO.read(new File("A_Grade.jpg"));
			this.images[1] = ImageIO.read(new File("barker_nathan.jpg"));
			this.images[2] = ImageIO.read(new File("Eviler_barker_nathan.jpg"));
			this.images[3] = ImageIO.read(new File("Evilest_barker_nathan.jpg"));
			this.images[4] = ImageIO.read(new File("Negative.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.cE=0;
		showTheCircle = false;
		imgs = new BufferedImage[rows][cols];
		this.setSize(300, 400);
		this.setMinimumSize(new Dimension(300,400));
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
	}
	
	public void startGame() {
		this.game=true;
		if(this.gamestarted==false)
			for(int i=0; i<eArray.length; i++) {
				this.eArray[i]=new Enemy(-64-(i*64), 192, this.images[0], 48, 48, 1, 0, 10);
			}
		this.gamestarted=true;
	}
	
	public void pauseGame() {
		this.game=false;
	}
	public Enemy[] geteArray() {
		return eArray;
	}


	public void seteArray(Enemy[] eArray) {
		this.eArray = eArray;
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

	public Color getColor() {
		return c;
	}


	public void setColor(Color c) {
		this.c = c;
	}


	public int getRadius() {
		return diameter;
	}


	public void setRadius(int radius) {
		if(radius > 0) {
			this.diameter = radius;
		}
		else {
			this.diameter = 20;
		}
	}



	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//so that the paintComponent method will be called again � like a loop, but not quite 
		try { 
			boolean aboveEnemy=false;
		
			
			
			for (int i = 0; i < rows; i++){
				for (int j = 0; j < cols; j++){
					g.drawImage(imgs[i][j], j*tileSize, i*tileSize, null);
				}
			}
			if(showTheCircle == true) {
					g.drawImage(images[picture], x, y, c, null);
					
			}
			if(c2 != null) {
					g.drawImage(images[picture], x, y, c, null);
			}
			
			for(int i=0; i<tArray.length-1; i++) {
				if(tArray[i]==null) {
					break;
				}
				else {
					tArray[i].drawTheImage(g);
					if(tArray[i].getY()>=192)
						aboveEnemy=false;
					else
						aboveEnemy=true;
						
					if(this.game==true) {
						if(tArray[i].getDelay()==0) {
						if(this.pNum[i]==0) {
							if(eArray[cE].getHealth()>0&&aboveEnemy==true&&eArray[cE].getX()>tArray[i].getX()+32) {
								this.tArray[i].getP().setVelocityY(2.0);
								this.tArray[i].getP().setVelocityX(2.0);
							}
							if(eArray[cE].getHealth()>0&&aboveEnemy==false&&eArray[cE].getX()>tArray[i].getX()+32) {
								this.tArray[i].getP().setVelocityY(-2.0);
								this.tArray[i].getP().setVelocityX(2.0);
							}
							if(eArray[cE].getHealth()>0&&aboveEnemy==true&&eArray[cE].getX()<tArray[i].getX()-32) {
								this.tArray[i].getP().setVelocityY(2.0);
								this.tArray[i].getP().setVelocityX(-2.0);
							}
							if(eArray[cE].getHealth()>0&&aboveEnemy==false&&eArray[cE].getX()<tArray[i].getX()-32) {
								this.tArray[i].getP().setVelocityY(-2.0);
								this.tArray[i].getP().setVelocityX(-2.0);
							}
							if(eArray[cE].getHealth()>0&&aboveEnemy==false&&eArray[cE].getX()<=tArray[i].getX()+32&&eArray[cE].getX()>=tArray[i].getX()) {
								this.tArray[i].getP().setVelocityY(-3.0);
								this.tArray[i].getP().setVelocityX(1.0);
							}
							if(eArray[cE].getHealth()>0&&aboveEnemy==true&&eArray[cE].getX()<=tArray[i].getX()+32&&eArray[cE].getX()>=tArray[i].getX()) {
								this.tArray[i].getP().setVelocityY(3.0);
								this.tArray[i].getP().setVelocityX(1.0);
							}
							if(eArray[cE].getHealth()>0&&aboveEnemy==false&&eArray[cE].getX()>=tArray[i].getX()+32&&eArray[cE].getX()<=tArray[i].getX()) {
								this.tArray[i].getP().setVelocityY(-3.0);
								this.tArray[i].getP().setVelocityX(1.0);
							}
							if(eArray[cE].getHealth()>0&&aboveEnemy==true&&eArray[cE].getX()>=tArray[i].getX()+32&&eArray[cE].getX()<=tArray[i].getX()) {
								this.tArray[i].getP().setVelocityY(3.0);
								this.tArray[i].getP().setVelocityX(1.0);
							}
							}
							for(int j=0; j<=9; j++) {
								if(this.tArray[i].getP().getX()>=eArray[j].getX()&&this.tArray[i].getP().getY()>=eArray[j].getY()&&this.tArray[i].getP().getX()<=eArray[j].getX()+64&&tArray[i].getP().getY()<=eArray[j].getY()+64) {
								eArray[j].reduceHealth(this.tArray[i].getP().getDamage());
								if(eArray[j].getHealth()<=0) 
									eArray[j].setImage(null);
								}
							}
						}
						}
					}
					if(this.game==false) {
						this.tArray[i].getP().setVelocityX(0);
						this.tArray[i].getP().setVelocityY(0);
					}
					
					this.tArray[i].getP().drawTheImage(g,this.game);
					
					
				}
		
			
			if(this.game==true) {
				for(int i=0; i<eArray.length; i++) {
					this.eArray[i].drawTheImage(g);
					if(eArray[i].getX()>490&&eArray[i].getHealth()>0) {
						this.numLives-=eArray[i].getHealth();
						eArray[i].setHealth(0);
						drBsJFrame.setTheTextOfTheLivesLabel("Lives: " + numLives);
					}
				}
				
			}
			
			Thread.sleep(10); 
			repaint();//so that things do not happen too fast. You can change this number 
		}catch (InterruptedException e) { 
			e.printStackTrace(); 
		}

		
	}
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int delay=0;
			int damage=0;
			if(showTheCircle==true)
				switch(picture) {
				case 1: this.money--;
				delay=100;
				damage=5;
				break;
				case 2: this.money-=2;
				delay=50;
				damage=4;
				break;
				case 3: this.money-=4;
				delay=25;
				damage=3;
				break;
				}
			drBsJFrame.setTheTextOfTheMoneyLabel("$" + money);
			Projectile p= new Projectile(x, y, this.images[4], 15, 15, 0.0, 0.0, damage, delay);
			
			this.tArray[tNum]=new Tower(x, y, this.images[picture], 64, 64, 90, delay, 10, p, tNum);
			this.currentImage[tNum]=picture;
			this.tNum++;
			c = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
			this.showTheCircle=false;
			this.picture=5;
			repaint();
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			
			repaint();
			
		}
		
	}
	