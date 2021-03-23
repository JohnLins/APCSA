
public class Question
{
    
    private char type;
    private String questionText;
    private String answer;

    
    public Question(char t, String qt, String a)
    {
        type = t;
        
        questionText = qt;
        
        answer = a;
    }

    public char getType(){
     return type; 
    }
    
    public String getText(){
     return questionText;   
    }
   
    public String getAnswer(){
     return answer;   
    }
}
