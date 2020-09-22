
/**
 * Write a description of class All here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClassName
{
    //Instance variables (Should always be private)
    private int x;

    /*Constructor (
    It initalizes objects,
    Sets the initial data for the objects,
    The name for the constructor is always the same as the name of the class,
    It has no return type
    */
    public ClassName(/*It can have arguments*/)
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    //this is a mutator method (Changes value, but does not return anything)
    public void add(int y)
    {
        x = x + y;
    }
    
    //another method example (This is a mutator method)
    public void sub(int y)
    {
        //local Variable
        int z = 1;
                    //using local variable
        x = x - y - z;
    }
    
    //Method to show value (Common)
    public int show()
    {
        return x;
    }
    
    //Main class
    public static void main(String[] args) {
        //Use "new" keyword
        ClassName number = new ClassName();
        number.add(5);
        number.sub(2);
        System.out.println(number.show());
    }
    
    
}
