public class EighteenPercentTax implements TaxableBehavior {

    @Override
    public double getTax(double price) {
        return price * 0.18;
    }

}
