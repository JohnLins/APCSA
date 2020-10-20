
/**
 * Write a description of class game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class game
{
    public static void main(String args[])
    {
        int scoreA = 10;
        int scoreB = 20;
        
        if(scoreA > scoreB){
            System.out.println("A Won!");
        } else if (scoreA < scoreB){
            System.out.println("B Won!");
        } else{
            System.out.println("Tie!");
        }
    }
}
