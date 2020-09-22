import java.awt.Graphics;

import java.awt.Graphics2D;

import javax.swing.JComponent;



public class CarComponent extends JComponent

{

public void paintComponent(Graphics g)

{

Graphics2D g2 = (Graphics2D) g;



Car car1 = new Car(30, 30);


    
Car car2 = new Car(40, 90);
    
    
car1.draw(g2);
    
car2.draw(g2);


}

}