
public class invoicePrinter
{
    public static void main(String[] args){
     Address samsAddress = new Address("Sam's Small Appliances", "100 Main Street", "Anytown", "CA", "9865");
     Invoice samsInvoice = new Invoice(samsAddress);
     samsInvoice.add(new Product("Toaster", 29.95), 3);
     samsInvoice.add(new Product("Hair dryer", 24.95), 1);
     //System.out.println(samsInvoice.format());
    }
}
