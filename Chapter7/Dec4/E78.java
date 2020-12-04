import java.util.Random;
import java.lang.Math; 
public class E78
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        
        int[] second = {1,2,3,4,5,6,7,8,9,10};
        int[] newArr = new int[10];
        
        /*for(int i = 0; i < second.length; i++){
            int index = generator.nextInt(9);
            newArr[i] = second[index];
            
            for(int j = index + 1; j < second.length; j++){
                second[j-1] = second[j];
            }
        }*/
        
        
        int initSize = second.length;
        for(int i = 0; i < second.length; i++){
            int index = (int) (Math.random() * initSize - 1);
            newArr[i] = second[index];
            second[index] = second[initSize - 1];
            initSize--;
        }
        
        
        
        System.out.println();
        for(int i = 0; i < 10; i++){
            System.out.print(newArr[i] + ", ");
        }
        
    }
}
