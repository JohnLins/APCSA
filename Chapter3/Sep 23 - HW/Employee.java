
/**
 * Write a description of class Employee here.
 *
 * @author (John Lins)
 * @version (a version number or a date)
 */
public class Employee
{
    private String name;
    private double salary;

    public Employee(String employeeName, double currentSalary)
    {
        // initialise instance variables
        name = employeeName;
        salary = currentSalary;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void raiseSalary(double amount)
    {
        salary = salary + amount;
    }
}
