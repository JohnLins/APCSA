
public class Investment
{
    private double balance;
    private double rate;
    private int year;

   
    public Investment(double aBalance, double aRate)
    {
        balance = aBalance;
        rate = aRate;
        year = 0;
    }

    public void waitForBalance(double targetBalance)
    {
        while (balance < targetBalance){
         year++;
         double interest = balance * rate / 100;
         balance = balance + interest;
        }
    }
    
    public void waitYears(int numberOfYears){
        for(int i = 1; i <= numberOfYears; i++){
            double interest = balance * rate / 100;
            balance = balance + interest;
            year++;
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
    public int getYears(){
     return year;   
    }
    
}
