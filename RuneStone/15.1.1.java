import java.util.List;
import java.util.ArrayList;

public class RandomStringChooser

{
    private int index;
    private ArrayList<String> words = new ArrayList<String>();

    public RandomStringChooser(String[] ws){
        index = 0;
        for(int i = 0; i < ws.length; i++){
            words.add(ws[i]);
        }
    }

    public String getNext(){
        String r = "";
        if(index >= words.size()){
            r = "NONE";
        } else {
            r = words.get(index);
            words.set(index, "NONE");
        }
        
        
        index++;
        return r;

    }

    /** This is a main method for testing the class */
    public static void main(String[] args)
    {
        System.out.println("It should print the words in the array in a random order and then NONE twice");
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for (int k = 0; k < 6; k++)
        {
           System.out.println(sChooser.getNext() + " ");
        }

     } // end of main

} // end of class
