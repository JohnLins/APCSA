import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
public class Star
{ 
    private int xLeft;
    private int yTop;
    
    public Star(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    public void draw(Graphics2D g2)
    {
       Point2D.Double r1 = new Point2D.Double(xLeft - 30, yTop + 30);
        
       Point2D.Double r2 = new Point2D.Double(xLeft + 30, -yTop + 30);
        
       Point2D.Double r3 = new Point2D.Double(xLeft - 30, -yTop - 30);
        
       Point2D.Double r4 = new Point2D.Double(xLeft + 30, yTop + 30);
       
       Point2D.Double r5 = new Point2D.Double(xLeft + 60, yTop + 10);
        
       Point2D.Double r6 = new Point2D.Double(-xLeft + 30, -yTop + 30);
       
       Line2D.Double line1 = new Line2D.Double(r1, r2);

       Line2D.Double line2 = new Line2D.Double(r3, r4);
        
       Line2D.Double line3 = new Line2D.Double(r5, r6);
        
       g2.draw(line1);
       
       g2.setPaint(Color.RED);
       g2.fill(line2);
       g2.draw(line2);
       
       g2.setPaint(Color.BLUE);
       g2.fill(line3);
       g2.draw(line3);
     
    }
}
