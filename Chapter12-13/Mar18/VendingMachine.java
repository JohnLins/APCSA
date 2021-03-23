import java.util.ArrayList;
public class VendingMachine
{
    private ArrayList<Product> products = new ArrayList<Product>(); 

    
    public VendingMachine(ArrayList<Product> p)
    {
        products = p;
    }
    
    public void add(Product product){
     products.add(product);   
    }

    public double purchase(String product, double payment){
        double cost = 0.0;
        for(Product p : products){
            if(p.getName() == product){
                cost = p.getCost();
            }
        }
        
        if(payment < cost){
            System.out.println("Not enough");
            return payment;
         
        }
        
        double change = payment - cost;
        
        System.out.println("Here is your " + product);
        return change;
    }
    
    
}
