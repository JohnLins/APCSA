
public class Monthly extends Appointment
{
   

    public boolean occursOn(int month){
        if(month == monthI){
            return true;   
        } else {
            return false;
        }
    }
}
