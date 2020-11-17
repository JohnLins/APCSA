import java.util.Random;

public class E619
{
    public static void main(String[] args)
    {
        int stratOne = 0;
        int stratTwo = 0;
        
        Random generator = new Random();
        
        for(int i = 0; i < 1000; i++){
            int rightDoor = 1 + generator.nextInt(3);
         
            int doorChoice = 1 + generator.nextInt(3);
            
            int hostPickDoor = 1 + generator.nextInt(3);
            if(hostPickDoor == doorChoice){
                if(hostPickDoor <= 2){
                    hostPickDoor++;
                } else {
                    hostPickDoor--;
                }
            }
            
            if(hostPickDoor == rightDoor){
                stratOne++;
            }
            if(doorChoice == rightDoor){
                stratTwo++;
            }
        
    }
        System.out.println("Strat 1: " + stratOne);
        System.out.println("Strat 2: " + stratTwo);
     
        if(stratOne > stratTwo){
            System.out.println("Strat 1 Wins!");
        } else if (stratTwo > stratOne){
            System.out.println("Strat 2 Wins!");
        } else {
            System.out.println("Tie");
        }
        
    }
}