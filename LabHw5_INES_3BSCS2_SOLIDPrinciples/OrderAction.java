package LabHw5_INES_3BSCS2_SOLIDPrinciples;

public class OrderAction implements InvoiceGenerator, PlaceOrder, SendEmail, TotalCalculator
{
    @Override
    public void generateInvoice(String fileName)
    {
        System.out.print("\n  Invoice: " + fileName);
    }
    @Override
    public void placeOrder(String customerName, String address)
    {
        System.out.print("\n  Place Order for " + customerName + " at " + address);
    }
    @Override
    public void sendEmailNotification(String email)
    {
        System.out.print("\n  Email Notification: " + email + "\n\n");
    }
    @Override
    public void calculateTotal(double price, int quantity)
    {
        System.out.print("\n  Total: " + "\n   Price: ₱" + price + "\n   Quantity: " + quantity);
    }
}
