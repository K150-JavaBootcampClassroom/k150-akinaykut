package week_3.GreengrocerApp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

// Depoya yeni ürünlerin eklenilmesi için gerekli class
public class ReStoreServiceImp implements IReStoreStrategy {


    // Manav deposunun güncellendiği kısım
    @Override
    public void reStore(GreengrocerMarket market, HashMap<String, Double> products) {

        // Gelen hashmap içindeki ürünleri ve değerlerinin depoya eklenildiği kısım
        products.forEach((key, value) -> {
           market.addStorage(key, value);
        });

        System.out.println("Storage is successfully updated...");
    }
}
