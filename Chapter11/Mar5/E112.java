import java.io.*;
import java.util.Scanner;

public class E112{
 
    public static void main(String[] args) throws FileNotFoundException{
     Scanner console = new Scanner(System.in);   
     System.out.println("Input File: ");
     String inputFileName = console.next();
     
     System.out.println("Output File: ");
     String outputFileName = console.next();
     
     File inputFile = new File(inputFileName);
     Scanner in = new Scanner(inputFile);
     PrintWriter out = new PrintWriter(outputFileName);
     
    
     int line = 1;
     while(in.hasNext()){
         System.out.println("/* " + line + " */" + in.next());
         line++;
        }
        
        in.close();
        out.close();
    }
}