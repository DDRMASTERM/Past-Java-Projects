import  algoritharium.*;

import java.awt.Color;

//Important Notes
//Double click the algoritharium.jar file to load the gui
//Create a new picture, or load a picture
//Select Code -> Load and your DrBsPaintableCanvas.class file

//Eclipse should auto-compile every time you save your file

//Select Code -> Reload if you add methods, but otherwise, you probably shouldn't have to

public class PaintableCanvas {
	
	public void redSquares() {
		Image img = ImageViewer.getImage();
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		for(int g=0; g< numPixelsHigh; g=g+10) {
			for(int h=g; h<10+g && h<numPixelsHigh; h++) {
				for(int i=g; i<10+g && i<numPixelsWide; i++) {
					img.setPixelColor(i, h, Color.RED);
				}
				
			}
		}
	}

	public void oneRedDot ( ) {
		//The following line grabs whatever image is currently loaded
		//so make sure you open an image, or use File -> New 
		Image img = ImageViewer.getImage();

		//The following line set's pixel (11,30) to RED.
		//That is 11 pixels over, and 30 pixels down
		img.setPixelColor(11, 30, Color.RED);
	}

	//This method puts on 5 red dots
	public void fiveRedDots(){
		Image img = ImageViewer.getImage();

		img.setPixelColor(20, 43, Color.RED);
		img.setPixelColor(21, 43, Color.RED);
		img.setPixelColor(22, 43, Color.RED);
		img.setPixelColor(23, 43, Color.RED);
		img.setPixelColor(24, 43, Color.RED);
	}

	//make the entire 10th row red
	public void tenthRowRed(){
		Image img = ImageViewer.getImage();
		//The following two methods look at the image and determine how wide and high it is
		//You will need to use these if you want to color the entire image generically
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		System.out.println("The image is " + numPixelsHigh + " pixels tall and " + numPixelsWide + " wide");
		for(int i=0; i<numPixelsWide; i++) {
			img.setPixelColor(i, 10, Color.RED);
		}
		

	
	}

	//make the entire 5th column blue
	public void fifthColumnBlue(){
		Image img = ImageViewer.getImage();
		//The following two methods look at the image and determine how wide and high it is
		//You will need to use these if you want to color the entire image generically
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		System.out.println("The image is " + numPixelsHigh + " pixels tall and " + numPixelsWide + " wide");
		for(int j=0; j<numPixelsHigh; j++) {
			img.setPixelColor(5, j, Color.BLUE);
		}
	}

	//paint three large stripes on the image, the first red, second white, and third blue
	public void threeColors(){
		Image img = ImageViewer.getImage();
		//The following two methods look at the image and determine how wide and high it is
		//You will need to use these if you want to color the entire image generically
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int oneThird = 0;
		int twoThird = numPixelsHigh/3;
		int finalThird = twoThird*2;
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				if(j<twoThird)
					img.setPixelColor(i, j, Color.RED);
				else if(j<finalThird)
					img.setPixelColor(i, j, Color.WHITE);
				else
					img.setPixelColor(i, j, Color.BLUE);
			}
		}

	}
	
	//paint black and white stripes (top to bottom) on the image, switching every 20th column
	public void zebraStripes(){
		Image img = ImageViewer.getImage();

		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		boolean isTwenty = false;
		int count=0;
		for(int i=0; i<numPixelsWide; i++) {
			count++;
			if(count==20&&isTwenty==false) {
				count=0;
				isTwenty=true;
			}
			if(count==20&&isTwenty==true) {
				count=0;
				isTwenty=false;
			}
			for(int j=0; j<numPixelsHigh; j++) {
				
				if(isTwenty==false)
					img.setPixelColor(i, j, Color.BLACK);
				else
					img.setPixelColor(i, j, Color.WHITE);
			}
		}//Notice that you can create a color object called c, then paint c
		
		//You will also probably need to use the mod operator %
		//For example, if you have a variable called i, you can use i%20==0 to determine
		//if i is 0, 20, 40, .. 80, 100, ...  
		
	}
	
	
	//paint black and white stripes (left to right) on the image, switching every 20th row
	public void jailBird(){
		Image img = ImageViewer.getImage();

		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		boolean isTwenty = false;
		int count=0;
		for(int i=0; i<numPixelsHigh; i++) {
			count++;
			if(count==20&&isTwenty==false) {
				count=0;
				isTwenty=true;
			}
			if(count==20&&isTwenty==true) {
				count=0;
				isTwenty=false;
			}
			for(int j=0; j<numPixelsWide; j++) {
				
				if(isTwenty==false)
					img.setPixelColor(j, i, Color.BLACK);
				else
					img.setPixelColor(j, i, Color.WHITE);
			}
		}

	}
	
}
