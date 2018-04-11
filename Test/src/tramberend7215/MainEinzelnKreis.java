package tramberend7215;

import cgtools.ImageWriter;
import cgtools.Vec3;
import static cgtools.Vec3.*;

import java.awt.Color;
import java.io.IOException;

import javax.imageio.ImageIO;

import tramberend7215.Image;

public class MainEinzelnKreis {
	static int width = 160;
	static int height = 90;
	
	static double radius = 80;
	static double d = radius + radius; /* Durchmesser */
	
	static ImageWriter iw = new ImageWriter(new double[MainEinzelnKreis.width * MainEinzelnKreis.height * 3], MainEinzelnKreis.width, MainEinzelnKreis.height);
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
			drawCircle(x,y);

			
		}
		}
		String filename = "C:\\Users\\-\\git\\tst\\Test\\src\\doc\\a01-circle.png";
		
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
	
	
}
