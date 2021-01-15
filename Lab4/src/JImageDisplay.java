import java.awt.*;
import java.awt.image.BufferedImage;

public class JImageDisplay extends javax.swing.JComponent{
    private BufferedImage image;
    public JImageDisplay(int w,int h){

        image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Dimension dimension = new Dimension(w, h);

        super.setPreferredSize(dimension);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage (image, 0, 0, image.getWidth(), image.getHeight(), null);
    }

    public void clearImage(){
        Graphics2D imageGraphics = image.createGraphics();
        imageGraphics.setColor(new Color(0, 0, 0));

        imageGraphics.fillRect(0, 0, image.getWidth(), image.getHeight());
    }
    public void drawPixel (int x, int y, int rgbColor){
        image.setRGB(x,y,rgbColor);
    }
}
