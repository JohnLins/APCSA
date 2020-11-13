import java.util.Scanner;

public class E617
{
    public static void main(String[] args)
    {
     double costInYen = 0.0;
     double dollarValue = 1;
     
     System.out.println("How much does $1 cost in yen? ");
     
     Scanner in = new Scanner(System.in);
     
     costInYen = in.nextDouble();
     
     while (dollarValue != 0.0){
         System.out.println("Enter dollar value: ");
        dollarValue = in.nextDouble();
        System.out.println("In Yen: " + (dollarValue / costInYen));
        
    
    }
    
    
    
}
}
    
    
        

