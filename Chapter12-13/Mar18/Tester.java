import java.util.ArrayList;

public class Tester
{
    public static void main(String args[]){
        ArrayList<Product> insert = new ArrayList<Product>();
        insert.add(new Product("chips", 4.1));
        insert.add(new Product("candy", 1.2));
        insert.add(new Product("snack", 0.5));
        VendingMachine vm = new VendingMachine(insert);
        
        System.out.println(vm.purchase("candy", 1.5));
     
     
     
    }
}
