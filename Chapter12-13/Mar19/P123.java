import java.util.ArrayList;
import java.util.Scanner;
public class P123
{
    private ArrayList<Question> qs;

  
    public P123(String stringQuestions)
    {
        qs = new ArrayList<Question>();
        Scanner scanner = new Scanner(stringQuestions);
      
        int lineNumber = 0;
        
        
        
        while (scanner.hasNextLine()) {
            lineNumber++;
            String line = scanner.nextLine();
            //System.out.println(line);
            if(lineNumber % 2 != 0){
                String a = "answer";
                if(line.charAt(0) == 'T'){
                    //while (scanner.hasNextLine()){a = scanner.nextLine(); break;}
                    Question q = new Question('T', line, a);
                    qs.add(q);
                    
                } else if (line.charAt(0) == 'N') {
                    //while (scanner.hasNextLine()){a = scanner.nextLine(); break;}
                    Question q = new Question('N', line, a);
                    qs.add(q);
                    
                } else if (line.charAt(0) == 'S') {
                    //while (scanner.hasNextLine()){a = scanner.nextLine(); break;}
                    Question q = new Question('S', line, a);
                    qs.add(q);
                    
                } else if (line.charAt(0) == 'M') {
                    //while (scanner.hasNextLine()){a = scanner.nextLine(); break;}
                    Question q = new Question('M', line, a);
                    qs.add(q);
                    
                } else {
                 System.out.println("error");   
                }
            }
            
        }
        scanner.close();
        
        
    }

    public double ask(){
        double numberOfQuestions = qs.size();
        double numberOfCorrectAnswers = 0;
        Scanner in = new Scanner(System.in);
        
        
        for(int i = 0; i < qs.size(); i++){
         System.out.println("Question: " + qs.get(i).getText()); 
         if(in.nextLine() ==  qs.get(i).getAnswer()) {numberOfCorrectAnswers++;}
         System.out.println("The answer was: " + qs.get(i).getAnswer());
        }
        
        return numberOfCorrectAnswers / numberOfQuestions;
    }
   
    
    public static void main(String[] args){
        //ArrayList <String question 
        String questions = "T  here is a question \n" + 
        "answer\n" +
        "N here is another question \n" + 
        "134\n" +
        "S  yet another question \n" +
        "answer\n" +
        "M my final question \n" + 
        "answer\n";
        
        P123 myQuestion = new P123(questions);
        
        System.out.println(myQuestion.ask());
        
    }
}
