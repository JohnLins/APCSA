import java.util.Scanner;
/**
 * Write a description of class E523 here.
 *
 * @author (John Lins)
 * @version (a version number or a date)
 */
public class E523
{
    public static void main(String []args)
    {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a month: ");

        int month = in.nextInt();
        
        Month Month = new Month();
        
        int days = Month.getLenght(month);
        System.out.print(days + " Days");
    }
}
