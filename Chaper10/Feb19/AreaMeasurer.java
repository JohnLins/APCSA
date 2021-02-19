import java.awt.Rectangle;
public class AreaMeasurer implements Measurer
{
  
    
    public double measure(Object anObject)
    {
        Rectangle aRect = (Rectangle) anObject;
        double area = aRect.getWidth() * aRect.getHeight();
        return area;
    }
    
    
}
