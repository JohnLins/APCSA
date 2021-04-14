
public class E1312
{
    public String word;
   
    public E1312(String w)
    {
        word = w;
    }

   public void substringGen(){
       for(int i = 0; i < word.length()+1; i++){
         for(int j = i; j < word.length()+1; j++){
             System.out.print(word.substring(i, j) + " ");
            }
        }
    }
    
    public static void main(String[] args){
        E1312 mine = new E1312("rum");
        mine.substringGen();
    }
}
