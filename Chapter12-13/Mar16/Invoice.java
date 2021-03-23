import java.util.ArrayList;

public class Invoice
{
    private Address billingAddress;
    private ArrayList<LineItem> items;

    
    public Invoice(Address anAddress)
    {
        items = new ArrayList<LineItem>();
        billingAddress = anAddress;
    }

   
    public void add(Product aProduct, int quantity)
    {
        LineItem anItem = new LineItem(aProduct, quantity);
        items.add(anItem);
    }
    
    public String format(){
        String r = "";
        for(LineItem item : items){
            r = r + item + "\n";
        }
        
        return r;   
    }
    
    
    
    private double getAmountDue(){
     double amountDue = 0;
     for(LineItem item : items){
         amountDue = amountDue + item.getTotalPrice();
        }
        return amountDue;
    }
    
}

