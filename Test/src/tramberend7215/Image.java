package tramberend7215;

import cgtools.ImageWriter;
import cgtools.Vec3;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.IOException;

public class Image {
    public Image(int width, int height) {
        System.out.println("Image not yet implemented.");
   
    }

    public void setPixel(int x, int y, Vec3 color) {
        System.out.println("Image not yet implemented.");

//        WritableRaster raster =
//                Raster.createBandedRaster(DataBuffer.TYPE_USHORT, Main.width, Main.height, 3, null);
//       
//                raster.setPixel(x, y, rgb);
    }

    public void write(String filename) throws IOException {
    	
        System.out.println("Image not yet implemented.");
//         ImageWriter iw = new ImageWriter(new double [Main.width * Main.height*3] , Main.width, Main.height);
//      iw.getImage().setRGB(0, 0, 255);
        
    }
}
