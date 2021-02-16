
public class CoinTester
{
    // instance variables - replace the example below with your own
    public static void main(String args[]){
        Coin myCoin = new Coin(1, "Penny");
        Coin myCoin2 = new Coin(5, "Nickel");
        System.out.println(myCoin.compareTo(myCoin2));
        
        System.out.println(myCoin.getValue());
        System.out.println(myCoin.getName());
    }
}
