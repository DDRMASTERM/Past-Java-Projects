import  algoritharium.*;

import java.awt.Color;

//My guess using the unknown.jpg file for the number of White pixels is: 156
//My guess using the unknown.jpg file for the number of Red pixels is: 282
//My guess using the unknown.jpg file for the number of Green pixels is: 323
//My guess using the unknown.jpg file for the number of Blue pixels is: 308
//My guess using the unknown.jpg file for the specific color choice mentioned above: 877


public class PaintableCanvas3 {


	public void howManyStars(){
		Image img = ImageViewer.getImage();
		int num = 0;
		int red = 0;
		int blue = 0;
		int green = 0;
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				Color c = img.getPixelColor(i, j);
				red = c.getRed();
				green = c.getGreen();
				blue = c.getBlue();
				if(red==255&&green==255&&blue==255)
					num++;
			}
		}
		//Your code here
		


		//Leave this at the end
		//A bit of a hack to get your answer printed at the top of the screen
		ImageViewer.getFrames()[0].setTitle("There were " + num + " stars");
	}

	public void howManyPureRedPixels(){
		Image img = ImageViewer.getImage();
		int num = 0;
		int red = 0;
		int blue = 0;
		int green = 0;
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				Color c = img.getPixelColor(i, j);
				red = c.getRed();
				green = c.getGreen();
				blue = c.getBlue();
				if(red==255&&green==0&&blue==0)
					num++;
			}
		}

		
		ImageViewer.getFrames()[0].setTitle("There were " + num + " red pixels");
	}

	public void howManyPureGreenPixels(){
		Image img = ImageViewer.getImage();
		int num = 0;
		int red = 0;
		int blue = 0;
		int green = 0;
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				Color c = img.getPixelColor(i, j);
				red = c.getRed();
				green = c.getGreen();
				blue = c.getBlue();
				if(red==0&&green==255&&blue==0)
					num++;
			}
		}


		ImageViewer.getFrames()[0].setTitle("There were " + num + " green pixels");

	}

	public void howManyPureBluePixels(){
		Image img = ImageViewer.getImage();
		int num = 0;
		int red = 0;
		int blue = 0;
		int green = 0;
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				Color c = img.getPixelColor(i, j);
				red = c.getRed();
				green = c.getGreen();
				blue = c.getBlue();
				if(red==0&&green==0&&blue==255)
					num++;
			}
		}


		
		
		ImageViewer.getFrames()[0].setTitle("There were " + num + " blue pixels");
	}
	
	public void howManyWithSpecificNumbers(){
		Image img = ImageViewer.getImage();
		int num = 0;
		int red = 0;
		int blue = 0;
		int green = 0;
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		for(int i=0; i<numPixelsWide; i++) {
			for(int j=0; j<numPixelsHigh; j++) {
				Color c = img.getPixelColor(i, j);
				red = c.getRed();
				green = c.getGreen();
				blue = c.getBlue();
				if(red==58&&green==169&&blue==31)
					num++;
			}
		}


		
		
		ImageViewer.getFrames()[0].setTitle("There were " + num + " oddly specific color pixels");
	}

}
