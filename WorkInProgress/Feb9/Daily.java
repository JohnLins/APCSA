public class Daily extends Appointment
{
    public boolean occursOn(int day){
        if(day == dayI){
            return true;   
        } else {
            return false;
        }
    }
}
