import java.util.Scanner;
/**
 * Write a description of class Volume here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Volume
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Price for 6 pack: ");
        double packPrice = in.nextDouble();
        
        System.out.print("Price for 2 liter");
        
        double bottlePrice = in.nextDouble();
        
        
        final double CANS_PER_PACK = 6;
    
        final double CAN_VOLUME = 0.355; 
        
        final double BOTTLE_VOLUME = 2;
        
        
        
        double packPricePerLiter = packPrice / (CANS_PER_PACK * CAN_VOLUME);
        
        double bottlePricePerLiter = bottlePrice / BOTTLE_VOLUME;
        
        
        
        System.out.printf("Pack price per liter: %8.2f", packPricePerLiter);
        
        System.out.println();
        
        
        
        System.out.printf("Bottle price per liter: %8.2f", bottlePricePerLiter);
        
        System.out.println();
        
        System.out.println("Extra input practice");
        
        int age = in.nextInt();
        System.out.println(age);
            
    }
}
