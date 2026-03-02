public class PolandInvoice extends Invoice {

    public PolandInvoice() {
        super();
        this.tax = new TwentyPercentTax();
    }
}
