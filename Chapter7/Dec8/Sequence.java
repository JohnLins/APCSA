public class Sequence
{
    private int[] values;
    public int size;

    public Sequence(int size)
    {
        size = size;
        values = new int[size];
    }

    public void set(int i, int n)
    {
        values[i] = n;
    }
    
    //good
    public boolean equals(Sequence other)
    {
     for(int i = 0; i < size; i++) {
         if(other.values[i] != values[i]){
             return false;
            }
        }
        return true;
    }
    
    //good
    public boolean sameValues(Sequence other)
    {
        int times = 0;
        boolean answer = false;
        for(int i = 0; i < size;i++){
            for(int j = 0; j < size; j++){
                if(other.values[i] == values[j]){
                    times++;
                } 
                
            }
            if(times == size){
                answer = true;
            }
        }
        
        return answer;
    }
    
    //done
    public boolean isPermutationOf(Sequence other)
    {
        boolean answer = true;
        for(int i = 0; i < size; i++){
            if(other.values[i] == values[0]){
                for(int j = 0; j < size - i; j++){
                    if(other.values[i+j] != values[j]){
                        answer = false;
                    }
                }
                
            }
        }
        return answer;
    }
    

 }
    
