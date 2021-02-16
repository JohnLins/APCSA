import java.util.ArrayList;
public class Tester
{
    public static void main(String args[]){
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
       
        
        
        Appointment one = new Appointment(0,0,0,"this");
        Appointment two = new Appointment(0,0,0,"this");
        Appointment three = new Appointment(0,0,0,"this");
        
        appointments.add(one);
        appointments.add(two);
        appointments.add(three);
        
        
        
        
        System.out.println(appointments.get(0).occursOn(0,0,0));
        System.out.println(appointments.get(0).des());
    }
}
