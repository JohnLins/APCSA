public class Appointment {
    public static int yearI;
    public static int monthI;
    public static int dayI;
    public static String description;
    
    public Appointment(int y, int m, int d, String de){
        yearI = y;
        monthI = m;
        dayI = d;
        description = de;
    }
    
    public boolean occursOn(int year, int month, int day){
        if(year == yearI && month == monthI && day == dayI){
            return true;   
        } else {
            return false;
        }
    }
    
    public String des(){
     return description;   
    }
    
}

