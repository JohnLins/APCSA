
/**
 * Write a description of class LikeMeToDo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class LikeMeToDo
{
  public static void main(String[] args)
  {
    String name = JOptionPane.showInputDialog("Hi, my name is John... What would you like me to do?: ");
    System.out.println("Sorry," + name + " but i'm afraid I can't do that");
  }
}
