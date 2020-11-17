  
import java.util.Scanner;

public class AverageTestScore
{
    public static void main(String[] args)
    {
     int numOfScores = 0;
     int addUp = 0;
     System.out.println("Number of scores? ");
     
     Scanner in = new Scanner(System.in);
     
     numOfScores = in.nextInt();
     
    for(int i = 0; i < numOfScores; i++) {
        System.out.println("Enter a score: ");
        addUp += in.nextInt();
    }
    
        System.out.println("Average: " + addUp/numOfScores);
     
    
    
}
}