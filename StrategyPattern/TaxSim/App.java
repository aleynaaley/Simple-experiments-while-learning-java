public class App {
    public static void main(String[] args) throws Exception {

        Item laptop = new Item("HP Laptop", 15000);
        Item camera = new Item("Canon camera", 10000);
        Item pen = new Item("Unibal pen", 100);
        Item chair = new Item("Ikea chair", 1500);
        Item phone = new Item("Iphone 13", 35000);
        Invoice turkiyeInvoice = new TurkiyeInvoice();
        turkiyeInvoice.addAnItem(phone);
        turkiyeInvoice.addAnItem(laptop);
        System.out.println("Turkiye total: " + turkiyeInvoice.getTotal());
        Invoice usaInvoice = new USAInvoice();
        usaInvoice.addAnItem(camera);
        usaInvoice.addAnItem(chair);
        System.out.println("USA total: " + usaInvoice.getTotal());
        Invoice polandInvoice = new PolandInvoice();
        polandInvoice.addAnItem(pen);
        polandInvoice.addAnItem(laptop);
        System.out.println("Poland total: " + polandInvoice.getTotal());
        Invoice greeceInvoice = new GreeceInvoice();
        greeceInvoice.addAnItem(laptop);
        greeceInvoice.addAnItem(chair);
        System.out.println("Greece total: " + greeceInvoice.getTotal());
        
        // tax policy for Turkiye changes to 5 percent
        turkiyeInvoice.setTaxableBehavior(new FivePercentTax());
        // print total for Turkiye now
        System.out.println("Turkiye total with new tax behavior: " + turkiyeInvoice.getTotal());
    }
}
