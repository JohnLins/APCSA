
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private double balance;
    public int chargeCount;
    public int  monthlyCharge;

    public BankAccount(/*It can have arguments*/)
    {
        // initialise instance variables 
        balance = 0;
        chargeCount = 0;
        monthlyCharge = 3;
    }
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    public void deductMonthlyCharge()
    {
        monthlyCharge -= 1;
        
       // math.max(,);
    }

    public void deposit(double amount)
    {
        chargeCount += 1;
        deductMonthlyCharge();
        double fee = 2.0;
        if(chargeCount > monthlyCharge){
         balance = balance + (amount - fee);   
        }
        else {
            balance = balance + (amount - fee);
        }
        
        //balance = balance + (amount - fee);
        
    }
    
    public void withdraw(double amount)
    {
        chargeCount += 1;
        deductMonthlyCharge();
        double fee = 2.0;
        if(chargeCount > monthlyCharge){
         balance = balance - (amount + fee);   
        }
        else {
            balance = balance - (amount + fee);
        }
        //balance = balance - (amount + fee);
    
    }
    
    
    
    /**
    
    Gets the current balance of the bank account.
    
    @return the current balance
    
    */
    
    public double getBalance()
    
    {
    
    return balance;
    
    }
    
    }
