import java.util.Scanner;

public class QuestionDemo3
{
    public static void presentQuestion(Question q){
         q.display();
         System.out.print("Answer: ");
       
         Scanner in = new Scanner(System.in);
         String r = in.nextLine();
         System.out.println(q.checkAnswer(r));
    }
    
    public static String toString(Question q){
        
        return "Text: " + q.getText() + " Answer: " + q.getAnswer();
    }
    
       public static void main(String[] args){
         Question first = new Question();
         first.setText("Who was the inventor of Java?");
         first.setAnswer("James G");
         ChoiceQuestion second = new ChoiceQuestion();
         second.setText("How old is John:");
         
         second.addChoice("15", false);
         second.addChoice("16", true);
         second.addChoice("13", false);
         second.addChoice("4", false);
         
         presentQuestion(first);
         presentQuestion(second);
    
        String output = toString(first);
        System.out.println(output);
   
    }
}
