
public class Product
{
    private String name;
    private double cost;

    
    public Product(String n, double c)
    {
        name = n;
        cost = c;
    }

    public double getCost(){
     return cost;   
    }
    
    public String getName(){
        return name;
    }
}
