import java.util.Scanner;
import java.lang.Math;

public class E44 {

public static void main(String[] args){

    Scanner num = new Scanner(System.in);  
    
    System.out.println("Enter num1: ");
    int num1 = num.nextInt();
    
    System.out.println("Enter num2: ");
    int num2 = num.nextInt(); 
    
    
    System.out.println("Sum: " + (num1 + num2));  
    System.out.println("Difference: " + (num1 - num2));
    System.out.println("Product: " + (num1 * num2));
    System.out.println("Average: " + ((num1 + num2)/2));
    System.out.println("Distance: " + Math.abs(num1 - num2));
    System.out.println("Max: " + Math.max(num1, num2));
    System.out.println("min: " + Math.min(num1, num2));
    
}
}