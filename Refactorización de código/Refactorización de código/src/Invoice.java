public class Invoice {
    private int invoiceNumber;
    private String customerName;
    private double subtotal;
    private double tax;

    public Invoice(int invoiceNumber, String customerName, double subtotal) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.subtotal = subtotal;
        this.tax = calculateTax();
    }

    public void printInvoiceHeader(){
        String.format("Invoice Details:");
        String.format("Invoice Number: " , invoiceNumber);
        String.format("Customer Name: " , customerName);
    }

    public void printTaxDetails() {
        String.format("Total Amount: " , subtotal);
        String.format("Tax Amount: " , tax);
        String.format("Amount with Tax: " , (subtotal + tax));
    }

    public double calculateTax() {
        return subtotal * 0.15;
    }

    public double getSubtotalWithTax() {
        return subtotal + calculateTax();
    }

    public void updateCustomerName(String newName) {
        customerName = newName;
    }

    public void applyDiscountAndUpdateTax(double discountPercentage) {
        double resultado = subtotal - (subtotal * discountPercentage / 100);
        calculateTax();
    }
    
    private double recalculateTax() {
        return calculateTax();
    }

    public void printDiscountDetails() {
        String.format("Discount Applied: " , discountPercentage);
        String.format("New Tax Amount: " , calculateTax());
        String.format("Amount After Discount: " , (subtotal + tax));
    }
}