import java.util.Scanner;

public class SentinelDemo
{
    public static void main(String[] args)
    {
     double sum = 0;
     int count = 0;
     double salary = 0;
     
     System.out.println("Enter salaries (-1 to finish)");
     Scanner in = new Scanner(System.in);
     
     while (salary != -1){
    
        salary = in.nextDouble();
        
        if (salary != -1){
        
        sum = sum + salary;
        
        count++;
    
        }
    
    }
    
    
    if (count > 0){
    
    double average = sum / count;
    
    System.out.println("Average salary: " + average);
    
    } else {
    
    System.out.println("No data");
    
    }
    
    }
    
    
    
    }
    
        

