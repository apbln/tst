package tramberend7215;

import cgtools.ImageWriter;
import cgtools.Vec3;
import static cgtools.Vec3.*;

import java.awt.Color;
import java.io.IOException;

import javax.imageio.ImageIO;

import tramberend7215.Image;

public class Main {
	static int width = 160;
	static int height = 90;
	
	static double radius = 8;
	static double d = radius + radius; /* Durchmesser */
	
	static ImageWriter iw = new ImageWriter(new double[Main.width * Main.height * 3], Main.width, Main.height);
	static Color black = new Color(0, 0, 0); // Color black
	static int rgbBlack = black.getRGB();

	public static void main(String[] args) {
//		Image image = new Image(width, height);
		double l=1;
		double z=l;
		
		for (int x = 0; x != width; x++) {
			for (int y = 0; y != height; y++) {
				iw.getImage().setRGB(x, y, rgbBlack);
				// pixelColor(x, y);
				// image.setPixel(x, y, pixelColor(x, y));
//			drawCircle(x,y);
															System.out.print("x = "+x);
			/***HORIZONTAL***/								System.out.println(" y = "+y);
//			drawCirclesH1(x,y);
//			drawCirclesH2(x,y);
//			drawCirclesH3(x,y);
//			drawCirclesH4(x,y);
//			drawCirclesH5(x,y);
//			drawCirclesH6(x,y);
			
			/***VERTIKAL***/
			
			drawCirclesV1(x,y,z);
			int w=1; //Für While-Schleife
			int  t = 16; // Variable für Anzahl Kreise Horizontal
			while(w != t) {
			if(x==d*w && y==0 
//			||x==d*2 && y==0 || x==d*3 && y==0 || x==d*4 && y==0  || x==d*5 && y==0  || x==d*6 && y==0  || x==d*7 && y==0  || x==d*8 && y==0 || x==d*9 && y==0 ||
//			   x==d*10 && y==0 ||x==d*11 && y==0 || x==d*12 && y==0 || x==d*13 && y==0  || x==d*14 && y==0  || x==d*15 && y==0  || x==d*16 && y==0  || x==d*17 && y==0 || x==d*18 && y==0
			)
			z=z+2;
			w++;
			}
//			drawCirclesV2(x,y);
//			drawCirclesV3(x,y);
//			drawCirclesV4(x,y);
//			drawCirclesV5(x,y);
//			drawCirclesV6(x,y);
//			drawCirclesV7(x,y);
//			drawCirclesV8(x,y);
			
		}
		}
//		String filename = "C:\\Users\\-\\git\\tst\\Test\\src\\doc\\a01-circle.png";
		String filename = "C:\\Users\\-\\git\\tst\\Test\\src\\doc\\a01-polka-dots.png";
		try {

			iw.write(filename);

			System.out.println("Wrote image: " + filename);
		} catch (IOException error) {
			System.out.println(String.format("Something went wrong writing: %s: %s", filename, error));
		}
	}

	static Vec3 pixelColor(int x, int y) {

		return vec3(100, 100, 100);
	}

	/***KREIS MITTE***/
	
	static void drawCircle(int x, int y) {
		
		iw.getImage().setRGB(x, y, rgbBlack);

		double dx = x - width / 2;
		double dy = y - height / 2;
		double distanceSquared = dx * dx + dy * dy;

		if (distanceSquared <= d)
			iw.getImage().setRGB(x, y, 16777215); // dritter Parameter ist RGB-Int-Wert
	}
	
	/***HORIZONTAL***/
	
	static void drawCirclesH1(int x, int y) {
		
		
		 double r = 6;
		 double s = r; //Anfangswert von r (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = r * r;
double z = 1;
			
			for(int i=0; s*i<width;i++) {
			double l = (x - r )*(x - r )+(y - t*z)*(y - t*z);
			
			double o = (x - r )*(x - r )+(y - height / 6)*(y - height / 6);
			if (l <= r2 ) {
				iw.getImage().setRGB(x, y, 16777215); 
				System.out.println(" h1 ");
			}
			r = r + 2*s;
			
			}
			
			
			
//			for(int k=0; t*k<height;k++) {
//				double m = (x - r )*(x - r )+(y - s)*(y - s);
//				if (m <= r2 ) {
//					iw.getImage().setRGB(x, y, 16777215); 
//				}
//			s = s + 2*t;
//			}
			
	
	}
	static void drawCirclesH2(int x, int y) {
		
		
		 double r = 6;
		 double s = r; //Anfangswert von r (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = r * r;


			for(int i=0; s*i<width;i++) {
				double l = (x - r )*(x - r )+(y - 2 -t*3)*(y - 2 -t*3);
			
			double o = (x - r )*(x - r )+(y - height / 6)*(y - height / 6);
			if (l <= r2 ) {
				iw.getImage().setRGB(x, y, 16666215); 
				System.out.println(" h2 ");
			}
			r = r + 2*s;
			}
	}
	static void drawCirclesH3(int x, int y) {
		
		
		 double r = 6;
		 double s = r; //Anfangswert von r (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = r * r;


			for(int i=0; s*i<width;i++) {
				double l = (x - r )*(x - r )+(y - 2 -t*5)*(y - 2 -t*5);
			
			double o = (x - r )*(x - r )+(y - height / 6)*(y - height / 6);
			if (l <= r2 ) {
				iw.getImage().setRGB(x, y, 16555215); 
				System.out.println(" h3 ");
			}
			r = r + 2*s;
			}
	}
	static void drawCirclesH4(int x, int y) {
		
		
		 double r = 6;
		 double s = r; //Anfangswert von r (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = r * r;


			for(int i=0; s*i<width;i++) {
				double l = (x - r )*(x - r )+(y - 2 -t*7)*(y - 2 -t*7);
			
			double o = (x - r )*(x - r )+(y - height / 6)*(y - height / 6);
			if (l <= r2 ) {
				iw.getImage().setRGB(x, y, 16444215); 
				System.out.println(" h4 ");
			}
			r = r + 2*s;
			}
	}
	static void drawCirclesH5(int x, int y) {
		
		
		 double r = 6;
		 double s = r; //Anfangswert von r (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = r * r;


			for(int i=0; s*i<width;i++) {
				double l = (x - r )*(x - r )+(y - 2 -t*9)*(y - 2 -t*9);
			
			double o = (x - r )*(x - r )+(y - height / 6)*(y - height / 6);
			if (l <= r2 ) {
				iw.getImage().setRGB(x, y, 16333215); 
				System.out.println(" h4 ");
			}
			r = r + 2*s;
			}
	}
	static void drawCirclesH6(int x, int y) {
		
		
		 double r = 6;
		 double s = r; //Anfangswert von r (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = r * r;


			for(int i=0; s*i<width;i++) {
				double l = (x - r )*(x - r )+(y - 2 -t*11)*(y - 2 -t*11);
			
			double o = (x - r )*(x - r )+(y - height / 6)*(y - height / 6);
			if (l <= r2 ) {
				iw.getImage().setRGB(x, y, 16333215); 
				System.out.println(" h4 ");
			}
			r = r + 2*s;
			}
	}
	
