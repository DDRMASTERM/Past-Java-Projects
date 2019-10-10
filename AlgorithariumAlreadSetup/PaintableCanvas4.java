import  algoritharium.*;

import java.awt.Color;

public class PaintableCanvas4 {


	public void drawA0(){
		Image img = ImageViewer.getImage();
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int twofifthH = numPixelsHigh/5;
		int twofifthW = numPixelsWide/5;
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				if(i==twofifthW&&j>=twofifthH&&j<=twofifthH*4||j==twofifthH&&i>=twofifthW&&i<=twofifthW*4||i==twofifthW*4&&j>=twofifthH&&j<=twofifthH*4||j==twofifthH*4&&i>=twofifthW&&i<=twofifthW*4)
					img.setPixelColor(i, j, Color.BLACK);
				
			}
		}
		//Your code here
	}
	public void drawA1(){
		Image img = ImageViewer.getImage();
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int twofifthH = numPixelsHigh/5;
		int twofifthW = numPixelsWide/5;
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				if(i==twofifthW*4&&j<twofifthH*4&&j>twofifthH)//right side
					img.setPixelColor(i, j, Color.BLACK);
			}
		}
		//Your code here
	}
	public void drawA2(){
		Image img = ImageViewer.getImage();
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int twofifthH = numPixelsHigh/5;
		int twofifthW = numPixelsWide/5;
		int halfH=numPixelsHigh/2;
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				if(j==twofifthH*4&&i>=twofifthW&&i<=twofifthW*4)//bottom side
					img.setPixelColor(i, j, Color.BLACK);
				if(j==twofifthH&&i>=twofifthW&&i<=twofifthW*4)//top side
					img.setPixelColor(i, j, Color.BLACK);
				if(j==halfH&&i>=twofifthW&&i<=twofifthW*4)//middle
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW*4&&j<=halfH&&j>twofifthH)//top-right side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW&&j<twofifthH*4&&j>=halfH)//bottom-left side
					img.setPixelColor(i, j, Color.BLACK);
			}
		}
			
		//Your code here
	}
	public void drawA3(){
		Image img = ImageViewer.getImage();
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int twofifthH = numPixelsHigh/5;
		int twofifthW = numPixelsWide/5;
		int halfH=numPixelsHigh/2;
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				if(j==twofifthH*4&&i>=twofifthW&&i<=twofifthW*4)//bottom side
					img.setPixelColor(i, j, Color.BLACK);
				if(j==twofifthH&&i>=twofifthW&&i<=twofifthW*4)//top side
					img.setPixelColor(i, j, Color.BLACK);
				if(j==halfH&&i>=twofifthW&&i<=twofifthW*4)//middle
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW*4&&j<=halfH&&j>twofifthH)//top-right side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW*4&&j<twofifthH*4&&j>=halfH)//bottom-right side
					img.setPixelColor(i, j, Color.BLACK);
			}
		}
		//Your code here
	}
	public void drawA4(){
		Image img = ImageViewer.getImage();
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int twofifthH = numPixelsHigh/5;
		int twofifthW = numPixelsWide/5;
		int halfH=numPixelsHigh/2;
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				if(j==halfH&&i>=twofifthW&&i<=twofifthW*4)//middle
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW*4&&j<=halfH&&j>twofifthH)//top-right side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW*4&&j<twofifthH*4&&j>=halfH)//bottom-right side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW&&j<=halfH&&j>twofifthH)//top-left side
					img.setPixelColor(i, j, Color.BLACK);
			}
		}
		//Your code here
	}


	public void drawA5(){
		Image img = ImageViewer.getImage();
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int twofifthH = numPixelsHigh/5;
		int twofifthW = numPixelsWide/5;
		int halfH=numPixelsHigh/2;
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				if(j==twofifthH*4&&i>=twofifthW&&i<=twofifthW*4)//bottom side
					img.setPixelColor(i, j, Color.BLACK);
				if(j==twofifthH&&i>=twofifthW&&i<=twofifthW*4)//top side
					img.setPixelColor(i, j, Color.BLACK);
				if(j==halfH&&i>=twofifthW&&i<=twofifthW*4)//middle
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW&&j<=halfH&&j>twofifthH)//top-left side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW*4&&j<twofifthH*4&&j>=halfH)//bottom-right side
					img.setPixelColor(i, j, Color.BLACK);
			}
		}
		//Your code here
	}
	public void drawA6(){
		Image img = ImageViewer.getImage();
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int twofifthH = numPixelsHigh/5;
		int twofifthW = numPixelsWide/5;
		int halfH=numPixelsHigh/2;
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				if(j==twofifthH*4&&i>=twofifthW&&i<=twofifthW*4)//bottom side
					img.setPixelColor(i, j, Color.BLACK);
				if(j==twofifthH&&i>=twofifthW&&i<=twofifthW*4)//top side
					img.setPixelColor(i, j, Color.BLACK);
				if(j==halfH&&i>=twofifthW&&i<=twofifthW*4)//middle
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW&&j<=halfH&&j>twofifthH)//top-left side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW*4&&j<twofifthH*4&&j>=halfH)//bottom-right side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW&&j<twofifthH*4&&j>=halfH)//bottom-left side
					img.setPixelColor(i, j, Color.BLACK);
			}
		}
		//Your code here
	}
	public void drawA7(){
		Image img = ImageViewer.getImage();
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int twofifthH = numPixelsHigh/5;
		int twofifthW = numPixelsWide/5;
		int halfH=numPixelsHigh/2;
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				if(j==twofifthH&&i>=twofifthW&&i<=twofifthW*4)//top side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW*4&&j<=halfH&&j>twofifthH)//top-right side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW*4&&j<twofifthH*4&&j>=halfH)//bottom-right side
					img.setPixelColor(i, j, Color.BLACK);
			}
		}
		//Your code here
	}
	public void drawA8(){
		Image img = ImageViewer.getImage();
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int twofifthH = numPixelsHigh/5;
		int twofifthW = numPixelsWide/5;
		int halfH=numPixelsHigh/2;
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				if(i==twofifthW*4&&j<=halfH&&j>twofifthH)//top-right side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW*4&&j<twofifthH*4&&j>=halfH)//bottom-right side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW&&j<twofifthH*4&&j>=halfH)//bottom-left side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW&&j<=halfH&&j>twofifthH)//top-left side
					img.setPixelColor(i, j, Color.BLACK);
				if(j==twofifthH*4&&i>=twofifthW&&i<=twofifthW*4)//bottom side
					img.setPixelColor(i, j, Color.BLACK);
				if(j==twofifthH&&i>=twofifthW&&i<=twofifthW*4)//top side
					img.setPixelColor(i, j, Color.BLACK);
				if(j==halfH&&i>=twofifthW&&i<=twofifthW*4)//middle
					img.setPixelColor(i, j, Color.BLACK);
			}
		}
		//Your code here
	}
	public void drawA9(){
		Image img = ImageViewer.getImage();
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int twofifthH = numPixelsHigh/5;
		int twofifthW = numPixelsWide/5;
		int halfH=numPixelsHigh/2;
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				if(j==twofifthH*4&&i>=twofifthW&&i<=twofifthW*4)//bottom side
					img.setPixelColor(i, j, Color.BLACK);
				if(j==twofifthH&&i>=twofifthW&&i<=twofifthW*4)//top side
					img.setPixelColor(i, j, Color.BLACK);
				if(j==halfH&&i>=twofifthW&&i<=twofifthW*4)//middle
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW&&j<=halfH&&j>twofifthH)//top-left side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW*4&&j<twofifthH*4&&j>=halfH)//bottom-right side
					img.setPixelColor(i, j, Color.BLACK);
				if(i==twofifthW*4&&j<=halfH&&j>twofifthH)//top-right side
					img.setPixelColor(i, j, Color.BLACK);
			}
		}
		//Your code here
	}



}
