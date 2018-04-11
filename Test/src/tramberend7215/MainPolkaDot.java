package tramberend7215;

import cgtools.ImageWriter;
import cgtools.Vec3;
import static cgtools.Vec3.*;

import java.awt.Color;
import java.io.IOException;

import javax.imageio.ImageIO;

import tramberend7215.Image;

public class MainPolkaDot {
	static int width = 160;
	static int height = 90;

	static double radius = 8;
	static double d = radius + radius; /* Durchmesser */

	static ImageWriter iw = new ImageWriter(new double[MainPolkaDot.width * MainPolkaDot.height * 3],MainPolkaDot.width, MainPolkaDot.height);
	static Color black = new Color(0, 0, 0); // Color black
	static int rgbBlack = black.getRGB();

	public static void main(String[] args) {
		
		double l = 1;
		double z = l;
	
		
		for (int x = 0; x != width; x++) {
			for (int y = 0; y != height; y++) {
				iw.getImage().setRGB(x, y, rgbBlack);

				drawCircles(x, y, z);
				
				int w = 1; // Für While-Schleife
				int t = 16; // Variable für Anzahl Kreise Horizontal
				while (w != t) {
					if (x == d * w && y == 0)
						z = z + 2;
					w++;
				}
			}
		}
			String filename = "C:\\Users\\-\\git\\tst\\Test\\src\\doc\\a01-polka-dots2.png";
			try {

				iw.write(filename);

				System.out.println("Wrote image: " + filename);
			} catch (IOException error) {
				System.out.println(String.format("Something went wrong writing: %s: %s", filename, error));
			}
		
	}

	static void drawCircles(int x, int y, double z) {

		double s = radius; // Anfangswert vom radius (Für Inkrementierung in For-Schleife)
		double t = s;
		double r2 = radius * radius;

		for (int k = 0; t * k < height; k++) {
			double m = (x - radius * z) * (x - radius * z) + (y - s) * (y - s);
			
				if (m <= r2) 
					iw.getImage().setRGB(x, y, 16777215);				
			
			s = s + 2 * t;

		}

	}

}
