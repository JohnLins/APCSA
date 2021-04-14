import java.util.Scanner;
public class LoopFib
{
    public static long fib(int n){
        if(n <= 2){ return 1;}
        else {
         long olderValue = 1;
         long oldValue = 1;
         long newValue = 1;
         for(int i = 3; i <= n; i++){
             newValue = oldValue + olderValue;
             olderValue = oldValue;
             oldValue = newValue;
            }
            return newValue;
        }
        
    }
    
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     
     System.out.print("Enter n");
     int n = in.nextInt();
     
     for(int i = 1; i <= n; i++){
         long f = fib(i);
         
         System.out.println(f);
        }
    }
}
