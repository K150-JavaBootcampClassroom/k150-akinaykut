package week_3.GreengrocerApp;

import java.util.HashMap;

public class GreengrocerApp {



    public static void main(String[] args) {

        // Patron objesi oluşturuldu
        Boss marketOwner = new Boss("Hasan", "Amca");
        GreengrocerMarket market = marketOwner.greengrocerMarket;


        // Müşteriler oluşturuldu
        Person customer1 = new Person("Kapıcı", "Rıza");
        Person customer2 = new Person("Avukat", "Hayri");

        // Depoya eklemek istenilen veriler bir hashmap üzerine eklendi.
        HashMap<String, Double> products = new HashMap<>();
        products.put("elma", 50.5);
        products.put("armut", 25.5);
        products.put("kiraz", 40.1);

        // Depodaki veriler güncellendi
        ReStoreServiceImp reStoreServiceImp = new ReStoreServiceImp();
        reStoreServiceImp.reStore(market, products);

        // Satış işlemleri için gerekli servis objesi oluşturuldu.
        SellServiceImp sellServiceImp = new SellServiceImp();
        sellServiceImp.sell(market, customer1, "armut", 5.0);
        sellServiceImp.sell(market, customer2, "elma", 1.0);

        // Oluşan log kayıtları yazdırıldı.
        for(String message : market.getLogs()) {
            System.out.println(message);
        }
        // Depoda kalan ürünler yazdırıldı.
        market.storageInfo();
    }


}
