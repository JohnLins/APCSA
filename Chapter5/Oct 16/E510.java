import java.util.Scanner;
/**
 * Write a description of class ElevatorSimulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class E510
{
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
     System.out.println("Temperature Value: ");
     double tempVal = in.nextDouble();
     
     System.out.println("C or F: ");
     double m = in.next().charAt(0);
     
     if (m == 'F') {
         tempVal = tempVal + 32;
     } 
     
     if(tempVal < 0){
         System.out.println("Solid");
     } else if(tempVal > 100) {
         System.out.println("Gas");
     } else {
       System.out.println("Liquid");  
     }
     
     
     
     
    

    }
}
