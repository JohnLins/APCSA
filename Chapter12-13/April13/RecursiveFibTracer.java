import java.util.Scanner;

public class RecursiveFibTracer
{
    public static long fib(int n){
        System.out.print("n: " + n + ", ");
        long f;
        if(n <= 2){
            f = 1;
        } else {
            f = fib(n-1) + fib(n-2);
            
        }
        System.out.println("Exit: " + n + ", Return: " + f);
        return f;
    }
    
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     System.out.print("Enter n: ");
     int n = in.nextInt();
     
     long f = fib(n);
     System.out.println("Fib( " + n + ") = " + f); 
       
    }
}
