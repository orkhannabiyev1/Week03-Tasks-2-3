
package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice = new Invoice(
                "A101", "Hammer", 3, 12.50
        );

        System.out.println("Part number: " + invoice.getPartNumber());

        System.out.println("Description: " + invoice.getPartDescription());

        System.out.println("Quantity: " + invoice.getQuantity());

        System.out.println("Price per item: " + invoice.getPricePerItem());

        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());

        invoice.setQuantity(-2);
        invoice.setPricePerItem(-5);

        System.out.println("Invalid quantity: " + invoice.getQuantity());

        System.out.println("Invalid price: " + invoice.getPricePerItem());
    }
}
