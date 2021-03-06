package vector_calc;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Random;

public class VectorDraw extends JPanel{

    int magnitude;
    int direction;
    int xChange;
    int yChange;
    int yFinal;


    public VectorDraw (double mag, double angle, double xDis, double yDis, int finalY){

        magnitude = (int) mag;
        direction = (int) angle;
        xChange = (int) xDis;
        yChange = (int) yDis;
        yFinal = finalY;


    }

    public void drawRect(Graphics g){


        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        float[] dash1 = { 2f, 0f, 2f };
        Stroke stroke1 = new BasicStroke(6f, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND,
                1.0f,
                dash1,
                2f);
        g2.setStroke(stroke1);
        Line2D lin = new Line2D.Float(50, 50 + yChange, 50 + xChange, yFinal);
        //you MUST use 250 - ychange because JFrame coordinates go backwards to go up in the y axis
        Random rand = new Random();
        float r = rand.nextFloat();
        float z = rand.nextFloat();
        float b = rand.nextFloat();
        g2.setColor(new Color(r, z, b)); //Creates random color every time you open the program
        //you MUST use 250 - ychange because JFrame coordinates go backwards to go up in the y axis
        g2.draw(lin);


        //paintComponent is inbuilt !!! MUST use it here



        //In a 500x500 frame, (250,250) is the central coordinate
        //Need a way to modify the parameters of FILLRECTANGLE and not the PAINT parameters
        //parameters above are for coordinate spot, length (magnitude) and direction pointing (angle)
        //typecast magnitude, a double, into the integer size so that no errors occur when using a double in an integer parameter
        //size is in the "width" parameter
        //Need a way to make it point a certain direction
    }
}
