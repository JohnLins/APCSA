import java.util.Scanner;
import java.util.ArrayList;
public class LargestInArrayList
{
    public static void main(String args[]){
        ArrayList<Double> values = new ArrayList<Double>();
     
        System.out.println("Enter Value: (Q to quit)");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble()){
         values.add(in.nextDouble());
        }
        
        double largest = values.get(0);
        for(int i = 1;  i < values.size(); i++){
         if(values.get(i) > largest){
             largest = values.get(i);    
           }
        }
        
        for(double element : values){
         System.out.print(element);
         if(element == largest){
             System.out.print("<= Largest");
            }
            System.out.println();
        }
    }
}
