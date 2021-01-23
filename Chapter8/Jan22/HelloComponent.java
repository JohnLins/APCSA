import java.awt.Graphics;

import java.awt.Graphics2D;

import javax.swing.JComponent;



public class HelloComponent extends JComponent
{

    public HelloComponent(){
        
    }
    
public void paintComponent(Graphics g)

{

Graphics2D g2 = (Graphics2D) g;



Hello car1 = new Hello();


    

    
    
car1.drawH(g2);

car1.drawE(g2);
car1.drawLL(g2);

car1.drawO(g2);
    



}

}