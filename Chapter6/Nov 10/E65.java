import java.io.*; 
import java.lang.*; 
import java.io.*; 
import java.lang.*; 
import java.util.*; 
import java.util.Collections;
import java.util.Vector;

public class E65
{
    /*private double a;
    private double b;
    private double c;*/
    
    Vector<Double> values = new Vector<Double>(3);
    
    public E65()
    {
    }

    public void addValue(double value)
    {
        values.add(value);
    }
    
    public double getAverage(){
        double average = 0.0;
        for(int i = 0; i<3; i++){
            average+=values.get(i);
        }
        return average/values.size();
    }
    
    public double getSmallest(){
        return Collections.min(values);
    }
    
    public double getLargest(){
        return Collections.max(values);
    }
    
    public double getRange(){
        return getLargest() - getSmallest();
    }
}
