public class WebApp implements Observer {
    private String webName;

    public WebApp(String webName) {
        this.webName = webName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(webName + " received update: " + stockName + " is now $" + price);
    }
}