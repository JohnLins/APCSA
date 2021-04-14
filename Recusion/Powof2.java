
public class Powof2
{
    public static int pow2(int num){
        if(num <= 0){
            return 1;
        }
        else {
            return 2*pow2(num-1);
        }
    }
    
    public static void main(String[] args){
     Powof2 mine = new Powof2();
     System.out.println(mine.pow2(6));
        
    }
    
}
