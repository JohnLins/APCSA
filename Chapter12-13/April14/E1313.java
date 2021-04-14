
public class E1313
{
    public String word;
   
    public E1313(String w)
    {
        word = w;
    }
    
    private String remove(String wT, int index){
        String output  = "";
        for(int i = 0; i < wT.length(); i++){
            if(i != index){
                output += wT.charAt(i);
            } 
        }
        return output;
    }

   public void substringGen(){
       String temp = word;
       for(int i = 0; i < word.length()+1; i++){
           
         for(int j = i; j < word.length()+1; j++){
             //word.charAt(j);
             
             System.out.println(remove(temp, j));
            }
            temp = word;
        }
    }
    
    public static void main(String[] args){
        E1313 mine = new E1313("rum");
        mine.substringGen();
    }
}
