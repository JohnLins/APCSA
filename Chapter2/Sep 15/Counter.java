
/**
 * Write a description of class Counter here.
 *
 * @author (John Lins)
 * @version (a version number or a date)
 */
public class Counter
{
    private int value;

    public int getValue()
    {
        return value;
    }
    public void click()
    {
        value = value + 1;
    }
    public void reset()
    {
        value = 0;
    }
    public void unclick()
    {
       value = value - 1; 
    }
}
