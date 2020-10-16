import java.util.Scanner;
/**
 * Write a description of class ElevatorSimulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class E59
{
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
     System.out.println("Wage(Hourly): ");
     double hourlyWage = in.nextDouble();
     
     System.out.println("How many hours did the employee work: ");
     double hours = in.nextDouble();
     
     if(hours > 40){
         System.out.println("Pay: " + ((40*hourlyWage) + (hours-40)*(hourlyWage * 1.5)));
     } else {
         System.out.println("Pay: " + (hourlyWage * hours));
        }
     
     
     
    
    
    

    }
}
