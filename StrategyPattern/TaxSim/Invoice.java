
import java.util.ArrayList;

public abstract class Invoice {
    protected ArrayList<Item> purchasedItems;
    protected  double total;
    protected TaxableBehavior tax;

    public Invoice(){
        purchasedItems = new ArrayList<>();
        total = 0;
    }

    public void addAnItem(Item item) {
        purchasedItems.add(item);
    }

    public double getTotal() {
        total = 0;
        for (Item item : purchasedItems) {
            double price = item.getPrice();
            total += price + calculateTax(price);
        }
        return total;
    }

    public double calculateTax(double price) {
        return tax.getTax(price);
    }

    // runtime'da vergi davranışını değiştirmek için !!!!!
    public void setTaxableBehavior(TaxableBehavior newTax) {
        this.tax = newTax;
    }

}
