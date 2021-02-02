import java.util.Scanner;
public class QuestionDemo2
{
    
    public static void presentQuestion(ChoiceQuestion q){
     q.display();
     System.out.print("Your answer");
     Scanner in = new Scanner(System.in);
     String response = in.nextLine();
     System.out.println(q.checkAnswer(response));
    }
    
   public static void main(String args[]){
     ChoiceQuestion first = new ChoiceQuestion();
     first.setText("How old is John? ");
     first.addChoice("12", false);
     first.addChoice("16", true);
     first.addChoice("18", false);
     
     presentQuestion(first);
    }
}
