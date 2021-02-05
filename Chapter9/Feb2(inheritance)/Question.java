import java.util.Scanner;
public class Question
{
    private String text;
    private String answer;

 
    public Question()
    {
        text = "";
        answer = "";
    }

 
    public void setText(String questionText)
    {
        text = questionText;
    }
    
    public void setAnswer(String correctResponse)
    {
        answer = correctResponse;
    }
        
    public boolean checkAnswer(String response){
        //response.equals(answer)
        if(response.equals(answer)){
         return true;   
        } else {
            return false;
        }
    }
    
    public void display(){
        System.out.println(text);
    }
    
    public String getText(){
        return text;
    }
    public String getAnswer(){
        return answer;
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        Question mine =  new Question();
        mine.setText("How old is John?");
        mine.setAnswer("16");
        mine.display();
        System.out.print(mine.checkAnswer(in.nextLine()));
        
       
        
    }
}
