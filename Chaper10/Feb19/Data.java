
public class Data
{
   
    public static double average(Object[] objects, Measurer meas)
    {
        double sum = 0;
        for (Object obj : objects){
         sum = sum + meas.measure(obj);
         
        }
        if(objects.length > 0){
         return sum / objects.length;   
        }
        else {
         return 0;   
        }
    }
    
    public static Object max(Object anObject, Object anObject2, Measurer m){
     if(m.measure(anObject) > m.measure(anObject2)){
            return anObject;
        } else {
            return anObject2;
        }
    }
}
