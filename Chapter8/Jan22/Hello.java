import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
public class Hello
{ 
    
    public Hello()
    {
        
    }

    public void drawH(Graphics2D g2)
    {
       
        
       Point2D.Double r1 = new Point2D.Double(20, 20);
        
       Point2D.Double r2 = new Point2D.Double(40, 20);
        
      
       Line2D.Double a = new Line2D.Double(r1, r2);
       g2.draw(a);
       
       
       Point2D.Double r3 = new Point2D.Double(20, 10);
        
       Point2D.Double r4 = new Point2D.Double(20, 30);
       
       Line2D.Double b = new Line2D.Double(r3, r4);
       g2.draw(b);
       
       
       Point2D.Double r5 = new Point2D.Double(40, 10);
        
       Point2D.Double r6 = new Point2D.Double(40, 30);
       
       Line2D.Double c = new Line2D.Double(r5, r6);
       g2.draw(c);
       
     
        
       
       
    }
    
    
    public static void drawE(Graphics2D g2){
        
       Point2D.Double r1 = new Point2D.Double(60, 10);
        
       Point2D.Double r2 = new Point2D.Double(60, 30);
        
      
       Line2D.Double a = new Line2D.Double(r1, r2);
       g2.draw(a);
       
       
      // for(int i = 20; i < 4; i+=20){
           Point2D.Double r3 = new Point2D.Double(60, 10);
            
           Point2D.Double r4 = new Point2D.Double(80, 10);
            
          
           Line2D.Double b = new Line2D.Double(r3, r4);
           g2.draw(b);
           
           
           
           Point2D.Double r5 = new Point2D.Double(60, 20);
            
           Point2D.Double r6 = new Point2D.Double(80, 20);
            
          
           Line2D.Double c = new Line2D.Double(r5, r6);
           g2.draw(c);
           
           
           
           
           Point2D.Double r7 = new Point2D.Double(60, 30);
            
           Point2D.Double r8 = new Point2D.Double(80, 30);
            
          
           Line2D.Double d = new Line2D.Double(r7, r8);
           g2.draw(d);
           
        //}
       
       
       
        
    }
    
    public static void drawLL(Graphics2D g2){
        
           Point2D.Double r1 = new Point2D.Double(100, 10);
            
           Point2D.Double r2 = new Point2D.Double(100, 30);
            
          
           Line2D.Double a = new Line2D.Double(r1, r2);
           g2.draw(a);
           
           
           Point2D.Double r3 = new Point2D.Double(120, 10);
            
           Point2D.Double r4 = new Point2D.Double(120, 30);
            
          
           Line2D.Double b = new Line2D.Double(r3, r4);
           g2.draw(b);
           
        
    }
    
    public static void drawO(Graphics2D g2){
           Point2D.Double r1 = new Point2D.Double(140, 10);
            
           Point2D.Double r2 = new Point2D.Double(140, 30);
            
          
           Line2D.Double a = new Line2D.Double(r1, r2);
           g2.draw(a);
           
           
           Point2D.Double r3 = new Point2D.Double(160, 10);
            
           Point2D.Double r4 = new Point2D.Double(160, 30);
            
          
           Line2D.Double b = new Line2D.Double(r3, r4);
           g2.draw(b);
           
           
           
           Point2D.Double r5 = new Point2D.Double(140, 10);
            
           Point2D.Double r6 = new Point2D.Double(160, 10);
            
          
           Line2D.Double c = new Line2D.Double(r5, r6);
           g2.draw(c);
           
           
           
           Point2D.Double r7 = new Point2D.Double(140, 30);
            
           Point2D.Double r8 = new Point2D.Double(160, 30);
            
          
           Line2D.Double d = new Line2D.Double(r7, r8);
           g2.draw(d);
           
           
    }
}
