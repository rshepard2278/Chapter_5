import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 * Class BallDemo - a short demonstration showing animation with the 
 * Canvas class. 
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class BallDemo   
{
    private Canvas myCanvas;
    private ArrayList<BouncingBall> balls;
    private ArrayList<BoxBall> boxBalls;
    private Random rand;

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        rand = new Random();
        balls = new ArrayList<>();
        boxBalls = new ArrayList<>();
        myCanvas = new Canvas("Ball Demo", 600, 500);
    }

    public void boxBounce(int numBalls) {
        myCanvas.setVisible(true);
        Rectangle box = new Rectangle(20, 20, 400, 400);
        myCanvas.draw(box);

        for(int i = 0; i < numBalls; i++) {
            boxBalls.add(new BoxBall(21, 30, 20, box, Color.BLACK, myCanvas));
            boxBalls.get(i).draw();
        }

        while(true) {
            myCanvas.wait(50);           // small delay
            for(int i = 0; i < numBalls; i++) {
                boxBalls.get(i).move();
            }           
        }
    }

    /**
     * Simulate two bouncing balls
     */
    public void bounce(int numBalls)
    {
        int ground = 400;   // position of the ground line

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.drawLine(50, ground, 550, ground);

        for(int i = 0; i < numBalls; i++) {
            balls.add(new BouncingBall(rand.nextInt(300), 50, 50, Color.BLUE, ground, myCanvas));
            balls.get(i).draw();
        }

        // make them bounce
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            for(int i = 0; i < numBalls; i++) {
                balls.get(i).move();
                if(balls.get(i).getXPosition() >= 550) {
                    finished = true;
                }
            }           
        }
    }
}
