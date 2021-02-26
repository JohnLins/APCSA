import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener
{
   public int numOfClicks;
   public ClickListener(){
       numOfClicks = 0;
    }
   public void actionPerformed(ActionEvent event){
     numOfClicks++;
     System.out.println("I was clicked " + numOfClicks + " times");  
    }
    
}
