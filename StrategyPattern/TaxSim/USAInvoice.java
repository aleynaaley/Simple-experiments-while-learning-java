public class USAInvoice extends Invoice {

    public USAInvoice() {
        super();
        this.tax = new FivePercentTax();
    }
}
