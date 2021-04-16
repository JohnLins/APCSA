import java.util.Scanner;
public class ExpressionCalculator
{
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     System.out.println("Enter: ");
     String input = in.nextLine();
     Evaluator e = new Evaluator(input);
     int value = e.getExpressionValue();
     System.out.println(input + " = " + value);
    }
}
