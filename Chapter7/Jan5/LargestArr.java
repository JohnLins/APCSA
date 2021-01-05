import java.util.Scanner;
/**
 * Write a description of class LargestArr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LargestArr
{
    public static void main(String[] args)
    {
     final int LENGTH = 100;
     double[] values = new double[LENGTH];
     int currentSize = 0;
     
     System.out.println("Please enter values, Q to quit");
     Scanner in = new Scanner(System.in);
     while(in.hasNextDouble() && currentSize < values.length){
         values[currentSize] = in.nextDouble();
         currentSize++;
        }
        double largest = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] > largest) {
             largest = values[i];   
            }
        }
        
        for (int i = 0; i < currentSize; i++){
            System.out.print(values[i]);
            if(values[i] == largest) {
             System.out.print("<- Largest");   
            }
            System.out.println();
        }
    }
}
