
public class E72
{
    public static void main(String []args){
        int[] start = {3,6,7,2,4,9};
        ArrayMethods arr = new ArrayMethods(start);
        
        System.out.println("Original: ");
        arr.printArr();
        
        System.out.println();
        arr.shiftRight();
        
        System.out.println();
        arr.swapFirstAndLast();
        
        
    }
}
