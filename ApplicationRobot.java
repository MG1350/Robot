import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File; 
public class ApplicationRobot
{   
    public static void main(String[] args) throws Exception
    {
        Robot rob = new Robot();
        rob.mouseMove(30,1060);
        rob.delay(1000);
        rob.mousePress(InputEvent.BUTTON1_MASK);
        rob.delay(100);
        rob.mouseRelease(InputEvent.BUTTON1_MASK);

        rob.mouseMove(120,720);
        rob.delay(1000);
        rob.mousePress(InputEvent.BUTTON1_MASK);
        rob.delay(100);
        rob.mouseRelease(InputEvent.BUTTON1_MASK);

        rob.mouseMove(1280,530);
        rob.delay(2500);
        rob.mousePress(InputEvent.BUTTON1_MASK);
        rob.delay(100);
        rob.mouseRelease(InputEvent.BUTTON1_MASK);
        
        rob.mouseMove(1300,930);
        rob.delay(1000);
        rob.mousePress(InputEvent.BUTTON1_MASK);
        rob.delay(100);
        rob.mouseRelease(InputEvent.BUTTON1_MASK);

        rob.mouseMove(840,110);
        rob.delay(2000);
        rob.mousePress(InputEvent.BUTTON1_MASK);
        rob.delay(100);
        rob.mouseRelease(InputEvent.BUTTON1_MASK);

        rob.mouseMove(840,220);
        rob.delay(1000);
        rob.mousePress(InputEvent.BUTTON1_MASK);
        rob.delay(100);
        rob.mouseRelease(InputEvent.BUTTON1_MASK);

        rob.delay(1000);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle bounds = new Rectangle(screenSize);
        BufferedImage image= rob.createScreenCapture(bounds); 
        File file = new File("myScreenShot.png");
        ImageIO.write(image,"png", file);
        System.out.println("A screenshot is captured to " + file.getPath()); 

    }
}
