import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class stdSort
{
    public static void printArr(int[] arr){
        for(int value : arr){
         System.out.print(value + " ");
        }
    }
    
    public static void printArrList(ArrayList<Integer> arr){
     for(int value : arr){
         System.out.print(value + " ");
        }
    }
   public static void main(String[] args){
       int[] a = {7, 4, 2, 1, 0};
       Arrays.sort(a);
       printArr(a);
       
       int pos = Arrays.binarySearch(a, 7);
       System.out.println(pos);
       ArrayList<Integer> b = new ArrayList<Integer>();
       b.add(5);
       b.add(2);
       b.add(9);
       Collections.sort(b);
       printArrList(b);
    }
}
