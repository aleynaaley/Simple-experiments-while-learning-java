public class TwentyPercentTax implements TaxableBehavior {

    @Override
    public double getTax(double price) {
        return price * 0.2;
    }

}
