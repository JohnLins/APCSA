
/**
 * Write a description of class Image here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.net.URL;

import javax.crypto.ExemptionMechanismException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
  public static void main(String[] args) throws Exception
  {
    URL imageLocation = new URL(
    "http://horstmann.com/java4everyone/duke.gif");
    JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
  }
}