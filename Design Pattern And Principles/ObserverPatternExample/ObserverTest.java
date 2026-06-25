public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket =
                new StockMarket("TCS");


        Observer mobileUser =
                new MobileApp("Abhyanand");

        Observer webUser =
                new WebApp("Investor1");


        stockMarket.registerObserver(
                mobileUser);

        stockMarket.registerObserver(
                webUser);


        stockMarket.setStockPrice(
                4200.50);

        stockMarket.setStockPrice(
                4350.75);


        stockMarket.deregisterObserver(
                webUser);


        System.out.println(
            "\nWeb User Removed"
        );


        stockMarket.setStockPrice(
                4500.25);
    }
}