public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp("StockMobile");
        Observer web = new WebApp("StockWeb");

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        System.out.println("--- Updating Stock to AAPL @ 145.75 ---");
        stockMarket.setStock("AAPL", 145.75);

        System.out.println("\n--- Updating Stock to GOOG @ 2830.50 ---");
        stockMarket.setStock("GOOG", 2830.50);

        System.out.println("\n--- Removing WebApp Observer ---");
        stockMarket.removeObserver(web);

        System.out.println("\n--- Updating Stock to TSLA @ 705.30 ---");
        stockMarket.setStock("TSLA", 705.30);
    }
}