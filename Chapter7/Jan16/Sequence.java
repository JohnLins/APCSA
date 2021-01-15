import java.util.ArrayList;
public class Sequence
{
    private ArrayList<Integer> values;
    
    public Sequence(){
        values = new ArrayList<Integer>();
    }
    
    public void add(int n){
        values.add(n);
    }
    
    public String toString(){
        return values.toString();
    }

    public Sequence append(Sequence other){
        //ArrayList<Integer> valuesTemp = values;
        
        Sequence valuesTemp = new Sequence();
        
        valuesTemp.values = values;
        
        for(Integer i : other.values){
            valuesTemp.add(i);
        }
        return valuesTemp;
    }
    
}


