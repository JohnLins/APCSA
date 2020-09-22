
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    //Instance variables (Should always be private)
    private double balance;

    /*Constructor (
    It initalizes objects,
    Sets the initial data for the objects,
    The name for the constructor is always the same as the name of the class,
    It has no return type
    */
    public BankAccount(/*It can have arguments*/)
    {
        // initialise instance variables 
        balance = 0;
    }

    /**
     * Method 
     * @param  initialBalance
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    
    /**
    
    Deposits money into the bank account.
    
    @param amount the amount to deposit
    
    */
    public void deposit(double amount)
    
    {
    
    balance = balance + amount;
    
    }
    
    
    
    /**
    
    Withdraws money from the bank account.
    
    @param amount the amount to withdraw
    
    */
    
    public void withdraw(double amount)
    
    {
    
    balance = balance - amount;
    
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
