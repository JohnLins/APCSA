/**
 * Write a description of class Greeter here.
 *
 * @author (John Lins)
 * @version (a version number or a date)
 */
public class Greeter
{
    private String name;

    public Greeter(String nameEnter)
    {
        name = nameEnter;
    }

    public String sayHello()
    {
        return "Hello" + name;
    }
    
    public String sayGoodbye()
    {
        return "Goodbye" + name;
    }
    
    public String refuseHelp()
    {
        return "I am sorry, " + name + ", but I can't do that";
    }
}
