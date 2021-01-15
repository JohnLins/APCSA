
public class SequenceTest {
    public static void main(String args[]){
        Sequence thing = new Sequence();
        
        Sequence thing2 = new Sequence();
        
        thing.add(1);
        thing.add(2);
        thing2.add(3);
        thing2.add(4);
        
     
        
        System.out.println("Append" + thing.append(thing2));
        
        
        Sequence thing3 = new Sequence();
        
        Sequence thing4 = new Sequence();
        
        thing3.add(1);
        thing3.add(2);
        thing3.add(3);
        
        thing4.add(4);
        thing4.add(5);
        thing4.add(6);
        
        System.out.println("Merge: " + thing3.merge(thing4));
    }

}