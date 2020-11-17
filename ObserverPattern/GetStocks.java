import java.text.DecimalFormat;

public class GetStocks implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetStocks(Subject stockGrabber, int newStartTime, String newStock, double newPrice) {
        this.stockGrabber = stockGrabber;
        this.startTime = newStartTime;
        this.stock = newStock;
        this.price = newPrice;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 20; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            double randNum = (Math.random() * (.06)) - .03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format(price + randNum));

            if (stock == "IBM") {
                ((StockGrabber) stockGrabber).setIBM(price);
            } else if (stock == "AAPL") {
                ((StockGrabber) stockGrabber).setApple(price);
            } else if (stock == "GOOG") {
                ((StockGrabber) stockGrabber).setGoogle(price);
            }

            System.out.println(stock + ": " + df.format((price + randNum)) + " " + df.format(randNum));
            System.out.println();

        }
    }

}