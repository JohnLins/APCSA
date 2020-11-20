import java.util.Scanner;
public class P62
{
    public static void main(String[] args){
        
        int x = 0;
        System.out.println("n'th number: ");
     
        Scanner in = new Scanner(System.in);
     
        x = in.nextInt();
        
        int fold1 = 1;
        int fold2 = 1;
        
        
        for(int i = 0; i <= x; i++) {
        
        int fnew = fold1 + fold2;
        fold2 = fold1;
        fold1 = fnew;
        
        System.out.println(fnew);
        
        }
        
            
    }
}
