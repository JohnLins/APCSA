import java.util.ArrayList;
public class Bag
{
    public class Item {
        public String name;
        
        Item(String n){
            name = n;
        }
    }
    public ArrayList<Item> data = new ArrayList<Item>();
    
   public void add(String itemName){
       Item newItem = new Item(itemName);
       data.add(newItem);
    }
    
    public int count(String itemName){
        int times = 0;
        for(Item index : data){
            if(index.name == itemName){
                times = times + 1;
            }
        }
        return times;
    }
    
    public static void main(String args[]){
        Bag mine = new Bag();
        mine.add("hi");
        
        mine.add("Cool");
        System.out.println(mine.count("hi"));
    }
}
