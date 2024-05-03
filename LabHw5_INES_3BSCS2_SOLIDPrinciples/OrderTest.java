package LabHw5_INES_3BSCS2_SOLIDPrinciples;

public class OrderTest
{
    public static void main(String[] args)
    {
        OrderAction order = new OrderAction();

        System.out.print("\nLABORATORY ASSIGNMENT 5: SOLID PRINCIPLES | INES | 3 BSCS 2");
        System.out.print("\n\nE-COMMERCE DELIVERY");

        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");
        order.generateInvoice("order_123.pdf");
        order.sendEmailNotification("johndoe@example.com");
    }
}
