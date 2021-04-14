import java.util.Scanner;

public class SelectionSortTimer
{
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     System.out.print("Enter array size");
     int n = in.nextInt();
     int[] a = ArrayUtil.randomIntArray(n, 100);
     
     StopWatch timer = new StopWatch();
     
     timer.start();
     SelectionSorter.sort(a);
     timer.stop();
     
     System.out.println("Time it took" + timer.getElapsedTime() + " milliseconds");
    }
}
