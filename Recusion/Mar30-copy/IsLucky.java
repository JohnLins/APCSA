
public class IsLucky
{
   public static boolean isLucky(int num){
     int lastDigit = num % 10;
     if(lastDigit == 8){
     return true;    
        } else {
         return isLucky(num/10);   
        }
    }
    
    public static void main(String[] args){
     System.out.println(isLucky(500));   
    }
}
