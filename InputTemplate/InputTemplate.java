  
import java.util.Scanner;

public class InputTemplate
{
    public static void main(String[] args)
    {
     int x = 0;
     System.out.println("Number: ");
     
     Scanner in = new Scanner(System.in);
     
     x = in.nextInt();
        System.out.println(x);
}
}