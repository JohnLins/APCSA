public class Palindrome
{
  
    public boolean checkPal(char[] word, int start, int end)
    {
        if(start >= end){
         return true;   
        }
        
        if(word[start] == word[end]){
         return checkPal(word, start+1, end-1); 
        } else {
         return false;   
        } 
    }
    
    public static void main(String[] args){
     Palindrome mine = new Palindrome();
     char[] word = {'u', 'w', 'w', 'u'}; 
     System.out.println(mine.checkPal(word, 0, word.length-1));
    }
}
