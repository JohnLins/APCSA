import java.util.Scanner;
/**
 * Write a description of class Initials here.
 *
 * @author (John Lins)
 * @version (a version number or a date)
 */
public class P41
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in); 
       System.out.print("Cost of new Car: ");
       int cost = in.nextInt();
       
       System.out.print("Estimated miles driven per year:" );
       int milesPerYear = in.nextInt();
       
       System.out.println("Estimated gas price: ");
       int gasPrice = in.nextInt();
       
       System.out.println("The efficiency % in miles per gallon: ");
       double efficiency = in.nextDouble();
       
       System.out.println("The estimated resale value after 5 years: ");
       int resale = in.nextInt();
       
       
       
       System.out.print("Total cost of owning the car for 5 years: $");
       System.out.println(((milesPerYear*gasPrice*efficiency)+cost)-resale);
    }

    
}