	/***VERTIKAL***/
	
	static void drawCirclesV1(int x, int y, double z) {
		
		 double s = radius; //Anfangswert vom radius (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = radius * radius;
		
		 
			for(int k=0; t*k<height;k++) {
				double m = (x - radius*z )*(x - radius*z )+(y - s)*(y - s);
				if (m <= r2 ) {
					iw.getImage().setRGB(x, y, 16777215); 
					System.out.println(" Circles2 ");
				}
			s = s + 2*t;
			
			}
			
	}
	static void drawCirclesV2(int x, int y) {
		double r = 8;
		 double s = r; //Anfangswert von r (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = r * r;

		
			for(int k=0; t*k<height;k++) {
				double m = (x - r*3 )*(x - r*3 )+(y - s)*(y - s);
				if (m <= r2 ) {
					iw.getImage().setRGB(x, y, 16777215); 
					System.out.println(" Circles2 ");
				}
			s = s + 2*t;
			}
	}
	static void drawCirclesV3(int x, int y) {
		double r = 8;
		 double s = r; //Anfangswert von r (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = r * r;

		
			for(int k=0; t*k<height;k++) {
				double m = (x - r*5 )*(x - r*5 )+(y - s)*(y - s);
				if (m <= r2 ) {
					iw.getImage().setRGB(x, y, 16777215); 
					System.out.println(" Circles2 ");
				}
			s = s + 2*t;
			}
	}
	static void drawCirclesV4(int x, int y) {
		double r = 8;
		 double s = r; //Anfangswert von r (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = r * r;

		
			for(int k=0; t*k<height;k++) {
				double m = (x - r*7 )*(x - r*7 )+(y - s)*(y - s);
				if (m <= r2 ) {
					iw.getImage().setRGB(x, y, 16777215); 
					System.out.println(" Circles2 ");
				}
			s = s + 2*t;
			}
	}
	static void drawCirclesV5(int x, int y) {
		double r = 8;
		 double s = r; //Anfangswert von r (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = r * r;

		
			for(int k=0; t*k<height;k++) {
				double m = (x - r*9 )*(x - r*9 )+(y - s)*(y - s);
				if (m <= r2 ) {
					iw.getImage().setRGB(x, y, 16777215); 
					System.out.println(" Circles2 ");
				}
			s = s + 2*t;
			}
	}
	static void drawCirclesV6(int x, int y) {
		double r = 8;
		 double s = r; //Anfangswert von r (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = r * r;

		
			for(int k=0; t*k<height;k++) {
				double m = (x - r*11 )*(x - r*11 )+(y - s)*(y - s);
				if (m <= r2 ) {
					iw.getImage().setRGB(x, y, 16777215); 
					System.out.println(" Circles2 ");
				}
			s = s + 2*t;
			}
	}
	static void drawCirclesV7(int x, int y) {
		double r = 8;
		 double s = r; //Anfangswert von r (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = r * r;

		
			for(int k=0; t*k<height;k++) {
				double m = (x - r*13 )*(x - r*13 )+(y - s)*(y - s);
				if (m <= r2 ) {
					iw.getImage().setRGB(x, y, 16777215); 
					System.out.println(" Circles2 ");
				}
			s = s + 2*t;
			}
	}
	static void drawCirclesV8(int x, int y) {
		double r = 8;
		 double s = r; //Anfangswert von r (Für Inkrementierung in For-Schleife)
		 double t = s;
		 double r2 = r * r;

		
			for(int k=0; t*k<height;k++) {
				double m = (x - r*15 )*(x - r*15 )+(y - s)*(y - s);
				if (m <= r2 ) {
					iw.getImage().setRGB(x, y, 16777215); 
					System.out.println(" Circles2 ");
				}
			s = s + 2*t;
			}
	}
}
