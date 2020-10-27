import java.util.Scanner;
public class E510
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);
     System.out.print("Card: ");
     
     char first = in.next().charAt(0); 
     char second = in.next().charAt(1);
     
        if(first == 'A'){
             System.out.print("Ace ");
        } else if (first == 'J') {
             System.out.print("Jack ");
        } else if (first == 'Q') {
             System.out.print("Queen ");
        } else if (first == 'K') {
             System.out.print("King ");
        } else {
             System.out.print(first);
        }
        
        if (second == 'D') {
             System.out.print("of Diamonds ");
        } else if (second == 'H') {
             System.out.print("of Hearts ");
        } else if (second == 'S') {
             System.out.print("of Spades ");
        } else if (second == 'C') {
             System.out.print("of Clubs ");
        }
        
       
        
}

}
