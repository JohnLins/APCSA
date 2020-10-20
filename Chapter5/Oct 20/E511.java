import java.util.Scanner;
public class E511
{
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
     System.out.println("Temperature Value: ");
     double tempVal = in.nextDouble();
     
     System.out.println("C or F: ");
     double m = in.next().charAt(0);
     
     
     System.out.println("Altitude (in meters)");
     double alt = in.nextDouble();
     
   
     
     if (m == 'F') {
         tempVal = tempVal + 32;
     } 
     
     tempVal -= (alt/300);
     
     if(tempVal < 0){
         System.out.println("Solid");
     } else if(tempVal > 100) {
         System.out.println("Gas");
     } else {
       System.out.println("Liquid");  
     }
     
     }
     
     
}
     
     
     