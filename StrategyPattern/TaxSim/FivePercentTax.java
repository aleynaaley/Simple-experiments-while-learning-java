public class FivePercentTax implements TaxableBehavior {

    @Override
    public double getTax(double price) {
        return price * 0.05;
    }
}
