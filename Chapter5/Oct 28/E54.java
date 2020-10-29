import java.util.Scanner;
public class E54
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);
     System.out.println("Convert from?: ");
     String from = in.next();
     System.out.println("Convert to");
     String to = in.next();
     System.out.println("Value: ");
     double value = in.nextDouble();
     
     
     double fmultr = 0;
     double tmultr = 0;
     
    if (from.equals("oz")){
         fmultr = 0;
    } else if (from.equals("gal")){
         fmultr = 128;
    } else {
         System.out.println("Bad conversion");
    }
    
    if (to.equals("ml")){
        tmultr = 29.5735;
    } else if (to.equals("l")){
        tmultr = 0.0295735;
    } else {
        System.out.println("Bad conversion");
    }
        
    
    
         System.out.println((tmultr*value) * fmultr);
    
       
        
}

}
