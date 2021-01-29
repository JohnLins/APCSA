
import java.util.ArrayList; 

public class ComboLock
{
    private int secret1;
    private int secret2;
    private int secret3;
    ArrayList<Integer> secrets = new ArrayList<Integer>();
    
    ArrayList<Integer> ticksArr = new ArrayList<Integer>();
    
   
    public ComboLock(int secret1, int secret2, int secret3){
        secrets.add(secret1);
        secrets.add(secret2);
        secrets.add(secret3);
        
    }
    
    public void reset(){
        secret1 = 0;
        secret2 = 0;
        secret3 = 0;
        
    }
    
    public void turnLeft(int ticks){
        ticksArr.add(ticksArr.get(ticksArr.size()-1) - ticks);
    }
    
    public void turnRight(int ticks){
        ticksArr.add(ticks);
        
    }
    
    public boolean open(){
        int i = 0;
        for (Integer ti : ticksArr){
            if(ti != secrets.get(i)){
                return false;
            }
            i++;
        }
        
        return true;
        
    }
    
    public static void main(String args[]){
        ComboLock mine = new ComboLock(12, 11, 10);
        mine.turnRight(12);
        mine.turnLeft(1);
        mine.turnLeft(1);
        System.out.println(mine.open());
        
    }
}
