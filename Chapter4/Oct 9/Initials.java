import java.util.Scanner;
/**
 * Write a description of class Initials here.
 *
 * @author (John Lins)
 * @version (a version number or a date)
 */
public class Initials
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in); 
       System.out.print("Enter First Name: ");
       String first = in.next();
       
       System.out.print("Enter your significant other's first name:" );
       String second = in.next();
       
       String initials = first.substring(0,1) + "&" + second.substring(0,1);
       
       System.out.println(initials);
    }

    
}
