import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class P115
{
    
    public static void main(String args[]){
        String file = "coin.txt";
        DataSetReader reader = new DataSetReader();
        ArrayList<Coin> coins = new ArrayList<Coin>();
        //Coin mine = new Coin(0.01, "penny");
       
       
         try {
             
             
             double[] data = reader.readFile(file);
             for(double n : data){
                 coins.add(new Coin(n, "name"));
                }
             
             
             
            }
            catch (FileNotFoundException exception) {
                System.out.println("File not found");
            } catch (BadDataException exception){
             System.out.println("Bad data: " + exception.getMessage());   
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        
            
        
    }
    
    
  
    
   
}
