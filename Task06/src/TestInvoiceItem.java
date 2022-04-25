public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem ivt = new InvoiceItem("sp1", "good", 2, 5000.0d);
        System.out.println(ivt.toString());
    }
}
