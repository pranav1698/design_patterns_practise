public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googlePrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(StockGrabber newStockGrabber) {
        this.stockGrabber = newStockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println();
        System.out.println("New Observer " + this.observerID);

        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googlePrice = googlePrice;

        printThePrices();
    }

    public void printThePrices() {
        System.out.println(this.observerID + "\nIBM: " + this.ibmPrice + "\nApple: " + this.aaplPrice + "\nGoogle: "
                + this.googlePrice);
    }

}