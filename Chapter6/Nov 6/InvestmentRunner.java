public class InvestmentRunner

{

public static void main(String[] args)

{

final double INITIAL_BALANCE = 10000;

final double RATE = 10;

Investment invest = new Investment(INITIAL_BALANCE, RATE);

invest.waitForBalance(2 * INITIAL_BALANCE);

int years = invest.getYears();

System.out.println("The investment doubled after " + years + " years");

}

}
