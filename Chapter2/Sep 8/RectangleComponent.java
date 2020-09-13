import java.awt.Graphics;

import java.awt.Graphics2D;

import java.awt.Rectangle;

import javax.swing.JComponent;


/*

7 A component that draws two rectangles.

8 */

public class RectangleComponent extends JComponent

{

    public void paintComponent(Graphics g)
    {

    Graphics2D g2 = (Graphics2D) g;


    Rectangle square1 = new Rectangle(0, 0, 50, 50);
    
    Rectangle square2 = new Rectangle(10, 15, 20, 60);

  
    Rectangle square3 = square1.intersection(square2);
    System.out.println(square3);

    g2.draw(square1);
    g2.draw(square2);
    
    /*
     * You can tell when it's empty if "width" and "height" are "0"
     */

}

}