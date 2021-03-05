import java.io.*;
import java.util.Scanner;

public class Total{
 
    public static void main(String[] args) throws FileNotFoundException{
     Scanner console = new Scanner(System.in);   
     System.out.println("Input File: ");
     String inputFileName = console.next();
     
     System.out.println("Output File: ");
     String outputFileName = console.next();
     
     File inputFile = new File(inputFileName);
     Scanner in = new Scanner(inputFile);
     PrintWriter out = new PrintWriter(outputFileName);
     
     double total = 0;
     
     while(in.hasNextDouble()){
         double value = in.nextDouble();
         out.printf("%15.2f\n", value);
         total += value;
        }
        
        out.printf("Total: %8.2f\n", total);
        in.close();
        out.close();
    }
}