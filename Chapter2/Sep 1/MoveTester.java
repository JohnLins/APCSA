import java.awt.Rectangle;
/**
 * Write a description of class MoveTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoveTester
{
    
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        //Move rectangle
        box.translate(15, 25);
        
        //Print
        System.out.print("x: ");
        System.out.println(box.getX());
        
        System.out.print("y: ");
        System.out.println(box.getY());
        System.out.println("Expected: 35");
    }
}
