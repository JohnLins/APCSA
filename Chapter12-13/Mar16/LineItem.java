
public class LineItem
{
    private int quantity;
    private Product theProduct;
    public LineItem(Product aProduct, int aQuantity)
    {
        quantity = aQuantity;
        theProduct = aProduct;
    }

   public double getTotalPrice(){
     return theProduct.getPrice() * quantity;  
    }
}
