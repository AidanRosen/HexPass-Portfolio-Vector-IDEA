package vector_calc;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

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
        Stroke stroke = new BasicStroke(6f);
        g2.setStroke(stroke);
        Line2D lin = new Line2D.Float(50, 50 + yChange, 50 + xChange, yFinal);
        //you MUST use 250 - ychange because JFrame coordinates go backwards to go up in the y axis
        g2.draw(lin);

/*
        super.paintComponent(g);
        //paintComponent is inbuilt !!! MUST use it here
        System.out.println(this.magnitude);
        System.out.println("The above is the value for size");
        g.fillRect(250, 250, this.magnitude, 5);*/



        //In a 500x500 frame, (250,250) is the central coordinate
        //Need a way to modify the parameters of FILLRECTANGLE and not the PAINT parameters
        //parameters above are for coordinate spot, length (magnitude) and direction pointing (angle)

        //typecast magnitude, a double, into the integer size so that no errors occur when using a double in an integer parameter

        //size is in the "width" parameter
        //Need a way to make it point a certain direction
        //g.fillRect(x, y, size, 15);
    }
}