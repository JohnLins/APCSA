
/**
 * Write a description of class EmployeeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeTester
{
    public static void main(String[] args) {
        Employee jeff = new Employee("Jeff", 50000.00);
        
        System.out.println(jeff.getName());
        System.out.println(jeff.getSalary());
        jeff.raiseSalary(20000.0);
        System.out.println(jeff.getName());
        System.out.println(jeff.getSalary());
    }
}
