public class GreeceInvoice extends Invoice {

    public GreeceInvoice() {
        super();
        this.tax = new TenPercentTax();
    }

}
