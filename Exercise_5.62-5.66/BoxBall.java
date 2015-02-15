import java.awt.*;
import java.awt.geom.*;

/**
 * Class BoxBall creates a ball that boucnes within
 * the bounds of a box
 * 
 * @author Richard Shepard
 * @version 2.14.2015
 */
public class BoxBall
{
    private int xPos;
    private int yPos;
    private int radius;
    private Color boxColor;
    private Canvas canvas;
    private int xSpeed;
    private int ySpeed;
    private int xMax;
    private int yMax;
    private int xMin;
    private int yMin;


    public BoxBall(int xPos, int yPos, int radius, Rectangle rect, Color boxColor, Canvas canvas) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
        this.boxColor = boxColor;
        xSpeed = 4;
        ySpeed = 4;
        xMax = (int)(rect.getX() + rect.getWidth());
        yMax = (int)(rect.getY() + rect.getHeight());
        xMin = (int)(rect.getX());
        yMin = (int)(rect.getY());
        this.canvas = canvas;
    }

    public void draw() {
        canvas.setForegroundColor(boxColor);
        canvas.fillCircle(xPos, yPos, radius *2);
    }

    public void erase() {
        canvas.eraseCircle(xPos, yPos, radius *2);
    }

    public void move() {
        erase();

        xPos += xSpeed;
        yPos += ySpeed;
        
        if(xPos + radius * 2 > xMax - 1 || xPos < xMin + 1) {
            xSpeed *= -1;
        }
        
        if(yPos + radius * 2 > yMax - 1 || yPos < yMin +1) {
            ySpeed *= -1;
        }

        draw();
    }
}
