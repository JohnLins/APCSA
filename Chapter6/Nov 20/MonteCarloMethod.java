import java.util.Random;
public class MonteCarloMethod
{
    public static void main(String[] args)
    {
        final int TRIES = 10000;
        Random generator  = new Random();
        int hits = 0;
        
        for(int i = 1; i <= TRIES; i++ ){

            double r = generator.nextDouble();
            
            double x = -1 + 2 * r;
            
            r = generator.nextDouble();
            
            double y = -1 + 2 * r;

            
            if (x * x + y * y <= 1) { hits++; }
            
            
        }
        
        double piEstimate = 4.0 * hits / TRIES;

        System.out.println("Estimate for pi: " + piEstimate);
        
        
    }
}
