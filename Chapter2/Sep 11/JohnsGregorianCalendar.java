import java.util.GregorianCalendar;
import java.util.Calendar;
class JohnsGregorianCalendar{
    public static void main(String[] args){
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.DAY_OF_MONTH, 100);
       
        
        GregorianCalendar JohnsBirthday = new GregorianCalendar(2004, Calendar.JULY, 6);
        
        
        
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
        String week_day = Weekday(weekday);
        
        System.out.println("Weekday after 100 days is : "
         + week_day);
        
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
   
        System.out.println("Date after 100 days is : " + year 
            + "/" + month + "/" + dayOfMonth);
            
            
            
        weekday = JohnsBirthday.get(Calendar.DAY_OF_WEEK);
          
        System.out.println("The weekday of my birthday is: " + weekday);
        
        
      
        
        JohnsBirthday.add(Calendar.DAY_OF_MONTH, 10000);
       
        
        dayOfMonth = JohnsBirthday.get(Calendar.DAY_OF_MONTH);
        month = JohnsBirthday.get(Calendar.MONTH);
        year = JohnsBirthday.get(Calendar.YEAR);
   
        System.out.println("Date 10,000 days after my birthday is : " + year 
            + "/" + month + "/" + dayOfMonth);
           
            
            
    }
    public static String Weekday(int dayNum) {
        String day;
        switch(dayNum){
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid";
        }
        return day;
    }
}
