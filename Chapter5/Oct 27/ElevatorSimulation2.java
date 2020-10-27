import java.util.Scanner;

public class ElevatorSimulation2
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);
     System.out.print("Floor: ");
     
     if(in.hasNextInt())
     {
        int floor = in.nextInt(); 
     
     if(floor == 13)
     {
         System.out.println("Err, no 13th floor");
     } else if (floor <= 0 || floor > 20){
         System.out.println("Err, floor must be between 1 ans 20");
     } else {
     int actualFloor = floor;
     if(floor > 13)
     {
         actualFloor = floor - 1;
     }
         System.out.println("The elevator will go to the actual floor " + actualFloor);
         
     }
    }
    else {
        System.out.println("Err, not an integer");
    }
}

}
