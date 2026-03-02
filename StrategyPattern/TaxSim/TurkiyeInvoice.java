public class TurkiyeInvoice extends Invoice {

    public TurkiyeInvoice() {
        super();
        this.tax = new EighteenPercentTax();
    }
}
