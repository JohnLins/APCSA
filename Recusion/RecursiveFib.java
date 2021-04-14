import java.util.Scanner;
public class RecursiveFib
{
    public static long fib(int n){
        if(n <= 2){
         return 1;   
        } else {
         return fib(n-1) + fib(n-2);   
        }
    }
    
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     System.out.println("Enter val: ");
     int n = in.nextInt();
     
     for(int i = 1; i <= n; i++){
         System.out.println(fib(i));
        }
     
    }
}
