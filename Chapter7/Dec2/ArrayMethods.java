import java.io.*;
public class ArrayMethods
{
    private int[] values;

    public ArrayMethods(int[] initialValues)
    {
        values = initialValues;
    }
    
    public void printArr()
    {
        for(int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " , ");
        }
    }

    public void swapFirstAndLast()
    {
        int first = values[0];
        values[0] = values[values.length-1];
        values[values.length-1] = first;
        
        System.out.println("Swap First And Last: ");
        printArr();
        System.out.println();
    }
    
    public void shiftRight() 
    {
        int initial = values[values.length-1];
        int[] newValues = new int[6];
        for(int i = 1; i < values.length; i++) {
            newValues[i] = values[i - 1];
        }
        newValues[0] = initial;
        
        values = newValues;
        
        System.out.println("Shift Right: ");
        printArr();
    }
}
