import java.awt.Graphics;

import java.awt.Graphics2D;

import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class E1012Component extends JComponent

{

    private static final int BOX_X = 53;
    
    private static final int BOX_Y = 123;
    
    private static final int BOX_WIDTH = 25;
    
    private static final int BOX_HEIGHT = 40;
    
    private Rectangle box;


public E1012Component()

{
    box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
}



public void paintComponent(Graphics g)

{
    
    Graphics2D g2 = (Graphics2D) g;
    
    g2.draw(box);
    g2.draw(new Ellipse2D.Double(BOX_X + 6, BOX_Y + 10, BOX_WIDTH - 8, BOX_HEIGHT + 8));

}



}

