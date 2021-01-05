
/**
 * Write a description of class Equal2Zero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Equal2Zero
{
    public static void main(String[] args) {
     int zeros = 0;
     int arr[] = {3, 5, 6, 9, 0, 2, 0};
     for(int i = 0; i < arr.length; i++) {
         if(arr[i] == 0) {
             zeros++;
            }
        }
        
        System.out.println(zeros);
    }
}
