import java.util.Scanner;
/**
 * Write a description of class E410 here.
 *
 * @author (John)
 * @version (a version number or a date)
 */
public class E410
{
    public static void main(String[] args){
    int gallons;
    int efficiency;
    int pricePerGal;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Gallons: ");
    gallons = scan.nextInt();
    System.out.println("Efficiency: ");
    efficiency = scan.nextInt();
    System.out.println("Price Per Gallon: ");
    pricePerGal = scan.nextInt();
    
    System.out.println("Cost per 100 miles: $" + (100/efficiency)*pricePerGal);
    
    
    System.out.println("-----Part two-------");
    char driveLetter;
    System.out.println("Drive Letter: ");
    driveLetter = scan.next().charAt(0);
    System.out.println(driveLetter + ":\\Windows\\System\\Readme.txt");
}
}
