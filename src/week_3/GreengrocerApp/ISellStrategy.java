package week_3.GreengrocerApp;

public interface ISellStrategy {

    // Satış stratejisi için implement edilmesi gereken arayüz
    void sell(GreengrocerMarket market, Person customer, String product, double amount);


}
