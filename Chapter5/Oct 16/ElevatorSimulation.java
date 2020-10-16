import java.util.Scanner;
/**
 * Write a description of class ElevatorSimulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElevatorSimulation
{
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
     System.out.print("Floor: ");
     int floor = in.nextInt();
     
     
     int actualFloor;
     if(floor > 13){
         actualFloor = floor - 1;
    } else {
        actualFloor = floor;
    }
    
    System.out.print("The elevator will travel to: " + actualFloor);
    

    }
}
