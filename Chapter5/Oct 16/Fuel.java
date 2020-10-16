import java.util.Scanner;
/**
 * Write a description of class fuel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fuel
{
    public static void main(String[] args)
    {
     double fuelAmount = 2;
     double fuelCapacity = 30;
     
     if(100.0*(fuelAmount/fuelCapacity) < 10.0) {
         System.out.println("Red");
        } else {
            System.out.println("Green");
        }
     
    }
    
}
