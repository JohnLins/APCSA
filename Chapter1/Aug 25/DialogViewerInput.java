
/**
 * Write a description of class DialogViewerInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class DialogViewerInput
{
  public static void main(String[] args)
  {
    String name = JOptionPane.showInputDialog("Name: ");
    System.out.println("Hello " + name);
  }
}