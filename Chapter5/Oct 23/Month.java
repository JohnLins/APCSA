
/**
 * Write a description of class month here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Month
{
    public int getLenght(int month)
    {
        int days = 0;
        if(month == 4 || month == 6 || month == 9 || month == 11){
            days = 30;
        }else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        }else if(month == 2) {
           days = 29;
        }
        
        return days;
    }
}
