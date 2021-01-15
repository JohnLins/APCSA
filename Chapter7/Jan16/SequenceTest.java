public class SequenceTest {
    public static void main(String args[]){
        Sequence thing = new Sequence();
        
        Sequence thing2 = new Sequence();
        
        thing.add(1);
        thing.add(2);
        thing2.add(3);
        thing2.add(4);
        
     ;
        
        System.out.println(thing.append(thing2));
    }

}