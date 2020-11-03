import java.util.Scanner;
import java.lang.Math.*;
/**
 * Write a description of class P520 here.
 *
 * @author (John lins)
 */
public class P520
{
    public static void main(String args[])
    {
     final double G = 6.67*Math.pow(10, -11);
     double M = 1.3*Math.pow(10, 22);
     final double R = 1.153*Math.pow(10, 6);
         
     double escapeV = Math.sqrt(2*((G*M)/(R)));
     
     Scanner in = new Scanner(System.in);
     System.out.println("Launch V (mph): ");
     int launchV = in.nextInt();
     
     if(launchV <= escapeV) {
         System.out.println("Will return!");
     } else {
         System.out.print("The Mass of the Commet must be: ");
         System.out.print(((Math.pow(launchV, 2))/2)/G);
     }
     
    }
}
