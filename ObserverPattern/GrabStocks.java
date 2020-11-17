public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBM(197.00);
        stockGrabber.setApple(677.60);
        stockGrabber.setGoogle(676.40);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBM(197.00);
        stockGrabber.setApple(677.60);
        stockGrabber.setGoogle(676.40);

        stockGrabber.unregister(observer1);

        stockGrabber.setIBM(197.00);
        stockGrabber.setApple(677.60);
        stockGrabber.setGoogle(676.40);

        Runnable getIBM = new GetStocks(stockGrabber, 2, "IBM", 197.00);
        Runnable getApple = new GetStocks(stockGrabber, 2, "AAPL", 676.60);
        Runnable getGoog = new GetStocks(stockGrabber, 2, "IBM", 676.40);

        new Thread(getIBM).start();
        new Thread(getApple).start();
        new Thread(getGoog).start();
    }
}
