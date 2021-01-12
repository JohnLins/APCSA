import java.util.ArrayList;
public class Arraylist
{
    public static void main(String args[]){
        ArrayList<String> friends = new ArrayList<String>();
        
        friends.add("John");
        friends.add("Jimmy");
        friends.add(1, "jeff");
        friends.remove(1);
        System.out.println(friends);
        friends.set(0, "Bob");
        
        String first = friends.get(0);
        System.out.println(first);
        
        //copy
        ArrayList<String> newFriends = new ArrayList<String>(friends);
        
        System.out.println(newFriends);
        
    }
  
}
