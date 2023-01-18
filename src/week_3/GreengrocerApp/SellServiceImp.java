package week_3.GreengrocerApp;


import javafx.util.converter.LocalDateStringConverter;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;

// Satış işleminin yapıldığı class
public class SellServiceImp implements ISellStrategy {


    // Satış stratejisi için gerekli method
    @Override
    public void sell(GreengrocerMarket market, Person customer, String product, double amount) {

        // Depodaki ürünleri ve depodaki ürünlerin miktarının kontrol edildiği kısım
        if(checkStorage(market, product, amount)) {

            // Depodaki güncel ürün miktarının yeni değeri
            double newProductAmount = market.getStorage().get(product) - amount;
            market.getStorage().put(product, newProductAmount);
        }
        // Zamanı log kayıtlarında göstermek için
        Clock clock = Clock.systemUTC();
        LocalDateTime time = LocalDateTime.now(clock);
        String message = time + " | " + customer.getName() + " " + customer.getSurname() + " " + amount + " kg " + product + " satın aldı.";
        market.getLogs().add(message);
    }

    // Depodaki ürünleri ve depodaki ürünlerin miktarının kontrol edildiği kısım
    private boolean checkStorage(GreengrocerMarket market, String product, double amount) {

        for(String fruit : market.getStorage().keySet()) {
        // Alınmak istenilen ürün == depodaki ürün
            if(fruit.equals(product)){

                // Alınmak istenilen miktar <= depodaki miktar
                if( amount <= market.getStorage().get(product)) {
                    return true;
                }
            }
        }


        return false;
    }
}

