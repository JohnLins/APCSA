
/**
 * Write a description of class PowerTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PowerTable
{
    public static void main(String[] args)
    {
        final int NMAX = 4;
        final double XMAX = 10;
        
        for(int n = 1; n <= NMAX; n++){
         System.out.printf("%10d", n);   
        }
        System.out.println();
        for(int n = 1; n <= NMAX; n++){
            System.out.printf("%10s", "x ");
        }
        System.out.println();
        for(double x = 1; x <= XMAX; x++){
         for(int n = 1; n <= NMAX; n++){
             System.out.printf("%10.0f", Math.pow(x, n));
            }
            System.out.println();
        }
    }
}
