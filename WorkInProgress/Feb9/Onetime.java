public class Onetime extends Appointment
{
    private static int day;
    public Onetime(int day){
        super();
    }
    
    public boolean onDay(int day){
        super.occursOn(0,0,0);
        
    }
}   
