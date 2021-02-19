import java.awt.Rectangle;
public class MeasureTester
{
   public static void main(String[] args){
     Measurer areaMeas = new AreaMeasurer();
     Rectangle[] rects = new Rectangle[] { 
         new Rectangle(5,10,20,30),
         new Rectangle(10, 20, 30, 40),
         new Rectangle(20, 30, 5, 15)
        };
        
        double averageArea = Data.average(rects, areaMeas);
        System.out.println(averageArea);
        System.out.println("Expected 625");
        
        System.out.println(Data.max(rects[0], rects[1], areaMeas));
    }
}
