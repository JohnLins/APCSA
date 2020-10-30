import java.util.Scanner;
public class P510
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);
     System.out.println("How satisfied are you? 1 to 3: ");
     int satisfaction = in.nextInt();
     System.out.println("Bill: ");
     double bill = in.nextDouble();
     
     if(satisfaction == 3){
         System.out.println(bill*0.20);
     } else if (satisfaction == 2){
         System.out.println(bill*0.15);
        } else {
            System.out.println(bill*0.10);
        }
     
     

}

}
