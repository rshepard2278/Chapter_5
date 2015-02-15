import java.awt.Color;
import java.util.Random;

/**
 * Class DrawDemo - provides some short demonstrations showing how to use the 
 * Pen class to create various drawings.
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class DrawDemo
{
    private Canvas myCanvas;
    private Random random;

    /**
     * Prepare the drawing demo. Create a fresh canvas and make it visible.
     */
    public DrawDemo()
    {
        myCanvas = new Canvas("Drawing Demo", 600, 600);
        random = new Random();
    }

    /**
     * Draw a square on the screen.
     */
    public void drawSquare()
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.BLUE);

        square(pen);
    }

    public void drawTriangle() {
        Pen pen = new Pen(100, 100, myCanvas);
        pen.setColor(Color.GREEN);

        triangle(pen);
    }

    public void drawPentagon() {
        Pen pen = new Pen(100, 100, myCanvas);
        pen.setColor(Color.BLUE);

        pentagon(pen);
    }

    public void drawPolygon(int sides) {
        Pen pen = new Pen(100, 100, myCanvas);
        pen.setColor(Color.RED);

        polygon(pen, sides);
    }

    /**
     * Draw a wheel made of many squares.
     */
    public void drawWheel()
    {
        Pen pen = new Pen(250, 200, myCanvas);
        pen.setColor(Color.RED);

        for (int i=0; i<36; i++) {
            square(pen);
            pen.turn(10);
        }
    }

    public void drawSprial() {
        Pen pen = new Pen(10, 10, myCanvas);
        pen.setColor(Color.BLACK);
        sprial(pen);
    }

    /**
     * Draw a square in the pen's color at the pen's location.
     */
    private void square(Pen pen)
    {
        for (int i=0; i<4; i++) {
            pen.move(100);
            pen.turn(90);
        }
    }

    private void triangle(Pen pen) {
        for (int i =0; i < 3; i++) {
            pen.move(100);
            pen.turn(120);
        }
    }

    private void pentagon(Pen pen){
        for(int i = 0; i < 5; i++) {
            pen.move(100);
            pen.turn(360 / 5);
        }
    }

    private void polygon(Pen pen, int sides) {
        for(int i = 0; i < sides; i++) {
            pen.move(110);
            pen.turn(360 / sides);
        }
    }

    private void sprial(Pen pen) {
        for(int i = 500; i > 0; i -= 10) {
            pen.move(i);
            pen.turn(90);
        }
    }

    public void drawPicture() {
        myCanvas.drawString("Hello World", 100, 100);
        myCanvas.fillCircle(200, 200, 200);
        myCanvas.fillRectangle(400, 400, 50, 60);
    }
    /**
     * Draw some random squiggles on the screen, in random colors.
     */
    public void colorScribble()
    {
        Pen pen = new Pen(250, 200, myCanvas);

        for (int i=0; i<10; i++) {
            // pick a random color
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            pen.setColor(new Color(red, green, blue));
            
            pen.randomSquiggle();
        }
    }
    
    /**
     * Clear the screen.
     */
    public void clear()
    {
        myCanvas.erase();
    }
}
