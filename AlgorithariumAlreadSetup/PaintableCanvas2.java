import  algoritharium.*;

import java.awt.Color;
import java.util.Random;

//Important Notes
//Double click the algoritharium.jar file to load the gui
//Create a new picture, or load a picture
//Select Code -> Load and your DrBsPaintableCanvas.class file

//Eclipse should auto-compile every time you save your file

//Select Code -> Reload if you add methods, but otherwise, you probably shouldn't have to

public class PaintableCanvas2 {

	/*
	 * When I coded this up, I had to think about there only being 1 single line.  That meant
	 * I needed to code it up different than before, where I had to repeat things for the entire image.
	 * 
	 * Also, I noticed that I could think about it like, draw to the right, interspersed with drawing down every 5
	 * 
	 * You can check for every 5 with (variable name)%5=0
	 * 
	 */
	public void steps ( ) {
		Image img = ImageViewer.getImage();
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int count1=0;
		int count2=0;
		int count3=0;
		boolean outerLimits=false;
		while(outerLimits==false) {
			img.setPixelColor(count1, count2, Color.BLACK);
			if(count3>=0&&count3<5)
				count2++;
			if(count3>=5&&count3<9)
				count1++;	
			if(count1==numPixelsWide||count2==numPixelsHigh) 
				outerLimits=true;
			count3++;
			if(count3==10)
				count3=0;
		}
		
	}

	public void squares(){
		Image img = ImageViewer.getImage();

		//Use these 3 colors
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int twofifthH = numPixelsHigh/5;
		int twofifthW = numPixelsWide/5;
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				if(i<twofifthW||j<twofifthH||i>twofifthW*4||j>twofifthH*4)
					img.setPixelColor(i, j, Color.BLACK);
				else if(i<twofifthW*2||j<twofifthH*2||i>twofifthW*3||j>twofifthH*3)
					img.setPixelColor(i, j, Color.DARK_GRAY);
				else
					img.setPixelColor(i, j, Color.LIGHT_GRAY);
			}
		}
		
	}

	public void boundaries(){
		Image img = ImageViewer.getImage();

		//Use these 3 colors
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int twofifthH = numPixelsHigh/5;
		int twofifthW = numPixelsWide/5;
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				if(i==twofifthW&&j>=twofifthH&&j<=twofifthH*4||j==twofifthH&&i>=twofifthW&&i<=twofifthW*4||i==twofifthW*4&&j>=twofifthH&&j<=twofifthH*4||j==twofifthH*4&&i>=twofifthW&&i<=twofifthW*4)
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW*2&&j>=twofifthH*2&&j<=twofifthH*3||j==twofifthH*2&&i>=twofifthW*2&&i<=twofifthW*3||i==twofifthW*3&&j>=twofifthH*2&&j<=twofifthH*3||j==twofifthH*3&&i>=twofifthW*2&&i<=twofifthW*3)
					img.setPixelColor(i, j, Color.BLACK);
			}
		}
	}
	
	public void random_Movement(){
		Image img = ImageViewer.getImage();
		Random random=new Random();
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int count1=numPixelsWide/2;
		int count2=numPixelsHigh/2;
		int rand=0;
		while(0<1) {
			img.setPixelColor(count1, count2, Color.DARK_GRAY);
			rand=random.nextInt(4);
			switch(rand) {
			case 0: count1++; break;
			case 1: count2++; break;
			case 2: count1--; break;
			case 3: count2--; break;
			default: break;
			}
			if(count1==numPixelsWide||count2==numPixelsHigh||count1<0||count2<0)
				break;
	}
	}
}
