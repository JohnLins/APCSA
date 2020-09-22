import java.awt.Graphics;

import java.awt.Graphics2D;

import javax.swing.JComponent;



public class StarComponent extends JComponent

{

public void paintComponent(Graphics g)

{

Graphics2D g2 = (Graphics2D) g;



Star l1 = new Star(50, 20);

Star l2 = new Star(50, 20);
    
Star l3 = new Star(50, 20);
    
    
l1.draw(g2);
    
l2.draw(g2);

l3.draw(g2);

}

}