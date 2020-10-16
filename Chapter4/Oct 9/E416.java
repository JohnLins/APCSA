import java.util.Scanner;
/**
 * Write a description of class MilitaryFormat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class E416
{
   
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in); 
       System.out.print("Please enter the first time: ");
       int first = in.nextInt();
       
       System.out.print("Please enter the second time: ");
       int second = in.nextInt();
       
       int finalTime = Math.abs(second-first);
    
       int hours = finalTime/100;
       int min = finalTime - (hours*100);
       //String initials = first.substring(0,1) + "&" + second.substring(0,1);
       
       System.out.println(hours + " hours, and " + min + "Minutes");
    }


}
