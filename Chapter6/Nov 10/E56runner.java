public class E56runner
{
    public static void main(String args[]){
        E65 myValues =  new E65();
        
        myValues.addValue(5.0);
        myValues.addValue(4.2);
        myValues.addValue(2.0);
        
        System.out.println("Average: " + myValues.getAverage());
        System.out.println("Smallest: " + myValues.getSmallest());
        System.out.println("Largest: " + myValues.getLargest());
        System.out.println("Range: " + myValues.getRange());
        
    }
}